
public class StudentManager extends UserManager{
	public void join (Student student) {
		System.out.println(student.getFirstName()+" "+student.getCourse()+" " + "kursuna kayit oldu");
	}

}
