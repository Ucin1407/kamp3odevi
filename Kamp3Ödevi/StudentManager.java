public class StudentManager  {
	public static void lessonStart(Student student,Student student2) {
		
		System.out.println(student.getStudentName() + " adlı öğrenci " + student.getLesson() + " derse başladı");
		System.out.println(student2.getStudentName() + " adlı öğrenci " + student2.getLesson() + " derse başladı");
		System.out.println(student.getStudentName() + " " + " % " + student.getProgressPercentage() + " ulaştı");
		System.out.println(student2.getStudentName() + " " + " % " + student2.getProgressPercentage() + " ulaştı");
	}	
	}

