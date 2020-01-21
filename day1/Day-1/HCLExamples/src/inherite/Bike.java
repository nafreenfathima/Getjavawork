package inherite;

public class Bike implements Cycle,Automobile {

	@Override
	public boolean selfdriven() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("we should balance");
		
	}

}
