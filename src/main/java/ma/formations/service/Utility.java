package ma.formations.service;

public class Utility {
    public static String getDatabaseConnection(String url) {
        return "http:///production/" + url;
    }
}
