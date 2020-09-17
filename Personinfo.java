public class Personinfo{

	String firstname;
	String lastname; 
	String address;
	String city;
	String state;
	String zip;
	String phnumber;

	void Personinfo(String firstname,String lastname,String address,
				 String city,String state,String zip,String phnumber){

			this.firstname=firstname;
			this.lastname=lastname;
			this.address=address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phnumber = phnumber;
	}

	public void print(){
	
		System.out.println("firstname:" + firstname + "\nlastname:" + lastname + "\naddress" + address + "/nphone number" + phnumber + "\ncity:" + city + "\nstate:" + state + "\nzip: "+ zip );
	}
}
