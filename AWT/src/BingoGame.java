import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BingoGame {
	
	TextField textField;
	

	public TextField getTextField() {
		return textField;
	}
	

	public void setTextField(TextField textField) {
		this.textField = textField;
	}


	public static void main(String[] args) {
		
		BingoGame bingo = new BingoGame();
		
		String[] bingoArr = {"참새", "두루미", "황새", "비둘기", "까오기", 
							 "오리", "타조", "부엉이", "올빼미", "뱁새",
							 "꿩", "닭", "구관조","잉꼬", "매",
							 "거위", "독수리", "콘돌", "봉황", "공작",
							 "가치", "까마귀", "앵무새", "꾀꼬리","고니"
		
		};
		
		Frame f = new Frame("GridLayoutTest");
		f.setSize(800, 500);
		f.setLayout(new GridLayout(6, 5)); // 3 2 . 행 열의 테이블을 만든다
		
		for(int i=0; i<bingoArr.length; i++) {
			//3. 위에서 구현한 클래스의 인스턴스를 생성해서 이벤트 소스의 리스너로 등록
			Button btn1 = new Button(bingoArr[i]);
			btn1.addActionListener(new ButtonEventHandler());
			f.add(btn1);
			
		}

		//---화면구성
		
		//---이벤트
		//1. 메서드 중 필요한 것을 찾는다
		
		
		//2. 선택한 메서드가 속해있는 인터페이스를 구현
		
		//3. 위에서 구현한 클래스의 인스턴스를 생성해서 이벤트 소스의 리스너로 등록

		//빙고게임
		
		//1. 사용자가 입력한 것으로  5x5를 채운다
		TextField textField = new TextField(10);
		bingo.setTextField(textField);
		
		
		//이벤트 등록
//		input.addTextListener(new KeyEventHandler());
		f.add(textField);
		
		Button btn = new Button("입력");
		btn.addActionListener(new inputButtenEventHandler());
		f.add(btn);
		//2. 이미 저장되어있던 배열에서 임의로 25번 출력한다.
		
		//3. 사용자는 출력한것을 보고 체크한다.
		
		//4. 한줄이 완료되면 빙고
		
		
		f.setVisible(true);

	}
	

}
//2. 선택한 메서드가 속해있는 인터페이스를 구현 - 빙고판 버튼 클릭시
class ButtonEventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		Button button = (Button)e.getSource();
		
		button.setBackground(new Color(0));
	}
}

//class KeyEventHandler implements TextListener{
//	public void textValueChanged(TextEvent te) {
//		
//		System.out.println(te.paramString());
//		System.out.println();
//	}
//	
//}

class inputButtenEventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		BingoGame bg = new BingoGame();
		System.out.println(bg.getTextField()); 
	}
}
