package newcode;

public class Power {
    public double Power(double base, int exponent) {
        if(exponent == 0) return 1;
        if(base == 0) return 0d;
        double result = 1d;
        for(int i = 0 ; i < Math.abs(exponent) ; i++){
                result *= base;
        }
        if(exponent < 0){
            result  = 1/result;
        }
        return result;
    }
}
