

public class TelephoneDirectoryEntry {
	String surname;
	String initials;
	String street;
	String area;
	String city;
	String number;
	
	public TelephoneDirectoryEntry(String sn, String i, String s, String a, String c, String n){
		surname = sn;
		initials = i;
		street = s;
		area = a;
		city = c;
		number = n;
	}
	
	public void display(){
		System.out.println("##### Welcome #####");
		System.out.println("Name: "+ initials + ". " + surname);
		System.out.println("Address: " + street + ", " + area + ", " + city + ".");
		System.out.println("Phone number: " + number);
		System.out.println();
	}

    
    
}