import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class ImportStatic {
	
	public static void main(String[] args) {
		out.println(random());
		out.println(pow(2,5));
	}

}
/*[ù ��° ����] 
[�ʵ�-��������]
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";  //����-���ȭ

[�޼ҵ�]
������ - Scanner�� �̿��ؼ� ������ �Է�
compare() - ��//for��
getName()
getOx(){ return ox; }
getScore()

[ó�����]
�̸� �Է� : ȫ�浿
�� �Է� : 13211

    �̸�       1 2 3 4 5      ����
   ȫ�浿    O X X O O      60
   for���� �̿� �� ä��


2��° ����

   [�ǽ�] ��ü�迭
 //static�� �� ������ ���� ������ ���� ������ ����
Ŭ������ : Fruit
�ʵ�       : pum, jan, feb, mar, tot
               sumJan, sumFeb, sumMar

�޼ҵ�   : ������(������,������,..)
              calc()
              disp()
              output() - static �޼ҵ�

Ŭ������ : FruitMain

[���]
PUM   JAN   FEB   MAR   TOT
==================
���    100    80     75      255  ---> Fruit

����     30     25     10      xxx  ---> Fruit

����     25     30     90      xxx  ---> Fruit

==================
         xxx     xxx   xxx         ---> output()

 */