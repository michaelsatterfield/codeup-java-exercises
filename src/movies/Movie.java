
package movies;

public class Movie {
    private String name;
    private String category;



    //constructor
    public Movie(String _name, String _category){
        this.name = _name;
        this.category = _category;

    }
    //setters
    public void setInfo(String title,String category){
 this.name = title;
 this.category = category;
    }

//geters
    public Movie getMovieById (Integer id){
        Movie[] moviesList = new MoviesArray().findAll();


 return moviesList[id];
    }



}
