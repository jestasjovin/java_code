public class Looping {

    public static  void runcode(int[] arr) {
        int left = 0;                
        int right = arr.length - 1;  
      
       //just interested in all values
        for(int value:arr){
            if(value%2!=0){
                System.out.println(value); 
            }
        }

        //i want indexes for some reasons
        for(int  i = 0; i < arr.length; i++){
            System.out.println(i); 
        }

        //more control on the loop..... can run as long as a condition is met...not by indexing
        while(left <= right){
            System.out.println(left); 
            System.out.println("iteration: " + left + ", " + right);  
            left++;
            right--;
        }



        int[][] twod= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i < twod.length; i ++){
            for(int j=0; j< twod[i].length; j++){
            System.out.print(twod[i][j] + " ");
            }
            System.out.println(" ");  
        }

        // int[][] matrix = new int[3][3];

    }

    public static void main(String[] args) {
        // else if (){}
        // The break statement can also be used to jump out of a loop.
        // continue statement breaks one iteration


        // int[] numbers = {1, 2, 3, 4, 5};
        // int[] numbers = new int[5];
        // String[] fruits = new String[3]; 
        // String[] fruits = new String[]{"Apple", "Banana", "Orange"};



        int[] arr = {1, 2, 3, 4, 6, 8, 9, 10};
        runcode(arr);
    }
}
