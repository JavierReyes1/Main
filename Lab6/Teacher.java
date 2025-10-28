package Lab6;
public class Teacher extends Person{
	private int numCourses;
	private String [] courses;

	public Teacher(String name, String address){
		super(name, address);
		numCourses = 0;
		this.courses = new String[2];
	}
	public boolean addCourse(String course){
		if(numCourses != courses.length){
			courses[numCourses] = course;
			numCourses++;
			return true; //if the array is not full, add course,return true	
		}else{
			return false; //if array is full, return false	
		}
	}
	public boolean removeCourse(String course){
		String temp = " ";
		boolean isRemoved = false;
		for(int i = 0; i < courses.length ; i++){
			if(courses[i].equalsIgnoreCase(course)){
				 courses[i] = " ";
				 isRemoved = true;
			}
		}
		return isRemoved;
	}
	@Override
	public String toString(){
		return  "[Person Type: Teacher]" + super.toString() ;
	}

}
