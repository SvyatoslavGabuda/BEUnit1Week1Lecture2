package Es3;

public class Articolo {

	private String codiceArticolo;
	private String descrizioneArticolo;
	private double prezzo;
	private int pezziDisponibili;

	private Articolo() {
		codiceArticolo = "Art" + Math.random() * 20;
		descrizioneArticolo = "";
		prezzo = 999;
		pezziDisponibili = 0;
		System.out.println("Articolo creato. " + "\n" + "codice: " + this.codiceArticolo + "\n Descrizione: "
				+ this.descrizioneArticolo + "\n prezzo: " + this.prezzo);
	}

	public Articolo(String desc, double price, int num) {
		this();
		this.pezziDisponibili = num;
		this.descrizioneArticolo = desc;
		this.prezzo = price;
		System.out.println("Articolo creato. " + "\n" + "codice: " + this.codiceArticolo + "\n Descrizione: "
				+ this.descrizioneArticolo + "\n prezzo: " + this.prezzo);

	}
	public double getPrice() {
		return prezzo;
	}
	public void stampaDatiArticolo() {
		System.out.println(codiceArticolo);
		System.out.println(descrizioneArticolo);
		System.out.println(prezzo);
		System.out.println(pezziDisponibili);
		
		
	}

}
