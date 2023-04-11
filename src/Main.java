public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        fizzBuzz(65);
        recursion.printIncre(3);
        recursion.printDecre(4);
        System.out.println(recursion.digitsAmount(444444));
        System.out.println(recursion.sumNat(4));
        System.out.println(recursion.factorial(4));
        System.out.println(recursion.fibonacciRec(4));
        System.out.println(recursion.recursivePow(2, 3));
        recursion.invertedDigits(123456);
        System.out.println("aqui debiera ir el rectangulo");
        recursion.rectanglePerScreen(5, 4);
        recursion.trianglePerScreen(4, 5);
        recursion.invertedTrianglePerScreen(4, 5);
        System.out.println(recursion.isAlphabeticallyOrdered("a"));
        System.out.println(recursion.isAlphabeticallyOrdered("abc"));
        System.out.println(recursion.isAlphabeticallyOrdered("casa"));
        System.out.println(recursion.isPalindrome("casa"));
        System.out.println(recursion.isPalindrome("a"));
        System.out.println(recursion.isPalindrome("asosa"));
        System.out.println(recursion.numToBinary(3));
        System.out.println(recursion.numToBinary(0));
        System.out.println(recursion.numToBinary(10));
        System.out.println(recursion.numToBinary(11));
        System.out.println(recursion.numToBinary(100));
        System.out.println(recursion.numToBinary(7));
        System.out.println(recursion.numToBinary(12));
        System.out.println(recursion.numToBinary(99));
        System.out.println(recursion.binaryToNum("1100100"));
        System.out.println(recursion.binaryToNum("1100011"));
        System.out.println("numerically true "+ recursion.isNumericallyOrdered(1234));
        System.out.println("numerically true "+ recursion.isNumericallyOrdered(0));
        System.out.println("numerically false "+ recursion.isNumericallyOrdered(1432));
        System.out.println("true 0 binary " + recursion.isBinary(0));
        System.out.println("true binary" + recursion.isBinary(11000111));
        System.out.println( "false binary" + recursion.isBinary(11000112));
        System.out.println( "true binary" + recursion.isBinary(10));
        System.out.println( "true pal 101" + recursion.isPalindromeRec(101));
        System.out.println( "false pal 102" + recursion.isPalindromeRec(102));

    }

    private static void fizzBuzz(int n) {
        if( n<= 0 || n >= 200000){ return; }
        for (int i = 1; i < n + 1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz"); }
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz"); }
            if(i % 3 != 0 && i % 5 != 0){
                System.out.println(i);}
        }
    }



}