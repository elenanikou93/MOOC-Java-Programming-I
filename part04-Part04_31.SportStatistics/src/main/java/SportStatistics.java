
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<MatchInfo> games = new ArrayList<>();

        try (Scanner data = new Scanner(Paths.get(file))) {
            while (data.hasNextLine()) {
                String line = data.nextLine();
                String[] game = line.split(",");
                String hTeam = game[0];
                String vTeam = game[1];
                int hTeamPoints = Integer.valueOf(game[2]);
                int vTeamPoints = Integer.valueOf(game[3]);

                games.add(new MatchInfo(hTeam, vTeam, hTeamPoints, vTeamPoints));

            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        for (MatchInfo game: games) {
            if (game.getHomeTeam().equals(team) || game.getVisitingTeam().equals(team)) {
                gamesPlayed++;
            }

            
        }

        for (MatchInfo game: games) {
            if (game.getHomeTeam().equals(team)) {
                if (game.getHomeTeamPoints(team) > game.getVisitingTeamPoints(game.getVisitingTeam())) {
                    wins++;
                } else {
                    losses++;
                }
            } else if (game.getVisitingTeam().equals(team)) {
                if (game.getHomeTeamPoints(game.getHomeTeam()) > game.getVisitingTeamPoints(team)) {
                    losses++;
                } else {
                    wins++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
