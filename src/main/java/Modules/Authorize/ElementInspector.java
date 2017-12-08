package Modules.Authorize;

import io.appium.java_client.MobileElement;

public interface ElementInspector {
    MobileElement findElementByName(String name) throws Exception;
}
