import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int[] a = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            a[i] %= 42;
        }
        sc.close();

        for (int i = 0 ; i < 10 ; i++){
            int temp = 0;
            for(int j = i ; j >= 0 ; j--){
                if(a[i] != a[j]){
                    temp++;
                }
                if(temp == i){
                    count++;
                }
            }
        }
        System.out.println(count);
        }
    }