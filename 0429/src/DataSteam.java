import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataSteam {

	public static void main(String[] args) {
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("result.txt"));
	
		try{
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream bos = new DataOutputStream(fos);
		bos.writeUTF("ȫ�浿");// ���� �Է�
		bos.writeInt(25);
		bos.writeFloat(185.3f);// �Ǽ� �Է�
		bos.close();// try�� �Ҷ��� close() ���־���Ѵ�.
		
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		
		System.out.println("�̸� : "+dis.readUTF());
		System.out.println("���� : "+dis.readInt());
		System.out.println("Ű : "+dis.readFloat());
		
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
