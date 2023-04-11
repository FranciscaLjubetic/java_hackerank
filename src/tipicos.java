import java.util.ArrayList;

public class tipicos {

    public static boolean isFibonacci(int n){
        ArrayList<Integer> fib = new ArrayList<Integer>();

        if (n <= 0){
            fib.add(0);
        };
        if (n == 1){
            fib.add(0);
            fib.add(1);
        };
        if (n >= 2){
            fib.add(0);
            fib.add(1);
            for (int i= 2; i< n+1; i++){
                int fib_i = 0;
                fib_i = fib.get(i-1)+ fib.get(i-2);
                fib.add(fib_i);
            };
        };

        for(int j= 0; j <n; j++){
            if(n == fib.get(j)){
                return true;
            };
        };
        return false;
    }
}
