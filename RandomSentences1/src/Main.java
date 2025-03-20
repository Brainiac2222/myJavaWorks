import javax.swing.*;
import java.util.Random;

public class Main
{
    public static String [] article = { "the","a", "one", "some", "any" };
    public static String [] noun = { "boy", "girl", "dog", "town", "car" };
    public static String [] verb = { "drove", "jumped", "ran", "walked", "skipped" };
    public  static String [] preposition = { "to", "from", "over", "under", "on" };
    public static Random random = new Random();

    public static void main(String[] args)
    {
        for ( int i = 0; i < 20; i++ )
        {
            int aNum = random.nextInt(5);
            JOptionPane.showMessageDialog( null,
                    article[aNum].substring(0, 1).concat( article[aNum].substring(1)) + " " + noun[ random.nextInt(5) ] + " " + verb[random.nextInt(5) ] + " " + preposition[random.nextInt(5) ] + " " + article[random.nextInt(5) ] + " " + noun[ random.nextInt(5) ],
                    "Random Sentence Generation" , JOptionPane.PLAIN_MESSAGE );
        }
    }
}