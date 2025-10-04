//
//7. Sort a List of Strings: Given a list of strings,
//sort it in alphabetical order using a lambda expression.
package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface sort
{
	List<String> list(); 
}
public class Lambda_Q7 {
public static void main(String[] args) {
	sort ob=()->
	{
		List<String> name =Arrays.asList("nick", "divesh","ketan","nikita");
		Collections.sort(name);
		return name;
	};
	List<String> result =ob.list();
	System.out.println(result);
}
}
