import java.util.ArrayList;
import java.util.List;

//List 예제
public class ListEx {
	public static void main(String[] args) {
		// <>는 제네릭
		//자료구조 안에 어떤 타입을 담을 수 있는지
		List<String> list = new ArrayList<String>(); //배열과 다르게 크기를 정해주지 않아도됨
		
		list.add("word");
		list.add("apple");
		list.add("samsong");
		list.add("ibm");
		
		//tosting이 오버라이딩 되어있음
		//인덱스 안구해도됨 --> 등 편리
		
		System.out.println(list);
		
		//예를들어 중간에 값을 추가하고 싶은 경우
		list.add(2,"ZZZ");
		
		//추가됨
		
		//조회
		//파라미터가 int == 인덱스다 --> 몇번째꺼를 꺼낼거다
		System.out.println(list.get(3));
		System.out.println(list);
		
		//삭제
		//인덱스로 삭제 or object를 넣어서 삭제
		//EX) ibm
		//리스트 안에 ibm을 지워줌
		list.remove("ibm");
		//출력 
		System.out.println(list);
		
		//리스트안에 객체를 넣어보자 , 국여수 
	}
}
