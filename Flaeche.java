package Ecevit;

public class Flaeche {
	private double pi; 

	public  Flaeche(){
		this.pi = 3.14159;
	}
	//--------------------------------------------------
	public class Rechteck{
		private int laenge;
		private int breite;
		private int flaeche;
		
		public Rechteck(int laenge, int breite){
			this.breite = breite;
			this.laenge = laenge;
			this.flaeche = this.laenge * this.breite;
		}
		
		public void set(int laenge, int breite){
			this.breite = breite;
			this.laenge = laenge;
			
			this.flaeche = this.breite*this.laenge;
		}
		
		public int get(){
			return flaeche;
		}
	}
	
	//--------------------------------------------------
	
	public class Kreis{
		private int radius;
		
		public Kreis(int radius){
			this.radius = radius;
		}

		public int getFlaeche() {
			return (int) ((this.radius*this.radius)*pi);
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		
	}
	
	//--------------------------------------------------
	
	public class Dreieck{
		private int laenge;
		private int breite;
	
		
		public Dreieck(int laenge, int breite){
			this.breite = breite;
			this.laenge = laenge;
		}


		public void setLaenge(int laenge) {
			this.laenge = laenge;
		}

		public int getFlaeche() {
			return (breite*laenge)/2;
		}

		public void setBreite(int breite) {
			this.breite = breite;
		}
		
	}
}
