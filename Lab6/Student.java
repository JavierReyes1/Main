package Lab6;
public class Student extends Person{
	private int numCourses;
	private String [] courses;
	private int [] grades;

	public Student(String name, String address){
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[5];
		this.grades = new int[5];
		
	}
	public void addCourseGrade(String course, int grade){
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses ++;
	}
	public void printGrades(){
		for(int i = 0; i < numCourses; i++){
			System.out.println("-------------------------");
			System.out.println("Course: " + courses[i]);
			System.out.println("Mark: " + grades[i]);
			System.out.println("-------------------------");
		}	
	}
	public double getAverageGrade(){
		double average = 0;
		for(int i = 0; i < numCourses; i++){
			average += grades[i];
		}
		return average / numCourses;
	}
	@Override
	public String toString(){
		return super.toString() + " [Person Type: Student]";
	}
}
