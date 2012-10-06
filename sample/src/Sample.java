
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



