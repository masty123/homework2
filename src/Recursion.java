import java.util.*;
/**
 * This is a recursion homework for Object Oriented Programming.
 * @author Theeruth Borisuth
 *
 */
public class Recursion {
	/**
	* Remove duplicate consecutive items from a list, changing the list parameter.
	* For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	* will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	* Objects are compared using their own equals method.
	* @param list of any kind of object. The elements are not null.
	* @return reference to the list parameter with consecutive duplicates removed.
	*/
	public static List unique(List list){
		if(list.size() == 1) return list;
		List temp = list.subList(1, list.size());
		if(list.get(0).equals(list.get(1))){
			temp.remove(0);
			unique(list);
		}
		else unique(temp);		
		return list;
	}
	
	/**
	 * Print the list 
	 * @param list
	 */
	public static void printList(List list){
		boolean isFirst = true;
		for (Object result : list) {
			if(isFirst){
				System.out.print(result);
				isFirst = false;
			}else {
				System.out.print(", "+result);
			}
		}
	}
	
	/**
	 * Tail fibonacci : perform calculation first then execute the recursive call
	 * @param num : number of fibonacci.
	 * @param next : next index of fibonacci.
	 * @param start : start index of fibonacci.
	 * @return result of the fibonacci
	 */
	public static int fibonacci(int num, int next, int start){
		if(num == 0) return start;
		if(num == 1) return next;
		return fibonacci(num - 1, start+next, next);

	}
	
	/**
	 * Run the program.
	 * @param args
	 */
	public static void main(String[] args) {
		//new list
		List<String> list = new ArrayList<String>();
		//adding list
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		//print original list
		printList(list);
		//enter new line
		System.out.println();
		//print the non duplicate list
		printList(unique(list));
		
		System.out.println();
		//print tail fibonacci.
		System.out.println(fibonacci(10, 1, 0));
		
	}
}
