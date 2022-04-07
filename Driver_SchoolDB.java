//https://youtu.be/BhpbsAuR470

import java.util.*;
import java.io.*;
public class Driver_SchoolDB {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		ReadAndWriteToConsole();
		 Course A= new Course( true, 771, "MAT", 4);
		 Course B = new Course (true,777,"CMP",4);
		 Course C = new Course (true,711,"CMP",4);
		 Course D = new Course (true,723,"MAT",4);
		 Course E = new Course (false,168,"CMP",4);
		 Course F = new Course (false,338,"CMP",4);
		 Course [] a = {A,B,C,D,E,F};
		
		 Faculty G = new Faculty();
		 Faculty H = new Faculty(true);
		 Faculty I = new Faculty("MAT",false);
		 Faculty J = new Faculty("Superman",1938,"PHY",true);
		 Faculty [] c= {G,H,I,J};
		
		 Student K = new Student();
		 Student L = new Student(false);
		 Student M = new Student("Math",false);
		 Student N = new Student("Wonderwoman",1941,"JST",true);
		 Student[] d = {K,L,M,N};
		
		 GeneralStaff O = new GeneralStaff();
		 GeneralStaff P = new GeneralStaff("advise students");
		 GeneralStaff Q = new GeneralStaff("Sanitation","clean");
		 GeneralStaff R = new GeneralStaff("Flash Gordon",1934,"Security","safety");
		 GeneralStaff[] b = {O,P,Q,R};
		 printAll(a,b,c,d);
		 
	}
	
	public static void ReadAndWriteToConsole() throws IOException {
		Scanner keyBoard =new Scanner (System.in);
		File f=new File("SchoolDB_Initial.txt");
		try {
		      Scanner myReader = new Scanner(f);
		      while (myReader.hasNextLine()) {
		        String b = myReader.nextLine();
		        System.out.println(b);
		      }
		      System.out.println();
		      myReader.close();
		}catch (FileNotFoundException e) {
			
			
		}
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

		
	

