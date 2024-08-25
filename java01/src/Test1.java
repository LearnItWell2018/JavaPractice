public class Test1 {

    private int air = 2;
    protected float b = 2.5f;
    public double c = 2.5;
    char d = 'c';

    Number n = 2;
    String s;
    Double de;
    Float floatF;

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
    void go(){
        int y =7;
        for(int x =1; x < 7; x++){
            y++;
            if (x > 4){
                System.out.println(++y + " ");
            }
            if (y > 14){
                System.out.println(" X = " + x);
                break;
            }
        }
    }
    void multiFor(){
        for(int x =0; x < 4; x++){
            for(int y = 4; y > 2; y--){
                System.out.println(x + y + " ");
            }
            if (x==1){
                x++;
            }
        }
    }


    public static void main(String[] args) {
        int x = 1;
        while (x < 4) {
            System.out.println("In the loop value of loop is" + x);
            x = x + 1;
            System.out.println("After the loop value of loop is" + x);

        }

        int beerNum = 99;
        String word = " Beer bottle";
        while (beerNum > 0){
            if(beerNum==1){
                word="Beer bottle";
            }
            System.out.println(beerNum + " "+ word+"beer on the wall");
            System.out.println(beerNum+ " "+ word+"of beer");
            System.out.println("Take one down. pass it around");
            beerNum=beerNum-1;
            if(beerNum >0){
                System.out.println(beerNum+ " " + word+ "of beer on the wall");
            }else{
                System.out.println("No more beer bottle");
            }

        }

        String [] worldListOne = {"Tier", "front-end", "Random", "Coach", "Cricket"};
        String [] worldListTwo = {"Smart", "empowered", "centric", "point", " paint", "brush"};
        String [] wordListThree = {"Cricket", "hockey", "Basketball", "football", "polo"};
        int OneLength = worldListOne.length;
        int twoLength = worldListTwo.length;
        int ThreeLength = wordListThree.length;
        // generate random numbers---
        int rand1= (int) (Math.random()* OneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* ThreeLength);
        //Build a new phrase---
        String phrase = worldListOne[rand1] + " "+ worldListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(" What we need is " + " " + phrase);

        int a = 3;
        Test1 one = new Test1();
        one.go();
        one.multiFor();
        
    }

}

