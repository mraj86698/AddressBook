package AddrBook;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zipCode;
	String phoneNo;
	String email;

	public Contact(String firstName, String lastName, String address, String city, String state, long zipCode,
			String phoneNo, String email) {
		this.firstName = firstName; // Constructor
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	@Override
    public String toString() {
        return "Added New Contact: " +
                " \nFirstName = " + firstName +
                " \nLastName = " + lastName +
                " \nAddress = " + address +
                " \nCity = " + city +
                " \nState = " + state +
                " \nZipCode = " + zipCode +
                " \nPhoneNo = " + phoneNo +
                " \nEmail = " + email ;
	}

}
