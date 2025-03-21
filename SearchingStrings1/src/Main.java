import javax.swing.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String phrase = JOptionPane.showInputDialog( "Enter a sentence or phrase: " );
        String search = JOptionPane.showInputDialog( "Enter a search character: " );

        char searchCharacter = search.charAt( 0 );
            int i = 0;
            int counter = 0;

            while ( i != -1 )
            {
                i = phrase.indexOf( searchCharacter, i );

                if ( i != -1 )
                {
                    counter++;
                    i++;
                }
            }

            if (counter == 0 )
            {
                JOptionPane.showMessageDialog( null, "Zero occurrence of " + searchCharacter,
                        "Search character in a String phrase", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog( null, counter + " occurrence of " + searchCharacter,
                        "Search character in a String phrase", JOptionPane.PLAIN_MESSAGE );

            }
    }
}