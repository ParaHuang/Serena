package day25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Amy           Nancy Jo Lucy
//		Jack            Luke   Tony   Amy
//		Jo               Jean     Alex   Jane
//		Tony           AA   BB   CC
		Map<String, List<String>> orgChart = new HashMap<String, List<String>>();
		
		List<String> amyTeam = new ArrayList<String>();
		amyTeam.addAll(List.of("Nancy","Jo","Lucy"));
		orgChart.put("Amy", amyTeam);
		
		List<String> jackTeam = new ArrayList<String>();
		jackTeam.addAll(List.of("Luke","Tony","Amy"));
		orgChart.put("Jack", jackTeam);
		
		List<String> joTeam = new ArrayList<String>();
		joTeam.addAll(List.of("Jean","Alex","Jane"));
		orgChart.put("Jo", joTeam);
		
		List<String> tonyTeam = new ArrayList<String>();
		tonyTeam.addAll(List.of("AA","BB","CC"));
		orgChart.put("Tony", tonyTeam);
		
		List<String> jhonTeam = new ArrayList<String>();
		jhonTeam.addAll(List.of("Jhon"));
		orgChart.put("Jhon", jhonTeam);
		
		System.out.println("the CEO is:"+getCEO(orgChart));
		System.out.println(orgChart);
		System.out.println("fire Alex");
		fire(orgChart, "Alex");
		System.out.println(orgChart);
		System.out.println("Amy");
		fire(orgChart, "Amy");
		System.out.println(orgChart);
	}
	
	public static String getCEO(Map<String, List<String>> orgChart) {	//the manager who has no manager
		//1.find out all managers
		Set<String> managers = orgChart.keySet();	
		
		//2.looking for the manager of manager
		// do this for every manager (for loop)
		for(String manager:managers) {	//check every manager
			boolean isCEO = true;
			// search every team	(for loop)
			for(String m:managers) {	//check every team
				 List<String> team = orgChart.get(m);
//				 System.out.println(team);
				// if this manager exist in one team, then done searching for this manager
				 if(team.contains(manager)) {
					 isCEO = false;
					 break;// start to search every team for next manager
				 }
			}

			//if the loop above, never break in the middle, then which mean that manager has no supervisor
			//he is the boss
			if(isCEO) {
				return manager;
			}
		}
		
		return null; // implement me
	}

	public static void fire(Map<String, List<String>> orgChart, String firedEmployee) {
		//1.see if the firedEmployee is manager
		Set<String> managers = orgChart.keySet();	
		if(managers.contains(firedEmployee)) {
			//fire manager
			//1. find his team
			List<String> team =  orgChart.get(firedEmployee);
			
			//2. remove him
			orgChart.remove(firedEmployee);
			
			//3. find his manager,
			for(String manager : managers) {
				List<String> otherTeam = orgChart.get(manager);
				if(otherTeam.contains(firedEmployee)) {
					//3.remove him from his manager's team
					otherTeam.remove(firedEmployee);
					//4. append his team into his manager's team
					otherTeam.addAll(team);
					return;
				}
			}
		}else {
			//fire a normal employee
			for(String manager:managers) {
				//find the team of this manager
				//value = map.get(key);
				List<String> team =  orgChart.get(manager);
				
				//if firedEmployee belongs to this team
				if(team.contains(firedEmployee)) {
					//then remove him
					team.remove(firedEmployee);
					return;
				}
//				team.remove(firedEmployee);
			}
		}
		
	}
	
}












