package Ecevit;




public class Flaeche {
	private double pi; 

	public  Flaeche(){
		this.pi = 3.14159;
	}
	
	/**
	 * Zum beraechnen der Flaeche vom Rechteck
	 * @param laenge angabe in int die laenge
	 * @param breite angabe in int die breite
	 * @return laenge mal breite 
	 */
	public int Rechteck(int laenge, int breite){
		return breite * laenge;
	}
	
	/**
	 *Zum beraechnen der Flaeche vom Kreis
	 * @param radius
	 * @return pi mal radius^2
	 */
	public int Kreis(int radius){
		return (int) (pi*(radius*radius));	
	}
	
	/**
	 * Zum beraechnen der Flaeche vom  Dreicek
	 * @param laenge
	 * @param breite
	 * @return laenge mal breite durch 2
	 */
	public int Dreieck(int laenge, int breite){
		return (laenge*breite)/2;
	}

}
