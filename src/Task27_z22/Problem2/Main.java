package Task27_z22.Problem2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void printError(){

    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\Java Tasks\\src\\Task27_z22\\Problem2\\BracketDataFile.txt"))){
            String line;
            BracketStack stack = new BracketStack();
            int lineIndex=0;
            char tmp;
            while ((line = br.readLine()) != null) {
                lineIndex++;
                for (int i = 0; i < line.length(); i++) {
                    char t = line.charAt(i);
                    if(t=='('||t=='{'||t=='['){
                        stack.push(t);
                    }else if(t==')'||t==']'||t=='}'){
                        tmp=stack.expected();
                        if(tmp!=t){
                            System.out.println(line);
                            for(int j=0;j<line.length();j++){
                                if(j==i){
                                    System.out.print("^");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                            System.out.println("Error in line "+lineIndex+". ')' found, but '"+tmp+"' expected.");
                            return;
                        }
                    }
                }
            }
            System.out.println("OK");


        } catch (IOException E) {
            E.printStackTrace();
        }
    }
}
