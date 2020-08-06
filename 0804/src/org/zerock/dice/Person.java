package org.zerock.dice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

//생성자를 여러개 만들고 싶지않을경우
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	private String id;
	private String pw;
	private String name;
	private String email;

//생성자를 생성해논대로 만들지않고 원하는대로 만들고싶은 경우 
//(ex) id,pw,name,email을 다 입력받지 않고 원하는 값만 입력받을떼
	Person p = Person.builder()
			.id("AAA")
			.pw("BBB")
			.build();
}
