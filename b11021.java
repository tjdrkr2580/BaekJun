import java.util.Scanner;

public class b11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0 ; i < n ; i++){
            System.out.printf("Case #%d: %d\n",i+1,a[i]+b[i]);
        }
    }
}