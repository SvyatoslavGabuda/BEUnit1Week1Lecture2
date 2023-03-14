package Es2;

import java.util.ArrayList;

public class Sim {
 private String telNumber;
 private double creditoDisponibile;
 private Chiamata[] chiamate;
 
 
  public Sim(String N) {
	  
	  this.telNumber=N;
	  this.creditoDisponibile = 0;
	  this.chiamate = new Chiamata[5];
	  
  }
  public String getTelNumber() {
	  return this.telNumber;
	  
  }
  public double getcreditoDisponibile() {
	  return this.creditoDisponibile;
  }
  
  public void ricarica(double e) {
	  this.creditoDisponibile = creditoDisponibile + e;
	  System.out.println("hai ricaricato il numero " + this.telNumber+" di " + e + "$ il nuovo credito é: " + this.creditoDisponibile);
  }
  public void setChiamate(Chiamata[] lista) {
	  this.chiamate = lista;
	  System.out.println("");
  }
  public void stampaListaChiamate() {
	  if(this.chiamate[0] == null) {
		  System.out.println("nessuna chiamata");
	  }else {
		  System.out.println("lista chiamate: ");
		  
		  for(int i = 0;i<this.chiamate.length;i++) {
			  System.out.println("chiamata durata: "+ this.chiamate[i].getDurate() + "al numero: "+this.chiamate[i].getNumeroContattato());
		  }
	  }
  }
}
