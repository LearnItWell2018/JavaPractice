public class Test {

    private int air = 2;
    protected float b = 2.5f;
    public double c = 2.5;
    char d = 'c';

    Number n = 2;
    String s = null;
    Double de = null;
    Float floatF = null;

    private int function(int x) {
        method1(x);
        return x * x + air;
    }

    public int function1(int x) {
        return x * x * x + function(x);
    }

    private void method1(int x) {
        System.out.println("From Method 1 = " + x);
        return;
    }

    public int function1(float x) {
        return 2;
    }

    public String spellSwitch(int x) {

        switch (x) {
            case 1: {
                return "one";
            }
            case 2: {
                return "two";
            }
            case 3: {
                return "three";
            }
            case 4: {
                return "four";
            }
            default: {
                return "others";
            }
        }
    }

    public String spellSwitchBreak(int x) {

        String spelling;

        switch (x) {
            case 1: {
                spelling = "one";
                break;
            }
            case 2: {
                spelling = "two";
                break;
            }
            case 3: {
                spelling = "three";
                break;
            }
            case 4: {
                spelling = "four";
                break;
            }
            default: {
                spelling = "others";
                break;
            }
        }

        return spelling;
    }

    public void loopFor() {
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        System.out.println(" ======================= i++");

        for (int i = 0; i < 10; i++) {
            System.out.println("1");
        }

        System.out.println(" ======================= i+=1");

        for (int i = 0; i < 10; i += 1) {
            System.out.println(1);
        }

        System.out.println(" ======================= i = i + 2");

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("1");
        }

        System.out.println(" ======================= print i");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" ======================= print even");

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println(" ======================= print odd");

        for (int i = 1; i <= 9; i = i + 2) {
            System.out.println(i);
        }

        System.out.println(" ======================= break");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }

        System.out.println(" ======================= reverse ");

        for (int i = 10; i >= 0; i -= 1) {
            System.out.println(i);
        }
    }

    public void loopFor(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------Prime number until 100");
        for (int i = 2; i <= x; i++) {
            System.out.println(i);

        }
    }

    /**
     * 1 * 2 * 3 * 4 * 5 ..... = 120
     *
     * @param x
     */
    public void factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    /**
     * 1 + 2 + 3 + 4 + 5 .... = 15
     *
     * @param x
     */
    public void addTillTheInputValue(int x) {
        int sumValue = 0;
        for (int i = 1; i <= x; i++) {
            sumValue = sumValue + i;
        }
        System.out.println(sumValue);
    }

    /**
     * 1,1,2,3,5,8,13
     *
     * @param x
     */
    public void fibonacci(int x) {
        int v1 = 1;
        int v2 = 1;
        int v3 = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println(v2);
            v3 = v1 + v2;
            v2 = v1;
            v1 = v3;
        }
    }

    public void printStar(int x) {
        String s = "";
        for (int i = 1; i <= x; i++) {
            s = s + "*";
            System.out.println(s);
        }
    }


    public void printReverseSar(int x) {

        for (int i = 1; i <= x; i++) {//Outerloop
            System.out.println("");
            for (int j = 0; j <= x - i; j++) {//Inerloop
                System.out.print("*");
            }
        }

    }

    public void printPyramid(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i + 1; n++) {
                System.out.print("a");
            }
            System.out.println();


        }

    }

    public void printStructure(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(i + 1);

            }
            System.out.println();
        }
    }

    public boolean isItPrime(int x) {
        if (x < 1) {
            return false;
        }
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                return false;
            }


        }
        return true;

    }


    public void printMultipleOfNumber(int x) {

        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }


        }
    }

    public void printPrimeTill1(int x) {
        for (int i = 1; i <= x; i++) {
            //Logic to detect prime number start
            boolean isPrime = true;

            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    isPrime = false;
                }
            }

            //Logic to detect prime number end
            if (isPrime) {
                System.out.println(i);
            }


        }

    }

    public void printGrid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printNumber(int x) {
        int value = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < i + 1; n++) {
                value = value + 1;
                System.out.print(value);

            }
            System.out.println();
        }
    }

    public void printDiamond(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void printInvertedStar(int x) {
        for (int i = x; i >= 1; i--) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printHollowStar(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public void printAbsPyramid(int x) {


        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i + 1; n++) {

                System.out.print(Math.abs(i - n));
            }
            System.out.println();


        }


    }

    public void printIncreaseNumber(int x) {


        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i + 1; n++) {
                if (i - n < 0) {

                    System.out.print(n - i);
                } else {
                    System.out.print(i - n);
                }

            }
            System.out.println();
        }
    }

    public void printHollowDiamond(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else if (k == 2 * i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 2 * i - 1; n++) {
                if (n == 0) {
                    System.out.print("*");
                } else if (n == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }

    public void printSquareNumber(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (j == 1) {
                    System.out.print(" 7 ");
                } else if (j == x) {
                    System.out.print(" 7 ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printHalfDiamond(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public void printButterfly(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public void printTable(int x) {

        for (int i = 1; i < 11; i++) {
            System.out.println(x * i);
        }
    }

    public void patternsOne(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void hollowRectangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x + 1; j++) {
                if (i == 1 || j == 1 || i == x || j == x + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void halfPyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternsTwo(int x) {
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int calculateSum(int x, int y) {
        int sum = x + y;
        return sum;

    }

    public void leftPyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public void numberPyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void reverseNumberPyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void floydTriangle(int x) {
        int number = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

        }


    }

    public void printMatrix(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void printRhombus(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= x; n++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }

    public void numberPyramid1(int x) {


        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {

                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    public void flyPattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void palindromicPattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int n = i; n >= 1; n--) {
                System.out.print(n);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public void ReverseNumber1(int x) {
        int rem;
        int rev = 0;
        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println(rev);
    }

    public void reverseString() {
        String name = " Shalini";
        int length = name.length();
        String rev = "";
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of " + name + "is" + rev);
    }


    public static void getGreater(int a, int b) {
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");

        }

    }

    public void isEligible(int age) {
        if (age > 18) {
            System.out.println("Eligible for vote");

        } else {
            System.out.println("Not Eligible for vote");
        }
    }

    public void printDiagonal(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();

        }
    }

    public void sumOfNumbers(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println(sum);
    }

    public void sumOfOdd(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) ;
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void sumNaturals(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void invertedNumberPyramid(int x) {

        for (int i = 1; i <= x; i++) {

            for (int k = 5; k >= i; k--) {
                System.out.print(k);

            }
            System.out.println();

        }

    }

    public void patternSix(int x) {
        for (int i = 1; i <= x; i++) {
            int number = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number + x - j;
            }
            System.out.println();
        }
    }


}






















































