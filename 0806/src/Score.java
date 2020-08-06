import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//�� ������ ����

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "subject") //�迭�� ��� {}��
@Getter
//��κ��� �������̽��� ��κ� �߻�޼��尡 �����Ƿ� �޼��带 �����ؾ���
public class Score implements Comparable<Score>{	
	
	private String subject; //���� �̸�
	private int value; //����
	
	//Score = ���� ���ϴ� ��ü
	//��� �Ǵ� ������ ��ȯ�ϸ��
	@Override
	//compareTo = �⺻
	public int compareTo(Score arg0) {
		//��������(this.value)�� �ٸ����� (o)�� ���ϸ��
		return this.value > arg0.value ? 1 : -1 ;
		
	}
	
	//�������� --�ʿ��� �� ���� ���
	
	
	
	//@EqualsAndHashCode�� ���� 
	/*
	 * @Override public int hashCode() { //�ӽ÷� Ȯ���ϱ�����
	 * System.out.println("HashCode"); final int prime = 31; int result = 1; result
	 * = prime * result + ((subject == null) ? 0 : subject.hashCode()); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * System.out.println("������equals : "+ obj); if (this == obj) return true; if
	 * (obj == null) return false; if (getClass() != obj.getClass()) return false;
	 * Score other = (Score) obj; if (subject == null) { if (other.subject != null)
	 * return false; } else if (!subject.equals(other.subject)) return false; return
	 * true; }
	 */
	
	
}
