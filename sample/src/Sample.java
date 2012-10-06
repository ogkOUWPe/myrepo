
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck duck = new Duck();
		Wolf wolf = new Wolf();
		
		duck.Eat("fish");
		wolf.Eat("rabbit");

	}

}

class Animal{
	protected String name;
	
	public void Eat(String foodName) {
		System.out.println(name + " eating " + foodName );
	}
}

class Duck extends Animal {
	
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

class Wolf extends Animal {
	
	private String name;
	
	public Wolf() {
		name = "wolf";
	}
	
	public void run() {
		System.out.println(name + " running");
	}
	
	public void hunt() {
		System.out.println(name + " hunting");
	}

	public void barking() {
		System.out.println(name + " ah wooool");
	}
	
	public void Eat(String foodName) {
		System.out.println(name + " eating " + foodName );
	}
};