package test1;

public class Test {
	public static void main(String[] args){
		
		System.out.println("Hello!");
		printODD();
		printEVEN();
		Prompt();
		
		}
	public static void printODD() {
		for(int i=1;i<=100;i++) {
			if (i%2 == 1) {
				System.out.print(i+",");
			}
		}
		System.out.println("");
	}
	
	public static void printEVEN(){
		int j=0;
		while (j<=100) {
			if(j%2==0) {
				System.out.print(j+ ",");
			}
		j++;
		}
	}
	
	public static void Prompt() {
		Scanner sc = new Scanner(System.in);
		String Username= "User";
		String Password= "pass";
		System.out.print("Username: ");
		String name = sc.next();
		System.out.println("Password: ");
		String pass = sc.next();
		if(name.equals(Username) || pass.equals(Password)){
			System.out.println("Welcome"+ Username);
		}
		else {
				System.out.println("Invalid Username or Password");
		}
	}}