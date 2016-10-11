package fruit;

public class Citrus extends Fruit{
	int tanginess;
	public Citrus(String name, String color, String location, int tanginess) {
		super(name, color, location);
		this.tanginess = tanginess;
	}
	public int getTanginess(){
		System.out.println("This citrus is " + tanginess + "% tangy!!");
		return tanginess;
	}
	@Override
	public void getAllInfo(){
		System.out.println("THIS IS A CITRUS!!!");
		super.getAllInfo();
	}
	
	
}
