
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamePlayed = 0;
        int gameWins = 0;
        int gameLosses = 0;
        
        System.out.println("File: ");
        String file = scanner.nextLine();
        
        System.out.println("Team: ");
        String team = scanner.nextLine();
        
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String line = read.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                
                
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                if(homeTeam.equals(team)){
                    gamePlayed++;
                    if(homePoints > awayPoints){
                        gameWins++;
                    } else{
                        gameLosses++;
                    }
                    
                } else if(awayTeam.equals(team)){
                    gamePlayed++;
                    if(awayPoints > homePoints){
                        gameWins++;
                    } else{
                        gameLosses++;
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Games: " + gamePlayed);
        System.out.println("Wins: "+ gameWins);
        System.out.println("Losses: "+ gameLosses);
    }

}
