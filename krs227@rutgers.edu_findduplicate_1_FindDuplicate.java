public class FindDuplicate {
    public static void main(String[] args) {
        int n = args.length;
        int[] intArr = new int[n];
        boolean isDuplicate = false;
        for(int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < intArr.length - 1; i++) {
            for(int j = i + 1; j < intArr.length; j++) {
                if(intArr[j] == intArr[i]) {
                    isDuplicate = true;
                }
            }
        }
        System.out.println(isDuplicate);
    }
}