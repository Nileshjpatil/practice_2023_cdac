package info.java;

import java.util.Arrays;
import java.util.Map;
import java.util.Collection;

public class Teams {
	private int teamId;
	private String teamName;
	private String[] players= new String[11];
	
	private String [] teams=new String[5];
	
	Map<Integer,String> allTeams= new HashMap<Integer,String>();

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public String[] getTeams() {
		return teams;
	}

	public void setTeams(String[] teams) {
		this.teams = teams;
	}

	public Teams(int teamId, String teamName, String[] players, String[] teams) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
		this.teams = teams;
	}

	public Teams() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teams [teamId=" + teamId + ", teamName=" + teamName + ", players=" + Arrays.toString(players)
				+ ", teams=" + Arrays.toString(teams) + "]";
	}
	

}
