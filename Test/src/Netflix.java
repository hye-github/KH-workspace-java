public class Netflix {

	private String name;

	private String genre;

	private double point;

	

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getGenre() {

		return genre;

	}

	public void setGenre(String genre) {

		this.genre = genre;

	}

	public double getPoint() {

		return point;

	}

	public void setPoint(double point) {

		this.point = point;

	}

	

	

	public void getContents() {

		System.out.println(name + "\t" + genre + "\t" + point);

	}



	public Netflix() {}

	public Netflix(String name, String genre, double point) {

		this.name = name;

		this.genre = genre;

		this.point = point;

	}

}