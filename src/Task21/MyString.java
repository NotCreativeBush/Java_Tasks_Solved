package Task21;

public class MyString {
    private String str;
    public MyString(){
        this.str="";
    }
    public MyString(String s){
        this.str=s;
    }
    public int getLength(){
        return this.str.length();
    }
    public char getChar(int n) throws IllegalArgumentException{
        try {
            return this.str.charAt(n);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return ' ';
        }
    }
    public void append(String s){
        this.str+=s;
    }
    public void append(int rep, String s){
        for(int i=0;i<rep;i++){
            this.str+=s;
        }
    }
    public void prepend(String s){
        this.str=s+this.str;
    }
    public void insert(int pos, String s) throws IllegalArgumentException{
        try {
            this.str=this.str.substring(0,pos)+s+this.str.substring(pos,this.str.length()-1);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
    public void reset(String s){
        this.str=s;
    }
    @Override
    public String toString(){
        return this.str;
    }

}
