package ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("news.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("����� �غ��� �Դ�");
		bw.newLine();
		bw.write("����� ����");
		bw.newLine();
		bw.write("��� ��");
		bw.close();
		System.out.println("��� �ۼ� �Ϸ�");
	}

}
