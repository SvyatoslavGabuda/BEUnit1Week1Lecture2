package Es1;

public class Rettangolo {
	private double h;
	private double l;
	
	public Rettangolo(double h,double l) {
		this.h=h;
		this.l=l;
	}
	
	public double perimentro() {
		return (h+l)*2;
	}
	public double area() {
		return h*l;
	}
	

}
