public abstract class Animal{
	private String name;
	private String type;

	public Animal(String name, String type){
		if(name == null || type == null || name.isEmpty() || type.isEmpty()){ //If either name or type is empty or null
			System.out.println("Enter a valid name or type");		//Let user know invalid input
		}
		this.name = name;
		this.type = type;
	}
	public abstract void makeNoise();	//Abstract method, this MUST be implemented by child classes
	public String getName(){return name;}
	public String getType(){return type;}
	public String toString(){
		return "\nName: " + name + "\nType: " + type;
	}
}
