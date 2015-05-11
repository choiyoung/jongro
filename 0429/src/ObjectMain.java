import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectTest ot = new ObjectTest("ȫ�浿",25,185.3f);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(ot);
		oos.close();// ������ ��
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		ObjectTest data = (ObjectTest)ois.readObject();		
		System.out.println("�̸� : "+data.getName());
		System.out.println("�̸� : "+data.getAge());
		System.out.println("�̸� : "+data.getHeight());
	}

}
