import java.util.Scanner;

public class b2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        sc.close();

        System.out.printf("%d\n", a * (b.charAt(2) - '0'));
        System.out.printf("%d\n", a * (b.charAt(1) - '0'));
        System.out.printf("%d\n", a * (b.charAt(0) - '0'));
        System.out.printf("%d\n", a * Integer.parseInt(b));
    }
}
