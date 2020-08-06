import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx2 {
	public static void main(String[] args) {
		List<Score> scoreList = new ArrayList<>();
		
		//add() �� ���ھ��� ��ü
		//new ~ �� ���� �Ⱦ��̱� ������ builder�� (lombok)
		// �ڵ带 ������ �� �ִ�, �ʿ��� ��ŭ�� ���� �� �ִ�; //�������� build()�� ������.
		//new Score("����",89); �� ����
		scoreList.add(Score.builder().subject("����").value(89).build());
		scoreList.add(Score.builder().subject("����").value(50).build());
		scoreList.add(Score.builder().subject("����").value(14).build());
		
		//���� ���� ������ ����ҷ��� ���?
		//ScroeŬ������ �߰�
		
		String name = "����";
		
		//�ε��� ��ȣ�� �˾ƾ��ϴ� ������ ����
		
		int idx = scoreList.indexOf(Score.builder().subject(name).build()); 
		
		System.out.println(idx);
		
		Score result = scoreList.get(idx);
		
		System.out.println(result);
		
		//���� ����
		int target = 80; 
		
		//��ü�� Ŭ������
		//�ܺο� �ִ� �����鿡 �����ϰ� ������ ����Ѵ� --> �͸�Ŭ����
		//�͸�Ŭ������ ���� ���ٷ� ���� ǥ����
		Collections.sort(scoreList, new Comparator<Score>() {

		//�͸�Ŭ����
			@Override
			public int compare(Score o1, Score o2) {
				int gap1 = o1.getValue() - target; //�ܺ��� target�� ����� �� ����������� ��밡��
				int gap2 = o2.getValue() - target;
				// TODO Auto-generated method stub
				return gap1 > gap2?-1 : 1;
			}
		});
		
		System.out.println(scoreList);
		
		//���� �˻��Ҷ� -1�� ������ ���� ���°� ex)name ="����" �� idx = -1 
		
		//�������̽��� �����ٸ� Ÿ���� �ϳ��� �������� ���
		//������ �Ϸ��� �ݵ�� �񱳸� �ؾߵ�

		//�⺻ ������� ������ �ϰ������ Ŭ���� �̸� �ڿ� comparable
		

		
		System.out.println(scoreList);
		
		
		//50�� �̻��� ����� ��������
		
		List<Score> highScores = scoreList.parallelStream()
		.filter(s -> s.getValue() >= 50)
		.collect(Collectors.toList());;
		
		System.out.println(highScores);
		
		
	
		
		
	}
}
