package PruebasUnit;

public class PasswordUtil {


    public enum SecurityLevel {

        WEAK, MEDIUM, STRONG
    }



    public static SecurityLevel assessPassword(String Password){


        if(Password.length() < 8){
            return SecurityLevel.WEAK;
        }

        if (Password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }

        if (Password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }



}
