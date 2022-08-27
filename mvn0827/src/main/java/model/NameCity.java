package model;

public class NameCity {
	String name, city;

	public NameCity() {
	}

	public NameCity(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "NameCity [name=" + name + ", city=" + city + "]";
	}
	
}
