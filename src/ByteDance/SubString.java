package ByteDance;

public class SubString {
    public static void main(String[] args) {
        String s = "abcdddabcdd";

        String subString = null;
        for (int i = 0; i < s.length(); i++) {  //  子字符串起始下标
            for (int j = 1; j < s.length() - i + 1; j++) {  //  子字符串长度
                subString = s.substring(i,j);
                System.out.println(s.compareTo(subString));
                System.out.println(subString);
            }
        }
    }

    static boolean findString(String s){
        return true;
    }

}
