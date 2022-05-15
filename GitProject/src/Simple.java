import java.util.Collections;
import java.util.TreeSet;

public class Simple {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("Virat");
		ts.add("msd");
		ts.add("Rahul");
		ts.add("Rohit");
		System.out.println(ts);
	}
}
