public class twoSum2_0167 {
    public static void main(String[] args) {
        int [] numbers = {2, 7, 11, 15};
        int[] ints = twoSum(numbers, 9);
        for(int i : ints){
            System.out.print(i + ",");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                return new int[]{i+1 , j + 1};
            }
        }
        return new int [] {-1,-1};
    }
}
