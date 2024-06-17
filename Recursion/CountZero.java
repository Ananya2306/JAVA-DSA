import java.util.Scanner;
public class CountZero {
    /*
     Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
     */
   
        public static int countZeros(int n) {
            if (n == 0) {
                return 1;
            }
         return HelperZero(n, 0);
        }
    
        private static int HelperZero(int n, int count) {
           if (n < 10) {
                return count;
            }
            int lastDigit = n % 10;
            if (lastDigit == 0) {
                count++;
            }
            return HelperZero(n / 10, count);
        }
    
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:- ");
         int n = sc.nextInt();
            System.out.println(countZeros(n));
            sc.close();
        }
    }

