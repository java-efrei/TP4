package soup1;

public class Potatoe {

	double poids;
	int eyes;

	public Potatoe(double p, int e){
		this.poids = p;
		this.eyes = e;
	}

	public Potatoe(double p){
		this.poids = p;
		this.eyes = (int)(p * (double)10);
	}

	@Override
	public String toString(){
		return("Potatoe: [" + poids + "kg - " + eyes + "eyes]");
	}

}