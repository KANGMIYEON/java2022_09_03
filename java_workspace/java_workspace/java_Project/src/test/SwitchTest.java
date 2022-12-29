package test;

public class SwitchTest {

	public static void main(String[] args) {
		int x=5;
		switch(x) {
		case 6: System.out.println(x--);
		case 5: System.out.println(x--);
		case 4: System.out.println(x--);
		case 3: System.out.println(x--); break;
		default:
			System.out.println(x--); break;
		}

	}

}
