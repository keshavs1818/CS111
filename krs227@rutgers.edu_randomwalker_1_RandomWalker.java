public class RandomWalker {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double randomValue = 0;
        System.out.println("(" + x + "," + y + ")");

        for(int i = 1; i < n; i++) {
            
            randomValue = Math.random();

           if( randomValue < 0.25 ) {
               x += 1;
           } else if( randomValue < 0.50 ) {
               x -= 1;
           } else if( randomValue < 0.75) {
               y += 1;
           } else {
               y -= 1;
           }

           System.out.println("(" + x + "," + y + ")");
        
        }

        double squareDist = Math.pow(x, 2) + Math.pow(y, 2); 
        System.out.println("Squared distance = " + squareDist);
    }
}