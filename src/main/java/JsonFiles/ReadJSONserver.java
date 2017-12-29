package JsonFiles;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class ReadJSONserver {
    public String platformName;
    public String platformVersion;
    public String deviceName;
    public Boolean noReset;
    public String automationName;
    public String app;
    public String url;
    JSONParser parser = new JSONParser();

    public void ReadJsonDevice (String DeviceKey) {
        try {
            FileReader File = new FileReader("/Users/macbookair/Documents/floautomation/src/main/java/JsonFiles/json");
            JSONObject obj = (JSONObject) parser.parse(File);
            JSONObject Key = (JSONObject) obj.get(DeviceKey);
            platformName = (String) Key.get("platformName");
            platformVersion = (String) Key.get("platformVersion");
            deviceName = (String) Key.get("deviceName");
            automationName = (String) Key.get("automationName");
            noReset = (Boolean) Key.get("noReset");
            url = (String) Key.get("url");
            app = (String) Key.get("app");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
