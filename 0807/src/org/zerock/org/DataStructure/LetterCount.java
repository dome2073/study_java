package org.zerock.org.DataStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
//���� ���� ���ĺ� ���� idx�� hashmap���� �ٲ㺸��
public class LetterCount {
	
	private char ch;
	private int count;
	
	//�����ϴ� �޼���
	public void inc() {
		this.count += 1;
	}
	
}
