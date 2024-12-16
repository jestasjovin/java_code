public class LoopingStrings {

    public static  void runcode(String str) {
        int left = 0;                
        // int right = str.toCharArray().length - 1;  

       
        while(left < str.length()){
            char c = str.charAt(left);
            System.out.println(c);
            left++;
        }


        for(char value: str.toCharArray()){
                System.out.print(value+" "); 
        }

         // Converts the string into an IntStream
         // (representing the Unicode values of characters)    
         // Convert each int back to char and print it
        str.chars().forEach(ch -> System.out.print((char) ch + " "));




        for(int  i = 0; i < str.length(); i++){
            char ch = str.charAt(i);  
            System.out.print(ch + " "); 
           }



        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);  
            System.out.print(ch + " "); 
        }


        // Iterator<Character> iterator = charList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");  // Print each character
        // }     




    }

    public static void main(String[] args) {
        runcode("fruits");
    }
}
