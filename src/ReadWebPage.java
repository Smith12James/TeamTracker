import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.Scanner;

    /**
    * This class is designed to read info from NBA.com specifically from the Utah Jazz stats page
    * and store it into a csv file that will be created if one cannot be found
    */

public class ReadWebPage {

    public static void readPage (String webSite) throws IOException {

        URL url = new URL(webSite);

        Scanner sc = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();

        while(sc.hasNext()) {

            sb.append(sc.next());
            System.out.println(sc.next());

        }

        String result = sb.toString();
//        System.out.println(result);

        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents" + result);

    }

    public static void main(String args[]) throws IOException {

        String teamStats = "https://www.nba.com/stats/teams/boxscores-traditional/?Season=2020-21&SeasonType=Regular%20Season&OpponentTeamID=1610612762";

        readPage(teamStats);

    }

}
