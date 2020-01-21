

	
	public class Branchh extends Bankdemo //Inheritance
	{
		
		//abstraction
		private int BranchID;
		private int LocationID;
		
		
		//Constructor
		public Branchh(int branchID, int locationID) {
			super();
			BranchID = branchID;
			LocationID = locationID;
		}
		public Branchh() {
			// TODO Auto-generated constructor stub
		}
		//encapsulation
		public int getBranchID() {
			return BranchID;
		}
		public void setBranchID(int branchID) {
			BranchID = branchID;
		}
		public int getLocationID() {
			return LocationID;
		}
		public void setLocationID(int locationID) {
			LocationID = locationID;
		}
		public void display()
		{
			System.out.println("this is a Branch Account");
		
	}

	}

}
