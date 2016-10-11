package fruit;

public class RunFruit {

	public static void main(String[] args) {
		Fruit lemon = new Citrus("lemon", "yellow", "USA", 99);
		lemon.canEat();
		lemon.getName();
		lemon.getColor();
		lemon.getLocation();
		((Citrus) lemon).getTanginess();
		Citrus orange = new Citrus("orange", "orange", "Florida", 50);
		orange.getAllInfo();
				
		Strawberry strawberry = new Strawberry("straw", "red", "washington");
		strawberry.getColor();
		strawberry.getStrawberryJuice();
		strawberry.canEat();
		strawberry.getLocation();
		strawberry.getName();
		strawberry.getAllInfo();
	}

}
