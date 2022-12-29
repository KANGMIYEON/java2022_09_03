package test;

public class CardPack2Class{

	   public static void main(String[] args) {
	      
	      Card2 c = new Card2();
	      CardPack2 cp = new CardPack2();
	            
	     cp.printCard();
	   }
	}

	class CardPack2{
	   
	   private Card2[] pack = new Card2[52];
	   private int cnt = 0;
	   
	   
	   public void init() {
	      cnt = 52;
	   }
	   
	   public int getCnt() {
	      return cnt;
	   }
	   
	   public CardPack2() {
	      char shape = '♥';
	      for(int i=1; i<=4; i++) {
	         switch(i) {
	         case 1: shape = '♥'; break;
	         case 2: shape = '◆'; break;
	         case 3: shape = '♣'; break;
	         case 4: shape = '♠'; break;
	         }
	         for(int j=1; j<=13; j++) { 
	            Card2 tmp = new Card2();
	            tmp.setNum(j);
	            tmp.setShape(shape);
	            pack[cnt] = tmp;
	            cnt++;
	         
	      }
	   }
	}     
	      public void printCard() {
	         for(Card2 card:pack) {
	            card.print();
	         
	         }
	   }
	    
	}