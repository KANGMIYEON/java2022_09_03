package new02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://n.news.naver.com/article/094/0000010485?cds=news_media_pc&type=editn");
		
		System.out.println("getAuthority : " + url.getAuthority()); // n.news.naver.com
		System.out.println("getContent : " + url.getContent()); // sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@1a18644
		System.out.println("getPort : " + url.getPort()); // 비공개라서 -1
		System.out.println("getProtocol : " + url.getProtocol()); // https
		System.out.println("-------------------------------------");
		System.out.println("getHost : " + url.getHost()); // n.news.naver.com
		System.out.println("getQuery : " + url.getQuery()); // ? 뒤쪽에 달린 아이들 cds=news_media_pc&type=editn
		System.out.println("getPath : " + url.getPath()); // /article/094/0000010485

	}

}
