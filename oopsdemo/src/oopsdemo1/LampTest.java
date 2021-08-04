package oopsdemo1;

class Lamp
{
	/* stores the value for light true if light is on and
	   false if light is off */
	  boolean isOn;
	  
	  void turnOn()
	  {
		  isOn = true;
		  System.out.println("Light On? "+ isOn);
	  }
	  
	  void turnOff()
	  {
		  isOn = false;
		  System.out.println("Light On? "+ isOn);
	  }
}

public class LampTest {

	public static void main(String[] args) {
		
		// Create object 
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		// Switch on 
		led.turnOn();
		halogen.turnOn();
		
		// Switch off
		led.turnOff();
		halogen.turnOff();

	}

}
