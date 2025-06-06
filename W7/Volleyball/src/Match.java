import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Match
{
    private Team teamA;
    private Team teamB;
    private int scoreTeamA;
    private int scoreTeamB;
    private List<PointLog> pointsLog;

    public Match(Team teamA, Team teamB)
    {
        this.teamA = teamA;
        this.teamB = teamB;
        this.pointsLog = new ArrayList<>();
    }

    public Team getTeamA()
    {
        return this.teamA;
    }
    public void setTeamA(Team teamA)
    {
        this.teamA = teamA;
    }
    public Team getTeamB()
    {
        return this.teamB;
    }
    public void setTeamB(Team teamB)
    {
        this.teamB = teamB;
    }
    public int getScoreTeamA()
    {
        return this.scoreTeamA;
    }
    public int getScoreTeamB()
    {
        return this.scoreTeamB;
    }
    public List<PointLog> getPointsLog()
    {
        return this.pointsLog;
    }

    public void addPoint(Team team, Player player)
    {
        pointsLog.add(new PointLog(player, team, LocalDateTime.now()));
    }

    public void setScore(int scoreA, int scoreB)
    {
        this.scoreTeamA = scoreA;
        this.scoreTeamB = scoreB;
    }

    public Team getWinningTeam()
    {
        return scoreTeamA > scoreTeamB ? teamA : teamB;
    }

    public Team getLosingTeam()
    {
        return scoreTeamA < scoreTeamB ? teamA : teamB;
    }

    public String getScore()
    {
        return scoreTeamA + " - " + scoreTeamB;
    }

    public int getPointDifference()
    {
        return Math.abs(scoreTeamA - scoreTeamB);
    }

    public String getMatchInfoAsJSON()
    {
        return "{\"teamA\": \"" + teamA.getName() + "\", \"teamB\": \"" + teamB.getName() + "\", \"score\": \"" + getScore() + "\"}";
    }
}
