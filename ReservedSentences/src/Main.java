import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String sentences = JOptionPane.showInputDialog( "Enter a sentence: " );

        String[] tokens = sentences.split( " " );

        for ( int i = tokens.length - 1; i >=0; i-- )
        {
            System.out.print( tokens[ i ] + " " );
        }

        System.out.println();
    }
}