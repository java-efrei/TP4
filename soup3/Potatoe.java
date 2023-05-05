package soup3;

public class Potatoe extends Vegetable {

	int eyes;

	public Potatoe(double p, int e){
		super(p);
		this.eyes = e;
	}

	public Potatoe(double p){
		super(p);
		this.eyes = (int)(p * (double)10);
	}

	public double getPeelingWeight(double rate){
		return rate * this.poids + (double) (0.01 * this.eyes);
	}

	public int getCalories(){
		double poidsEpluche = this.poids - this.getPeelingWeight(0.1);
		return (int) ((poidsEpluche * 80.0)/0.1 - this.eyes * 5);
	}


	@Override
	public String toString(){
		return("Potatoe: [" + super.poids + "kg - " + eyes + "eyes]");
	}

}