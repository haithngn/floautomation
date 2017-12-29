package Test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Sample  {
    public void JSON(String key)
    {
        JSONParser parser = new JSONParser();
        try {
            String current = new java.io.File( "." ).getCanonicalPath();
            System.out.println("Current dir:" + current);

            FileReader fileReader = new FileReader("./src/main/java/Test/json");

            JSONObject json = (JSONObject) parser.parse(fileReader);
            JSONObject capa = (JSONObject) json.get(key);

            String platformName = (String) capa.get("platformName");
            String platformVersion = (String) capa.get("platformVersion");
            String deviceName = (String) capa.get("deviceName");
            String automationName = (String) capa.get("automationName");
            String orientation = (String) capa.get("orientation");
            String app = (String) capa.get("app");
            Boolean noReset = (Boolean) capa.get("noReset");
            String url = (String) capa.get("url");

            System.out.println("platformName: " + platformName);
            System.out.println("platformVersion: " + platformVersion);
            System.out.println("DeviceName: " + deviceName);
            System.out.println("automationName: " + automationName);
            System.out.println("orientation: " + orientation);
            System.out.println("noReset: " + noReset);
            System.out.println("URL: " + url);
            System.out.println("app: " + app);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sample abc = new Sample();
        abc.JSON("iPadAir");
    }
}
