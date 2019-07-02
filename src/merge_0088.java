import java.util.Arrays;

public class merge_0088 {
    /**
     * 划水过掉了
     * @param args
     */
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] muns2 = {2,5,6};
        merge(nums1,3,muns2,3);
        for (int i :nums1){
            System.out.print(i + ",");
        }
    }

    public  static  void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i = 0 ; i < n ; i++){
                nums1[m++] = nums2[i];
            }
            Arrays.sort(nums1);
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m + n];
        int s1 = 0, s2 = 0;
        int i = 0;
        while (s1 < m && s2 < n){
            if(nums1[s1] < nums2[s2]){
                arr[i++] = nums1[s1++];
            }else if(nums2[s2] < nums1[s1]){
                arr[i++] = nums2[s2++];
            }else {
                arr[i++] = nums1[s1++];
                arr[i++] = nums2[s2++];
            }
        }
        while (s1 != m){
            arr[i++] = nums1[s1++];
        }
        while (s2 != n){
            arr[i++] = nums2[s2++];
        }
        for (int k = 0 ; k < arr.length ; k++){
            nums1[k] = arr[k];
        }

    }

}
