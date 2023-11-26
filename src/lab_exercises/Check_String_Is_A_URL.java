package lab_exercises;

public class Check_String_Is_A_URL {
    public static void main(String[] args) {
        String url = "http://google.net";
        if(isURL(url)){
            System.out.println("This is a URL!");
        }
        else{
            System.out.println("This is not a URL!");
        }
    }

    public static boolean isURL(String yourURL){
        boolean hasHTTP = false;
        boolean hasFinalURL = false;
        if(yourURL.contains("http") || yourURL.contains("https")) hasHTTP = true;
        if(yourURL.contains(".com") || yourURL.contains(".net")) hasFinalURL = true;

        if(hasHTTP && hasFinalURL) return true;
        else return false;
    }
}
