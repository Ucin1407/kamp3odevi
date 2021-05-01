public class Instructor extends User{

	private String instructorFirstName;
	private String instructorLastName;
	private String courseName;
	public Instructor(String instructorFirstName, String instructorLastName, String courseName) {
		super();
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.courseName = courseName;
	}
	public String getInstructorFirstName() {
		return instructorFirstName;
	}
	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}
	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
