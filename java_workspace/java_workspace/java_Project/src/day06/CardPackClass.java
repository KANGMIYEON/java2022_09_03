package day06;

public class CardPackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card();
//		c.print();
		CardPack cp = new CardPack();
		cp.shuffle();
		for(int i=1; i<=4; i++) { // 4줄로 출력
			for(int j=1; j<=13; j++) {
				Card tmp = cp.pick();
				tmp.print();
			}
			System.out.println(); // 줄바꿈.
		}
		
	}

} 
/*
 * CardPack클래스
 * - 카드 팩 : 52장의 카드들 배열로 만들기
 * - 카드 섞는 기능
 * - 카드 빼내는 기능
 * - 출력기능 - Card클래스에서 사용
 * - 카드 초기화 기능 (섞고나서 다시 순서대로) 
 * */

class CardPack{
	
	private Card[] pack = new Card[52]; // 52장의 카드가 들어갈 수 있는 배열 / 자료형 : Card[]
	private int cnt = 0; // 카드의 남은 개수
	
	// 카드 섞기 기능
	// 메서드명 : shuffle()
	// 매개변수X, void
	public void shuffle() {
		int min = 0;
		int max = pack.length-1;
		for(int i=0; i<pack.length; i++) {
			int index = (int)(Math.random()*(max-min+1))+min; // 인덱스 번지까지
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
		}
	}
	
	// 카드 빼내는 기능
	// pick()
	// 리턴타입 : Card
	// 매개변수X
	// cnt = 52개 가정
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt]; // pack의 마지막 번지를 pick
	} 
	
	// 카드 초기화
	public void init() {
		cnt = 52; // 빼낸 카드를 다시 집어넣는 형태
		shuffle(); // 다시 섞어줌
	}

	public int getCnt() {
		return cnt;
	}
	
	// 생성자 52장의 카드 생성
	public CardPack() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
				case 1: shape = '♥'; break;
				case 2: shape = '◆'; break;
				case 3: shape = '♣'; break;
				case 4: shape = '♠'; break;
				}
			for(int j=1; j<=13; j++) {
				Card tmp = new Card(); // 카드 1장 생성
				tmp.setNum(j);
				tmp.setShape(shape);
				pack[cnt] = tmp; // 카드 팩에 카드 1장 추가
				cnt++;
			}
			
		}
		
	} 
}