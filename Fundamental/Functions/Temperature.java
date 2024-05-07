import java.util.Scanner;
/*
 Given three values - Start Fahrenheit Value (S), 
 End Fahrenheit value (E) and
  Step Size (W),
   you need to convert all Fahrenheit values from Start to End at the gap of W,
 into their corresponding Celsius values and print the table.
Note:
You don't have to write the main function or take input.
 It has already been taken care of and you need to just print the integer value .
  Just write the code that prints Fahrenheit to Celsius table in the function itself.
Formula is C = (F - 32) * 5/9

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37

 */
public class Temperature {

    public static void Temp(int S,int E,int W){
        int fahren;
        while(S<=E){
            fahren = (S-32)*5/9;
            System.out.println(S+"\t"+fahren);
            S = S+W;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        Temp(S, E, W);
        sc.close();
    }
}
