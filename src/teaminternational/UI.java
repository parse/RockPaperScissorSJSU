package teaminternational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	public Integer getMainMenu() {

		System.out.println("Enter your choice, 1 for Start game, 2 for Show score, 3 for Help");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );
		
	}
	
	public Integer getPlayerChoice() {

		System.out.println("Enter your choice, 1 for Rock, 2 for Paper, 3 for Scissor");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );
		
	}
	
	
	
	public Integer getRoundsInput() {

		System.out.println("Enter number of rounds");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );
		
	}
	
}