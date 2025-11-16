public class Main{
	public static void main(String[] args) {
		Vet vet = new Vet("Javier");
		Animal cat = new Cat("Fluffy");		//Polymorphism usage. cat can use "Animal" methods, but if "Cat" object has i.e purr() method, reference variable "cat" won't be able to call it
		Animal dog = new Dog("Milo");
		vet.vaccinate(cat);
		vet.vaccinate(dog);
		cat = null;		//reference variable "cat" to object "Cat", now points "null", this object is ready for GB
		dog = null;
		vet = null;
		
	}
}
