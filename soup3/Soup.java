package soup3;

public class Soup extends Quantifiable{

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
			peelingWeight += soup[i] instanceof Potatoe ? ((Potatoe)soup[i]).getPeelingWeight(this.peelingRate) : ((Carrot)soup[i]).getPeelingWeight(this.peelingRate);
		}
		return peelingWeight;
	}

	public int getCalories(){
		double calories = 0.0;
		for(int i=0; i<numberVegetable; i++){
			calories += soup[i] instanceof Potatoe ? ((Potatoe)soup[i]).getCalories() : ((Carrot)soup[i]).getCalories();
		}
		return (int) calories;
	}

	@Override
	public String toString(){
		String chaine = "Soup\n------\n";
		for(int i=0; i<numberVegetable; i++){
			if(soup[i] instanceof Carrot){
				chaine += "Carrot: [" + ((Carrot)soup[i]).getCalories() + " calories - " + soup[i].poids + "kg - " + ((Carrot)soup[i]).longueur + "cm]\n";
			}
			else{
				chaine += "Potatoe: [" + ((Potatoe)soup[i]).getCalories() + " calories - " + soup[i].poids + "kg - " + ((Potatoe)soup[i]).eyes + "eyes]\n";
			}
		}
		return chaine;
	}

}