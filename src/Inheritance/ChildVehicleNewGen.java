package Inheritance;

public class ChildVehicleNewGen extends ParentVehicleExitGen {
			
	public void vehicleEngine()
	{
		System.out.println("Engine Code is Implemented");
	}
	
	public void vehicleColor()
	{
		System.out.println(vehicleColor);
	}
	
	public static void main(String[] args) {
	
	ChildVehicleNewGen ng = new ChildVehicleNewGen();
	ng.vehicleGear();
	ng.vehicleBrakes();
	ng.vehicleAudioSystem();
	ng.vehicleEngine();
	ng.vehicleColor();

}	
	
}
