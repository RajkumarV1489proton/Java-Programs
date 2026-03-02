package programs;

public class ReverseOfEachString {

    public static void main(String[] args) {

        String str = "Welcome to java class";
        String[] words = str.split(" ");

        String rev = "";

        for (String word : words) {
            rev = word + " " + rev;
        }

        System.out.println(rev);
    }
}