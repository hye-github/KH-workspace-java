
public class Movie {


	private String title;
	private String genre;
	private int grade;
	
	
	public Movie() {}
	
	public Movie(String title, String genre, int grade) { //대응
	      super();
	      this.title = title;
	      this.genre = genre;
	      this.grade = grade;
	 }
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
