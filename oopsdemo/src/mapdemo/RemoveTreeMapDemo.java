package mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class RemoveTreeMapDemo {

	public static void main(String[] args) {
		
		 TreeMap<String, String> countryISOCodeMapping = new TreeMap<>();

	        countryISOCodeMapping.put("India", "IN");
	        countryISOCodeMapping.put("United States of America", "US");
	        countryISOCodeMapping.put("China", "CN");
	        countryISOCodeMapping.put("United Kingdom", "UK");
	        countryISOCodeMapping.put("Russia", "RU");
	        countryISOCodeMapping.put("Japan", "JP");

	        System.out.println("Country ISO Code Mapping : " + countryISOCodeMapping);

	        // Remove the mapping for a given key
	        String countryName = "Japan";
	        String isoCode = countryISOCodeMapping.remove(countryName);
	        if(isoCode != null) {
	            System.out.println("\nRemoved (" + countryName + " => " + isoCode + ") from the TreeMap. New TreeMap " + countryISOCodeMapping);
	        } else {
	            System.out.println(countryName + " does not exist, or it is mapped to a null value");
	        }

	        // Remove the mapping for the given key only if it is mapped to the given value
	        countryName = "India";
	        boolean isRemoved = countryISOCodeMapping.remove(countryName, "IA");
	        System.out.println("\nWas the mapping removed for " + countryName + "? : " + isRemoved);

	        // Remove the first entry from the TreeMap
	        Map.Entry<String, String> firstEntry = countryISOCodeMapping.pollFirstEntry();
	        System.out.println("\nRemoved firstEntry : " + firstEntry + ", New TreeMap : " + countryISOCodeMapping);

	        // Remove the last entry from the TreeMap
	        Map.Entry<String, String> lastEntry = countryISOCodeMapping.pollLastEntry();
	        System.out.println("\nRemoved lastEntry : " + lastEntry + ", New TreeMap : " + countryISOCodeMapping);

	}

}
