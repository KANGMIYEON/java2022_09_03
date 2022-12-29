package 시헌;

public class Person3 extends Person2{

	private String animal;
	
	public Person3(String name, int age, String ad, String phone, String animal) {
		super(name, age, ad, phone);
		this.animal = animal;
	}
	public void printPerson() {
		super.printPerson();
		System.out.println("반려동물 : "+animal);
	}
}
