import javax.swing.*;
import java.util.Scanner;

public class Task10_03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String ans="Nontrivial divisors of "+ n + ": ";
        for(int i=2;i<n;i++){
            if(n%i==0){
                ans=ans+(i + " ");
            }
        }
        if(ans.equals("Nontrivial divisors of "+n+": ")) {
            JOptionPane.showMessageDialog(null, "prime", "Divisors", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, ans, "Divisors", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
