public class maxArea_0011 {
    public static void main(String[] args) {
        int [] num = {1,3,2,5,25,24,5};
        int i = maxArea(num);
        System.out.println(i);
    }

    /**
     * 双指针+ 条件堆积
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        //初始最大容量
        int max = (right - left ) * Math.min(height[left],height[right]);
        while (left < right){
            if(right - left == 1){
                int value = 1 * Math.min(height[left],height[right]);
                max = Math.max(value,max);
            }
            //如果左边移动一下 容量增大就左移
            if((right - left - 1) * (Math.min(height[right],height[left + 1])) > max){
                //不断更新最大值
                max = (right - left - 1) * Math.min(height[right],height[left + 1]);
                left ++;
                //如果右边移动一下，容量增大就右移
            }else if((right - left - 1) * Math.min(height[left],height[right - 1]) > max){
                max = (right - left - 1) * Math.min(height[left],height[right - 1]);
                right  --;
                //取小不取大
            }else if(height[right] > height[left]) {
                   left++;
            }else if(height[right] < height[left]){
                   right --;
            }else {
                //相等就都移动
                left++;
                right --;
            }
        }
        //最终返回
        return max;
    }
}
