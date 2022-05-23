//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        String image = "!"; 
        boolean isLink = true;
        String current;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            if (openBracket == -1){ 
                break;
            }
            int closeBracket = markdown.indexOf("]", openBracket);
            if (closeBracket == openBracket + 1){
                isLink = false;
            }
            int openParen = markdown.indexOf("(", closeBracket);
            if (openParen != closeBracket + 1 || openParen == -1){//check link format
                isLink = false;
            }
            int closeParen = markdown.indexOf(")", openParen);
            if (openBracket - 1 != -1 && markdown.substring(openBracket - 1, openBracket).equals(image)){//check image
                isLink = false;
            }
            if(isLink){
                current = markdown.substring(openParen + 1, closeParen);
                if (current.indexOf(" ") == -1){// checking if link is with spaces
                    toReturn.add(markdown.substring(openParen + 1, closeParen));
                }
                currentIndex = closeParen + 1;
            }
            else{
                currentIndex++;
            }
            isLink = true;           
        }    
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
