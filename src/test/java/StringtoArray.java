public class StringtoArray {
    public static void main(String[] args){
        String str = "123abc", nstr="";
        char ch;

       char[] arr = str.toCharArray();
        for(char cha:arr) {
            System.out.println("Original :" + cha);
        }

        for(int i =0; i< str.length();i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reversed :"+nstr);
    }
}
