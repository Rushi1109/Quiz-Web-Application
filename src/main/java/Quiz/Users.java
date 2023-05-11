package Quiz;
public class Users {

	private String id;
	private String username;
	private String email;
	private String mobile;
	private String city;
	
	
	public Users(String id, String username, String email, String mobile,
			String city) {
		
		this.id = id;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return city;
	}
	public void setAddress(String city) {
		this.city = city;
	}
}
