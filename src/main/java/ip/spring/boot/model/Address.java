package ip.spring.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Address {
	private String city;
	private int pinCode;
	private String country;
	
	public Address(String city, int pinCode, String country) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
