import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Date date1 = new Date("1992/01/06");
		Date date2 = new Date("1993/03/06");
		Date date3 = new Date("1997/04/06");
		Date date4 = new Date("1995/05/07");
		Date date5 = new Date("1995/05/01");
		
		//Date date1 = dateformat3.parse("17/07/1989");
		Student st[]=new Student[5];
		st[0]=new Student(121129,"dhanunjai",date1,98.3);
		st[1]=new Student(121128,"jai",date2,91.1);
		st[2]=new Student(121139,"rag",date3,89.1);
		st[3]=new Student(121149,"pra",date4,98.3);
		st[4]=new Student(121119,"sin",date5,87.4);
		StudentGroup sg=new StudentGroup(5);
		sg.setStudents(st);
		//System.out.println(sg.length);
		sg.addFirst(new Student(121111,"rim",new Date(1991-01-21),76.7));
		
		//sg.remove(0);
		//sg.remove(new Student(121111,"rim",new Date(1991-01-21),76.7));
		
		//sg.removeToIndex(2);
		//sg.removeToElement(new Student(121149,"pra",date4,72.1));
		//sg.bubbleSort();
		//Student[] students=sg.getStudentsWithMaxAvgMark();
		Student[] students=sg.getStudents();
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].getFullName());
		}
		//System.out.println(sg.getNextStudent(st[1]).getFullName());
		//System.out.println(students[0].getFullName());
		//System.out.println(st[0].getBirthDate());
		//int id, String fullName, Date birthDate, double avgMark
	}

}
