
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Exercise13_5 extends Frame {
	Panel pUp = new Panel();
	Button btnPrevMon = new Button(" ");
	Button btnNextMon = new Button(" ");
	Label lblYearMon = new Label();
	Calendar curMon = Calendar.getInstance();

	Exercise13_5(String title) {
		super(title);
		pUp.setBackground(Color.yellow);
		pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
		pUp.add(btnPrevMon);
		pUp.add(lblYearMon);
		pUp.add(btnNextMon);
		btnPrevMon.addActionListener(new BtnEventHandler());
		btnNextMon.addActionListener(new BtnEventHandler());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				we.getWindow().setVisible(false);
				we.getWindow().dispose();
				System.exit(0);
			}
		});
		add(pUp);
		setBounds(200, 200, 200, 70);
		setDays(curMon);
		setVisible(true);
	} // Exercise13_5

	void setDays(Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		lblYearMon.setText(year + " " + (month + 1) + " ");
	}

	class BtnEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			/*
			 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. btnPrevMon , curMon . ������ ��ư�� �̸� �� �� �� ��������
			 * �����Ѵ� 2. btnNextMon , curMon . ������ ��ư�� �̸� �� �� �� ���ķ� �����Ѵ� 3. setDays() . �� ȣ���ؼ�
			 * ����� ������ ���̺� ���̰� �Ѵ�
			 */
		}
	}

	public static void main(String[] args) {
	Exercise13_5 mainWin = new Exercise13_5("Scheduler");
	}
}
// main
