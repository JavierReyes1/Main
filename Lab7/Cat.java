public class Cat extends Animal{
	public Cat(String name){
		super(name, "Cat");
	}
	
	public void makeNoise(){	//abstract makeNoise() was inheritaed from Animal, so it MUST be implemented here 
		System.out.println("Meow");
	}
}
