package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

//Student & ComparableDemo & Developer
public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Developer> al = new ArrayList<Developer>();
		
		Developer d1 = new Developer (103, "Mike", "Java");
		Developer d2 = new Developer(105,"Mary","Dot Net");
        Developer d3 = new Developer(101,"Ravi","Angular");
        Developer d4 = new Developer(102,"Hary","Php");
        Developer d5 = new Developer(104,"Navin","Oracle");
        
        al.add(d1); al.add(d2); al.add(d3); al.add(d4); al.add(d5); 
        
        System.out.println("--- UnSorted ---\n");
        for(Developer i: al)
        {
        	System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
        }
        System.out.println();
        
        // Sort by id
        Collections.sort(al, new IdComparator());
        System.out.println("---- Sorted by Id ----\n");
        for(Developer i: al)
        {
        	System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
        }
        System.out.println();
        
        // sort by domain of developer
        Collections.sort(al, new DomainComparator());
        System.out.println("---- Sorted by Domain ----\n");
        for(Developer i: al)
        {
        	System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
        }
        
	}

}
