class MoviesTi { 
    private final String movieName; 
    private final double ticketPrice; 
    private int availableSeats; // Yahan boolean ki jagah int use hoga

    public MoviesTi(String movieName, double ticketPrice, int availableSeats) { 
        this.movieName = movieName; 
        this.ticketPrice = ticketPrice; 
        this.availableSeats = availableSeats; 
    } 

    public String getMovieName() { 
        return movieName; 
    } 

    public double getTicketPrice() { 
        return ticketPrice; 
    } 

    public int getAvailableSeats() { 
        return availableSeats; 
    } 

    public void bookseat(int numberofseats) {
        // Spelling theek kar di hai aur int ke sath comparison ho raha hai
        if (numberofseats < 0 || numberofseats > availableSeats) {
            System.out.println("Booking rejected: " + numberofseats);
        } else {
            availableSeats = availableSeats - numberofseats;
            System.out.println("Booking " + numberofseats + " seats successful!");
        }
    }
}

public class MoviesTicket { 
    public static void main(String[] args) { 
        // 3ri value mein seat ka number (jaise 10 seats) pass kiya hai
        MoviesTi ticket1 = new MoviesTi("Inception", 12.5, 10); 
        MoviesTi ticket2 = new MoviesTi("The Dark Knight", 10.0, 5); 
        
        ticket1.bookseat(3);

        System.out.println("Movie: " + ticket1.getMovieName() + ", Price: $" + ticket1.getTicketPrice() + ", Available Seats: " + ticket1.getAvailableSeats()); 
        System.out.println("Movie: " + ticket2.getMovieName() + ", Price: $" + ticket2.getTicketPrice() + ", Available Seats: " + ticket2.getAvailableSeats()); 
    } 
}