package 시헌;

public class Person2 extends Person {

		private String ad;
		private String phone;
		
		public Person2(String name, int age, String ad, String phone) {
			super(name, age);
			this.ad = ad;
			this.phone = phone;
		}
		
		public void printPerson() {
			super.printPerson();
			System.out.println("주소 : "+ad);
			System.out.println("전화 : "+phone);
		}

		public String getAd() {
			return ad;
		}

		public String getPhone() {
			return phone;
		}
		
		
}
