public class mySqrt_0069 {
    //直接计算超时
//    public int mySqrt_0069(int x) {
//        for(int i = 0 ; i <= x ; i++){
//            if( (i*i) < x){
//                continue;
//            }else if( (i*i) == x){
//                return i;
//            }else{
//                return i -1;
//            }
//        }
//        return 0;
//    }
          public int mySqrt(int x) {
            long t = x;
              //二分
          	t = 0x5f3759df - (t >> 1);
          	while (!(t*t <= x && (t+1)*(t+1) > x))
          		t = (x/t + t)/2;
          	return (int)t;
          }
}
