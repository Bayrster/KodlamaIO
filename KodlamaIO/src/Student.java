
public class Student extends User{
	String adres;
	String course;
	public Student(int id, String firstName, String lastName, String email, String password, String adres,
			String course) {
		super(id, firstName, lastName, email, password);
		this.adres = adres;
		this.course = course;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
