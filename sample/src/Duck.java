
public class Duck extends Animal {
	
	private String name;
	
	public Duck() {
		name = "duck";
	}
	public void fly() {
		System.out.println(name + " flying");
	}
	public void swim() {
		System.out.println(name + " swimming");
	}
	public void quack() {
		System.out.println(name + " quack quack");
	}
	
	public void Eat(String foodName) {
		System.out.println(name + " eating " + foodName );
	}
};