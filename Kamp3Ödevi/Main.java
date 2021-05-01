public class Main {

	public static void main(String[] args) {
		User user = new User("Uğur","Can","u123","u.kodlamaio@gmail.com",true);
	    User user2 = new User("Can","Çırak","u456","u2.kodlamaio@gmail.com",false);
		user.Login("Uğur", "u123");
		user2.Login("Can","u456");
		user.getIsActive();
		user2.getIsActive();
		UserManager.add(user, user2);
		
		
		Instructor instructor = new Instructor("Engin","Demirog","Java&React");
		Instructor instructor2 = new Instructor("Engin","Demirog","C#");
		InstructorManager.load(instructor, instructor2);
	 
		
		
		Student student = new Student("Uğurcan","Java",48);
		Student student2 = new Student("Mustafa","C#",98);
        StudentManager.lessonStart(student, student2);
	}

}
