package 시헌;

public class IPTV extends ColorTv{

	private String ad;
	
	public IPTV(int size, int pixel, String ad) {
		super(size, pixel);
		this.ad = ad;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는"+ad+" 주소의 ");
		super.printProperty(); // 메서드 호출!!
	}

}
