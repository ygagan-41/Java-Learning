//ques1-print each character of string
/* public class stringques {
    static void main(){
        String name = "useless";

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
} */
//ques2-count length of string wihtout length keyword
public class stringques{
    static void main(){
        String name = "walter white";
        int count = 0;
        for(int i=0; i<name.length(); i++){
            count++;
        }
        System.out.println(count);
    }
}