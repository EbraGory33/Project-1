
public class Course {
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept; 
	private int numCredits;
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits){
		this.isGraduateCourse=isGraduateCourse;
		this.courseNum=courseNum;
		this.courseDept=courseDept;
		this.numCredits=numCredits;

	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public void setGraduateCourse(boolean isGraduateCourse) {
		this.isGraduateCourse = isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public void setCourseDept(String courseDept) {
		this.courseDept = courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}

	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}
	
	public String getCourseName() {
		if(isGraduateCourse) return "G" + courseDept + courseNum;
		else return "U" + courseDept + courseNum;
	}
	
	public boolean equals(Object obj){
		Course a = (Course) obj;
		return a.isGraduateCourse()== isGraduateCourse
			&& a.getCourseNum()    == courseNum	
			&& a.getCourseDept()   == courseDept
			&& a.getNumCredits()   == numCredits;
	}
	
	public String toString() {
		if (isGraduateCourse) return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate", courseDept, courseNum, numCredits);
		else                  return String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate", courseDept, courseNum, numCredits);
	}
	
	public int compareTo(Course c){
		
		return Integer.compare(courseNum, c.courseNum);
	}


}
