package org.generation.ecommerce.model;

public class ChangePassword {
	private String usarname;
	private String password;
	private String newPassword;
	
	public ChangePassword(String usarname, String password, String newPassword) {
		super();
		this.usarname = usarname;
		this.password = password;
		this.newPassword = newPassword;
	}//constructor
	
	public ChangePassword() {} //constructorDefault

	public String getUsarname() {
		return usarname;
	}

	public void setUsarname(String usarname) {
		this.usarname = usarname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwprd) {
		this.password = passwprd;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "ChangePassword [usarname=" + usarname + ", passwprd=" + password + ", newPassword=" + newPassword + "]";
	}
	
	
}//classChangePassword
