//ques1-prints digit of a number
/* public class dsabasicmaths { */
  /*   static void main(){
        int num = 5432;
        while(num!=0){
            int digit= num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
} */
//count digits of a number
/* public class dsanasicmaths{
    static void main(){
        int count = 0;
        int num = 7896;
        while(num!=0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
} */
//sum of digits
/* public class dsaques{
    static void main(){
        int num = 1234;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            sum=sum+digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
 */
//reverse  a number 
/* public class dsaques{
    static void main(){
        int num = 9854;
        while(num!=0){
            // we have just print it not stored it if we have to stored it in reverse so do next ques
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }
} */
//reverse a number with storing
/* public class dsaques{
    static void main(){
        int num = 9854;
        int rev = 0;
        while(num!=0){
            // we have just print it not stored it if we have to stored it in reverse so do next ques
            int digit = num % 10;
            rev = rev * 10 + digit ;
            num = num / 10;
        }
        System.out.println(rev);
    }
} */
//palindrome
/* public class dsaques{
    static boolean ispalindrome(int num){
        int rev = 0;
        int originalnum = num;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if(originalnum == rev){
            return true;
        }
        return false;
    }
    static void main(){
        int num = 1234321;
        boolean result = ispalindrome(num);
        System.out.println(result);
       
    }
} */
//check prime number or not
/* public class dsaques{
    static boolean checkprime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    static void main(){
        int num = 11;
        boolean result = checkprime(num);
        System.out.println(result);
    }
} */
//check armstrong number
/* public class dsaques{
    static boolean checkarmstrong(int num){
        int originnum = num;
        int n=0;
        while (num!=0) {
            int digit = num % 10;
            int armstrong = digit * digit * digit;
            n = n + armstrong ;
            num = num/10;
        }
        if(n == originnum){
            return true;
        }
    return false;
    }
    static void main(){
        int num = 153;
        boolean result = checkarmstrong(num);
        System.out.println(result);

    }

} */
//print prime from 1 to n will do later