import java.util.Scanner;
/*
Pattern for N = 4

*000*000*
0*00*00*0
00*0*0*00
000***000

 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(2*n+1);j++){
                if(j==i || j==n+1 || j==(2*n+1-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
