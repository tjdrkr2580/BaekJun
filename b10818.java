import java.util.Scanner;

public class b10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        min = a[0];
        sc.close();
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }
        }
        System
            .out
            .printf("%d %d", min, max);
    }
}