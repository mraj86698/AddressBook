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
	     System.out.println("Enter last name");
	     String lastName = sc.next();
	     for (Contact contact:list){
	      if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
	         contact.editExistingContact();
	      }
	     }
	    }
	public void deleteContact(){
        System.out.println("Enter first name and last name to delete your details ");
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        for (Contact contact:list){
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
                list.remove(contact);
            }
        }
    }

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book\n");
		AddressBook addressBook = new AddressBook();

		int input;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter 1 for Add Contact");
			System.out.println(" Enter 2 for Update Contact ");
			System.out.println(" Enter 3 for DeleteContact");

			input = scanner.nextInt();
			switch (input) {
			case 1:
				addressBook.add();
				System.out.println(addressBook.list);
				System.out.println("Contact Added Successfully");
				break;
			case 2:
				addressBook.editContact();
			     System.out.println(addressBook.list);
				break;
			case 3:
				 addressBook.deleteContact();
			     System.out.println(addressBook.list);
				break;

			case 4:
				System.exit(0);
			}
		}



	}

}
