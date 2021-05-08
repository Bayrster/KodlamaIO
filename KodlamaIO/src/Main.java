
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student(1, "Muhammed", "Bayram", "asd", "asdasdsd","istanbul" , "Java");
		Student student2=new Student(2,"Elif","ERYİĞİT","dsa","dsadas","Ankara","C#");
		Instructor instructor1=new Instructor(1, "Engin", "Demiroğ", "engindemiroğ@gmail.com", "asdsdas", "Java");
		
		UserManager userManager=new UserManager();
		userManager.Add();
		userManager.Remove();
		userManager.Update();
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addToHomework(instructor1);
		
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.join(student1);
		studentManager.join(student2);
	}

}
