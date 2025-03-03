public class Main
{
    public static void main(String[] args)
    {
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf( "'c' is located at index %d\n", letters.indexOf( 'c' ) );
        System.out.printf( "'a' is located at index %d\n", letters.indexOf( 'a', 1 ) );
        System.out.printf( "'$' is located at index %d\n\n", letters.indexOf( '$' ) );

        System.out.printf( "Last 'c' is located at index %d\n", letters.lastIndexOf( 'c' ) );
        System.out.printf( "Last 'a' is located at index %d\n", letters.lastIndexOf( 'a', 25 ) );
        System.out.printf( "Last '$' is located at index %d\n\n", letters.lastIndexOf( '$' ) );

        System.out.printf( "\"def\" is located at index %d\n", letters.indexOf( "def" ) );
        System.out.printf( "\"def\" is located at index %d\n", letters.indexOf( "def"));
        System.out.printf( "\"hello\" is located at index %d\n\n", letters.indexOf( "hello" ) );

        System.out.printf( "Last \"def\" is located at index %d\n", letters.lastIndexOf( "def" ));
        System.out.printf( "Last \"def\" is located at index %d\n", letters.lastIndexOf( "def", 25));
        System.out.printf( "Last \"hello\" is located at index %d\n\n", letters.lastIndexOf( "hello" ));

        System.out.printf( "Substring from index 20 to end is \"%s\"\n", letters.substring( 20 ) );
        System.out.printf( "%s \"%s\"\n\n", "Substring from index 3 up to, but not including 6 is", letters.substring( 3, 6));

        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf( "s1 = %s\ns2 = %s\n\n", s1, s2 );
        System.out.printf( "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
        System.out.printf( "s1 after concatenation = %s\n", s1 );
        System.out.printf( "s2 after concatenation = %s\n\n", s2 );
        
    }
}