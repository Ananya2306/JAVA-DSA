import java.util.*;
public class Pattern15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-1;j++){
                System.out.println("*");
            }
            for(int k =1;k<=n;k++){
                System.out.println("*");
            }

        }
        sc.close();
    }
}
