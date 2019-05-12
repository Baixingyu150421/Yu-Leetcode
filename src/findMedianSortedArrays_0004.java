import java.util.Arrays;
import java.util.TreeSet;

public class findMedianSortedArrays_0004 {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    /**
     * 此解法时间复杂度为O(M) + O(logN) + O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2,0,newArr,nums1.length,nums2.length);
        Arrays.sort(newArr);
        if(newArr.length % 2 !=0){
            return (double) newArr[newArr.length / 2];
        }else
            return ((double) newArr[newArr.length / 2] + (double)newArr[(newArr.length / 2 ) - 1 ]) / 2;
    }
}
