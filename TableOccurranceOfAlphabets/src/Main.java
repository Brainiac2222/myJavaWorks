import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] character = new char[ alphabet.length() ];
        int[] numberOfOccurrences = new int[ character.length ];
        alphabet.getChars(0,alphabet.length() ,character, 0 );

        String sentence = JOptionPane.showInputDialog( "Enter a line of text: " );

        if ( sentence != null )
        {
            String formattedSentence = sentence.toLowerCase().replace( " ", "").replace(",", "").replace(":"," ").replace( ".", "" );

            for ( int i = 0; i < character.length; i++ )
            {
                for ( int j = 0; j < formattedSentence.length(); j++ )
                {
                    if ( character[ i ] == formattedSentence.charAt(j) )
                    {
                        numberOfOccurrences[ i ]++;
                    }
                }
            }

            System.out.printf( "%s\t%s\n", "Table", "Number of Occurrences" );

            for ( int i = 0; i < character.length; i++ )
            {
                System.out.printf( "%s\t%12s\n", character[ i ], numberOfOccurrences[ i ] );
            }
        }
        else
        {
            JOptionPane.showMessageDialog( null, "Please enter an input", "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }

    }
}