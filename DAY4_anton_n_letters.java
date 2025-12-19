import java.util.*;
public class DAY4_anton_n_letters {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // ✅ read full line

        Set<Character> letters = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        System.out.println(letters.size());
	}
}
