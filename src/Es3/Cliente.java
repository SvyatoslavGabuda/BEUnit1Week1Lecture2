package Es3;

public class Cliente {
	private String codicePersonale;
	private String nome;
	private String cognome;
	private String email;
	private String dataIscrizione;

	public Cliente(String nome, String Cognome, String email, String data) {
		this.nome = nome;
		this.cognome = Cognome;
		this.email = email;
		this.dataIscrizione = data;
		this.codicePersonale = nome + Cognome + Math.random();
		System.out.println("nuovo utente reggistrato");
		

	};
	
	public void stampaDati() {
		System.out.println(nome);
		System.out.println(cognome);
		System.out.println(email);
		System.out.println(dataIscrizione);
		System.out.println(codicePersonale);
		
		
	}

}
