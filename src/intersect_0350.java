import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect_0350 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {2,1};
        int[] intersect = intersect(nums1, nums2);
        for(Integer a : intersect){
            System.out.print(a + " ");
        }
    }
    //两个数组的交集
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length < 1 && nums2.length < 1) return new int[]{};
        if(nums1.length < 1 || nums2.length < 1) return new int[]{};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
                continue;
            }else {
                if(nums1[i] < nums2[j]){
                    i++;
                    continue;
                }else if(nums1[i] > nums2[j]){
                    j++;
                    continue;
                }
            }
        }
        int [] newArr = new int[list.size()];
        int k = 0;
        for(Integer a : list){
            newArr[k++] = a;
        }
        return newArr;
    }
}
