package practice;
import java.util.*;
public class CollectionExamples {
public static void main(String aa[])
{
	ArrayList a1=new ArrayList();
	a1.add("gandhi");
	a1.add("sagar");
	a1.add("azmeera");
	System.out.println("Array List Elements");
	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	LinkedList b1=new LinkedList();
	b1.add("gandhi");
	b1.add("sagar");
	b1.add("azmeera");
	b1.add("kumar");
	System.out.println("LInked List Elements");
	Iterator it=b1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	HashSet c1=new HashSet();
	c1.add("gandhi");
	c1.add("sagar");
	c1.add("azmeera");
	c1.add("kumar");
	c1.add("hameed");
	c1.add("harsha");
	System.out.println("HashSet List Elements");
	Iterator itrr=c1.iterator();
	while(itrr.hasNext())
	{
		System.out.println(itrr.next());
	}
	HashMap d1=new HashMap();
	d1.put("sagar",67);
	d1.put("bhavsingh",77);
	d1.put("azmeera",87);
	d1.put("gandhi",97);
	Set s=d1.entrySet();
	System.out.println("HashMap Elements");
	Iterator ittr=s.iterator();
	while(ittr.hasNext())
	{
		System.out.println(ittr.next());
	}
}
}
