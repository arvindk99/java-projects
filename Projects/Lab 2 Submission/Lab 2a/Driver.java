import java.util.*;
public class Driver {
	private static Scanner i =  new Scanner(System.in);
	
	
	public void input(Person p) {
		System.out.printf("What is your name?");
		p.setName(i.nextLine());
		System.out.printf("What is your age?");
		p.setAge(i.nextLine());
		System.out.printf("What is your address? ");
		p.setAddress(i.nextLine());
		System.out.printf("What is your phone number");
		p.setNumber(i.nextLine());
	}

}
