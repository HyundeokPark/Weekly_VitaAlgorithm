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
		
		String input = br.readLine(); //���� ���� �Է� ����!!
		String[] sentence = new String[Integer.parseInt(input)]; //���� ������ŭ ���پ� �޾Ƶ帱 �迭 ����
		
		String[] m_sentence = new String[sentence.length]; //������ ��Ƶ� �迭
		
		for(int i =0; i <Integer.parseInt(input); i++){ // ���پ� �迭�� �ֱ�
           sentence[i] = br.readLine();
		}
		
		for(int i=0; i<sentence.length; i++) {//�ܾ �ٽ� ���ڴ����� �ɰ��� word�迭�� ����, �׸��� ������ ��쿡�� sentence�迭�� ������
			String[] word = sentence[i].split("");
			for(int j=0; j< word.length; j++) {
	
				
				if(word[j].equals("a") ||word[j].equals("A") || word[j].equals("e")||word[j].equals("E") ||
						word[j].equals("i") || word[j].equals("I") || word[j].equals("o") || word[j].equals("O") ||
								word[j].equals("U") ||	word[j].equals("u")) {					
					answer = answer + word[j];					
				} 
			}
			if(answer.isEmpty()) { //���ڰ� ���ٸ� ???�� ��� �����Ѵ�.
				m_sentence[i] = "???";
				
			}
			else { //������ �ִٸ� �� ������ �迭�� ����
				m_sentence[i] = answer;
			}
			answer = ""; //�ѹ����� ������ �� �Ŀ��� �ʱ�ȭ ������ ������, ������� ��� ������!
		}
	}
}
