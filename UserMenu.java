import java.util.Scanner;
import java.util.*;
public class UserMenu {
	
	static Course A= new Course( true, 771, "MAT", 4);
	static Course B = new Course (true,777,"CMP",4);
	static Course C = new Course (true,711,"CMP",4);
	static Course D = new Course (true,723,"MAT",4);
	 static Course E = new Course (false,168,"CMP",4);
	 static Course F = new Course (false,338,"CMP",4);
	
	 static  Faculty G = new Faculty();
	 static Faculty H = new Faculty(true);
	 static Faculty I = new Faculty("MAT",false);
	 static Faculty J = new Faculty("Superman",1938,"PHY",true);
	
	 static  Student K = new Student();
	 static Student L = new Student(false);
	 static Student M = new Student("Math",false);
	 static Student N = new Student("Wonderwoman",1941,"JST",true);
	
	 static GeneralStaff O = new GeneralStaff();
	 static GeneralStaff P = new GeneralStaff("advise students");
	 static GeneralStaff Q = new GeneralStaff("Sanitation","clean");
	 static GeneralStaff R = new GeneralStaff("Flash Gordon",1934,"Security","safety");
	 
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("==================================================================================================");
		System.out.println("===========================================USER MENU==============================================");
		
		// A.
		 Course newCourse1=newCourse();
		 Course newCourse2=newCourse();
		 Course newCourse3=newCourse();
		 Course [] A1 = {A,B,C,D,E,F,newCourse1,newCourse2,newCourse3};
		// B.
		 Faculty newFaculty1=newFaculty();
		 Faculty newFaculty2=newFaculty();
		 Faculty newFaculty3=newFaculty();
		 Faculty[] C1= {G,H,I,J,newFaculty1,newFaculty2,newFaculty3};
		// C.
		 GeneralStaff newGeneralStaff1=newGeneralStaff();
		 GeneralStaff newGeneralStaff2=newGeneralStaff();
		 GeneralStaff newGeneralStaff3=newGeneralStaff(); 
		 GeneralStaff[] B1 = {O,P,Q,R, newGeneralStaff1, newGeneralStaff2, newGeneralStaff3};
		// D.
		 Student newStudent1=newStudent();
		 Student newStudent2=newStudent();
		 Student newStudent3=newStudent();
		 Student[] D1 = {K,L,M,N,newStudent1,newStudent2,newStudent3};
		// E-F. Add 2 new Courses to a Faculty and Student object:
		 newFaculty1.addCourseTaught(newCourse1);
		 newFaculty1.addCourseTaught(newCourse2);
	     //newStudent1.addCourseTaken(newCourse1);
		 newStudent3.addCourseTaken(newCourse2);
		
		// G-H. Add an array of 2 Courses to a Faculty and Student object:
		Course [] ab= {newCourse1,newCourse3};
		 newFaculty2.addCoursesTaught(ab);
		 //newStudent2.addCoursesTaken(ab);
		
		// I. Get the Course at index (valid and invalid indexes) from a Faculty object:
		//Course at valid index for Faculty
		  newFaculty2.getCourseTaught(2);
		//Course at invalid index for Faculty
		  newFaculty2.getCourseTaught(-4);
		
		// J. Get the Course at index (valid and invalid indexes) from a Student object:
		//Course at valid index for Student
		  newStudent2.getCourseTaken(2);
		//Course at invalid index for Student
		 newStudent2.getCourseTaken(-4);
		
		// K.
		System.out.println("===========================================Search MENU==============================================");
		System.out.println("Search menu for Faculty's avaliable Courses");
		System.out.println();
		System.out.println("----------------------Faculty Object Names:---------------------");
		System.out.println("NewFaculty1");
		System.out.println("NewFaculty2");
		System.out.println("NewFaculty3");
		System.out.println("----------------------Course Object Names:---------------------");
		System.out.println("NewCourse1");
		System.out.println("NewCourse2");
		System.out.println("NewCourse3");
		System.out.println("----------------------------------------------------------");	
		while(true) {
		String a;
		String b;
			while(true) {
				System.out.println("Choose a Faculty Object:");
				a=scan.next();
				if(a.equalsIgnoreCase("NewFaculty1")||a.equalsIgnoreCase("NewFaculty2")||a.equalsIgnoreCase("NewFaculty3")) {
					break;
				}
				else
					System.out.println("Invalid selection");
			}
			System.out.println("----------------------------------------------------------");	
			while(true) {
				System.out.println("Choose a Course Object:");
				b=scan.next();
				if(b.equalsIgnoreCase("NewCourse1")||b.equalsIgnoreCase("NewCourse2")||b.equalsIgnoreCase("NewCourse3")) {
					break;
				}
				else
					System.out.println("Invalid selection");
			}
//==========================================================================================================================================================			
			if(a.equalsIgnoreCase("NewFaculty1")){
				if(b.equalsIgnoreCase("NewCourse1")) {
					String course= newCourse1.getCourseDept()+"-"+newCourse1.getCourseNum();
						if(newFaculty1.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 Teaches NewCourse1");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 does not Teach NewCourse1");
						}
				}
				else if(b.equalsIgnoreCase("NewCourse2")){
					String course= newCourse2.getCourseDept()+"-"+newCourse2.getCourseNum();
						if(newFaculty1.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 Teaches NewCourse2");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 does not Teach NewCourse2");
						}
				}
				else {
					String course= newCourse3.getCourseDept()+"-"+newCourse3.getCourseNum();
						if(newFaculty1.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 Teaches NewCourse3");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty1 does not Teach NewCourse3");
						}
				}
			}
			
			else if(a.equalsIgnoreCase("NewFaculty2")){
				
				if(b.equalsIgnoreCase("NewCourse1")) {
					String course= newCourse1.getCourseDept()+"-"+newCourse1.getCourseNum();
						if(newFaculty2.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 Teaches NewCourse1");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 does not Teach NewCourse1");
						}
				}
				
				else if(b.equalsIgnoreCase("NewCourse2")){
					String course= newCourse2.getCourseDept()+"-"+newCourse2.getCourseNum();
						if(newFaculty2.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 Teaches NewCourse2");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 does not Teach NewCourse2");
						}
				}
				
				else {
					String course= newCourse3.getCourseDept()+"-"+newCourse3.getCourseNum();
						if(newFaculty1.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 Teaches NewCourse3");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty2 Teaches NewCourse3");
						}
				}
			}
			
			else{
				if(b.equalsIgnoreCase("NewCourse1")) {
					String course= newCourse1.getCourseDept()+"-"+newCourse1.getCourseNum();
						if(newFaculty3.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 Teaches NewCourse1");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 does not Teach NewCourse1");
						}
				}
				else if(b.equalsIgnoreCase("NewCourse2")){
					String course= newCourse2.getCourseDept()+"-"+newCourse2.getCourseNum();
						if(newFaculty3.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 Teaches NewCourse2");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 does not Teach NewCourse2");
						}
				}
				else {
					String course= newCourse3.getCourseDept()+"-"+newCourse3.getCourseNum();
						if(newFaculty3.getAllCoursesTaughtAsString().contains(course)) {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 Teaches NewCourse3");
						}
						else {
							System.out.println("----------------------------------------------------------");
							System.out.println("NewFaculty3 does not Teach NewCourse3");
						}
					}
			}
//==========================================================================================================================================================			
			System.out.println("Have you completed your search? Enter Y/N");
			String c=scan.next();
			if(c.equalsIgnoreCase("Y")) {
				break;
			}
			else if (c.equalsIgnoreCase("N")) {}
		}
		// L.
		System.out.println("=================================================================================================");
		String [] f1= {"newFaculty1","newFaculty2","newFaculty3"};
		Faculty [] F1= {newFaculty1,newFaculty2,newFaculty3};
		System.out.println("The Faculty that teaches most is " + teachesMost(F1,f1)+". The Faculty that teaches least is " + teachesLeast(F1,f1)+".");
		// M-N.
		String [] c1= {"newCourse1","newCourse2","newCourse3"};
		Course [] C2= {newCourse1,newCourse2,newCourse3};
		System.out.println("The max Course is " + maxCourse(C2,c1)+". The min Course is " + minCourse(C2,c1)+".");
		// O.
		/*String [] s1= {"newStudent1","newStudent2","newStudent3"};
		Student [] S1= {newStudent3,newStudent3,newStudent3};
		for(int i=0;i<S1.length;i++) {
			System.out.println(S1[i].getAllCoursesTakenAsString());
		}
		System.out.println("The max Course is " + mostCredit(S1,s1)+". The min Course is " + LeastCredit(S1,s1)+".");
		*/
		printAll(A1,B1,C1,D1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
public static Course newCourse() {
	Course New;
	Boolean grad;
	String dept;
	System.out.println("Create new Courses");
	System.out.println("=====================");
	while(true) {
	System.out.println("Do you want Course to be a Graduate Course Y/N");
	String a= scan.next();
		if(a.equalsIgnoreCase("Y")) {
			grad=true;
		}
		else grad=false;
		if(a.equalsIgnoreCase("Y")||a.equalsIgnoreCase("N")) {
			break;
		}
	}
	System.out.println("What is the course Dept");
	dept=scan.next();
	System.out.println("What is the course Number");
	int b=scan.nextInt();
	System.out.println("What is the course credits");
	int cred=scan.nextInt();
	System.out.println("========================================");
	System.out.println("Course Created");
	System.out.println("========================================");
	return New= new Course(grad,b,dept,cred);
}

public static Faculty newFaculty(){
Faculty f;
boolean a=false; 
String dept;
System.out.println("Option 1) Faculty()");
System.out.println("Option 2) Faculty(boolean isTenured)"); 
System.out.println("Option 3) Faculty(String deptName, boolean isTenured)");
System.out.println("Option 4) Faculty(String name, int birthYear, String deptName, boolean isTenured)");
System.out.println("Select 1-4 for a Faculty");
int opst=0;
boolean b=true;
while(b||(opst>4 && opst<0)) {
	opst=scan.nextInt();
	b=false;
}
if (opst==1) {
	return f=new Faculty();
}
else if(opst==2) {
	while(true) {
		System.out.println("Is the faculty tenured Y/N");
		String t= scan.next();
		if(t.equalsIgnoreCase("Y")) {
			a=true;
		}
		else if (t.equalsIgnoreCase("N")) {	
			a=false;
		}
		if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
			break;
		}
	}
	return f=new Faculty(a);
}
else if(opst==3) {
	while(true) {
		System.out.println("Is the faculty tenured Y/N");
		String t= scan.next();
		if(t.equalsIgnoreCase("Y")) {
			a=true;
		}
		else if (t.equalsIgnoreCase("N")) {	
			a=false;
		}
		if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
			break;
		}
	}
	System.out.println("What is the course Dept");
	dept=scan.next();
	return f= new Faculty(dept,a);
}
else {
	System.out.println("Faculty Name:");
	String name=scan.next();
	System.out.println("Faculty birth Year:");
	int birthYear=scan.nextInt();
	System.out.println("What is the course Dept");
	dept=scan.next();
	while(true) {
		System.out.println("Is the faculty tenured Y/N");
		String t= scan.next();
		if(t.equalsIgnoreCase("Y")) {
			a=true;
		}
		else if (t.equalsIgnoreCase("N")) {	
			a=false;
		}
		if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
			break;
		}
	}
	return f= new Faculty(name,birthYear,dept,a);
}
}

public static GeneralStaff newGeneralStaff() {	
	GeneralStaff g;
	String duty;
	String dept;
	System.out.println("Option 1) GeneralStaff()");
	System.out.println("Option 2) GeneralStaff(String duty)"); 
	System.out.println("Option 3) GeneralStaff(String deptName, String duty)");
	System.out.println("Option 4) GeneralStaff(String name, int birthYear, String deptName, String duty)");
	System.out.println("Select 1-4 for a Staff");
	int opst=0;
	boolean b=true;
	while(b||(opst>4 && opst<0)) {
		opst=scan.nextInt();
		b=false;
	}
	if (opst==1) {
		return g= new GeneralStaff();
	}
	else if (opst==2) {
		System.out.println("What is the Staff's duty");
		duty=scan.next();
		return g= new GeneralStaff(duty);
	}
	else if (opst==3) {
		System.out.println("What is the Dept");
		dept=scan.next();
		System.out.println("What is the Staff's duty");
		duty=scan.next();
		return g= new GeneralStaff(dept,duty);
	}
	else {
		System.out.println("Staff Name:");
			String name=scan.next();
		System.out.println("Staff birth Year:");
			int birthYear=scan.nextInt();
		System.out.println("What is the Dept");
			dept=scan.next();
		System.out.println("What is the Staff's duty");
			duty=scan.next();
		return g= new GeneralStaff(name,birthYear,dept,duty);
	}
}

public static Student newStudent() {
	Student s;
	boolean grad =false; 
	String major;
	System.out.println("Option 1) Student()");
	System.out.println("Option 2) Student(boolean isGraduate)"); 
	System.out.println("Option 3) Student(String major, boolean isGraduate)");
	System.out.println("Option 4) Student(String name, int birthYear, String major, boolean isGraduate)");
	System.out.println("Select 1-4 for a Student");
	int opst=0;
	boolean b=true;
	while(b||(opst>4 && opst<0)) {
		opst=scan.nextInt();
		b=false;
	}
	if (opst==1) {
		return s=new Student();
	}
	else if(opst==2) {
		while(true) {
			System.out.println("Is the Student a grad Student Y/N");
			String t= scan.next();
			if(t.equalsIgnoreCase("Y")) {
				grad=true;
			}
			else if (t.equalsIgnoreCase("N")) {	
				grad=false;
			}
			if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
				break;
			}
		}
		return s=new Student(grad);
	}
	else if (opst==3) {
		while(true) {
			System.out.println("Is the Student a grad Student Y/N");
			String t= scan.next();
			if(t.equalsIgnoreCase("Y")) {
				grad=true;
			}
			else if (t.equalsIgnoreCase("N")) {	
				grad=false;
			}
			if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("What is the student major");
		major=scan.next();	
		return s= new Student(major,grad);		
	}
	else {
		System.out.println("Student Name:");
		String name=scan.next();
		System.out.println("Student birth Year:");
		int birthYear=scan.nextInt();
		System.out.println("What is the student major");
		major=scan.next();
		while(true) {
			System.out.println("Is the Student a grad Student Y/N");
			String t= scan.next();
			if(t.equalsIgnoreCase("Y")) {
				grad=true;
			}
			else if (t.equalsIgnoreCase("N")) {	
				grad=false;
			}
			if(t.equalsIgnoreCase("Y")||t.equalsIgnoreCase("N")) {
				break;
			}
		}
		return s= new Student(name,birthYear,major,grad);
	}
}

public static String teachesMost(Faculty[] a,String[] b) {
	String most=b[0];
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==1) {
			most =b[i];
			}
			else {
			most =b[i-1];	
			}
		}
	return most;
}
public static String teachesLeast(Faculty[] a,String[] b) {
	String least=b[0];
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==-1) {
			least =b[i];
			}
			else {
			least =b[i-1];	
			}
		}
	return least;
}

public static String maxCourse(Course[] a,String[] b) {
	String most=b[0];
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==1) {
			most =b[i];
			}
			else {
			most =b[i-1];	
			}
		}
	return most;
}
public static String minCourse(Course[] a,String[] b) {
	String min="";
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==-1) {
			min =b[i];
			}
			else {
			min =b[i-1];	
			}
		}
	return min;
}

public static String mostCredit(Student[] a,String[] b) {
	String most=b[0];
	Student start=a[0];
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==1) {
			most =b[i];
			}
			else {
			most =b[i-1];	
			}
		}
	return most;
}
public static String LeastCredit(Student[] a,String[] b) {
	String least=b[0];
		for(int i=1;i<a.length;i++) {
			if (a[i].compareTo(a[i-1])==-1) {
			least =b[i];
			}
			else {
			least =b[i-1];	
			}
		}
	return least;
}
public static void printAll(Course[] a, GeneralStaff[] b, Faculty[] c, Student[] d) {
	System.out.println("**************************************************************");
	System.out.println("SCHOOL DATABASE INFO:");
	System.out.println();
	System.out.println("************************************************");
	System.out.println("COURSES:");
	for(int i=0 ; i<a.length;i++) {
		System.out.println(a[i].toString());
	}
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("PERSONS:");
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("EMPLOYEES:");
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("GENERAL STAFF:");
	for(int i=0 ; i<b.length;i++) {
		System.out.println(b[i].toString());
	}
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("FACULTY:");
	for(int i=0 ; i<c.length;i++) {
		System.out.println(c[i].toString());
	}
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("STUDENTS:");
	for(int i=0 ; i<d.length;i++) {
		System.out.println(d[i].toString());
	}
	System.out.println("************************************************");
	System.out.println("**************************************************************");
	System.out.println();
}
	
}


