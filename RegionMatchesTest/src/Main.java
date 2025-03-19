import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String string1 = JOptionPane.showInputDialog( "Enter first string literal: " );

        String string2 = JOptionPane.showInputDialog( "Enter second string literal: " );

        String startingIndex = JOptionPane.showInputDialog( "Enter integer starting index: " );

        String numberOfCharacters = JOptionPane.showInputDialog( "Enter number of characters to be compared: " );

        int index = Integer.parseInt( startingIndex );

        int character = Integer.parseInt( numberOfCharacters );

        if ( index == 0 )
        {
            if ( string1.regionMatches( true, index, string2, index, character ) )
            {
                JOptionPane.showMessageDialog( null,
                        "First " + character + " characters of first string and second string match with case ignored",
                        "Comparing Strings using Method regionMatches", JOptionPane.PLAIN_MESSAGE );
            }
            else
            {
                JOptionPane.showMessageDialog( null,
                        "First " + character + " characters of first string and second string do not match with case ignored",
                        "Comparing Strings using Method regionMatches", JOptionPane.PLAIN_MESSAGE );
            }
        }
        else
        {
            if ( string1.regionMatches( true, index, string2, index, character ) )
            {
                JOptionPane.showMessageDialog( null,
                        character + " characters of first string and second string match with case ignored",
                        "Comparing Strings using Method regionMatches", JOptionPane.PLAIN_MESSAGE );
            }
            else
            {
                JOptionPane.showMessageDialog( null,
                        character + " characters of first string and second string do not match with case ignored",
                        "Comparing Strings using Method regionMatches", JOptionPane.PLAIN_MESSAGE );
            }
        }
    }
}