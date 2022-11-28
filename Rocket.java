public class Rocket {

	String make = "Spaceship";
	String model = "Falcon";
	String color = "blue";
	public int year = 2020;
	public double price = 750000.00;
	public String real_name = "Isaac";
	private int ID = 3053133;
	private String Pilot1;
	
	
	
	
	
	
	
	
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD,String Model){
		this.ID = iD;
		this.model = Model;
	}
	
	
	
	
	
	public void setName( String Pilot1){
		this.real_name = Pilot1;
	
	}
	
	public String getName(){
		return real_name;
	}
	
		public String getPilot1() {
			return Pilot1;
		}

		public void setPilot1(String pilot1) {
			Pilot1 = pilot1;
		}

	
	
	
	void launch() {
		System.out.println("Rocket has been launched");
	}
	void EmergencyBrake() {
		System.out.println("Emergency brake has been activated");
	}

	
}