import javax.swing.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        boolean[] airplaneSeats = new boolean[ 10 ];
        int firstClassCounter = 0;
        int economyCounter = 5;
        boolean isFull = true;

        do {
            int option;
            String opt = JOptionPane.showInputDialog( "Please type 1 for First Class.\nPlease type 2 for Economy: " );
            option = Integer.parseInt( opt );

            switch( option )
            {
                case 1:
                    if ( firstClassCounter <= 4 )
                    {
                        airplaneSeats[ firstClassCounter ] = true;
                        JOptionPane.showMessageDialog( null, "First Class: Seat " + (firstClassCounter + 1) + "." ,
                                "Airline Reservation System", JOptionPane.PLAIN_MESSAGE );
                        ++firstClassCounter;
                    }else
                    {
                        JOptionPane.showMessageDialog( null, "First Class is full.",
                                "Airline Reservation System", JOptionPane.PLAIN_MESSAGE);
                        int choice;
                        String input = JOptionPane.showInputDialog( "Would you like Economy.\n1.Yes.\t2.No\t");
                        choice = Integer.parseInt( input );

                        switch ( choice )
                        {
                            case 1:
                                if ( economyCounter <= 9 )
                                {
                                    airplaneSeats[ economyCounter ] = true;
                                    JOptionPane.showMessageDialog( null, "Economy: Seat " + (economyCounter + 1),
                                            "Airplane Reservation System", JOptionPane.PLAIN_MESSAGE);
                                    ++economyCounter;
                                    break;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog( null, "Economy is also Full.",
                                            "Airline Reservation System", JOptionPane.PLAIN_MESSAGE);
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog( null, "Next flight leaves in 3 hours",
                                        "Airline Reservation System", JOptionPane.PLAIN_MESSAGE);
                                isFull = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    if ( economyCounter <= 9 )
                    {
                        airplaneSeats[ economyCounter ] = true;
                        JOptionPane.showMessageDialog( null, "Economy: Seat " + (economyCounter + 1),
                                "Airline Reservation System", JOptionPane.PLAIN_MESSAGE );
                        economyCounter++;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Economy is Full\nNext flight leaves in 3 hours"
                                , "Airline Reservation System", JOptionPane.PLAIN_MESSAGE );
                        isFull = false;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog( null, "Invalid input", "Airline Reservation System", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            JOptionPane.showMessageDialog( null, Arrays.toString( airplaneSeats ), "Airline Reservation System", JOptionPane.PLAIN_MESSAGE);
        }while( isFull );
    }
}