import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IO: �Է°� ���
// IO stream : �Է°� ����� ���� ����� �޶�.
// Reader : �Է�
// Writer : ���

public class ExceptionTest2 {
	private int dan;
	
	public void input() throws NumberFormatException, IOException{//����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// System.in�� in�� InputStream���·� ��� ���ڴٰ� ���� �ϴ°�
		System.out.print("���ϴ� ���� �Է����ּ��� : ");
		dan = Integer.parseInt(br.readLine());
		
		
	}
	public void output(){
		if(dan>=2 && dan<=9){
			for(int i=1;i<=9;i++){
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
		else{ 
		try{//System.out.println("������ ������ �ʰ��ϼ̽��ϴ�.");
			throw new Exception("�����ʰ�");// ������ Exception �߻�
			//throw new MakeException("�����ʰ�");//����ڰ� Exception�� ����� ����
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{ //throws�� ������ ��°� throw�� ������ �߻���Ŵ
		ExceptionTest2 et = new ExceptionTest2();
		et.input();//ȣ��
		et.output();
		
		
	}

}
// Override�� �� �޼ҵ忡�� throws�� ��� �Ҽ�����.Override������ try�� catch�� ��� �Ͽ��� �Ѵ�.