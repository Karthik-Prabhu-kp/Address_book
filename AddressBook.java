import java.util.*;

public class AddressBook{

	Arraylist persons;

	public Addressbook{
	 persons =new Arraylist();
	}

	public void addPerson(){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Name :");
		String firstname = scan.nextline();
		System.out.println("Enter last Name :");
      String lastname = scan.nextline();
		System.out.println("Enter address :");
      String address = scan.nextline();
		System.out.println("Enter Phone number :");
      String phnumber = scan.nextline();
		System.out.println("Enter your city :");
      String city = scan.nextline();
		System.out.println("Enter your state :");
      String state = scan.nextline();	
		System.out.println("Enter your zip :");
      String zip = scan.nextline();

		PersonInfo p = new PersonInfo(firstname,lastname,phnumber,city,state,zip);

		persons.add(p);

		p.print();
}

public void searchPerson(String n){

	for(int i=0;i<persons.size();i++){
		
		if( n = persons.get(i)){
		  p.print();
		else
			system.out.println("user not found");
		}
	}
}


public void deletePerson(String n){

	for(int i=0;i<persons.size();i++){

      if( n = persons.get(i)){
        persons.remove(i);
      else
         system.out.println("user not found");
      }
   }
}

