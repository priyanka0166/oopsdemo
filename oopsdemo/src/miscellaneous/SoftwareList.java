package miscellaneous;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.sun.Softwares;

public class SoftwareList {

	public static void main(String[] args) {
		
		Softwares s1 = new Softwares();
		s1.printSoftware();
		
		System.out.println("------------------");
		
		OperatingSystem op1 = new OperatingSystem();
		op1.listSoftware();

	}

}
