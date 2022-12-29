package day14;

import java.io.File;
import java.util.StringTokenizer;

public class FileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\java_workspace\\java_Project\\out.txt"); // 줄바꿈의 의미가 아니라는 뜻으로 \\ 두개 넣어줌
		String fileName = f.getName();
		System.out.println("경로를 제외한 파일 이름 : "+fileName);
		System.out.println("경로를 포함한 파일 이름 : "+f.getPath());
		System.out.println("경로를 포함한 파일 이름 : "+f.getAbsolutePath());
		System.out.println("파일이 속한 폴더(경로만) : "+f.getParent());
		System.out.println("-------------------------------------");
		System.out.println("파일 구분자 : "+File.separator); // 자주 사용
		System.out.println("파일 구분 문자 : "+File.separatorChar);
		System.out.println();
		
		// f에 대한 경로 (드라이브, 경로, 파일명, 확장자 추출)
		String fstr = f.toString(); // f의 경로를 문자열로 변경
		System.out.println("f의 전체 경로: "+fstr);
		System.out.println("드라이브: "+fstr.substring(0,fstr.indexOf("\\")));
		System.out.println("파일명: "+fstr.substring(fstr.lastIndexOf("\\")+1));
		String file = fstr.substring(fstr.lastIndexOf("\\")+1);
		System.out.println(file.substring(0, file.indexOf(".")));
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		// StringTokenizer, split 이용
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명:"+str[0]+", 확장자"+str[1]);
		
		StringTokenizer stk = new StringTokenizer(f.getName(),"."); // " " 안에 내가 구분할 값
		while(stk.hasMoreElements()) { // 다음에 요소가 있다면
			System.out.println(stk.nextElement());
		}
		
		// p.514 StringBuffer : 문자열의 추가나 변경 등의 작업이 많은 경우 유리
		StringBuffer sb = new StringBuffer();
		// append : 문자열 끝에 추가
		sb.append("Hello"); 
		sb.append(" ");
		sb.append("World~!!");
		// insert : 문자열 중간에 추가
		sb.insert(0, "JAVA"); // 0번지에 "JAVA" 추가
		sb.insert(sb.indexOf("H"), " ");
		// delete : 문자열 일부분 삭제
		sb.delete(0, sb.indexOf(" ")+1); // end 미포함
		String a = sb.toString(); // 이 모든걸 한글자로 합쳐서 보내~
		System.out.println(a);
		
		// StringBuffer 사용하지 않고 출력
		String b ="";
		b += "Hello";
		b += " ";
		b += "World~!!";
		System.out.println(b);
		
//		String str = f.getAbsolutePath();
//		String drive = str.substring(0,2);
//		String path = str.substring(3,31);
//		String name = str.substring(31,34);
//		String suffix = str.substring(str.indexOf('.')+1);
//		System.out.println("드라이브: "+drive);
//		System.out.println("경로: "+path);
//		System.out.println("파일명: "+fileName);
//		System.out.println("확장자: "+suffix);
		
	}

}
