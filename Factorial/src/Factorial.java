/**
 * Created by oleg on 14.04.14.
 */
public class Factorial {
    int fact(int i) {
        int result;
        if(i==1) return 1;
        result = fact(i-1) * i;
        return result;
    }
    int fact1(int n) {
        int result=1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}
