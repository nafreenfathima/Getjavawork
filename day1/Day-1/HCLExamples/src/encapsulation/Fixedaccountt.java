package encapsulation;
public class Fixedaccountt extends Bankdemo  //Inheritance
{
	
	//abstraction
	private int FixedAccNum;
	
	
	//Constructor
	public Fixedaccountt(int fixedAccNum) {
		super();
		FixedAccNum = fixedAccNum;
	}

	
	public Fixedaccountt() {
		// TODO Auto-generated constructor stub
	}


	//encapsulation
	public int getFixedAccNum() {
		return FixedAccNum;
	}

	public void setFixedAccNum(int fixedAccNum) {
		FixedAccNum = fixedAccNum;
	}
	
	public void display()//polymorphism
	{
		System.out.println("this is a Fixed Account");
	
}
	

}




