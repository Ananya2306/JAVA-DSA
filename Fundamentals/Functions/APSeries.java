import java.util.Scanner;
/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
Explanation :
Input is 4 and print the first 4 numbers that are not divisible by 4 and
 are of the form 3N + 2, where k is a non-negative integer.
 */
public class APSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        System.out.print("The AP series is:- ");
        int x;
        int a=1;
        for(int i=1;a <= n;i++) {
             x = 3 * i + 2;
            if (x % 4 > 0) {
                System.out.print(x + " ");
              a++;
            }
            
        }
        sc.close();
    }
}
