import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[9];
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < 9 ; i++){
            a[i] = sc.nextInt();
            if(max < a[i]){
                max = a[i];
                index = i;
            }
            sc.close();
        }
        System.out.printf("%d\n%d",max,index+1);
    }
}
