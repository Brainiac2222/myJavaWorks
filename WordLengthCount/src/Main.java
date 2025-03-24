import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String sentence  = JOptionPane.showInputDialog( "Enter a line of text: " );
        String[] tokens = sentence.split( " " );
        int[] wordLength = new int[ 15 ];

        for (String token : tokens) {
            for (int j = 0; j < wordLength.length; j++) {
                if ((token.length() - 1) == j) {
                    wordLength[j]++;
                }
            }
        }

        System.out.printf( "%s\t%s\n", "Word length", "Occurrences" );
        for ( int i = 0; i < wordLength.length; i++ )
        {
            System.out.printf( "%4d%13d\n", i + 1, wordLength[ i ] );
        }
    }
}