import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        short b = sc.nextShort();
        sc.close();
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
