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
		bos.writeUTF("홍길동");// 문자 입력
		bos.writeInt(25);
		bos.writeFloat(185.3f);// 실수 입력
		bos.close();// try이 할때는 close() 해주어야한다.
		
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		
		System.out.println("이름 : "+dis.readUTF());
		System.out.println("나이 : "+dis.readInt());
		System.out.println("키 : "+dis.readFloat());
		
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
