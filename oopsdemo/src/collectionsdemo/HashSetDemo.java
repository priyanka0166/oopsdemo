package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Java");
        programmingLanguages.add(null);
        programmingLanguages.add(null);
        
        System.out.println("*** Iterate over a HashSet using iterator() ***");
        
        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
        
        while (programmingLanguageIterator.hasNext()) {
            String programmingLanguage = programmingLanguageIterator.next();
            System.out.println(programmingLanguage);
        }
        
        System.out.println("\n*** Iterate over a HashSet using simple for-each loop ***");
        for(String programmingLanguage: programmingLanguages) {
            System.out.println(programmingLanguage);
        }
        
        HashSet<String> p1 = new HashSet<>(programmingLanguages);
        System.out.println("\nHash set: "+p1);
        
        HashSet<String> clonePl = new HashSet<>();
        
        //clone the hash set
        clonePl = (HashSet)p1.clone();
        System.out.println("Clone: "+clonePl);
        

	}

}
