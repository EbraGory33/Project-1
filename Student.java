import java.util.*;
public class Student extends Person {
	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken= new Course[50];
	private int numCoursesTaken=0;
	private boolean isGraduate=false;
	private String major="undeclared";
	
	public Student(){
		numStudents++;
		studentID=numStudents;
	}
	public Student(boolean isGraduate){
		numStudents++;
		studentID=numStudents;
		this.isGraduate=isGraduate;
	}
	public Student(String major, boolean isGraduate){
		numStudents++;
		studentID=numStudents;
		this.major=major;
		this.isGraduate=isGraduate;
	}
	public Student(String name, int birthYear, String major, boolean isGraduate){
		super(name,birthYear);
		this.major=major;
		this.isGraduate=isGraduate;
		numStudents++;
		studentID=numStudents;
	}
	public static int getNumStudents() {
		return numStudents;
	}
	public int getStudentID() {
		return studentID;
	}
	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	public boolean isGraduate() {
		return isGraduate;
	}
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void addCourseTaken(Course course){
		if(numCoursesTaken<50) {
			coursesTaken[numCoursesTaken++]=course;
		}
	
	}
	public void addCoursesTaken(Course [] course) {
		if (numCoursesTaken<coursesTaken.length) {
			for(int i=0;i<course.length;i++) {
				if(numCoursesTaken==50) {
					break;
				}
				coursesTaken[numCoursesTaken++]=course[i];
			}
		}
		
	}
	public Course getCourseTaken(int index) {
		if(index<0||index<numCoursesTaken) {
			return null;
		}
		else return coursesTaken[index];	
		}
	public String getCourseTakenAsString(int index) {
			if(index<0||index>numCoursesTaken) {
				return "";
			}
			else { return coursesTaken[index].getCourseDept()+"-"+coursesTaken[index].getCourseNum();
			}
		}
	public String getAllCoursesTakenAsString() {
			String a="";
			for (int i =0; i<numCoursesTaken-1;i++) {
				a += getCourseTakenAsString(i)+", ";
			}
				a += getCourseTakenAsString(numCoursesTaken-1);
			return a;
			
		}
	
	public boolean equals(Object obj) {
		Student s =(Student) obj;
		return super.equals(s)
			&& s.numStudents==this.numStudents
			&& s.studentID==this.studentID
			&& Arrays.equals(s.coursesTaken,coursesTaken)
			&& s.numCoursesTaken==numCoursesTaken
			&& s.isGraduate==isGraduate
			&& s.major.equals(major);
	}
	public String toString() {
		if(isGraduate) return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, "Graduate", numCoursesTaken, getAllCoursesTakenAsString()); 
		else		   return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, "Undergraduate", numCoursesTaken, getAllCoursesTakenAsString());
	}
	
	public int compareTo(Person p) {
		int numCredits=0;
		int sNumCredits=0;
		if(p instanceof Student) {
			Student s = (Student) p;   
			if(this.getNumCoursesTaken()==0 || s.getNumCoursesTaken()==0) {
				if(numCoursesTaken>s.numCoursesTaken) { 
					return 1;
				}
				else if(numCoursesTaken<s.numCoursesTaken) {
					return -1;
				}
				
				else { 
					return 0;
				}
			}
			else if (s.getNumCoursesTaken()!=0 && getNumCoursesTaken()!=0) {
				for(int i = 0; i<this.getNumCoursesTaken();i++) {
					numCredits+=this.getCourseTaken(i).getNumCredits();
				}
				for(int i = 0; i<s.getNumCoursesTaken();i++) {
					sNumCredits+=s.getCourseTaken(i).getNumCredits();
				}
				return Integer.compare(numCredits,sNumCredits);
			}
		}
			
				return super.compareTo(p);
		
	}
}
