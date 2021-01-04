import java.util.Scanner;

class RevAltModified {

   public static void main(String[] args) {
        
        String input,output;
        int revlen;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Reverse Length:");
        revlen=sc.nextInt();
        System.out.println("Enter Input:");
        input=sc.next();
        output = "";
        for(int i=0;i<input.length()-(revlen-1);i+=revlen){
            StringBuilder temp = new StringBuilder();
            temp.append(input.substring(i,i+revlen)).reverse();
            output=output.concat(temp.toString());
        }
        if(input.length()%revlen!=0){
            int rem = input.length()%revlen;
            output=output.concat(input.substring(input.length()-rem,input.length()));
        }
        System.out.println(output);
        
    }
}