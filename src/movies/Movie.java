
package movies;

public class Movie {
    private String name;
    private String category;



//constructor
//    setting rules; having two parameters
    public Movie(String _name, String _category){
//  use this!
        this.name = _name;
        this.category = _category;

    }
//getters(methods)
    public String getName (){
        return this.name;
    }


    public String getCategory(){
      return  this.category;
    }


//setters(methods)

    public void setName(String _name){
        this.name= _name; }

    public void setCategory(String _category){
        this.category= _category; }


}
