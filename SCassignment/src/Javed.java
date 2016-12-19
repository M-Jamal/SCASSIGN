import java.util.Scanner;

//Muhammad Javed ===== FA13-BSE-028



public class Javed {
	public  Scanner read = new Scanner(System.in);
	public String user = null;
	public String pass = null; 
	public void login(){
		System.out.println("Enter User Name: ");
		user = read.nextLine();
		System.out.println("Enter Password: ");
		pass = read.nextLine();
		Jamal login = new Jamal();
		login.Loginuser(user, pass, login);
		
	}
	
	
}
