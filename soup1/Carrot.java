package soup1;

public class Carrot {

	double poids;
	double longueur;

	public Carrot(double p, double l){
		this.poids = p;
		this.longueur = l;
	}

	@Override
	public String toString(){
		return("Carrot: [" + poids + "kg - " + longueur + "cm]");
	}

}