package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		Movie m1 = new Movie(8, "Force", 2015);
		Movie m2 = new Movie(7, "Jallebi", 1983);
		Movie m3 = new Movie(9, "WorldWar", 1977);

		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(m1);
		list.add(m2);
		list.add(m3);

//		for (Movie movie : list) {
//			System.out.print(movie.getRating() + " ");
//			System.out.print(movie.getName() + " ");
//			System.out.print(movie.getYear() + " ");
//			System.out.println("  ");
//		}
//		System.out.println("Movies after sorting : ");
//		Collections.sort(list);
//		for (Movie movie : list) {
//			System.out.print(movie.getRating() + " ");
//			System.out.print(movie.getName() + " ");
//			System.out.print(movie.getYear() + " ");
//			System.out.println("  ");
//		}
		SortByRating rating = new SortByRating();
		Collections.sort(list, rating);
		for (Movie movie : list) {
			System.out.print(movie.getRating() + " ");
			System.out.print(movie.getName() + " ");
			System.out.print(movie.getYear() + " ");
			System.out.println("  ");
		}
		System.out.println("Movies after sorting (year) : ");
		SortByYear year = new SortByYear();
		Collections.sort(list, year);
		for (Movie movie : list) {
			System.out.print(movie.getRating() + " ");
			System.out.print(movie.getName() + " ");
			System.out.print(movie.getYear() + " ");
			System.out.println("  ");
	}
		System.out.println("Movies after sorting (Name) : ");
		SortByName name = new SortByName();
		Collections.sort(list, name);
		for (Movie movie : list) {
			System.out.print(movie.getRating() + " ");
			System.out.print(movie.getName() + " ");
			System.out.print(movie.getYear() + " ");
			System.out.println("  ");
	}
}
}
