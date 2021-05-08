
public class Instructor extends User{
	String lesson;

	public Instructor(int id, String firstName, String lastName, String email, String password, String lesson) {
		super(id, firstName, lastName, email, password);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	

}
