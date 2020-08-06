import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//각 과목의 점수

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "subject") //배열일 경우 {}로
@Getter
//대부분의 인터페이스는 대부분 추상메서드가 있으므로 메서드를 구현해야함
public class Score implements Comparable<Score>{	
	
	private String subject; //과목 이름
	private int value; //점수
	
	//Score = 나랑 비교하는 객체
	//양수 또는 음수를 반환하면됨
	@Override
	//compareTo = 기본
	public int compareTo(Score arg0) {
		//현재점수(this.value)와 다른점수 (o)와 비교하면됨
		return this.value > arg0.value ? 1 : -1 ;
		
	}
	
	//조건정렬 --필요할 때 마다 사용
	
	
	
	//@EqualsAndHashCode와 같음 
	/*
	 * @Override public int hashCode() { //임시로 확인하기위해
	 * System.out.println("HashCode"); final int prime = 31; int result = 1; result
	 * = prime * result + ((subject == null) ? 0 : subject.hashCode()); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * System.out.println("내부적equals : "+ obj); if (this == obj) return true; if
	 * (obj == null) return false; if (getClass() != obj.getClass()) return false;
	 * Score other = (Score) obj; if (subject == null) { if (other.subject != null)
	 * return false; } else if (!subject.equals(other.subject)) return false; return
	 * true; }
	 */
	
	
}
