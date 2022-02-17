package collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset_ {
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("usha");
	li.add("jovita");
	li.add("saranya");
	li.add("sree");
	li.add("usha");
	System.out.println(li);
	HashSet<String> hs=new HashSet<String>();
	hs.addAll(li);
	System.out.println(hs);
}
}
/*

Write a program to read a string and to test whether first and last character are same. The
string is said to be be valid if the 1st and last character are the same. Else the string is said to
be invalid.
Include a class UserMainCode with a static method checkCharacters which accepts a string
as input .
The return type of this method is an int. Output should be 1 if the first character and last
character are same . If they are different then return -1 as output.
Create a class Main which would get the input as a string and call the static
method checkCharacterspresent in the UserMainCode.
Input and Output Format:
Input consists of a string.
Output is a string saying characters are same or not .
Refer sample output for formatting specifications.
Sample Input 1:
the picture was great
Sample Output 1:
Valid
Sample Input 1:
this
*/