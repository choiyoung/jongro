import java.util.ArrayList;


public class PersonMain {
	
	public ArrayList<PersonDTO> init(){
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("�ڳ�",16);
		PersonDTO cc = new PersonDTO("����",21);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		return list;
	}
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		
		ArrayList<PersonDTO> list = pm.init();
		for(PersonDTO dto: list){
			System.out.println("�̸� : "+dto.getName()+"���� : "+dto.getAge());
			
		}

	}

}
