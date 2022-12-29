package day09;

public class Exception03 {

	public static void main(String[] args) {
		/*
		 * 예외가 발생항면 발생한 시점부터 메서드 종료. (비정상종료)
		 * try~catch문을 활용하여 예외가 발생했을 때 프로그램이 비정상 종료되지 않고
		 * 이어서 정상적으로 종료될 수 있도록 처리하는 방법
		 * 예외발생 시점부터 실행은 안 됨. 
		 * 
		 * try{
		 * 예외가 발생할 수 있는 실행문;
		 * } catch(예외클래스명1 객체){
		 * 처리문;
		 * } catch(예외클래스명2 객체){
		 * 처리문;
		 * } catch(예외클래스명3 객체){
		 * 처리문;
		 * } finally // 잘 안 씀
		 * 
		 * */
		
		double res = 0;
		try {
			res = 1/0; // 0으로 나눔. 예외발생.
			int arr[] = null; // 0~4번지
			arr[5]=10; // 5번지 없음. 예외발생.
		} catch (ArithmeticException | NullPointerException e) { // 멀티캐치블럭 : 둘 중하나가 오면 잡아라!
			System.out.println("예외발생!"); // 예외 발생하면 다음 catch는 실행되지 않음.
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다. 예외발생!");
		} catch (Exception e) { // Exception은 모든 예외의 최고 조상 => 항상 마지막 catch에 와야함. 처음에 오면 error!
			System.out.println("Exception 발생!");
		}
		System.out.println("수고하셨습니다 :-)");
	}

} 
