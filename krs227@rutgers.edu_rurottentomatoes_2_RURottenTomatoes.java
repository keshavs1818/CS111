public static void main(String[] args) {
        int numReviewers = Integer.parseInt(args[0]);
        int numMovies = Integer.parseInt(args[1]);
        int[] arraySums = new int[numMovies];
        int[][] movieRatings = new int[numReviewers][numMovies];
        for(int i = 2; i < args.length; i++) {
            for(int j = 0; j < numReviewers; j++) {
                for(int k = 0; k < numMovies; k++) {
                    movieRatings[j][k] = Integer.parseInt(args[i]);
                }
            }
        }
        for(int i = 0; i < arraySums.length; i++) {
            int sum = 0;
            for(int j = 0; j < numReviewers; j++) {
                sum += movieRatings[j][i];
            }
            arraySums[i] = sum;
        }
        for(int i = 0; i < arraySums.length - 1; i++) {
            if(arraySums[i] > arraySums[i + 1]) {
                System.out.println(i);
            } else if(arraySums[i] == arraySums[i + 1]) {
                System.out.println(0);
            }
        }
    }