package WVA;
import java.io.*;
import java.util.Scanner;
public class march_1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] result;
		String answer = "";
		String input = br.readLine(); //���� ���� �Է� ����!!
		
		String[] sentence = new String[Integer.parseInt(input)]; //���� ������ŭ ���پ� �޾Ƶ帱 �迭 ����

		for(int i =0; i <Integer.parseInt(input); i++){ // ���پ� �迭�� �ֱ�
           sentence[i] = br.readLine();
		}
		
		for(int i=0; i<sentence.length; i++) {
			String[] word = sentence[i].split("");
			for(int j=0; j< word.length; j++) {
				if(word[j].equals("a") ||word[j].equals("A") || word[j].equals("e")||word[j].equals("E") ||
						word[j].equals("i") || word[j].equals("I") || word[j].equals("o") || word[j].equals("O") ||
								word[j].equals("U") ||	word[j].equals("u")) {					
					answer = answer + word[j];					
				} 
			}
			if(!answer.isEmpty())
			answer = answer +"\n";
		}
		bw.write(answer);
		if(answer.isEmpty()) {
			bw.write("???");
		}
		bw.flush();
	}
}
