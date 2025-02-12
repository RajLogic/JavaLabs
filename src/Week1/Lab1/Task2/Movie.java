package Week1.Lab1.Task2;

public class Movie {
    private String title;
    private String director;
    private int year;
    private int rating;


    public Movie(String title, String director, int year, int rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
//can use this too to set the value and check it in line version instead of setRating
//        if (rating >= 0 && rating <= 5) {
//            this.rating = rating;
//        } else {
//            this.rating = 0;
//        }

//        Call function instead
//        setRating(rating);
    }

    public Movie() {
        this.title = "";
        this.director = "";
        this.year = 0;
        this.rating = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            this.rating = 0;
        }
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return "\nTitle: " + title + "\nDirector: " + director + "\nYear: " + year + "\nRating: " + rating +"\n";
    }
}

