import static org.junit.jupiter.api.Assertions.*;

class TeamTest
{
    private Team team;
    private Player player1;
    private Player player2;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        team = new Team("Team A");
        player1 = new Player("Player 1", 10);
        player2 = new Player("Player 2", 20);
    }

    @org.junit.jupiter.api.Test
    void getMatchesWon()
    {
        team.setMatchesWon(5);
        assertEquals(5, team.getMatchesWon());
    }

    @org.junit.jupiter.api.Test
    void setMatchesWon()
    {
        team.setMatchesWon(10);
        assertEquals(10, team.getMatchesWon());
    }

    @org.junit.jupiter.api.Test
    void addPlayer()
    {
        team.addPlayer(player1);
        assertEquals(1, team.getPlayers().size());
        assertTrue(team.getPlayers().contains(player1));
    }

    @org.junit.jupiter.api.Test
    void getTotalWins()
    {
        team.setMatchesWon(7);
        assertEquals(7, team.getTotalWins());
    }
}
