package Es2;

public class MainSim {

	public static void main(String[] args) {

		Sim prima = new Sim("035123456");
		prima.ricarica(50);
		prima.ricarica(15);
		stampaDatiSim(prima);

		Sim seconda = new Sim("000111222");
		seconda.setChiamate(setListaChiamate());

		stampaDatiSim(seconda);

	}

	public static void stampaDatiSim(Sim s) {
		System.out.println("Numero di telefono: " + s.getTelNumber());
		System.out.println("Credito diponibile: " + s.getcreditoDisponibile());

		s.stampaListaChiamate();
	}

	public static Chiamata[] setListaChiamate() {
		Chiamata[] list = new Chiamata[5];
		list[0] = new Chiamata(1.2, 111111);
		list[1] = new Chiamata(2.5, 222222);
		list[2] = new Chiamata(1.30, 333333);
		list[3] = new Chiamata(2.00, 444444);
		list[4] = new Chiamata(5.12, 555555);
		return list;

	}

}
