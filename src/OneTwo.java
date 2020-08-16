public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder flipped = new StringBuilder();
        for (int i = 0; i < str.length() -2; i += 3) {
            String temp  = str.substring(i, i+3);
            flipped.append(temp.substring(1)).append(temp.charAt(0));
        }
        return flipped.toString();
    }

}
