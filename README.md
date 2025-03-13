method indexOf is used to locate the first occurrence of a character in a String. 
If the method find the character, it returns the characters index in the String literal, Otherwise return -1.

method lastIndexOf locate the last occurrence of a character in a String.
The method searches from the end of the String towards the beginning.If it finds the character,
it returns the character index in the String, otherwise, return -1.

method substring enable a new String object to be created by copying part of an existing String object.

method concat concatenate two String objects and return new String object containing the characters from
both original Strings.

method replace returns a new String object in which every occurrence in a string literal( eg. s1) of character('l') is replaced with character ('L').
It leaves the original String unchanged.If there are no occurrences of the first argument in the String, the method returns the original String.

method toUpperCse is used to generate a new String with uppercase letters where corresponding lowercase letters exist in s1.
The method returns a new String object containing the converted String and leaves the original unchanged.

method toLowerCase returns a new a String object with lower case letters where corresponding letters exist.

method trim() is used to generate a new String object that removes all white space characters that appear at the beginning and/or at the end of a String on which trim operates.

method toCharArray to create a new character array containing a copy of characters in a String literal.

method valueOf is static method that takes an argument of any type and convert it to a String object.
By default, Java treats integer literals as type int and floating point literals as double.

String objects are immutable, their character content cannot be changed after they're created because Class String does not provide methods that
allow the contents of a String object to be modified.

Class String Builder should be used if the character content would change.
String Builder is not thread safe, use Class String Buffer which is thread safe
