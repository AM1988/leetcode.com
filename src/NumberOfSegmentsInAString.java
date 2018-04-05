/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * <p>
 * Please note that the string does not contain any non-printable characters.
 * <p>
 * Example:
 * <p>
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {

        int count = 0;
        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == ' ' & s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        if (s.charAt(0) != ' ') {
            return count + 1;
        } else {
            return count;
        }
    }


    public static void main(String[] args) {
        NumberOfSegmentsInAString re = new NumberOfSegmentsInAString();
        System.out.println(re.countSegments("Hello, my name is John"));
        System.out.println(re.countSegments("     "));
        System.out.println(re.countSegments("Of all the gin joints in all the towns in all the world,   "));
    }
}
