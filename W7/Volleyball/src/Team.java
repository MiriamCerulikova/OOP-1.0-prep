import java.util.ArrayList;
import java.util.List;

class Team
{
    private String name;
    private List<Player> players;
    private int matchesWon;

    public Team(String name)
    {
        this.name = name;
        this.players = new ArrayList<>();
        this.matchesWon = 0;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<Player> getPlayers()
    {
        return this.players;
    }
    public int getMatchesWon()
    {
        return this.matchesWon;
    }
    public void setMatchesWon(int matchesWon)
    {
        this.matchesWon = matchesWon;
    }

    public void addPlayer(Player player)
    {
        players.add(player);
    }

    public int getTotalWins()
    {
        return this.matchesWon;
    }
}
