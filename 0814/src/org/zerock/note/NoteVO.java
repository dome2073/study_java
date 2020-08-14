package org.zerock.note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class NoteVO {
	private int from;
	private int to;
	private char state ='N';
	private String content;
}
