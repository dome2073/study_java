import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.zerock.domain.Item;
import org.zerock.service.CoinService;
import org.zerock.service.CoinServiceImpl;
import org.zerock.service.ItemService;
import org.zerock.service.ItemServiceImpl;
import org.zerock.ui.CoinUI;
import org.zerock.ui.ItemUI;
import org.zerock.ui.MainUI;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoinService coinService = new CoinServiceImpl();
		
		CoinUI coinUI = new CoinUI(sc, coinService);

		
		List<Item> items = new ArrayList<>();
		
		//��ü���� 
		items.add(Item.builder().name("�ݶ�").price(800).no(Item.IDX++).build());
		items.add(Item.builder().name("���̴�").price(800).no(Item.IDX++).build());
		items.add(Item.builder().name("������").price(1200).no(Item.IDX++).build());
		items.add(Item.builder().name("���̼Ҵ�").price(700).no(Item.IDX++).build());
		items.add(Item.builder().name("����").price(600).no(Item.IDX++).build());
		
		ItemService itemService = new ItemServiceImpl(items);
		
		ItemUI itemUI = new ItemUI(itemService);
		
		//ui.printItem(700);
		//System.out.println(itemService.findByPrice(total));
		
		MainUI mainUI = new MainUI(coinUI, itemUI, sc);
		
		
		mainUI.sellItem();
		
		//�������� ��ȣ�������� 
	}
}
