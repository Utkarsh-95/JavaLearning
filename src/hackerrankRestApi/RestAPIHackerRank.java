package hackerrankRestApi;

import java.io.*;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Result {

    public static void main(String[] args) throws JSONException {
        getTotalGoals("Barcelona", 2011);
    }

    /*
     * Complete the 'getTotalGoals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING team
     *  2. INTEGER year
     */
    public static int getTotalGoals(String team, int year) throws JSONException {

        int scoreSum = 0;
        try {

            int page = 1;
//            while (true) {
                URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + team + "&page=" + page);
                final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                String out = null;
                StringBuilder output = new StringBuilder();
                try {
                    final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                    while ((out = br.readLine()) != null) {
                        System.out.println(out);
                        output.append(out);

                    }

                    JSONObject obj = new JSONObject(output);
                    JSONArray jarr = obj.getJSONArray("data");
                    System.out.println(jarr.length());
                    if (jarr.length() == 0) {
//                        break;
                    } else {

                        for (int i = 0; i < jarr.length(); i++) {
                            JSONObject obji = new JSONObject(jarr.getJSONObject(i));
                            scoreSum += Integer.parseInt(obji.getString("team1goals"));
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e + "Unable to read from URL inputstream");
                }
                page++;

//            }

            page = 1;
//            while (true) {
                URL team2url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + team + "&page=" + page);
                final HttpURLConnection conn1 = (HttpURLConnection) team2url.openConnection();
                conn1.setRequestMethod("GET");

                String out1 = null;
                StringBuilder output1 = new StringBuilder();
                try {
                    final BufferedReader br = new BufferedReader(new InputStreamReader(conn1.getInputStream()));

                    while ((out1 = br.readLine()) != null) {
                        System.out.println(out1);
                        output.append(out1);

                    }

                    JSONObject obj = new JSONObject(output1);
                    JSONArray jarr = obj.getJSONArray("data");
                    System.out.println(jarr.length());
                    if (jarr.length() == 0) {
//                        break;
                    } else {

                        for (int i = 0; i < jarr.length(); i++) {
                            JSONObject obji = new JSONObject(jarr.getJSONObject(i));
                            scoreSum += Integer.parseInt(obji.getString("team2goals"));
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e + "Unable to read from URL inputstream");
                }
                page++;

//            }

            System.out.println(scoreSum);

        } catch (IOException | NumberFormatException e) {

        }
        return scoreSum;

    }

}
