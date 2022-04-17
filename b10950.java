import java.util.Scanner;

public class b10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < num; i++) {
            System.out.printf("%d\n", a[i] + b[i]);
        }
    }
}
