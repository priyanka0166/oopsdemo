package oopsdemo2;

class Honda extends Car
{
	public void hondaStart()
	{
		// Composition --> Honda class fully dependent on Engine
		Engine Heng = new Engine();
		Heng.startEngne();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondaCity = new Honda();
		
		hondaCity.setColor("Silver");
		hondaCity.setMax_speed(180);
		
		System.out.println("----- Honda Car Details -----");
		System.out.println(hondaCity.getColor()+ " Color");
		System.out.println(hondaCity.getMax_speed()+ " Speed");
		hondaCity.hondaStart();

	}

}
