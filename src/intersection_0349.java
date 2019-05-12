import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 求两数组交集
 */
public class intersection_0349 {
    public static void main(String[] args) {
        //nums1 = [1,2,2,1], nums2 = [2,2]
        int [] nums1= {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        for(Integer i : intersection){
            System.out.print(i + ":");
        }
    }
    public  static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
       for(int i = 0 ; i< nums1.length ;i++){
           for(int j = 0 ; j < nums2.length ; j++){
               if(nums1[i] == nums2[j]){
                   set.add(nums1[i]);
               }else{
                   continue;
               }
           }
       }
       int [] arr = new int[set.size()];
       int k = 0;
       Iterator<Integer> iterator = set.iterator();
       while (iterator.hasNext()){
           arr[k++] = iterator.next();
       }
       return arr;
    }
}
