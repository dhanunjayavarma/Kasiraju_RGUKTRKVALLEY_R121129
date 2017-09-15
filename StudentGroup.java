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
	//public static ;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public static ArrayList<Student> StudentList=new ArrayList<Student>();
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	//completed
	public int getLength()
	{
		return this.students.length;
	}
	@Override
	//completed
	public Student[] getStudents() {
		// Add your implementation here
		this.students = new Student[StudentList.size()];
		toarray(this.students);
		return this.students;
	}

	@Override
	//completed
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
	//completed
	public Student getStudent(int index) {
		// Add your implementation here
		int len=getLength();
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
	//completed
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
		//Student[] dateStudent;
		public static ArrayList<Student> al=new ArrayList<Student>();
		int len=StudentList.size();
		int i;
		for(i=0;i<len;i++)
		{
			if(date.after(StudentList.get(i).getBirthDate())||date.equals(StudentList.get(i).getBirthDate() ))
			{
				//System.out.println(StudentList.get(i).getBirthDate());
				al.add(this.students[i]);
			}
		}
		Student[] dateStudent=new Student[al.size()];
		dateStudent=toa(al,dateStudent);
		return dateStudent;
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
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] dateStudent;
		ArrayList<Student> al=new ArrayList<Student>();
		int len=StudentList.size();
		int i;
		for(i=0;i<len;i++)
		{
			if( (firstDate.before(StudentList.get(i).getBirthDate())&&lastDate.after(StudentList.get(i).getBirthDate())) ||firstDate.equals(StudentList.get(i).getBirthDate() )||lastDate.equals(StudentList.get(i).getBirthDate()))
			{
				//System.out.println(StudentList.get(i).getBirthDate());
				al.add(this.students[i]);
			}
		}
		dateStudent=new Student[al.size()];
		dateStudent=toa(al,dateStudent);
		return dateStudent;
		//return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		//Date date2=new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE,days);
		Date date2=c.getTime();
		return getBetweenBirthDates(date,date2);
		//return null;
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
		Double max=Double.MIN_VALUE;
		int i;
		int len=this.students.length;
		for(i=0;i<len;i++)
		{
			if(this.students[i].getAvgMark()>max)
			{
				max=this.students[i].getAvgMark();
			}
		}
		ArrayList<Student> al=new ArrayList<Student>();
		for(i=0;i<len;i++)
		{
			if(this.students[i].getAvgMark()==max)
			{
				al.add(students[i]);
			}
		}
		Student [] dateStudent=new Student[al.size()];
		dateStudent=toa(al,dateStudent);
		return dateStudent;
	}

	@Override
	public Student getNextStudent(Student student) {
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
			}
			return this.students[i+1];	
		}
		
	}
}
