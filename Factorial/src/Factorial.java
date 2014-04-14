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
}
