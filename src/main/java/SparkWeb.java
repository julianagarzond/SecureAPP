import static spark.Spark.*;

public class SparkWeb {
    public static void main(String[] args) {
        port(5000);
        secure("keystores/certificado.p12", "ecistore", null, null);
        get("/hello", (req, res) -> "Hello World");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
