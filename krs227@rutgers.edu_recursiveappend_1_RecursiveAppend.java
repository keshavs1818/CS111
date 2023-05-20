public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        String appString = "";
        if(n == 0) {
            appString = original;
        } else {
            appString = original + appendNTimes(original, n - 1);
        }
    return appString;
    }

    public static void main (String[] args) {
        StdOut.println(appendNTimes("hello", 3));
        StdOut.println(appendNTimes("dog", 4));
        StdOut.println(appendNTimes("walnut", 5));
        StdOut.println(appendNTimes("CS111", 0));
        StdOut.println(appendNTimes("cat", 1));
    }
}