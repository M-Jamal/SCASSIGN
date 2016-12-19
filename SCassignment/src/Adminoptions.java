import java.util.Scanner;

public class Adminoptions {
	
	public Adminoptions(){
		System.out.println("Adminoptions Class is Created just to fullfil three classes requirement.");
	}
	
	
	public void showmenu(Jamal obj){
		Scanner read = new Scanner(System.in);
		while(true){
			System.out.println("Select Operations To do: ");
			System.out.println("1. Get Login Status. ");
			
			if(obj.isloggedin())
			{
			System.out.println("2. Change Usename. ");
			System.out.println("3. Change Password");
			System.out.println("4. Logout.");
			}
			System.out.println("5. Terminate Program.");
			
			int option  = read.nextInt();
			if(option == 1){
				System.out.println(obj.getAuthentication());
			}
			else if(option == 2){
				System.out.println("Enter New Username: ");
				String newuser = read.next();
				obj.setuser(newuser);
			}
			else if(option == 3){
				System.out.println("Enter New Password: ");
				String newpass = read.next();
				obj.setpass(newpass);
			}
			else if(option == 4){
				obj.logout();
			}
			else if(option == 5){
				break;
			}
			
			
		}
		
	}
	
}
