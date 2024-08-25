public class LoopQuestion {
    public void printTable(int x) {
        int number = 2;
        for (int i = 1; i <= x; i++) {
            System.out.println(number + "X" + i + "=" + number * i);


        }
    }

    public void reverseTable(int x) {
        int number = 3;
        int i;
        for (i = x; i >= 1; i--) {
            System.out.println(number + "X" + i + "=" + number * i);

        }


    }
    public static void main(String[]args){
        LoopQuestion lq = new LoopQuestion();
        lq.printTable(10);
        lq.reverseTable(10);
    }
}
