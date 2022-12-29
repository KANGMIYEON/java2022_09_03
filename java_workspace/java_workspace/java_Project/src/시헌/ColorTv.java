package 시헌;

public class ColorTv extends Tv{
	
	private int pixel;
	
	
	public ColorTv(int size, int pixel) {
		super(size);
		this.pixel = pixel;
	}

	public void printProperty() {
		System.out.println(getSize()+"인치 "+pixel+"컬러");
	}

	public int getPixel() {
		return pixel;
	}

	

	
}
