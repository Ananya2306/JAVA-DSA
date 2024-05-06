import java.util.Scanner;
/*
Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and
the grade (an uppercase character),
depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only.
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
 */
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Basic Salary:- ");
        int basic = sc.nextInt();
        System.out.print("Enter your Grade:- ");
        char grade = sc.next().charAt(0);

        double HRA = (0.2)*basic;
        double DA = (0.5)*basic;
        int Allow;
        if(grade =='A') {
            Allow = 1700;
        }else if(grade=='B'){
            Allow = 1500;
        }else{
            Allow = 1300;
        }
        double PF = (0.11)*basic;

        double Total_salary = (basic+HRA+DA+Allow-PF);
        int ans = (int)Math.round(Total_salary);
        System.out.println("The Total Salary is :- " + ans);

        sc.close();

    }
}
