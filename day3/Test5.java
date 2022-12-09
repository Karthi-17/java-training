package day3;

class Movie { //implements Comparator{
	
	String title;
	String director;
	double rating;
	
	Movie() {}
	
	Movie(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	
	public void getRating(Movie[] movie) {
		for(int i = 0;i<movie.length;i++) {
			if(movie[i].rating>3) {
				System.out.println(movie[i].title);
			}
		}
	}
	
	public Movie[] movieUpperCase(Movie[] movie) {
		for (int i = 0; i < movie.length; i++) {
			System.out.println(movie[i].title.toUpperCase());
		}
		return movie;
	}
	
	public void printMovie(Movie[] movie) {
		for (int i = 0; i < movie.length; i++) {
			System.out.println(movie[i].title);
		}
		System.out.println();
	}
	
	public Movie[] sortByDirector(Movie[] movie) {
		
//		for (int i = 0; i < movie.length-1; i++) {
//			for (int j = 0; j < movie.length-1-i; j++) {
//				if (movie[j].director.charAt(0)>movie[j+1].director.charAt(0)) {
//					Movie temp = movie[j];
//					movie[j] = movie[j+1];
//					movie[j+1] = temp;
//				}
//			}
//		}
		
		for (int i = 0; i < movie.length-1; i++) {
			for (int j = 0; j < movie.length-1-i; j++) {
				if (movie[j].director.charAt(0)>movie[j+1].director.charAt(0)) {
					Movie temp = movie[j];
					movie[j] = movie[j+1];
					movie[j+1] = temp;
				}
			}
		}
		
		return movie;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		Movie m1 = (Movie) o1;
//		Movie m2 = (Movie) o2;
//		
//		if (m1.director.charAt(0)>m2.director.charAt(0)) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
}

public class Test5 {

	public static void main(String[] args) {
		Movie m1 = new Movie("Wakanda Forever", "Ryan Coogler", 4);
		Movie m2 = new Movie("Spiderman: No way home", "Jon Watts", 4.5);
		Movie m3 = new Movie("Interstellar", "Christopher Nolan", 4.7);
		Movie m4 = new Movie("ABC", "DEF", 2);
		Movie m5 = new Movie("ABCDE", "DEF", 3);
		
		Movie[] movieArray = { m1, m2, m3, m5, m4 };
		
		Movie test = new Movie();
		test.getRating(movieArray);
		test.movieUpperCase(movieArray);
		test.getRating(movieArray);
		test.printMovie(movieArray);
		test.sortByDirector(movieArray);
		test.printMovie(movieArray);
		test.getRating(movieArray);
		
	}

}
