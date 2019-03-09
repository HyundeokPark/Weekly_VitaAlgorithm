package WVA;
import java.io.*;

public class March1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] point = new int[2];
		int[] num;

		for(int i=0; i<2; i++) {
			point[i] = Integer.parseInt(br.readLine());
		}
		
		num = new int[point[1] - point[0]+1];
		
		int j = 0;
		for(int i=point[0]; i<=point[1]; i++) {
			num[j] = i;
			j++;
		}
		
		for(int i=0; i<num.length; i++) {
	
		}
		
		

	}

}
