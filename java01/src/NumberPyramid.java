public class NumberPyramid {

    public static void printCharacter() {
        String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] characters = ch.toCharArray();
        System.out.println(characters.length);
        int x = 8;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(ch.charAt(k) + " ");

            }
            System.out.println();

        }

    }

    public static void printNumber(int x) {
        int number = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printNumber(9);


        String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] characters = ch.toCharArray();
        int number = 0;

        System.out.println(characters.length);
        int x = 7;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(ch.charAt(number) + " ");
                if(number==25){
                    number=-1;
                }


                number++;

            }

            System.out.println();


        }


    }


}

