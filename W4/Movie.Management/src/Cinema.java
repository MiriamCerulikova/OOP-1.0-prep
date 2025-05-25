import java.util.List;

public class Cinema
{
    private String name;
    private List<Room> rooms;

    public Cinema(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

    public void setRooms(List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public void addRoom(Room room)
    {
        rooms.add(room);
    }

    public double getTotalRevenue()
    {
        double totalRevenue = 0;
        for (Room room : rooms)
        {
            for (Seat seat : room.getSeats())
            {
                totalRevenue += seat.getTotalPrice();
            }
        }
        return totalRevenue;
    }

    public Room getRoomWithMostSeats()
    {
        Room roomWithMostSeats = null;
        int maxSeats = 0;
        for (Room room : rooms)
        {
            if (room.getTotalSeats() > maxSeats)
            {
                maxSeats = room.getTotalSeats();
                roomWithMostSeats = room;
            }
        }
        return roomWithMostSeats;
    }

    public Room getRoomWithFewestSeats()
    {
        Room roomWithFewestSeats = null;
        int minSeats = Integer.MAX_VALUE;
        for (Room room : rooms)
        {
            if (room.getTotalSeats() < minSeats)
            {
                minSeats = room.getTotalSeats();
                roomWithFewestSeats = room;
            }
        }
        return roomWithFewestSeats;
    }

    public Movie getMostExpensiveMovie()
    {
        Movie mostExpensiveMovie = null;
        double maxPrice = 0;
        for (Room room : rooms)
        {
            Movie movie = room.getMovie();
            if (movie.getPrice() > maxPrice)
            {
                maxPrice = movie.getPrice();
                mostExpensiveMovie = movie;
            }
        }
        return mostExpensiveMovie;
    }
}
