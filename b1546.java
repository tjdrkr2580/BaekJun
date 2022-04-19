import java.util.Scanner;

public class b1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n = sc.nextInt();
        int[] a = new int[n];
        float v = 0;
        int max = 0;
        max = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            v += (float)a[i] / max * 100;
        }
        sc.close();
        System
            .out
            .println(v / n);
    }
}
