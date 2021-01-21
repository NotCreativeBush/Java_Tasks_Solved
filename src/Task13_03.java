public class Task13_03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] brr = {2, 3, 6, 8, 5, 1};
        boolean repeat=false;
        for (int i=0;i< arr.length;i++){
            repeat=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    repeat=true;
                    break;
                }
            }
            if(repeat==false){
                for (int j=0;j<brr.length;j++){
                    if (arr[i]==brr[j]){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
    }
}
