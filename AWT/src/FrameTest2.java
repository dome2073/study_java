import java.awt.*;

class FrameTest2 {
	public static void main(String args[]) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Toolkit tk = Toolkit.getDefaultToolkit(); // Toolkit . 구현된 객체를 얻는다
		Dimension screenSize = tk.getScreenSize(); // . 화면의 크기를 구한다
		// Frame 화면크기의 절반값에서 크기의 절반값을 뺀 위치로 하면
		// Frame . 이 화면 가운데 위치하게 된다
		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setVisible(true); // Frame . 생성한 을 화면에 보이도록 한다
	}
}
