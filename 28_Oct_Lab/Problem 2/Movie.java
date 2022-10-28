/*Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables   */


package Lab_28Oct;

public class Movie {

    String movieName, movieStartTime,movieEndTime;
    
    public String getMovie() {
      System.out.println("Movie name : "+movieName);
      System.out.println("Movie StartTime : "+movieStartTime);
      System.out.println("Movie EndTime :"+movieEndTime);
      
      return null;
    }
    public void setMovie(String movieName,String movieStartTime,String movieEndTime) {
    	this.movieName=movieName;
    	this.movieStartTime=movieStartTime;
    	this.movieEndTime=movieEndTime;
    }
}
