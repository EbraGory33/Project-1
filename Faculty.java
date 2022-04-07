import java.util.*;
public class Faculty extends Employee  implements Comparable<Person>{
	private Course[] coursesTaught= new Course[100];
	private int numCoursesTaught = 0;
	private boolean isTenured;
	
	public Faculty() {
			isTenured = false;
	}
	public Faculty(boolean isTenured) {
		this.isTenured=isTenured;
	}
	public Faculty(String deptName, boolean isTenured) {
		super(deptName); 	this.isTenured=isTenured; 
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name,birthYear,deptName);		this.isTenured=isTenured; 
	}
	
	
	public boolean isTenured() {
		return isTenured;
	}
	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
	
	public void addCourseTaught(Course course){
		if(numCoursesTaught<100) {
		coursesTaught[numCoursesTaught]=course;
		numCoursesTaught++;
		}
	}
	public void addCoursesTaught(Course [] course) {
		if (numCoursesTaught < coursesTaught.length) {
			for(int i=0; i< course.length; i++) {
				if(numCoursesTaught<100) {
					coursesTaught[numCoursesTaught]=course[i];
					numCoursesTaught++;
				}
			}
		}	
	}
	public Course getCourseTaught(int index) {
		if(index<0||index>numCoursesTaught) {
			return null;
		}
		else return coursesTaught[index];
		// note: index must be verified. Return “null” if invalid
	}
	public String getCourseTaughtAsString(int index) {
		if(index<0||index>numCoursesTaught) {
			return "";
		}
		else return coursesTaught[index].getCourseDept()+"-"+coursesTaught[index].getCourseNum();
	}
	
	public String getAllCoursesTaughtAsString() {
		String a="";
		for (int i =0; i<numCoursesTaught-1;i++) {
			a += getCourseTaughtAsString(i)+", ";
		}
			a += getCourseTaughtAsString(numCoursesTaught-1);
		return a;
		
	}
	public boolean equals(Object obj) {
		Faculty f=(Faculty) obj;
		
		return super.equals(f)
			&&	Arrays.equals(f.coursesTaught,coursesTaught)
			&&  f.isTenured==isTenured
			&&	f.numCoursesTaught==numCoursesTaught;
		
	}
	public String toString() {
		if(isTenured) return super.toString()+String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", "Is Tenured" , numCoursesTaught,getAllCoursesTaughtAsString());
		else  		  return super.toString()+String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", "Not Tenured" , numCoursesTaught,getAllCoursesTaughtAsString());
	}
	
	public int compareTo(Person p) {
		if(p instanceof Faculty) {
		Faculty f = (Faculty) p;   
			if(numCoursesTaught > f.numCoursesTaught)
				return 1;
			else if(numCoursesTaught < f.numCoursesTaught)
				return -1;
			else
				return 0;
		}
		else
			return super.compareTo(p);
			
	
	}
}
