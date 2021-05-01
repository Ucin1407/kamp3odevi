public class Student extends User {
	private String studentName;
	private String lesson;
	private double progressPercentage;
	
	public Student(String studentName,String lesson, double progressPercentage) {
		super();
		this.studentName = studentName;
		this.lesson = lesson;
		this.progressPercentage = progressPercentage;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public double getProgressPercentage() {
		return progressPercentage;
	}
	public void setProgressPercentage(double progressPercentage) {
		this.progressPercentage = progressPercentage;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}