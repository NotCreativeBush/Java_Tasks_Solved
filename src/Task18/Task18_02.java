package Task18;

public class Task18_02 {
    private static int roll(){
        int dice1,dice2;
        int count=0;
        do{
            dice1=(int) (Math.random()*6)+1;
            dice2=(int) (Math.random()*6)+1;
            count++;
        }while (dice1+dice2!=12);
        return count;
    }

    public static void main(String[] args) {
        int rolled;
        int first=0;
        int ninety=0;
        for(int i=0;i<1000000;i++){
            rolled=roll();
            if(rolled==1){
                first++;
            }
            if(rolled>=90){
                ninety++;
            }
        }
        System.out.println("In first roll   : "+first/10000.0+"%");
        System.out.println("90 or more rolls: "+ninety/10000.0+"%");
    }
}
