public class ReplaceSpacesWithHyphens {
    public static String replaceSpaces(String text) {
        int i;
        String newtext="";
        for(i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                newtext+='-';
            }else{
                newtext+=text.charAt(i);
            }
        }
        return newtext;
    }
    public static void main(String[] args) {
        System.out.println("\"hello world\" → " + replaceSpaces("hello world"));
        System.out.println("\"a b c\" → " + replaceSpaces("a b c"));
        System.out.println("\"no_spaces_here\" → " + replaceSpaces("no_spaces_here"));
        System.out.println("\"  leading and trailing \" → " + replaceSpaces("  leading and trailing "));
        System.out.println("\"\" → " + replaceSpaces(""));
    }
}

