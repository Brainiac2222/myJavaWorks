import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String phrase = JOptionPane.showInputDialog( "Enter a phrase or sentence: " );

        JOptionPane.showMessageDialog(null, "UpperCase : " + phrase.toUpperCase() +
                "\nLowerCase: " + phrase.toLowerCase(), "UpperCase LowerCase", JOptionPane.PLAIN_MESSAGE);
    }
}