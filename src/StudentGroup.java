import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public static ArrayList<Student> StudentList=new ArrayList<Student>();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		this.students = new Student[StudentList.size()];
		toarray(this.students);
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int len=this.students.length;
		int i;
		if(students==null)
		{
			    throw new IllegalArgumentException();
		}
		else
		{
			for(i=0;i<len;i++)
			{
				StudentList.add(students[i]);
				//setStudent(students[i],i);
			}
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int len=this.students.length;
		if(index<0||index>=len)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return this.students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		//System.out.println(student.getFullName());
		int len=StudentList.size();
		if(student==null||index<0||index>=StudentList.size())
		{
			throw new IllegalArgumentException();
		}
		else
		{
			//this.students[index]=student;
			StudentList.set(index,student);
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	@Override
		public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			StudentList.add(0,student);
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}
@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			StudentList.add(student);
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null||index<0||index>=StudentList.size())
		{
			throw new IllegalArgumentException();
		}
		else
		{
			//this.students[index]=student;
			StudentList.add(index,student);
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=StudentList.size())
		{
			throw new IllegalArgumentException();
		}
		else
		{
			StudentList.remove(index);
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	
	 if(student==null)
	 {
		 throw new IllegalArgumentException();
	 }
	 else
	 {
		 int i;
		 int mark=0;
		 int len=StudentList.size();
		 for(i=0;i<len;i++)
		 {
			 if(this.students[i].equals(student))
			 {
				 StudentList.remove(student);
				 mark=1;
			 }
		 }
		 if(mark==0)
		 {
			 throw new IllegalArgumentException("Student not exist");
		 }
	 }
	}
	public void toarray(Student[] students)
	{
		int i;
		int len=StudentList.size();
		for(i=0;i<len;i++)
		{
			this.students[i]=StudentList.get(i);
		}
	}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int i,j;
		int len=StudentList.size();
		if(index<0||index>=StudentList.size())
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(i=0;i<len;i++)
			{
				if(i>index)
				{
					for(j=i;j<len;j++)
					{
						StudentList.remove(i);
					}
					break;
			
					
				}
			}
			
			this.students = new Student[StudentList.size()];
			 toarray(this.students);
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			int len=StudentList.size();
			int i,j;
			for(i=0;i<len;i++)
			{
				if(this.students[i].equals(student))
				{
					for(j=i;j<len-1;j++)
					{
						StudentList.remove(i+1);
					}
					//StudentList.remove(i);
					break;
				}
			}
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i,j;
		int len=StudentList.size();
		if(index<0||index>=StudentList.size())
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(i=0;i<index;i++)
			{
			
				StudentList.remove(0);
				
				
			}
			
			this.students = new Student[StudentList.size()];
			 toarray(this.students);
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			int len=StudentList.size();
			int i,j;
			for(i=0;i<len;i++)
			{
				if(this.students[i].equals(student))
				{
					break;
				}
				else
				{
					StudentList.remove(0);
				}
			}
			this.students = new Student[StudentList.size()];
			toarray(this.students);
		}
	}

	public Student[] toa(ArrayList<Student> al,Student[] st)
	{
		int i;
		int len=st.length;
		for(i=0;i<len;i++)
		{
			st[i]=al.get(i);
		}
		return st;
	}
	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		int len=StudentList.size();
		Student st;
		for(i=0;i<len-1;i++)
		{
			for(j=0;j<len-i-1;j++)
			{
				//System.out.println(this.students[j].compareTo(this.students[j+1]));
				if(StudentList.get(j).compareTo(StudentList.get(j+1))>0)//f>s +
				{
					st=this.students[j];
					StudentList.set(j,this.students[j+1]);
					StudentList.set(j+1,st);
				}
			}

		}
		this.students = new Student[StudentList.size()];
		toarray(this.students);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}


	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
