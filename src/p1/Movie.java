package p1;

public class Movie /* implements Comparable<Movie> */{
	private int rating;
	private String name;
	private int year;

	public Movie(int rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

//	@Override
//	public int compareTo(Movie o) {
//		return this.year-o.year;
//	}

	

	

}
