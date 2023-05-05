package soup2;

public class Soup {

	int numberVegetable;
	final int MAX = 10;
	Vegetable[] soup = new Vegetable[MAX];
	private double peelingRate = 0.1;

	public void setPeelingRate(double rate){
		this.peelingRate = rate;
	}

	public void add(Vegetable v){
		if(numberVegetable < MAX){
			soup[numberVegetable] = v;
			numberVegetable++;
		}
	}

	public double getPeelingWeight(){
		double peelingWeight = 0.0;
		for(int i=0; i<numberVegetable; i++){
			peelingWeight += soup[i] instanceof Potatoe ? this.peelingRate * soup[i].poids + (double) (0.01 * ((Potatoe)soup[i]).eyes) : this.peelingRate * soup[i].poids;
		}
		return peelingWeight;
	}

	@Override
	public String toString(){
		String chaine = "Soup\n------\n";
		for(int i=0; i<numberVegetable; i++){
			if(soup[i] instanceof Carrot){
				chaine += "Carrot: [" + soup[i].poids + "kg - " + ((Carrot)soup[i]).longueur + "cm]\n";
			}
			else{
				chaine += "Potatoe: [" + soup[i].poids + "kg - " + ((Potatoe)soup[i]).eyes + "eyes]\n";
			}
		}
		return chaine;
	}

}