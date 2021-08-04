package miscellaneous;

public class StringBufferDemo {

	public static void main(String[] args) {
		    
        StringBuffer buf = new StringBuffer("Java");
        
        	// append -- Java Guide Ver1/7
        buf.append(" Guide Ver1/"); 
        buf.append(7);
        
        	// Insert  -- Java Student Guide Ver1/7
        int index = 5;   
        buf.insert(index, "Student "); 
        
        	// Set -- Java Student Guide Ver1.7
        index = 23;      
        buf.setCharAt(index, '.');   
        
        	// Replace  -- Java Student Guide Ver1.8
        int start = 24;   
        int end = 25;
        buf.replace(start, end, "8"); 
        
        	//Convert to string
        String s = buf.toString();   
        System.out.println(s);
        System.out.println(buf.reverse());

	}

}
