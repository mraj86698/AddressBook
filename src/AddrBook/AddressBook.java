package AddrBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contact> list = new ArrayList();

	public void add() {
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

		Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNo, email);
		list.add(contact);
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.add();
		System.out.println(addressBook.list);
	}

}
