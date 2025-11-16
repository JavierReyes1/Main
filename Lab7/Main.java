public class Main{
	public static void main(String[] args) {
		Vet vet = new Vet("Javier");
		Animal cat = new Cat("Fluffy");
		Animal dog = new Dog("Milo");
		vet.vaccinate(cat);
		vet.vaccinate(dog);
		cat = null;
		dog = null;
		vet = null;
		
	}
}
