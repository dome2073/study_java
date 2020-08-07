package org.zerock.org.DataStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
//어제 만든 알파벳 비교의 idx를 hashmap으로 바꿔보기
public class LetterCount {
	
	private char ch;
	private int count;
	
	//증가하는 메서드
	public void inc() {
		this.count += 1;
	}
	
}
