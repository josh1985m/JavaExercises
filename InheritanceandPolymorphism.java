public class InheritanceandPolymorphism 
{
	public static class Person 
	{
		String name;
		String address;
		int phoneNumber;
		String emailAddress;
		public Person()
		{
			
		}
		public Person(String name, String address, int phoneNumber, String emailAddress)
		{
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.emailAddress = emailAddress;
		}
		
	}	
	public static class Employee extends Person 
	{
		String office;
		double salary; 
		int year;
		int day;
		int month;
		
		public void DateHired(int year, int month, int day) 
		{
			this.year = year;
			this.month = month;
			this.day = day;
		}
		
		public Employee(String office, double salary, int year, int day, int month)
		{
			this.office = office;
			this.salary = salary;
		}
	}
	
	public static class Student extends Person
	{
		private int status;
		public final static int FRESHMAN = 1;
		public final static int SOPHOMORE = 3;
		public final static int JUNIOR = 2;
		public final static int SENIOR = 4;

		public Student(String name, double d,  
			int phoneNumber, int i, int status) {

			this.status = status;
		}
		public void setStatus(int status) {
			this.status = status; 
		}
		public String getStatus() {
			switch (status) {
				case 1 : return "freshman"; 
				case 2 : return "sophomore"; 
				case 3 : return "junior"; 
				case 4 : return "senior";
				default : return "Unknown"; 
			}
		}
		public String toString() {
			return super.toString() + "\nStatus: " + getStatus();
		}
	}
	
	public static class Faculty extends Employee
	{
		String officeHours;
		int rank;
		public Faculty(String office, double salary, int year, int day, int month, String officeHours, int rank) {
			super(office, salary, year, day, month);
			this.officeHours = officeHours;
			this.rank = rank;
		}
		
	}
	public static class Staff extends Employee
	{
		String title;
		public Staff(String office, double salary, int year, int day, int month, String title) {
			super(office, salary, year, day, month);
			this.title = title;
		}
		
	}

	public static void main(String[] args) {
		
		Employee employee = new Employee("Home Office", 690123.35, 1995, 26, 07);
		System.out.println(employee.toString());
		Student student = new Student("Home Office", 690123.35, 1995, 26, 07);
		System.out.println(student.toString());
		Faculty faculty = new Faculty(null, 0, 0, 0, 0, null, 0);
		System.out.println(faculty.toString());
		Staff staff = new Staff(null, 0, 0, 0, 0, null);
		System.out.println(staff.toString());
		
	}

}
