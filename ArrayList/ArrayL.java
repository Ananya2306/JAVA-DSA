package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayL {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(2);
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum + list.get(i);
		}
		System.out.print(sum);
		Collections.sort(list);
		System.out.print(list);
	}
}


