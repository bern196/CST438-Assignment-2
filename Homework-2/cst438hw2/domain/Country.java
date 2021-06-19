package cst438hw2.domain;



import javax.persistence.Entity;
import Javax.persistence.Id;

public class Country {
	
	private String countryCode;
	private String countryName;

	public Country() {
		
	}
	
	public Country(String countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	//Country code
	public String getCountryCode() {
		return countryCode;
	}

	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	//Country name
	public String getCountryName() {
		return countryName;
	}

	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

	
}