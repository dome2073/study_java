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
	
	//����ڰ� 1���� ������ ����..
	//����ڰ� 2���� ������ ����..
	// --> �̰��� MainUI�� ����
	
	//1���϶� , 2���϶�  if���� ��������ʰ� �������?
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		String oper = printStr("1.Game UI, 2.ShapeUI");
		
		uiMap.get(oper).execute();
		
		execute();
	}

}
