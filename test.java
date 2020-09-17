import java.util.*;

public class test{

	public static void main(String[] args){

	AddressBook ab = new AddressBook();

	String s;
	int check;

		System.out.println("Enter 1 to 4 to add,search,delete,exit")
		input = Scan.nextLine();
		check=Integer.praseINT(input);

	switch(check){

	case 1:
			 ab.addPerson();
			 break;

	case 2:

			System.out.primtln("enter name to search");
			s= scan.nextLine();
			ab.searchPerson(s);
			break;
	case 3:
	
			System.out.println("Enter name to del");
			s=scan.nextLine();
			ab.deletePerson(s);
			break;
	default:
			System.exit(0)
}

}

