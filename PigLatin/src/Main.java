import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String literal = JOptionPane.showInputDialog( "Enter a sentence:" );

        String[] tokens = literal.split( " " );

        for ( String token : tokens )
        {
            printLatinWord( token );
        }

    }

    public static void printLatinWord( String token )
    {
        System.out.println(token.substring(1).concat(token.substring(0 ,1) ).concat( "ay" ) );
    }
}