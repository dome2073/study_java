package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//¹°Ç°
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter

public class Item {
	public static int IDX = 0;  

	private int no;
	private String name;
	private int price;
}
