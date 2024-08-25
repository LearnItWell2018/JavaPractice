public class PyramidExample {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid
        
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();//
        }
    }
}
