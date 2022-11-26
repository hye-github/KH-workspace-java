package classes;

public class Movie {


	private String title;
	private String genre;
	private double score;
	
	
	public Movie() {}
	
	public Movie(String title, String genre, double score) { //대응
	      super();
	      this.title = title;
	      this.genre = genre;
	      this.score = score;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}
