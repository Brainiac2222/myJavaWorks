import javax.swing.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String telephoneNumber = JOptionPane.showInputDialog( "Enter telephone number: " );

        if ( !validateTelephoneNumber( telephoneNumber ) )
        {
            JOptionPane.showMessageDialog( null, "Invalid telephone number"
                    , "Invalid telephone number", JOptionPane.ERROR_MESSAGE);
        }
        String[] tokens = telephoneNumber.replaceAll( "[() ]",
                "").split( "-" );

        String areaCode = tokens[0].substring( 0, 3 );
        String firstThree = tokens[0].substring(3 );

        System.out.println( Arrays.toString(tokens));
        JOptionPane.showMessageDialog( null,"Area code: " + areaCode +".\nTelephone Number: " + firstThree.concat(tokens[1] ) + ".",
                "Tokenizing Telephone Number", JOptionPane.PLAIN_MESSAGE);
    }

    public static boolean validateTelephoneNumber( String telephoneNumber )
    {
        return telephoneNumber.matches("[(]\\d{3}[)]\\s\\d{3}-\\d{4}");
    }
}