
public class Person1 {
 String name;
 
 @Override
	public boolean equals(Object obj) {
	    Person1 p = (Person1) obj;
		return this.name.equals(p.name);
	}
}
