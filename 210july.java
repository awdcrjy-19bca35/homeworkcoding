// program to find weight of given string // date: 10 july 2021
import java.util.*;
import java.lang.String;
public class Weight
{
  public static void main (String[]args)
  { 
      Scanner sc=new Scanner(System.in);
      String s = new String ();
      System.out.println ("Enter your string:");
      s = sc.nextLine ();
      int weight = 0,vweight =0;
      String str = s.toUpperCase ();
      char c[] = str.toCharArray ();
      for (int i = 0; i < c.length; i++)
      {
         if((int)c[i]>64 && (int)c[i]<=90)
          { 
            if(c[i]=='A'|| c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U')
                   continue; 
              else 
              {   
                int n = (int) c[i] - 64;
	              weight = weight + n;
              }
          }
      }
      System.out.println("String weight without vowels:"); 
      System.out.println(weight);
      int q=0;
      for (int i = 0; i < c.length; i++)
      { if((int)c[i]>64 && (int)c[i]<=90)
         q = (int) c[i] - 64;
	    vweight += q;
      }
      System.out.println("String weight with vowels included:"); 
      System.out.println(vweight);

  }
}
/*---------------------------------------------------------------------------
output:
Enter your string:

Abcde

String weight without vowels:

9

String weight with vowels included:

15
--------------
output 2:
Enter your string:

gayathri

String weight without vowels:

78

String weight with vowels included:

89
