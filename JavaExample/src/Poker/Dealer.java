package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//딜러
public class Dealer {

	// 1.딜러는 카드를 받는다
	// ArrayList<Card> cardList = new ArrayList(52);
	// Card[] cardList = new Card[52];
	List<Card> cardList = new ArrayList<>(52);
	Card[] giveList = new Card[5];
	
	boolean straight = false;
	boolean flush = false;
	boolean pullhouse = false;

	int pair = 0;
	int triple = 0;

	int[] numArr = new int[14];
	int[] kindArr = new int[5];

	//
	public List<Card> setCardList() {

		// 1.cardList에 card를 담는다
		// 1- 13장씩 52장을 담고 섞는다
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cardList.add(new Card(i, j));
			}
		}
		Collections.shuffle(cardList);

		return cardList;

	}

	// 카드 5장주기
	public Card[] giveCard() {
		if (cardList == null || cardList.size() ==0) {
			setCardList();
			System.out.println("새로운 카드 생성");
		}
		// 보내줄 5장을 다시담고 담은것은 지운다.
		for (int i = 0; i < 5; i++) {
			
			giveList[i] = cardList.get(0);		
			cardList.remove(0);
		}
		
	
		System.out.println("-----------------");
		return giveList;
	}

	// 받은번호만 가져오는 메서드 //1~13까지 (J,Q,K,A)
	public int[] getNumArr(Card[] cArr) {
		int[] numArr = new int[14];

		for (int i = 0; i < cArr.length; i++) {
			numArr[cArr[i].num]++; // 번호마다 카운팅
		}

		return numArr;
	}

	// 받은 카드의 종류만 가져오는 메서드 //1.스페이스 2. 클로버 3.하트 4.다이아로 가정
	public int[] getKindArr(Card[] cArr) {
		int[] kindArr = new int[14];

		for (int i = 0; i < cArr.length; i++) {
			kindArr[cArr[i].kind]++; // 카드 종류마다 카운팅
		}

		return kindArr;
	}

	// 게임결과를 알려주는 메서드 //-로얄 스트레이트 플러쉬, 백 스트레이트 플러시, 마운틴, 백스트레이트,
	public String rankCheck(Card[] cArr) {
		pair = 0;
		numArr = getNumArr(cArr);
		kindArr = getKindArr(cArr);

		pair = getPair(numArr);

		straight = isStraight(numArr);

		flush = isFlush(kindArr);

		if (pair == 3 && pair >= 1)
			pullhouse = true;
		if (flush == true && straight == true)
			return "스트레이트 플러시";
		if (pair == 4)
			return "포카드";
		if (triple == 1 && pair >= 1) // 고칠필요
			return "풀하우스";
		if (flush == true)
			return "플러시";
		if (straight == true)
			return "스트레이트";
		if (triple == 1)
			return "트리플";
		if (pair >= 1)
			return pair + "페어";
		else
			return "노페어";

	}

	// 페어를 알려주는 메서드
	public int getPair(int[] numArr) {
		// 같은카드번호 4장 -- pair = 4 --> 포카드
		// 같은카드번호 3장 -- triple = 1 --> 트리플
		// 같은카드번호2장 x2 -- pair = 2 --> 투페어
		// 같은카드번호2장 x1 -- pair = 1 --> 원페어

		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 4)
				pair = 4;
			if (numArr[i] == 3)
				triple = 1;
			if (numArr[i] == 2)
				pair += 1;
		}

		return pair;
	}

	// 스트레이트 - 같은번호의 연속을 확인하는 메서드 //수정필요 --j,q,k,1,2 일때
	public boolean isStraight(int[] numArr) {

		int straightCnt = 0;

		// 현재 숫자만큼 카운팅 ++
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 0) {
				straightCnt += 1;
				if (straightCnt == 5) {
					straight = true;
					return straight;
				}
			} else {
				straightCnt = 0;
			}

		}
		return straight;
	}

	// 플러시 -- 같은종류의 카드 5개일경우 체크
	public boolean isFlush(int[] kindArr) {

		for (int i = 0; i < kindArr.length; i++) {
			if (kindArr[i] >= 5) {
				flush = true;
				return flush;
			}

		}

		return flush;
	}

	@Override
	public String toString() {
		return "Dealer [cardList=" + cardList + "]";
	}
	
	//플레이어들의 랭크를 체크한다.
	public String rankPlayer(Player[] player) {
		
		//플레이어의 랭크를 가져온다.
		for (int i = 0; i < player.length; i++) {
			//System.out.println("s플레이어"+i+":"+Arrays.toString(player[i].card));
			
			player[i].rank = rankCheck(player[i].card);
			//System.out.println("player : "+i+"의 랭크는 :"+ player[i].rank);
		}
		
		
		
		return "플레이어1 승리";
	}

}