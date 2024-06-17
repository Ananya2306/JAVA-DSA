package Numbers;
import java.util.Scanner;
/*
A child is running up a staircase with N steps, and 
can hop either 1 step, 2 steps or 3 steps at a time.
Implement a method to count how many possible ways 
the child can run up to the stairs. 
You need to return number of possible ways W.

Sample Input 1:
4
Sample Output 1:
7
 */
public class StairCaseProb {
    public static int Ways(int n){
       if(n==0 || n==1){
        return 1;
       }
       if(n==2){
        return 2;
       }
       return Ways(n-1)+Ways(n-2)+Ways(n-3); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        System.out.println(Ways(n));
        sc.close();
    }
}
