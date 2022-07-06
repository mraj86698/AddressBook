package AddrBook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program\n");

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter FirstName: ");
		String firstName = sc.next();
		System.out.println(" Enter LastName: ");
		String lastName = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		System.out.println("Enter State: ");
		String state = sc.next();
		System.out.println("Enter ZipCode: ");
		long zipCode = sc.nextLong();
		System.out.println("Enter Phone No.: ");
		String phoneNo = sc.next();
		System.out.println("Enter EmailID: ");
		String email = sc.next();
		sc.close();

		System.out.println("\n First Name :" + firstName + "\n Last Name :" + lastName + "\n Address :" + address
				+ "\n City Name :" + city + "\n State Name :" + state + "\n Zip code :" + zipCode + "\n Phone number :"
				+ phoneNo + "\n Email id :" + email);

	}


}
