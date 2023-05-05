package soup3;

public class Carrot extends Vegetable {

	double longueur;

	public Carrot(double p, double l){
		super(p);
		this.longueur = l;
	}

	public double getPeelingWeight(double rate){
		return rate * this.poids;
	}

	public int getCalories(){
		double poidsEpluche = this.poids - this.getPeelingWeight(0.1);
		return (int) ((poidsEpluche * 40.0)/0.1);
	}

	@Override
	public String toString(){
		return("Carrot: [" + super.poids + "kg - " + longueur + "cm]");
	}

}