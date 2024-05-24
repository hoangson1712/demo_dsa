public class demo_recursion {

    public static void main(String[] args) {

        /**
         *      Recursion = When a thing is defined in terms of itself.
         *                  Apply the result of a procedure, to a procedure.
         *                  A recursive method calls itself. Can be a substitute for iteration.
         *                  Divide a problem into sub-problems of the same type as the original.
         *                  Commonly used with advanced sorting algorithms and navigating trees
         *
         *                  Advantages:
         *                  1. easier to read/write
         *                  2. easier to debug
         *
         *                  Disadvantages:
         *                  1. sometimes slower
         *                  2. uses more memory
         */

//        walk(500);
//        System.out.println(factorial(4));
        System.out.println(power(2,8));

    }

    private static int power(int base, int exponent) {

        if(exponent < 1) return 1; // Base case
        return base * power(base,exponent - 1); // Recursive

    }

    private static int factorial(int num) {

        if(num < 1) return 1; // Base case
        return num * factorial(num - 1); // Recursive

    }

    private static void walk(int steps) {

//        for(int i = 0; i < steps; i++){
//            System.out.println("You take a step!");
//        }

        if(steps < 1) return;
        System.out.println("You take a step!");
        walk(steps - 1);

    }

}
