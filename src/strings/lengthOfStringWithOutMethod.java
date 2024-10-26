package strings;

public class lengthOfStringWithOutMethod {
    public static void main(String args[]) {
        String str = "Know Program";
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        System.out.println(str.length());
    }
}
