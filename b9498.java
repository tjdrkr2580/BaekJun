import java.util.Scanner;

public class b9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a <= 100 && a > 89) {
            System.out.println("A");
        } else if (a <= 89 && a > 79) {
            System.out.println("B");
        } else if (a <= 79 && a > 69) {
            System.out.println("C");
        } else if (a <= 69 && a > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
