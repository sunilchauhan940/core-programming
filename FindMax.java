import java.util.Scanner;

class FindMax {

   public static void main(String[] args) {
        
        int n,a[],max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements:");
        n=sc.nextInt();
		System.out.println("Enter elements:");
        a=new int[n];
		max=a[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            a[i]=sc.nextInt();
            if(max<a[i])
				max = a[i];
        }
        System.out.println("Maximum element="+max);
    }
}