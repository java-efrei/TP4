package soup2;

public class Carrot extends Vegetable {

	double longueur;

	public Carrot(double p, double l){
		super(p);
		this.longueur = l;
	}

	@Override
	public String toString(){
		return("Carrot: [" + super.poids + "kg - " + longueur + "cm]");
	}

}