package org.zerock.ui;

import java.util.Map;
import java.util.Scanner;

public class MainUI extends AbstractUI{
	
	private Map<String, CommonUI> uiMap;
	
	public MainUI(Scanner scanner, Map<String, CommonUI> uiMap) {
		super(scanner);
		this.uiMap = uiMap;
		// TODO Auto-generated constructor stub
	}
	
	//사용자가 1번을 누르면 게임..
	//사용자가 2번을 누르면 도형..
	// --> 이것을 MainUI로 만듬
	
	//1번일때 , 2번일때  if문을 사용하지않고 만드려면?
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		String oper = printStr("1.Game UI, 2.ShapeUI");
		
		uiMap.get(oper).execute();
		
		execute();
	}

}
