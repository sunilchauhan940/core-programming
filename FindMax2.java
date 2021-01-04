import java.util.Scanner;

class FindMax2 {

   public static void main(String[] args) {
        
        String elements;
		int max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements:");
        elements=sc.next();
		String ele[] = elements.split(",");
		max=Integer.parseInt(ele[0]);
        for(int i=1;i<ele.length;i++){
            if(max<Integer.parseInt(ele[i]))
				max = Integer.parseInt(ele[i]);
			System.out.println(max);
        }
        System.out.println("Maximum element="+max);
    }
}