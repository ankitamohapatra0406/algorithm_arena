import java.util.*;

public class DAY2_helpfulmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1') c1++;
            else if (ch == '2') c2++;
            else if (ch == '3') c3++;
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < c1; i++) res.append("1+");
        for (int i = 0; i < c2; i++) res.append("2+");
        for (int i = 0; i < c3; i++) res.append("3+");
        
        res.deleteCharAt(res.length() - 1);

        System.out.println(res);
    }
}
