package org.zerock.dice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

//�����ڸ� ������ ����� �����������
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	private String id;
	private String pw;
	private String name;
	private String email;

//�����ڸ� �����س��� �������ʰ� ���ϴ´�� �������� ��� 
//(ex) id,pw,name,email�� �� �Է¹��� �ʰ� ���ϴ� ���� �Է¹�����
	Person p = Person.builder()
			.id("AAA")
			.pw("BBB")
			.build();
}
