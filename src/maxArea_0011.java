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
        int max = (right - left ) * Math.min(height[left],height[right]);
        while (left < right){
            if(right - left == 1){
                int value = 1 * Math.min(height[left],height[right]);
                max = Math.max(value,max);
            }
            if((right - left - 1) * (Math.min(height[right],height[left + 1])) > max){
                max = (right - left - 1) * Math.min(height[right],height[left + 1]);
                left ++;
            }else if((right - left - 1) * Math.min(height[left],height[right - 1]) > max){
                max = (right - left - 1) * Math.min(height[left],height[right - 1]);
                right  --;
            }else if(height[right] > height[left]) {
                   left++;
            }else if(height[right] < height[left]){
                   right --;
            }else {
                left++;
                right --;
            }
        }
        return max;
    }
}
