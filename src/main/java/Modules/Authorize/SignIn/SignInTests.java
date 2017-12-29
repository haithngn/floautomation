package Modules.Authorize.SignIn;

import Modules.Authorize.ValidSignupTests;
import Modules.Environments.TabletCapabilities;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Support.*;

import java.io.IOException;

public class SignInTests extends SetupSever {
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

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
        ValidSignInTests tests = new ValidSignInTests(this, reporter);
        tests.execute();
    }

    @AfterMethod
    public void cleanUp(){

    }
}
