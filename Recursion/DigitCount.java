import java.util.Scanner;

public class DigitCount {
    public static int Digit(int n){
        if(n<10){
            return 1;
        }
        return 1+Digit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println(Digit(n));
        sc.close();
    }
}
