package frassl;

/**
 * Klasse zur berechnung des Rauminhaltes
 * @author Gabriel Frassl
 * @version 03.12.2014
 */
public class Rauminhalt{
public class Pyramide {
	double a,h;
	
	
	public double PyramideR(){
		double v =((a*a)*h)/3;
		return v;
	}
	
	public void setSeitenLänge(double a) {
		this.a = a;
	}
	public void setHöhe(double h) {
		this.h = h;
	}
}



public class Kegel{
	double radius,h;
	
	public double KegelR(){
		double v = (1/3)* Math.PI*(radius*radius)*h;
		return v;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public void setHöhe(double h) {
		this.h = h;
	}
}





	public class Quader{
		double a,b,c;
	public double QuaderR(){
		double v= a*b*c;
		return v;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	
}
}
