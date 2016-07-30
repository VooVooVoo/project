package it.morfoza;


import spark.Spark;

/**
 * Created by Wojt on 2016-07-28.
 */
public class Projectproject {

    public static void main(String[] args) {

        String port = System.getenv("PORT");
        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);

            Spark.staticFileLocation("/webfiles");

            Spark.get("/hello", (request, response) -> {
                return "<html> Hello <b> Buddy </b> <br/>" +
                        "Please got to /project.html" +
                        "</html>";
            });

        }
    }
}