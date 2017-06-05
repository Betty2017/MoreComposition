public class Car extends Vehicle{

	private String name;
	private String color;
	private int speed;

	private Driver driver;
	public String pilots;
	public String Captains;

	public void setName(String name){
		this.name= name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	/*public String getName() {
	    return driver;
	}
	public void setDriver(String driver) {
	    this.driver = driver;
	}*/

	public Car()

	{
		name = "Porsh";
		color = "red";

	}


	public String drive()
	{	
		Driver driver1= new Driver();
		String drivername;
		driver1.setName("Bob");
		drivername=driver1.getName();

		return "The "+ color+ " "+name+" is being driven by " + drivername;
	}









}
