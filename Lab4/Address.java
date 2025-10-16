public class Address {

	private String street;
	private String city;
	private String county;

	public Address(String street, String city, String county) {
		if (street.isEmpty() || street == null || city.isEmpty() || city == null || county.isEmpty()
				|| county == null) {
			throw new IllegalArgumentException("Enter a valid street, city and county");
		}
		this.street = street;
		this.city = city;
		this.county = county;
	}

	public Address() {
	}

	// Getters & Setters

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getCounty() {
		return county;
	}

	public void setStreet(String street) {
		if (street.isEmpty() || street == null) {
			throw new IllegalArgumentException("Enter a valid street");
		}
		this.street = street;
	}

	public void setCity(String city) {
		if (city.isEmpty() || city == null) {
			throw new IllegalArgumentException("Enter a valid city");
		}
		this.city = city;
	}

	public void setCounty(String county) {
		if (county.isEmpty() || county == null) {
			throw new IllegalArgumentException("Enter a valid county");
		}
		this.county = county;
	}

	public String toString() {
		return "[ Street: " + street + " | City: " + city + " | County: " + county + " ]";
	}
}
