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
		
		int empty_count = 0;
		
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
				empty_count++;
			}
			else { //������ �ִٸ� �� ������ �迭�� ����
				m_sentence[i] = answer;
			}
			answer = ""; //�ѹ����� ������ �� �Ŀ��� �ʱ�ȭ ������ ������, ������� ��� ������!
		}
		
		for(int i=0; i<m_sentence.length; i++) {
			if((i<m_sentence.length-1)) {
				bw.write(m_sentence[i]+"\n");
			}
			else {
				bw.write(m_sentence[i]);
			}
			
		}
		/*if(empty_count == m_sentence.length) {
			bw.write("???");
		}*/
		
		bw.flush();
	}
}
