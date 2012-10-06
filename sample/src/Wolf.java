
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