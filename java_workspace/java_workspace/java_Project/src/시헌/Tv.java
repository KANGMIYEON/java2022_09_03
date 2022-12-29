package 시헌;

public class Tv {
//	   private int size;
//	   public TV(int size) { this.size = size; }
//	   protected int getSize() { return size; }
//
//	[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
//
//	public static void main(String[] args) {
//	   ColorTV myTV = new ColorTV(32, 1024);
//	   myTV.printProperty();
//	}
//	32인치 1024컬러
	
//	[2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV 클래스를 작성하라.
//
//	public static void main(String[] args) {
//	   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
//	   iptv.printProperty();
//	}
//	나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	
	private int size;
	public Tv(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
	
}
