
public class Jamal {
	private String user = "Admin";
	private String pass = "12345";
	private boolean authentication = false;
	
	public boolean getAuthentication(){
		return authentication;
	}
	
	public void Loginuser(String user,String pass){
		if(this.user.equals(user)){
			if(this.pass.equals(pass)){
				authentication = true;
				System.out.println("User Authorized.");
				Adminoptions AO = new Adminoptions();
				
			}
			else{
				System.out.println("Password is not Correct.");
			}
		}
		else{
			System.out.println("User name invalid.");
		}
	}
	
}
