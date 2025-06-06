import java.util.ArrayList;
import java.util.List;

class Tournament
{
    private List<Team> teams;
    private List<Match> matches;

    public Tournament()
    {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public List<Team> getTeams()
    {
        return this.teams;
    }
    public List<Match> getMatches()
    {
        return this.matches;
    }

    public void addTeam(Team team)
    {
        teams.add(team);
    }

    public void addMatch(Match match)
    {
        matches.add(match);
    }

    public Team getTournamentWinner()
    {
        Team winner = null;
        int maxWins = 0;
        for (Team team : teams)
        {
            if (team.getTotalWins() > maxWins)
            {
                maxWins = team.getTotalWins();
                winner = team;
            }
        }
        return winner;
    }
}
