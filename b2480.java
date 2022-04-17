import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int count = 0;
        int max = a;
        int result = 0;
        int same = 0;

        if (a == b) {
            count += 1;
            same = a;
        }
        if (b == c) {
            count += 1;
            same = b;
        }
        if (a == c && a != b) {
            count += 1;
            same = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        switch (count) {
            case 0:
                result = 100 * max;
                System.out.println(result);
                break;
            case 1:
                result = 1000 + (same * 100);
                System.out.println(result);
                break;
            case 2:
                result = 10000 + (max * 1000);
                System.out.println(result);
                break;
        }
    }
}
