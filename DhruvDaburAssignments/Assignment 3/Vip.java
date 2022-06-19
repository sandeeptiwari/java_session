package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vip extends Member implements OrganizeMatch {

	public void watchMatch() {
		System.out.println("Day 1 Matches are:- " + Arrays.toString(Day1));
		System.out.println("Day 2 Matches are:- " + Arrays.toString(Day2));
	}

	public List<String> createMatch(String match) {

		newMatches.add(match);
		System.out.println("The new match " + match + " has been added to the match fixture list");
		System.out.println("The new updated match fixtures are:-"+newMatches);
		return newMatches;
	}
}
