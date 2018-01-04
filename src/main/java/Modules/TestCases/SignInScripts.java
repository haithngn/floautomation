package Modules.TestCases;

import Modules.Authorize.SignIn.ValidSignInTests;
import Modules.Environments.TabletCapabilities;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import Support.SetupSever;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Modules.Keywords.*;

import java.io.IOException;

public class SignInScripts extends SetupSever {
    public static String username = "sender30";
    public static String password = "111111";

    @BeforeMethod
    public void setUp() throws IOException {
        TabletCapabilities capabilities = new TabletCapabilities("iOS", "11.2",
                "iPad Air", false, "XCUITest", false,
                "Portrait");
        super.SetUp(capabilities);
    }

    @Test
    public void signin() {
        RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);
        LoginKeywords tests = new LoginKeywords(this, reporter);
        tests.login(username, password);
    }

    @AfterMethod
    public void cleanUp(){

    }
}
