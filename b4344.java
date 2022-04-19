import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; 
public class b4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < testcase ; i++) {
			st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
			int N = Integer.parseInt(st.nextToken());	//학생 수 
			arr = new int[N];
			double sum = 0;
			for(int j = 0 ; j < N ; j++) {
				int val = Integer.parseInt(st.nextToken());	
				arr[j] = val;
				sum += val;	
			}
			double mean = (sum / N) ;
			double count = 0; 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}
	