import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectTest ot = new ObjectTest("홍길동",25,185.3f);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(ot);
		oos.close();// 보내는 쪽
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		ObjectTest data = (ObjectTest)ois.readObject();		
		System.out.println("이름 : "+data.getName());
		System.out.println("이름 : "+data.getAge());
		System.out.println("이름 : "+data.getHeight());
	}

}
