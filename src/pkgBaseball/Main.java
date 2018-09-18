package pkgBaseball;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);

		BaseBallPlayerStats Player = new BaseBallPlayerStats();

		System.out.println("Enter player name: \n"); 
		Player.setName(user_input.next()); 

		System.out.println(" Enter at bats: \n"); 
		Player.setH(user_input.nextInt()); 
		System.out.println("Enter Hits: \n"); 
		Player.setAB(user_input.nextInt()); 

		System.out.println(" Enter doubles: \n"); 
		Player.setBtwo(user_input.nextInt()); 

		System.out.println(" Enter triples: \n"); 
		Player.setBthree(user_input.nextInt()); 

		System.out.println("Enter Home Runs: \n"); 
		Player.setHR(user_input.nextInt()); 

		System.out.println(" Enter Runs: \n"); 
		Player.setR(user_input.nextInt()); 

		System.out.println("Please enter Walks: \n"); 
		
		
		System.out.println("%s's Baseball Stats: " + Player.getName());
		System.out.println("Batting Avg. " + Player.BA());
		System.out.println("On base %: " + Player.OBP());
		System.out.println("Slugging% : " + Player.SLG());
		System.out.println("On Base and Slugging percentage: " + Player.OBS());
		System.out.println("Total Bases: " + Player.TB());

}

}
