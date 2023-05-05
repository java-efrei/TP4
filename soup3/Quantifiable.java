package soup3;

public class Quantifiable {

	@Override
	public String toString(){
		if(this instanceof Carrot){
			return "Carrot: [" + ((Carrot)this).getCalories() + " calories - " + ((Vegetable)this).poids + "kg - " + ((Carrot)this).longueur + "cm]\n";
		}
		else{
			return "Potatoe: [" + ((Potatoe)this).getCalories() + " calories - " + ((Vegetable)this).poids + "kg - " + ((Potatoe)this).eyes + "eyes]\n";
		}
	}

}