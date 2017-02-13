product of numbers example in array


import java.util.*;
public class example4 {
    public static void main(String aa[])
    {
        int a[]={1,2,3,4,5};
        int prod=1;
        for(int k:a)
        {
           prod*=k; 
        }
        System.out.println("the total product of numbers is  "+prod);
    }
}



palindrone number example


import java.util.*;
public class example3 {

    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter your String please");
        StringBuffer sb=new StringBuffer(s.next());
       StringBuffer sb1=new StringBuffer();
       sb1=sb.reverse();
       
        if(sb.equals(sb1))
            System.out.println("Entered string is palindrone");
        else
            System.out.println("Entered string is not palindrone");
        
    }
}
