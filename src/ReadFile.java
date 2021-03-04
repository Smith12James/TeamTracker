import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class is designed to read info from csv file to create an application
 * of team stats and store it into a csv file that will be created if one cannot be found
 */

public class ReadFile {

    public static void readFile(String file) throws IOException {

//        File order for
//        "TEAM_NAME","GAME_DATE","MATCHUP","WL","MIN","FGM","FGA","FG_PCT","FG3M","FG3A","FG3_PCT","FTM","FTA","FT_PCT","OREB","DREB","REB","AST","TOV","STL","BLK",
        String delimiter = ",";

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] nextRecord;

            while((line = br.readLine()) != null) {

                nextRecord = line.split(delimiter);

                for(String i: nextRecord) {
                    System.out.print(i + ", ");
                }
                System.out.println();

            }
            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) throws IOException {

        String file = "src/files/jazzStats.csv";

        readFile(file);

    }

}