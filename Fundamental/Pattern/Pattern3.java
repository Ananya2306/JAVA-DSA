import java.util.*;
/*
 Input => height = 4 
         width = 4
Output =>
 ****
 ****
 ****
 ****
 */
public class SolidRect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle:");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the rectangle:");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
