package org.zerock.th1;

//�� 4������ ���ÿ� �޸���;� ---extends Thread
//�Ӱ豸���� ��ü --- extends Thread
public class ToyHorse extends Thread{
	private String name;
	private int pos;
	
	public ToyHorse(String name) {
		
		this.name = name;
		this.pos = 0;
	
	}
	
	//run = �����尡 �������� ��
	// ���� ���鼭 gallop�̶�� �۾��� �ϰ�ʹ�.
	// �Ӱ豸���� ���� --run
	@Override
	public void run() {
		gallop();
		
	}

	public void gallop() {
		//���������� gallop���� 100��
		for (int i = 0; i < 100; i++) {
			
			this.pos += (int) (Math.random() * 10);
			//System.out.println(this);
			int count =  this.pos/10;
			
			//��Ƽ������� �� �����ڿ��̹Ƿ� 
			synchronized (System.out) {
				for(int j =0; j< count; j++) {

					System.out.print(".");
				}
				System.out.println(this);
			}
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public String toString() {
		return "ToyHorse [name=" + name + ", pos=" + pos + "]";
	}
	
	
	
}
