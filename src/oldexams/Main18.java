package oldexams;

public class Main18 {
    public static void main(String[] args) {
        int [] A = {1,3,5,7,9};
        int n = 5;
        int val = 3;
        System.out.println(getPos(A,n,val));
    }
    //二分查找
        public static int getPos(int[] A, int n, int val) {
            if( n == 0 || A.length == 0 )
                return -1;
            int left = 0;
            int right = n - 1;
            int mid = 0;
            while(left <= right){
                mid = (left + right) / 2;
                if(val > A[mid]){
                    left = mid + 1;
                }else if(val < A[mid]){
                    right = mid - 1;
                }else{
                    while( mid>=0 && A[mid] == val )
                        mid--;
                    return mid+1;
                }
            }
            return -1;
        }
}
