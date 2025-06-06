import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

class MatchTest
{
    private Team teamA;
    private Team teamB;
    private Player player1;
    private Player player2;
    private Match match;

    @BeforeEach
    void setUp()
    {
        teamA = new Team("Team A");
        teamB = new Team("Team B");
        player1 = new Player("Player 1", 10);
        player2 = new Player("Player 2", 20);
        match = new Match(teamA, teamB);
    }

    @Test
    void getPointsLog()
    {
        match.addPoint(teamA, player1);
        match.addPoint(teamB, player2);
        assertEquals(2, match.getPointsLog().size());
    }

    @Test
    void addPoint()
    {
        match.addPoint(teamA, player1);
        assertEquals(1, match.getPointsLog().size());
        assertEquals(player1, match.getPointsLog().get(0).getPlayer());
    }

    @Test
    void setScore()
    {
        match.setScore(3, 2);
        assertEquals(3, match.getScoreTeamA());
        assertEquals(2, match.getScoreTeamB());
    }

    @Test
    void getWinningTeam()
    {
        match.setScore(3, 2);
        assertEquals(teamA, match.getWinningTeam());
    }

    @Test
    void getLosingTeam()
    {
        match.setScore(3, 2);
        assertEquals(teamB, match.getLosingTeam());
    }

    @Test
    void getScore()
    {
        match.setScore(3, 2);
        assertEquals("3 - 2", match.getScore());
    }

    @Test
    void getPointDifference()
    {
        match.setScore(5, 3);
        assertEquals(2, match.getPointDifference());
    }

    @Test
    void getMatchInfoAsJSON()
    {
        match.setScore(3, 2);
        match.addPoint(teamA, player1);
        match.addPoint(teamB, player2);
        String expectedJSON = "{\"teamA\": \"Team A\", \"teamB\": \"Team B\", \"score\": \"3 - 2\"}";
        assertEquals(expectedJSON, match.getMatchInfoAsJSON());
    }
}
