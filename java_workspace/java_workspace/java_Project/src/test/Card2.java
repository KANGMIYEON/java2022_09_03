package test;

public class Card2 {
	
	private int num;
	private char shape;
	
	public Card2() {
		num = 1;
		shape = '♥';
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1:
			System.out.print("A ");
			break;
		case 11: 
			System.out.print("J ");
			break;
		case 12: 
			System.out.print("Q ");
			break;
		case 13: 
			System.out.println("K ");
			break;
		default:
			System.out.print(num+" ");
		
		}
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num>13) {
		this.num = 1;
		} else {
		this.num = num;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♣': case '◆': case '♠':
			this.shape = shape;
			break;
			default:
				this.shape = '♥';
		}
	}

	
}
