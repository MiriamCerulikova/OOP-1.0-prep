import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TournamentTest
{
    private Tournament tournament;
    private Team teamA;
    private Team teamB;
    private Match match;

    @BeforeEach
    void setUp()
    {
        tournament = new Tournament();
        teamA = new Team("Team A");
        teamB = new Team("Team B");
        match = new Match(teamA, teamB);
    }

    @Test
    void addTeam()
    {
        tournament.addTeam(teamA);
        tournament.addTeam(teamB);
        assertEquals(2, tournament.getTeams().size());
        assertTrue(tournament.getTeams().contains(teamA));
        assertTrue(tournament.getTeams().contains(teamB));
    }

    @Test
    void addMatch()
    {
        tournament.addMatch(match);
        assertEquals(1, tournament.getMatches().size());
        assertTrue(tournament.getMatches().contains(match));
    }

    @Test
    void getTournamentWinner()
    {
        teamA.setMatchesWon(3);
        teamB.setMatchesWon(5);
        tournament.addTeam(teamA);
        tournament.addTeam(teamB);

        // Test the winner based on the matches won
        assertEquals(teamB, tournament.getTournamentWinner());

        // Adjust wins for teamA and recheck
        teamA.setMatchesWon(6);
        assertEquals(teamA, tournament.getTournamentWinner());
    }
}
