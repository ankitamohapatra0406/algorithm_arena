import java.util.*;
public class DAY4_boy_or_girl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		 System.out.println(
		            s.chars().distinct().count() % 2 == 0
		            ? "CHAT WITH HER!"
		            : "IGNORE HIM!"
		        );
	}

}
