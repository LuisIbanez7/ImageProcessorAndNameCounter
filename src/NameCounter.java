import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NameCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		readNames(nameMap);
		printMap(nameMap);
	}

	private static void readNames(Map<String, Integer> map) {
		while (true) {
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String name = "";
			name = sn.nextLine();
			if (name.equals(""))
				break;
			Integer count = map.get(name);
			if (count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			map.put(name, count);
		}
	}

	private static void printMap(Map<String, Integer> map) {
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int count = map.get(key);
			System.out.println("Entry [" + key + "] has count " + count);
		}
	}
}
