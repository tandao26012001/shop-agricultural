package javaBean;

public class Uses {

	private String username;
	private String password;
	private int permission;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	public Uses(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Uses()
	{
		super();
	}
	
}
