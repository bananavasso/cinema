import java.util.*;

public class Movie {

    private String title;
    private String cast;
    private String director;
    private String releaseDate;
    private String duration;
    private String genre;
    private String rating;
    private String distributor;
    private String website;
    private String synopsis;
    private String time;
    public ArrayList<String> dates = new ArrayList<>();


    public String getTitle(){
        return title;
    }
    public String getCast(){
        return cast;
    }
    public String getDirector(){
        return director;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public String getDuration(){
        return duration;
    }
    public String getGenre(){
        return genre;
    }
    public String getRating(){
        return rating;
    }
    public String getDistributor(){
        return distributor;
    }
    public String getWebsite(){
        return website;
    }
    public String getSynopsis(){
        return distributor;
    }
    public String getTime(){
        return director;
    }
    public ArrayList getDates(){
        return dates;
    }



    public void setTitle(String title){
        title=title;
    }
    public void setCast(String cast){
        cast=cast;
    }
    public void setDirector(String director){
        director=director;
    }
    public void setReleaseDate(String releaseDate){
        releaseDate=releaseDate;
    }
    public void setDuration(String duration){
        duration=duration;
    }
    public void setGenre(String genre){
        genre=genre;
    }
    public void setRating(String rating){
        rating=rating;
    }
    public void setDistributor(String distributor){
        distributor=distributor;
    }
    public void setWebsite(String website){
        website=website;
    }
    public void setSynopsis(String synopsis){
        synopsis=synopsis;
    }
    public void setDate(String date){
        dates.add(date);
    }
    public void setTime(String time){
        time=time;
    }

}
