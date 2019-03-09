package WVA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class march1_1_rf {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] result;
		String answer = "";
		
		String input = br.readLine(); //줄의 갯수 입력 받음!!
		String[] sentence = new String[Integer.parseInt(input)]; //줄의 갯수만큼 한줄씩 받아드릴 배열 생성
		
		String[] m_sentence = new String[sentence.length]; //모음만 모아둘 배열
		
		for(int i =0; i <Integer.parseInt(input); i++){ // 한줄씩 배열에 넣기
           sentence[i] = br.readLine();
		}
		
		for(int i=0; i<sentence.length; i++) {//단어를 다시 글자단위로 쪼개서 word배열에 저장, 그리고 모음일 경우에만 sentence배열에 재저장
			String[] word = sentence[i].split("");
			for(int j=0; j< word.length; j++) {
	
				
				if(word[j].equals("a") ||word[j].equals("A") || word[j].equals("e")||word[j].equals("E") ||
						word[j].equals("i") || word[j].equals("I") || word[j].equals("o") || word[j].equals("O") ||
								word[j].equals("U") ||	word[j].equals("u")) {					
					answer = answer + word[j];					
				} 
			}
			if(answer.isEmpty()) { //글자가 없다면 ???을 대신 저장한다.
				m_sentence[i] = "???";
				
			}
			else { //모음이 있다면 그 모음을 배열에 저장
				m_sentence[i] = answer;
			}
			answer = ""; //한문장을 지나고 난 후에는 초기화 해주지 않으면, 전문장과 계속 합쳐짐!
		}
	}
}
