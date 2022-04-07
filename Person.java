import java.util.*;
public class Person {
	private String name;
	private int birthYear;

	public Person() {
	name = "";
	birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public boolean equals(Object obj){
		Person a = (Person) obj;
		return a.getName().equals(name)
			&& a.getBirthYear()==birthYear;	
	}
	
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	
	public int compareTo(Person p) {
		return Integer.compare(birthYear, p.birthYear);
	}
}

