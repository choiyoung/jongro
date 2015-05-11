import java.util.ArrayList;


public class PersonMain {
	
	public ArrayList<PersonDTO> init(){
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("코난",16);
		PersonDTO cc = new PersonDTO("루피",21);
		
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
			System.out.println("이름 : "+dto.getName()+"나이 : "+dto.getAge());
			
		}

	}

}
