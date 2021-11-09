package Inheritance_Activities;
import java.util.Scanner;

class Vehicle{
	Scanner sc=new Scanner(System.in);
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	
   public String getMake()
   {
	   
	   return make;
   }
   public void setMake() {
	   System.out.println("Vehicle Make :");
	   make=sc.next();
   }
   public String getVehicleNumber()
   {
	  return vehicleNumber;
   }
   public void setVehicleNumber()
   {
	   System.out.println("Vehicle Number :");
	   vehicleNumber=sc.next();
   }
   public int getFuelCapacity()
   {
	   return fuelCapacity;
   }
   public void setFuelCapacity() {
	   System.out.println("Fuel Capacity :");
	   fuelCapacity=sc.nextInt();
   }
   public int getCC()
   {
	   return cc;
   }
   public void setCC() {
	   System.out.println("Engine CC :");
	   cc=sc.nextInt();
   }
   public String getFuelType()
   {
	   return fuelType;
   }
   public void setFuelType()
   {
	   System.out.println("1.Petrol");
	   System.out.println("2.Diesel");
	   fuelType=sc.next();
   }
	   
   public void displayMake()
   {
	   System.out.println("Make :"+getMake());
   }
   
   public void displayBasicInfo()
   {
	   System.out.println("***********"+getMake()+"***********");
	   System.out.println("Vehicle Number : "+getVehicleNumber());
	   System.out.println("Fuel Capacity : "+getFuelCapacity());
	   System.out.println("Fuel Type :"+getFuelType());
	   
	   
   }
   public void displayDetailInfo()
   {
	   
   }
   
   
}
class TwoWheeler extends Vehicle{
	private String kickStartAvailable;
		
	public String isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable() {
		System.out.println("kick Start Avaialble (yes/No) ");
		kickStartAvailable=sc.next();
		
	}
	public void displayDetailInfo()
	{
		System.out.println("Kick Start Avaiable : "+isKickStartAvailable());
	}
}
class FourWheeler extends Vehicle{

		// TODO Auto-generated constructor stub
	private String audioSystem;
	private int numberOfDoors;
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem() {
		System.out.println("Audio System :");
		audioSystem=sc.next();
	}
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
	public void setNumberOfDoorss()
	{
		System.out.println("Number of Doors :");
		numberOfDoors=sc.nextInt();
	}
	

	public void displayDetailInfo()
	{
		System.out.println("Audio System :"+getAudioSystem());
		System.out.println("Number Of Doors :"+getNumberOfDoors());
		
	}
}
public class VehicleMain{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter Vehicle type :");
	System.out.println("1.Four Wheeler ");
	System.out.println("2.Two Wheeler");
	int ch=sc.nextInt();
	if(ch==1)
	{
		FourWheeler fw=new FourWheeler(); 
		fw.setMake();
		fw.setVehicleNumber();
		fw.setFuelType();
		fw.setFuelCapacity();
		fw.setCC();
		fw.setAudioSystem();
		fw.setNumberOfDoorss();
		fw.displayBasicInfo();
		fw.displayDetailInfo();
		
		
		
		
	}
	else if(ch==2){
		TwoWheeler tw=new TwoWheeler();
		tw.setMake();
		tw.setVehicleNumber();
		tw.setFuelType();
		tw.setFuelCapacity();
		tw.setCC();
		tw.setKickStartAvailable();
		tw.isKickStartAvailable();
		tw.displayBasicInfo();
		tw.displayDetailInfo();
	}
	else {
		System.exit(0);
	}
	
}}
	
	
	

	
