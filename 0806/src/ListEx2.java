import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx2 {
	public static void main(String[] args) {
		List<Score> scoreList = new ArrayList<>();
		
		//add() 에 스코어의 객체
		//new ~ 는 요즘 안쓰이기 떄문에 builder로 (lombok)
		// 코드를 절약할 수 있다, 필요한 만큼만 만들 수 있다; //마지막은 build()로 끝내줌.
		//new Score("국어",89); 와 동일
		scoreList.add(Score.builder().subject("국어").value(89).build());
		scoreList.add(Score.builder().subject("영어").value(50).build());
		scoreList.add(Score.builder().subject("수학").value(14).build());
		
		//만약 수학 점수를 출력할려면 어떻게?
		//Scroe클래스에 추가
		
		String name = "수학";
		
		//인덱스 번호를 알아야하는 문제가 생김
		
		int idx = scoreList.indexOf(Score.builder().subject(name).build()); 
		
		System.out.println(idx);
		
		Score result = scoreList.get(idx);
		
		System.out.println(result);
		
		//정렬 기준
		int target = 80; 
		
		//자체가 클래스임
		//외부에 있는 변수들에 접근하고 싶을때 사용한다 --> 익명클래스
		//익명클래스는 요즘 람다로 쉽게 표현함
		Collections.sort(scoreList, new Comparator<Score>() {

		//익명클래스
			@Override
			public int compare(Score o1, Score o2) {
				int gap1 = o1.getValue() - target; //외부인 target을 사용할 수 없어야하지만 사용가능
				int gap2 = o2.getValue() - target;
				// TODO Auto-generated method stub
				return gap1 > gap2?-1 : 1;
			}
		});
		
		System.out.println(scoreList);
		
		//만약 검색할때 -1이 나오면 값이 없는것 ex)name ="과학" 은 idx = -1 
		
		//인터페이스는 전혀다른 타입을 하나로 묶기위해 사용
		//정렬을 하려면 반드시 비교를 해야됨

		//기본 순서대로 정렬을 하고싶으면 클래스 이름 뒤에 comparable
		

		
		System.out.println(scoreList);
		
		
		//50점 이상인 사람만 가져오기
		
		List<Score> highScores = scoreList.parallelStream()
		.filter(s -> s.getValue() >= 50)
		.collect(Collectors.toList());;
		
		System.out.println(highScores);
		
		
	
		
		
	}
}
