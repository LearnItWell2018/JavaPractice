import org.w3c.dom.ls.LSOutput;

public class PlotGraph {



    public static void main(String[] args) {
        int startX = -10;
        int endX = 10;
        for (int x = startX; x <= endX; x++) {
            int y = 2*x + 4 ;
            System.out.print("x =" + x + " " + "y = " + y + " ");
            for (int i = 0; i< y; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

