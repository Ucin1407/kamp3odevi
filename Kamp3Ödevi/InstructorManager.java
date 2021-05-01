public class InstructorManager extends StudentManager{
  public static void load(Instructor instructor,Instructor instructor2) {
	  System.out.println(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName() + " adlı eğitmen " + instructor.getFirstName() + " adlı öğrencinin " + instructor.getCourseName() + " adlı kursunu yükledi");
	  System.out.println(instructor2.getInstructorFirstName() + " " + instructor2.getInstructorLastName() + " adlı eğitmen " + instructor.getLastName() + " adlı öğrencinin " + instructor.getCourseName() + " adlı kursunu yükledi");
 }
}
