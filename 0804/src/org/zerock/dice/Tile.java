package org.zerock.dice;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@AllArgsConstructor

public class Tile {
	
	private int num; //1~100 타일 칸
	private Tile link; //링크
}
