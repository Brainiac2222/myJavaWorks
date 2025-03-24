import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = new char[ alphabet.length() ];
        int[] occurrences = new int[ alphabet.length() ];

        String sentence = JOptionPane.showInputDialog( "Enter a sentence: " );

        alphabet.getChars(0, alphabet.length(), chars, 0 );
        for ( int i = 0; i < alphabet.length(); i++ )
        {
            int j = 0;
            while ( j != -1 )
            {
                j = sentence.toLowerCase().indexOf( chars[ i ], j );

                if( j != -1 )
                {
                    occurrences[ i ]++;
                    j++;
                }
            }
        }

        for ( int i = 0; i < alphabet.length(); i++ )
        {
            System.out.println( chars[ i ] + ": " + occurrences[ i ] );
        }

    }
}