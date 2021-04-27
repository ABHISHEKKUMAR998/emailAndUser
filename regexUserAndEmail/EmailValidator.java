package regexUserAndEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator
{

    private Pattern pattern;
    private Matcher matcher;
    private Matcher matcher4;

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String FIRST_NAME="[A-Z][a-z]*{3,}";
    private static final String Last_NAME="[A-Z][a-z]*{3,}";
    private static final String phoneNumber="^[1-9]{2}[0-9]{7,11}$ ";
    private static final String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public EmailValidator()
    {
        pattern = Pattern.compile(EMAIL_REGEX);
        pattern = Pattern.compile(FIRST_NAME);
        pattern = Pattern.compile(Last_NAME);
        pattern = Pattern.compile(phoneNumber);
        pattern = Pattern.compile(password);
    }

    
    public boolean validate(final String email)
    {
        matcher = pattern.matcher(email);
        return matcher.matches();
        
    }
}
