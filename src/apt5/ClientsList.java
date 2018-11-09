package apt5;

import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {
    public String[] dataCleanup(String[] names) {
        Person[] people = new Person[names.length]; 
    	for (int i = 0; i < names.length; i++) {
        	 int index = names[i].indexOf(",");
        	 if (index != -1) {
        		 String firstLast = names[i].substring(index+2, names[i].length()) + " " + names[i].substring(0, index);
        		 names[i] = firstLast;
        	 }
        	 people[i] = new Person(names[i]);
         }
    	Comparator<Person> comp = Comparator.comparing(Person::getLast);
        comp = comp.thenComparing(Person::getFirst);
        Arrays.sort(people,comp);
        
        for (int k = 0; k < names.length; k++) {
        	names[k] = people[k].toString();
        }
        
        return names;
    }
    
    public class Person{
		String first;
		String last;
		public Person(String s) {
			first = s.split(" ")[0];
			last = s.split(" ")[1];
		}
		public String getLast(){
			return last;
		}
		public String getFirst(){
			return first;
		}
		
		@Override
		public String toString() {
			return first + " " + last;
		}
	}
}
