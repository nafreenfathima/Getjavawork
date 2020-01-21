package oop;

public class AddressBookdemo {
	

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AddressBook ab = new AddressBook();
			AddressBook.Address address = new AddressBook().new Address();
			address.setName("MadhuPavanam");
			address.setStreet("Rajendranagar");
			address.setCity("Gudivada");
			address.setState("AP");
			//set values to attributes of inner class
			ab.setTemptAdd(address);
			
			//creating Address  -innerclass object
			AddressBook.Address paddress = new AddressBook().new Address();
			paddress.setName("Prasanna");
			paddress.setStreet("Rajendranagar");
			paddress.setCity("Vijayawada");
			paddress.setState("AP");
			
			//set values to attributes of outer class
			ab.setPermAdd(address);
			
			//
			System.out.println("Temperary Address "+ab.getTemptAdd());
			System.out.println("Permanant Address"+ab.getPermAdd());
		}

	}


