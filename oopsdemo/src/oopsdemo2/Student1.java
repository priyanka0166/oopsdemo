package oopsdemo2;

public class Student1 {
	
    String name;
    int rollNo;
    String className;
    boolean isFromCity;
    
    Student1(String name, int rollNo)
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    Student1(String name, int rollNo, String className, boolean isFromCity)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
        this.isFromCity = isFromCity;        
    }
    
    public void studentData()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
        System.out.println("Is student belongs to city = "+ isFromCity);
    }
    
    public static void main (String arg[])
    {
       // Creating object and providing some values by using parameterized constructor
        
        Student1 st1 = new Student1("Ravi", 1);
        st1.studentData();
        
        System.out.println();
        
        Student1 st2 = new Student1("Ram", 2, "MCA", true);
        st2.studentData();
        
    }    
}

