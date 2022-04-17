import java.util.Scanner;

public class b1920 {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                System.out.printf("수: %d %d\n", arr1[i], arr2[j]);
                if (arr2[j] == arr1[i]) {
                    count = 1;
                    System.out.println("1");
                    break;
                }
                if (count == 0)
                    System.out.println("0");
            }

        }
    }
}