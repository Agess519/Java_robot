package ChatRoom.Core;

public class User{
	private String name;
	private String password;

	public User(String t_name, String t_password){
		this.name = t_name;
		this.password = t_password;
	}

	public String getName(){
		return this.name;
	}
	public String getPassword(){
		return this.password;
	}

	public void setName(String t_name){
		this.name = t_name;
	}
	public void setPassword(String t_password){
		this.password = t_password;
	}

}