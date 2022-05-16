import java.util.HashSet;

public class Simple 
{
	 public static void main(String[] args) {
			HashSet <String>hs=new HashSet<>();
			hs.add("Rohit");
			hs.add("Rahul");
			hs.add("Msd");
			hs.add("Virat");
			System.out.println(hs);
			Object x[]=hs.toArray();
			for(int i=x.length-1;i>=0;i--)
			{
				System.out.println(x[i]);
				System.out.println("  ");
			}
		}
}
