package WVA;
import java.io.*;
import java.util.Scanner;
public class march_1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] result;
		String answer = "";
		String input = br.readLine(); //줄의 갯수 입력 받음!!
		
		String[] sentence = new String[Integer.parseInt(input)]; //줄의 갯수만큼 한줄씩 받아드릴 배열 생성

		for(int i =0; i <Integer.parseInt(input); i++){ // 한줄씩 배열에 넣기
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
