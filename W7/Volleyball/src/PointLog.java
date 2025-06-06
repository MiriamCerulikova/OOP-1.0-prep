import java.time.LocalDateTime;

class PointLog
{
    private Player player;
    private Team team;
    private LocalDateTime timestamp;

    public PointLog(Player player, Team team, LocalDateTime timestamp)
    {
        this.player = player;
        this.team = team;
        this.timestamp = timestamp;
    }

    public Player getPlayer()
    {
        return this.player;
    }
    public void setPlayer(Player player)
    {
        this.player = player;
    }
    public Team getTeam()
    {
        return this.team;
    }
    public void setTeam(Team team)
    {
        this.team = team;
    }
    public LocalDateTime getTimestamp()
    {
        return this.timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp)
    {
        this.timestamp = timestamp;
    }
}
