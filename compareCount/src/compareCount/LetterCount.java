package compareCount;

//���ĺ�ī��Ʈ DTO
public class LetterCount implements Comparable<LetterCount>{
	private char ch;
	private int count;
	
	
	public LetterCount(char ch) {
		super();
		this.ch = ch;
		this.count = 0; //=0
	}
	
	@Override
	public String toString() {
		return "LetterCount [ch=" + ch + ", count=" + count + "]";
	}
	
	//count�� ����
	public void inc() {
		this.count++;
	}
	
	//����
	@Override
	public int compareTo(LetterCount o) {
		
		//ū�� ����
		return o.count - this.count;
	}
	
}
