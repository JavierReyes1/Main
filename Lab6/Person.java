package Lab6;
public abstract class Person{
	private String name;
	private String address;

	public Person(String name, String address){
		if(name == null || address == null || name.isEmpty() || address.isEmpty()){
			throw new IllegalArgumentException("Enter a valid name or address");
		}
		this.name = name;
		this.address = address;
	}
	public void setName(String name){
		if(name == null || name.isEmpty()){
		throw new IllegalArgumentException("Enter a valid name");
		}
		this.name = name;	
	}
	public void setAddress(String address){
		if(address == null || address.isEmpty()){
		throw new IllegalArgumentException("Enter a valid address");	
		}	
		this.address = address;
	}
	public String getName(){return name;}
	public String getAddress(){return address;}
	@Override
	public String toString(){
		return "[Name: " + name + ", Address: " + address + "]";	
	}
}
