public class Vet{
	private String name;

	public Vet(String name){
		if(name == null || name.isEmpty()){
			System.out.println("Enter a valid name");
		}
		this.name = name;
	}
	public void vaccinate(Animal animal){
		System.out.println("\n" + name + " is vaccinating " + animal.getType()); 
		animal.makeNoise();
		System.out.println("Animal's details: " + animal);
	}
	@Override
	public String toString(){
		return "\nName: " + name;
	}
}
