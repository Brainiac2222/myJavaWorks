import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String months = "January February March April May June July August September October November December";
        String[] yearMonths = months.split( " " );

        String date = JOptionPane.showInputDialog( "Enter a date in format(mm/dd/yyyy):" );

        if ( date.matches("\\d[1-9]/[0-3][0-9]/[1-2]\\d{3}") )
        {
            JOptionPane.showMessageDialog( null, yearMonths[ Integer.parseInt( date.substring(0,2)) - 1 ]
                   + " " + date.substring(3, 5) + ", " + date.substring(6, 10), "New Date Format", JOptionPane.PLAIN_MESSAGE );
        }
        else
        {
            JOptionPane.showMessageDialog( null, "Invalid Input", "Error!!", JOptionPane.ERROR_MESSAGE );
        }
    }
}