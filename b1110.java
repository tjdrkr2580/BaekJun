import java.util.Scanner;

public class b1110 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        sc.close();
		int copy = a;
		int n=1;
		int check = a/10+a%10;
		if(check >=10)
			check%=10;
		a=(a%10)*10+check;
		while(copy!=a) 
		{
			check = a/10+a%10;
			if(check >=10)
				check%=10;
			a=(a%10)*10+check;
			n+=1;
		}
		System.out.println(n);
	}
}