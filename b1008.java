import java.util.Scanner;

public class b1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.printf("%.12f", (double) a / b);
    }
}
