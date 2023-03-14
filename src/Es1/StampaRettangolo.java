package Es1;

public class StampaRettangolo {

	public static void main(String[] args) {
		Rettangolo R1 = new Rettangolo(5, 10);
		System.out.println("Area: " + R1.area());
		System.out.println("Perimetro: " + R1.perimentro());

		Rettangolo R2 = new Rettangolo(14, 12.3);
		stampaRettangolo(R2);
		
		stampaDueRettangoli(R1,R2);

	}

	public static void stampaRettangolo(Rettangolo a) {
		System.out.println("Il rettangolo " + a + " ha:");
		System.out.println("Area: " + a.area());
		System.out.println("Perimetro: " + a.perimentro());
	}

	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println("Il Primo rettangolo " + a + " ha:");
		System.out.println("Area: " + a.area());
		System.out.println("Perimetro: " + a.perimentro());
		System.out.println("Il Secondo rettangolo " + b + " ha:");
		System.out.println("Area: " + b.area());
		System.out.println("Perimetro: " + b.perimentro());
		System.out.println("la somma delle loro aree è " + (a.area() + b.area()));
		System.out.println("la somma dei loro perimetri è " + (a.perimentro() + b.perimentro()));

	}

}
