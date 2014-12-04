//package Ecevit;

public class Test {
	public static void main(String[]args){
		Flaeche.Rechteck f1 = new Flaeche.Rechteck(3,4);
		f1.get();
		Flaeche.Kreis k1 = new Flaeche.Kreis(3);
		k1.getFlaeche();
		
		Rauminhalt.Pyramide p1 = new Rauminhalt.Pyramide();
		p1.setHoehe(5.5);
		p1.setSeitenLaenge(4.5);
		
		Zahlen zahl = new Zahlen(4);
		zahl.add(5);
		zahl.getMin();
		zahl.getMax();
		
	}
}
