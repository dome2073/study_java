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
		
		String[] bingoArr = {"����", "�η��", "Ȳ��", "��ѱ�", "�����", 
							 "����", "Ÿ��", "�ξ���", "�û���", "���",
							 "��", "��", "������","�ײ�", "��",
							 "����", "������", "�ܵ�", "��Ȳ", "����",
							 "��ġ", "���", "�޹���", "�Ҳ���","���"
		
		};
		
		Frame f = new Frame("GridLayoutTest");
		f.setSize(800, 500);
		f.setLayout(new GridLayout(6, 5)); // 3 2 . �� ���� ���̺��� �����
		
		for(int i=0; i<bingoArr.length; i++) {
			//3. ������ ������ Ŭ������ �ν��Ͻ��� �����ؼ� �̺�Ʈ �ҽ��� �����ʷ� ���
			Button btn1 = new Button(bingoArr[i]);
			btn1.addActionListener(new ButtonEventHandler());
			f.add(btn1);
			
		}

		//---ȭ�鱸��
		
		//---�̺�Ʈ
		//1. �޼��� �� �ʿ��� ���� ã�´�
		
		
		//2. ������ �޼��尡 �����ִ� �������̽��� ����
		
		//3. ������ ������ Ŭ������ �ν��Ͻ��� �����ؼ� �̺�Ʈ �ҽ��� �����ʷ� ���

		//�������
		
		//1. ����ڰ� �Է��� ������  5x5�� ä���
		TextField textField = new TextField(10);
		bingo.setTextField(textField);
		
		
		//�̺�Ʈ ���
//		input.addTextListener(new KeyEventHandler());
		f.add(textField);
		
		Button btn = new Button("�Է�");
		btn.addActionListener(new inputButtenEventHandler());
		f.add(btn);
		//2. �̹� ����Ǿ��ִ� �迭���� ���Ƿ� 25�� ����Ѵ�.
		
		//3. ����ڴ� ����Ѱ��� ���� üũ�Ѵ�.
		
		//4. ������ �Ϸ�Ǹ� ����
		
		
		f.setVisible(true);

	}
	

}
//2. ������ �޼��尡 �����ִ� �������̽��� ���� - ������ ��ư Ŭ����
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
