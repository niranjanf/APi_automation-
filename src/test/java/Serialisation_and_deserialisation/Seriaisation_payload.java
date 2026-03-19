package Serialisation_and_deserialisation;

public class Seriaisation_payload {
//serialisation means if we have payload as java object and for rest api we require payload in JSON format then by using pojo class we can make payload as json  by using jackson databind

private String username;
private String password;


	//	//body{
//    "username" : "admin",
//    "password" : "password123"
//}'
//	
	public Seriaisation_payload()
	{
		//default constructor
		
	}

	public Seriaisation_payload(String username,String password) {
		//parameterized constructor
		
		this.username = username;
		this.password = password;
		
		
	}
	
	
	public String getusername() {
		return username;
		
		
	}
	
	public void setusername (String username ) {
		this.username= username;
		
		
	}
	
	public String getpassword() {
		return password;
		
	}
	
	public void setpassword(String password) {
	this.password= password;
}
}