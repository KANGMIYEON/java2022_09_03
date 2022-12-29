package new02;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx01 {

	public static void main(String[] args) throws UnknownHostException {
		
		// 외부에서 네트워크 불러오기
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");
		System.out.println(ip);
		System.out.println("getHostAddress : " + ip.getHostAddress());
		System.out.println("getHostName : " + ip.getHostName());
		System.out.println("toString : " + ip.toString());
		
		System.out.println("-------------------------------------");
		
		byte[] ipAddr = ip.getAddress(); // ip.getAddress는 byte 배열에 담아줘야 한다!
		System.out.println("getAddress : " + Arrays.toString(ipAddr));
		String result = "";
		for(int i=0; i<ipAddr.length; i++) {
			result += (ipAddr[i] < 0 ? ipAddr[i]+256 : ipAddr[i]);
			result += "."; // 구분해서 보려고 점 찍어주기
		}
		System.out.println("getAddress + 256 : " + result);
		
		System.out.println("-------------------------------------");
		
		// 내 local에 대한 정보
		InetAddress localIp = InetAddress.getLocalHost();
		System.out.println("localHostAddress : " + localIp.getHostAddress());
		System.out.println("localHastName : " + localIp.getHostName());
		System.out.println();
	}

}
