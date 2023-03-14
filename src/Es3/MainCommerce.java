package Es3;

public class MainCommerce {

	public static void main(String[] args) {
		Articolo libro = new Articolo("trama spettacolora",10,555);
		Articolo dvd = new Articolo ("ottimo per tenere dati", 5.55, 99999);
		Articolo dvd1 = new Articolo ("dv1", 11, 10);
		Articolo dvd2 = new Articolo ("dv2", 22, 5);
		Articolo[] listaArticoli = {libro,dvd,dvd1,dvd2};
		Cliente primo = new Cliente ("Mario","Rossi","mario@gmail.com","12-02-2020");
		Carrello tutto = new Carrello(primo);
		tutto.addToCart(listaArticoli);
		tutto.stampaCarello();
		

	}

}
