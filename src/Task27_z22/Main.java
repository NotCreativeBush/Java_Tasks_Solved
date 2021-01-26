package Task27_z22;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(new File("E:\\Java Tasks\\src\\Task27_z22\\FileData.txt"));
            String[] arr = scanner.nextLine().split(" ");
            RPNStack stack = new RPNStack();
            for (String x : arr) {
                switch(x) {
                    case"+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case"*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case"-":
                        double d1 = stack.pop();
                        double d2 = stack.pop();
                        stack.push(d2 - d1);
                        break;
                    case"/":
                        double dd1 = stack.pop();
                        double dd2 = stack.pop();
                        stack.push(dd2 / dd1);
                        break;
                    default:
                        stack.push(Double.parseDouble(x));

                }
            }
            System.out.println(stack.pop());
        }catch (IOException E){
            E.printStackTrace();
        }

    }
}
