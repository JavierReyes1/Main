public class Dog extends Animal{
	public Dog(String name){
		super(name, "Dog");
	}
	public void makeNoise(){			//abstract makeNoise(){}; was inheritaed from Animal, so it MUST be implemented here 
		System.out.println("Ruff, Ruff");
	}
}
