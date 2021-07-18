package Week2;

public class Day10_6 {
	 public String addBinary(String a, String b) {
	        int aIdx = a.length() - 1;
	        int bIdx = b.length() - 1;

	        int sum = 0;
	        StringBuilder sb = new StringBuilder();

	        while (aIdx >= 0 || bIdx >= 0) {
	            if (aIdx >= 0) sum += a.charAt(aIdx--) - '0';
	            if (bIdx >= 0) sum += b.charAt(bIdx--) - '0';

	            sb.append(sum % 2);
	            sum /= 2;
	        }

	        if (sum == 1) sb.append(sum);
	        return sb.reverse().toString();
	    }
}
