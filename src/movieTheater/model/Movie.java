package movieTheater.model;

public class Movie  {
    private String idMovie;
    private String name;
    private String showDay;
    private int ticketAmount;

    public Movie(String idMovie, String name, String showDay, int ticketAmount) {
        this.idMovie = idMovie;
        this.name = name;
        this.showDay = showDay;
        this.ticketAmount = ticketAmount;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowDay() {
        return showDay;
    }

    public void setShowDay(String showDay) {
        this.showDay = showDay;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie='" + idMovie + '\'' +
                ", name='" + name + '\'' +
                ", showDay='" + showDay + '\'' +
                ", ticketAmount=" + ticketAmount +
                '}';
    }
    public String getLine(){
        return idMovie+","+name+","+showDay+","+ticketAmount;
    }

//    @Override
//    public String Obj() {
//        return idMovie+","+name+","+showDay+","+ticketAmount;
//    }
}
