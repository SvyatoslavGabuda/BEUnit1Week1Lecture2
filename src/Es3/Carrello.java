package Es3;

public class Carrello {
	private Cliente utente;
	private Articolo[] elencoArticoli;
	private double totCosto;

	public Carrello(Cliente c) {
		utente = c;
		elencoArticoli = new Articolo[0];
		totCosto = 0;
	};

	public void addToCart(Articolo[] list) {
		elencoArticoli = list;
		totCosto = setTotalCost();

	}

	private double setTotalCost() {
		if (elencoArticoli[0] == null) {
			return 0;
		} else {
			double costoTotale = 0;
			for (int i = 0; i < elencoArticoli.length; i++) {
				costoTotale += elencoArticoli[i].getPrice();
			}
			return costoTotale;
		}

	}

	public void stampaCarello() {
		System.out.println("dati nel carello--------------");
		utente.stampaDati();
		if(elencoArticoli[0] == null) {
			System.out.println("non ci sono oggetti nel carrello");
			
		}else {
			for (int i = 0; i < elencoArticoli.length; i++) {
				elencoArticoli[i].stampaDatiArticolo();
				
			}
		}
		System.out.println("totale da pagare:  " +totCosto);
		
		

	}
}
