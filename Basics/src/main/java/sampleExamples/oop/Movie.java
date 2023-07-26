package sampleExamples.oop;
//Example of Implementing Encapsulation in programming
public class Movie {
    // Data members
    private String title;
    private int year;
    private String genre;

    //Constructors : Properties of the class are initialized using constructors
    //Default Constructor


    public Movie() {
        title ="";
        year = -1;
        genre ="";
    }
   //Parameterized constructor
    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    //Getters and setter : to modify and access private members of the class

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
