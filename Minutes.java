import java.util.*;
public class minutes {
 public static void main(String[] args) 
     {
	Scanner s = new Scanner(System.in);
	int a;
	a = s.nextInt();
	int year,days;
	int n=60*24*365;
	year=a/n;
	a=a-(year*n);
	int m=60*24;
	days=a/m;
	System.out.print("3456789 minutes is approximately " +year+" years and "+days+" days.");
     }
}

