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
	Button btnPrevMon = new Button("◀");
	Button btnNextMon = new Button("▶");
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
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		

		// 1. 시작일(sDay) 을 해당 월의 1일이 포함된 일요일로 설정
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
//			   System.out.println(week + "주 : " + startDay + " ~ " + endDay);
//			  }

			
		
		// 2. 반복문을 반복문을 사용해 sDay의 값을 1씩 증가시키면서 버튼에 날짜를 넣는다
		// 3. 만일 날짜가 해당 월에 속하면 버튼의 배경을 흰색으로
		// 그렇지 않으면 밝은 회색으로 설정한다.
	} // setDays(Calendar date)

	class BtnEventHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("◀")) {
				// <버튼 클릭시 curMon을 한달이전으로 변경한다.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) - 1);

			} else if (ae.getActionCommand().equals("▶")) {
				// >버튼 클릭시 curMon을 한달이전으로 변경한다.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) + 1);
			}
			
			//해당 년, 월
			setDays(curMon);

		}

	}


	public static void main(String[] args) {
		Excercise13_6 mainWin = new Excercise13_6("Scheduler");
	} // main
}