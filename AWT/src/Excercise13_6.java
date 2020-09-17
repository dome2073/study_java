import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.DayOfWeek;
import java.util.Calendar;

class Excercise13_6 extends Frame {
	Panel pDate = new Panel();
	Panel pUp = new Panel();
	Button btnPrevMon = new Button("��");
	Button btnNextMon = new Button("��");
	Label lblYearMon = new Label();
	Button[] btnArr = new Button[42];
	Calendar curMon = Calendar.getInstance();

	Excercise13_6(String title) {
		super(title);
		pUp.setBackground(Color.yellow);
		pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
		pUp.add(btnPrevMon);
		pUp.add(lblYearMon);
		pUp.add(btnNextMon);
		pDate.setLayout(new GridLayout(6, 7));
		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new Button("1");
			pDate.add(btnArr[i]);
		}
		btnPrevMon.addActionListener(new BtnEventHandler2());
		btnNextMon.addActionListener(new BtnEventHandler2());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				we.getWindow().setVisible(false);
				we.getWindow().dispose();
				System.exit(0);
			}
		});
		add(pUp, "North");
		add(pDate, "Center");
		setBounds(200, 200, 500, 300);
		setDays(curMon);
		setVisible(true);
	} // MyScheduler

	void setDays(Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		lblYearMon.setText(year + " " + (month + 1) + " ");
		
		Calendar sDay = Calendar.getInstance(); // ������
		

		// 1. ������(sDay) �� �ش� ���� 1���� ���Ե� �Ͽ��Ϸ� ����
//		sDay.set(Calendar.WEEK_OF_MONTH, Cal) 
//		for (int week = 1; week < sDay.getMaximum(Calendar.WEEK_OF_MONTH); week++) {
//			   sDay.set(Calendar.WEEK_OF_MONTH, week);
//			 
//			   sDay.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
//			   int startDay = sDay.get(Calendar.DAY_OF_MONTH);
//			 
//			   sDay.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
//			   int endDay = sDay.get(Calendar.DAY_OF_MONTH);
//			 
//			   if (week == 1 && startDay >= 7) {
//			    startDay = 1;
//			   }
//			 
//			   if (week == sDay.getMaximum(Calendar.WEEK_OF_MONTH) - 1 && endDay <= 7) {
//			    endDay = sDay.getActualMaximum(Calendar.DAY_OF_MONTH);
//			   }
//			 
//			   System.out.println(week + "�� : " + startDay + " ~ " + endDay);
//			  }

			
		
		// 2. �ݺ����� �ݺ����� ����� sDay�� ���� 1�� ������Ű�鼭 ��ư�� ��¥�� �ִ´�
		// 3. ���� ��¥�� �ش� ���� ���ϸ� ��ư�� ����� �������
		// �׷��� ������ ���� ȸ������ �����Ѵ�.
	} // setDays(Calendar date)

	class BtnEventHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("��")) {
				// <��ư Ŭ���� curMon�� �Ѵ��������� �����Ѵ�.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) - 1);

			} else if (ae.getActionCommand().equals("��")) {
				// >��ư Ŭ���� curMon�� �Ѵ��������� �����Ѵ�.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) + 1);
			}
			
			//�ش� ��, ��
			setDays(curMon);

		}

	}


	public static void main(String[] args) {
		Excercise13_6 mainWin = new Excercise13_6("Scheduler");
	} // main
}