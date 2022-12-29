package 시헌;

public class TvMain {

	public static void main(String[] args) {
//		ColorTv myTv = new ColorTv(32, 1024);
//		myTv.printProperty();
		
		IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
		iptv.printProperty();

	}

}
