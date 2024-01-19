package Defaultpackage;

public class Stringclasswork3 {

    public static void main(String[] args) {
        // Input string
        String s3 = "selenium webdriver is used for webapplication testing";

        // Split the string into an array of words
        String[] words = s3.split(" ");

        // Print all the words
        for (String word : words) {
            System.out.println(word);

            // Check if the specific word "webapplication" is present
            if (word.equals("webapplication")) 
            {
                System.out.println("Found 'webapplication', stopping execution.");
               
                // You can add further actions or break the loop to stop execution here
                break;
            }
        }









	}

}
