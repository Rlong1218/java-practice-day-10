// Return a version of the given string, where for every star (*) in the string
// the star and the chars immediately to its left and right are gone.
// So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

public class StarChar {
    public String starOut(String str) {
        StringBuilder removed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() -1 && str.charAt(i+1) == '*') {
                continue;
            }
            if (str.charAt(i) == '*') {
                i++;
            }
            else removed.append(str.charAt(i));
        }
        return removed.toString();
    }
}
