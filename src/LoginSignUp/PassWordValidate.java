/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSignUp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author lenovo
 */
public class PassWordValidate {
    private Pattern pattern;
    private Matcher matcher;
    private static final String regex =
                      "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
    public PassWordValidate()
    {
        pattern=Pattern.compile(regex);
    }
    public  boolean validate(final String pwd)
    {
        matcher=pattern.matcher(pwd);
        return matcher.matches();
    }
}
