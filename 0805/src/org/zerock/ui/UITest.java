package org.zerock.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UITest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//enum으로 추가하려면 ??
		
		Map<String, CommonUI> map = new HashMap<>();
		map.put("1", new GameUI(scanner));
		map.put("2", new ShapeUI(scanner));

		MainUI ui = new MainUI(scanner, map);

		ui.execute();

	}
}
