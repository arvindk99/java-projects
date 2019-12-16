import java.util.*;
public class Person {
	public static void main(String[] args) {
		Person p = new Person();
		Driver d = new Driver();
		p.print();
		d.input(p);
	}
	
	public class PersonalInformation {
		private String name;
		private String address;
		private int age;
		private int number;
		
		public PersonalInformation() {}
		public PersonalInformation(String name, String address, int age, int number) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.number = number;
		}
		
		public String getName() {
			return name;
		}
		
		public String getAddress() {
			return address;
		}
		
		public int getAge() {
			return age;
		}
		
		public int getNumber() {
			return number;
		}
		
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setPhoneNumber(int number) {
			this.number = number;
		}
		
		public void print() {
			System.out.printf("Name: " + name + "\nAddress: " + address
					+ "\nAge: " + age + "\nPhone Number: " 
					+ number + "\n");
		}
	}
	
}
