import java.util.Scanner;

class RevAlt {

   public static void main(String[] args) {
        
        String input,output;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input:");
        input=sc.next();
        output = "";
        for(int i=0;i<input.length()-1;i+=2){
            StringBuilder temp = new StringBuilder();
            temp.append(input.substring(i,i+2)).reverse();
            output=output.concat(temp.toString());
        }
        if(input.length()%2!=0){
            int rem = input.length()%2;
            output=output.concat(input.substring(input.length()-rem,input.length()));
        }
        System.out.println(output);
        
    }
}