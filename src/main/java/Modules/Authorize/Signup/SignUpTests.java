package Modules.Authorize.Signup;
import Modules.Authorize.ValidSignupTests;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import Support.SetupSever;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTests extends SetupSever{
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    @BeforeMethod
    public void setUp() throws IOException {
        super.SetUp();
    }

    @Test
    public void signUpUsernameHasSpaces() {
        RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);
        InputSignUpTests tests = new InputSignUpTests(this, reporter);
        tests.execute();
    }

    @Test
    public void signup() {
        RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);
        ValidSignupTests tests = new ValidSignupTests(this, reporter);
        tests.execute();
    }
}
