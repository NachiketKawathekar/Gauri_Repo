import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx 
{
		public static void main(String[] args) 
		{
			ArrayList<String> ar=new ArrayList<String>();
			ar.add("Gauri");
			ar.add("Nachiket");
			ar.add("Anuradha");
			ar.add("Rutuja");
			ar.add("Shirish");
			
			Iterator<String> it=ar.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
}
