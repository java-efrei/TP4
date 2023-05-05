package soup2;

public class TestSoup {

	public static void main(String[] args){
		Soup s = new Soup();
		s.add(new Potatoe(0.3, 10));
		s.add(new Carrot(0.25, 30));
		System.out.println(s.getPeelingWeight());
		s.setPeelingRate(0.05);
		System.out.println(s.getPeelingWeight()); 
	}

}