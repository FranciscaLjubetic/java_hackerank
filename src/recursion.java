import static java.lang.Integer.parseInt;

public class recursion {

    public static void printIncre(int n) {
        if(n>0) {
            printIncre(n-1);
            System.out.println(n);
        }
        else System.out.println();
    }

    public static int sumNat(int n) {
        if(n == 1 ){ return n; }
        return n + sumNat(n-1);
    }

    public static void printDecre(int n) {
        if(n < 1 ){
            System.out.println();
        }
        else {
            System.out.println(n);
            printDecre(n-1);
        }
    }

    public static int digitsAmount(int n) {
        if(n < 10 ){
            return 1;
        }
        else {
            return 1 + digitsAmount(n/10);
        }
    }

    public static int factorial(int n) {
        if(n <= 1 ){ return n; }
        return n * factorial(n-1);
    }

    public static int fibonacciRec(int n) {
        if(n == 1 ){ return 1; }
        if(n <= 0){ return 0; }
        return fibonacciRec(n-2) + fibonacciRec(n-1);
    }

    public static int recursivePow(int base, int exp) {
        if(exp == 1 ) { return base; }
        return base * recursivePow(base, exp-1);
    }

    public static void invertedDigits(int n) {
        if(n < 10 ){
            System.out.print(n);
        }
        else {
            System.out.print(n%10);
            invertedDigits((n - n%10)/10);
        }
    }

    public static void rectanglePerScreen(int base, int high) {
        String brik = "|=|";
        String line = brik.repeat(base);

        if(high <= 0 ) {
            System.out.println();
        } else {
            System.out.println(line);
            rectanglePerScreen(base, high-1);
        }

    }

    public static void trianglePerScreen(int base, int high) {
        String brik = "|/";
        String line = brik.repeat(base);

        if(high <= 0 || base <= 0 ) {
            System.out.println();
        } else {
            System.out.println(line);
            trianglePerScreen(base-1, high-1);
        }

    }

    public static void invertedTrianglePerScreen(int base, int high) {
        String brik = "|\\";
        String line = brik.repeat(base);

        if(high <= 0 || base <= 0 ) {
            System.out.println();
        } else {
            invertedTrianglePerScreen(base-1, high-1);
            System.out.println(line);
        }

    }

    public static boolean isAlphabeticallyOrdered(String str) {
        if(str.length() <= 1) return true;

        if(str.charAt(1) < str.charAt(0)) return false;
        else {
            isAlphabeticallyOrdered(str.substring(1));
            return true;
        }
    }

    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) return true;

        if(str.charAt(0) !=  str.charAt(str.length()-1)) return false;
        else {
            isPalindrome(str.substring(1, str.length()-2 ));
            return true;
        }
    }


    public static String numToBinary(Integer num) {
        String binary;
        if(num == 0 || num == 1) { return num.toString(); }
        else{
            Integer bit = num%2;
            Integer nxtBit = ((num - num%2)/2);
            binary = numToBinary(nxtBit) + bit;
            return binary;
        }
    }

    public static int binaryToNum(String num) {
        int lent = num.length();
        if(num == "0" ) { return 0; }
        if(num == "1" ) { return 1; }
        if(lent<1 ) { return 0; }
        else {
            String newNum = num.substring(1);
            int firstCif = parseInt(String.valueOf(num.charAt(0)));
            int pot = (int) Math.pow(2, lent-1);
            int firstCipher = firstCif * pot;
            return binaryToNum(newNum) + firstCipher;
        }
    }

    public static boolean isNumericallyOrdered(int num) {
        String str = String.valueOf(num);
        int lent = str.length();
        int newNum = (int) (num%(Math.pow(10, lent-1)));
        if(str.length() <= 1) return true;

        if(str.charAt(1) < str.charAt(0)) return false;
        else {
            return isNumericallyOrdered(newNum);
        }
    }

    public static boolean isBinary(int num) {
        String str = String.valueOf(num);
        int lent = str.length();
        int newNum = (int) (num%(Math.pow(10, lent-1)));
        int cleanNum = (int) ((num -newNum)/Math.pow(10, lent-1));
        if(num == 0 || num == 1 ) return true;
        else if(cleanNum != 1 & cleanNum != 0) return false;
        else {
            return isBinary(newNum);
        }
    }

    /*public static String ascendantOrDescendant(int num) {
        String str = String.valueOf(num);
        int lent = str.length();
        int newNum = (int) (num%(Math.pow(10, lent-1)));
        public static boolean isNumericallyAscendant(num) {

            if(str.length() <= 1) return true;

            if(str.charAt(1) < str.charAt(0)) return false;
            else {
                return isNumericallyOrdered(newNum);
            }
        }
    }*/

    public static boolean isPalindromeRec(int num) {
        String str = String.valueOf(num);
        int lastCifer = num%10;
        int newNum = (int) (num%(Math.pow(10, str.length()-1)));
        if(str.length() <= 1) return true;
        if(str.charAt(0) !=  str.charAt(str.length()-1)) return false;
        else {
            isPalindromeRec((newNum - lastCifer)/10);
            return true;
        }
    }

}
