/**
 * 
 */
package gEnerics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lancre
 * @param <T>
 *
 */
public class LeagueTable<T extends Team> {
	private String leagueName;
	private ArrayList<T> teamList = new ArrayList<>();

	public LeagueTable(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public boolean addTeam(T teamLeague) {
		if (teamList.contains(teamLeague)) {
			System.out.println(teamLeague.getName() + " already on this league. ");
			return false;

		} else {
			teamList.add(teamLeague);
			System.out.println(teamLeague.getName() + " has been added to the " + this.getLeagueName());
			return true;
		}

	}

	public ArrayList<T> getTeamList() {
		return teamList;
	}

	public void printTeamOrder() {
		Collections.sort(teamList);
		for (T team : teamList) {
			System.out.println(team.getName() + ": "+ team.ranking());
		}

	}

}
