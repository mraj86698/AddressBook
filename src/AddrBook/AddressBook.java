package AddrBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contact> list = new ArrayList();
	Scanner sc = new Scanner(System.in);
	public void add() {

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

	public void editContact(){
	     System.out.println("Enter first name and last name to edit your details");
	     System.out.println("Enter first name");
	     String firstName = sc.next();
	     System.out.println("enter last name");
	     String lastName = sc.next();
	     for (Contact contact:list){
	      if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
	         contact.editExistingContact();
	      }
	     }
	    }

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.add();
		System.out.println(addressBook.list);

		addressBook.editContact();
	     System.out.println(addressBook.list);
	}

}
