package Task26_z21;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryReading {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please input the name of the file.");
            FileInputStream fis = new FileInputStream(scanner.nextLine());


            int ch;
            StringBuilder ans=new StringBuilder();
            while ((ch = fis.read()) != -1) {
                char chch=(char) ch;
                if((chch>='a'&&chch<='z')||(chch>='A'&&chch<='Z')){
                    ans.append(chch);
                }else{
                    if(ans.length()>=4)
                        System.out.println(ans);
                    ans=new StringBuilder();
                }

            }
            if(ans.length()>=4)
                System.out.println(ans);


            fis.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
