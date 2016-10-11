package fruit;

public class Fruit implements Food{


	String name;
	String color;
	String location;
	
	public Fruit(String name, String color, String location ){
		this.name = name;
		this.color = color;
		this.location = location;
	}
	
	@Override
	public String getName() {
		System.out.println("This is a " + name);
		return name;
	}
	@Override
	public String getLocation() {
		System.out.println("This " + name + " is from " + location);
		return location;
	}
	@Override
	public String getColor() {
		System.out.println("This " + name + " is " + color);
		return color;
	}

	@Override
	public void canEat() {
		System.out.println("Yes this " + name + " is edible");	
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void getAllInfo() {
		System.out.println("This is a "+ name + ". It is " + color + " in color. It is from " + location + ".");
		
	}
	
}
