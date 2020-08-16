// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
// Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

public class ZipZap {
    public String zipZap(String str) {
        StringBuilder zapped = new StringBuilder();
        if (str.length() >= 3) {
            for (int i = 0; i < str.length(); i++  ) {
                if (!(str.charAt(i) == 'z' && str.charAt(i+2) == 'p')) {
                    zapped.append(str.charAt(i));
                }
                else {
                    zapped.append("zp");
                    i+= 2;
                }
            }
            return zapped.toString();
        }
        else return str;
    }
}
