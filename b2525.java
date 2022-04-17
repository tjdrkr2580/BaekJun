import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int sm = sc.nextInt();
        sc.close();

        m += sm;
        int tm = m;

        if (m < 60) {
        } else if (m >= 60) {
            tm %= 60;
            m /= 60;
            h += m;
            if (h >= 24) {
                h -= 24;
            }
        }
        System.out.printf("%d %d", h, tm);
    }
}