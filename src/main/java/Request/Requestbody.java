package Request;
import java.util.List;

public class Requestbody {
	
	
	private String name;
	private LocationAs location;
	private int accuracy;
	private int phone_number;
	private String address;
	private List<String> types;
	private String website;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocationAs getLocation() {
		return location;
	}
	public void setLocation(LocationAs location) {
		this.location = location;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	private String language;

}
