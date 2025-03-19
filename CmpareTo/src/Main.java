import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String string1 = JOptionPane.showInputDialog( "Enter first string literal: " );

        String string2 = JOptionPane.showInputDialog( "Enter second string literal: " );

        if ( string1.compareTo( string2 ) == 0 )
        {
            JOptionPane.showMessageDialog( null, string1 + " is equal to " + string2 ,
                    "Comparing strings using Method compareTo" , JOptionPane.PLAIN_MESSAGE );
        } else if ( string1.compareTo( string2 ) > 0 )
        {
            JOptionPane.showMessageDialog( null, string1 + " is greater than " + string2,
                    "Comparing strings using Method compareTo", JOptionPane.PLAIN_MESSAGE );
        } else if ( string1.compareTo( string2 ) < 0 )
        {
            JOptionPane.showMessageDialog( null , string1 + " is less than " + string2,
                    "Comparing strings using Method compareTo", JOptionPane.PLAIN_MESSAGE );
        }
    }
}