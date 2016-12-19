import java.util.Scanner;

/////Muhammad Jamal Sabir = FA13-BSE-032

public class Jamal {
	private String user = "Admin";
	private String pass = "12345";
	private String userclone = null;
	private String passclone = null;
	
////////////////////////////////////////////////////////////////////////////////////////////////
	public void Loginuser(String user,String pass,Jamal obj){
		if(this.user.equals(user)){
			if(this.pass.equals(pass)){
				this.userclone = user;
				this.passclone = pass;
				System.out.println("User Authorized.");
				Adminoptions AO = new Adminoptions();
				AO.showmenu(obj);				
			}
			else{
				System.out.println("Password is not Correct.");
			}
		}
		else{
			System.out.println("User name invalid.");
		}
	}
	
	public String getAuthentication(){
		return "Username: "+this.userclone+"\nPassword: "+this.passclone;
	}
	public boolean isloggedin(){
		if(userclone.equalsIgnoreCase("") || userclone.equalsIgnoreCase(null)){
			return false;
		}
		else{
			return true;
		}
	}
	
	public void logout(){
		this.userclone = "";
		this.passclone = "";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	private Scanner read = new Scanner(System.in); 
	private String passvarify = null;
	protected boolean setuser(String changeuser){
		System.out.println("Enter Current Password: ");
		this.passvarify = read.nextLine();
		if(this.passclone.equals(passvarify)){
		this.userclone = changeuser;
		this.passvarify = null;
		return true;
		}
		else {
			System.out.println("Provided Invalid Password.");
			return false;
		}
	}
	
	protected boolean setpass(String changePass){
		System.out.println("Enter Current Password: ");
		this.passvarify = read.nextLine();
		if(this.passclone.equals(passvarify)){
		this.passclone = changePass;
		this.passvarify = null;
		return true;
		}
		else {
			System.out.println("Provided Invalid Password.");
			return false;
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////

	
}
