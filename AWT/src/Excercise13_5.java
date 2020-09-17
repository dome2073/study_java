import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

class Excercise13_5 extends Frame {
	Panel pUp = new Panel();
	Button btnPrevMon = new Button("◀");
	Button btnNextMon = new Button("▶");
	Label lblYearMon = new Label();
	Calendar curMon = Calendar.getInstance();

	Excercise13_5(String title) {
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
			
			if(ae.getActionCommand().equals("◀")) {
				//<버튼 클릭시 curMon을 한달이전으로 변경한다.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) -1);
					
			}else if(ae.getActionCommand().equals("▶")) {
				//>버튼 클릭시 curMon을 한달이전으로 변경한다.
				curMon.set(Calendar.MONTH, curMon.get(Calendar.MONTH) +1);
			}
			
			setDays(curMon);
					
		}
	}

	public static void main(String[] args) {
		Excercise13_5 mainWin = new Excercise13_5("Scheduler");
		
	}
}
// main
