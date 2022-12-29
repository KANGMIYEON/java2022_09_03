package jdbc;

public class Product { // VO(객체를 사용하는 용도), DTO(객체를 주고 받는 용도)
	
	// pno(product number), pname, price, regdate, madeby
	
	private int pno; // 자동증가 auto_increment
	private String pname;
	private int price;
	private String regdate; // default 로 오늘 날짜 자동 저장
	private String madeby;
	
	public Product() {}
	
	// 상품등록 더 간편하게 하기
	public Product(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}

	// 상품리스트 (대략리스트 : 대략적인 것만 보여줌)
	public Product(int pno, String pname, String regdate) {
		this.pno = pno;
		this.pname = pname;
		this.regdate = regdate;
	}

	// 상품수정 : pno(대상번호), pname(이름), price(가격), madeby(생산)
	public Product(int pno, String pname, int price, String madeby) {
		this(pname, price, madeby); // 위에 있는 생성자에서 호출해옴
		this.pno = pno;
	}
	
	// 상품상세리스트 (전체데이터 : 전체적인 내용을 구체적으로 보여줌)
	public Product(int pno, String pname, int price, String regdate, String madeby) {
		this(pno, pname, price, madeby); // 위에 있는 생성자에서 호출해옴
		this.regdate = regdate;
	}
	
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}
	
	

}
