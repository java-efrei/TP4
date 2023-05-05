package soup2;

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

	@Override
	public String toString(){
		return("Potatoe: [" + super.poids + "kg - " + eyes + "eyes]");
	}

}