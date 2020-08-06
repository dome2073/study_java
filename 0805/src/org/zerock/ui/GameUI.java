package org.zerock.ui;

import java.util.Scanner;

public class GameUI extends AbstractUI{
	
	//부모클래스 생성자
	public GameUI(Scanner scanner) {
		super(scanner);
		// TODO Auto-generated constructor stub
	}
	
	//구현내용 abstract이기 떄문에 오버라이딩이 강제됨
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		print("GAME UI.............");
	}
	
	//사용자가 1번을 누르면 게임..
	//사용자가 2번을 누르면 도형..
	// --> 이것을 MainUI로 만듬
	
	
}
