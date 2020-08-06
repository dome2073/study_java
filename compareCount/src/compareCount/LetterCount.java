package compareCount;

//알파벳카운트 DTO
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
	
	//count값 증가
	public void inc() {
		this.count++;
	}
	
	//정렬
	@Override
	public int compareTo(LetterCount o) {
		
		//큰값 먼저
		return o.count - this.count;
	}
	
}
