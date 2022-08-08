import java.util.*;
public class Numbers{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10000");
        int n = sc.nextInt();//100

        int sum = 0, count = 0;

        for(int i =1; i<=n; i++)
            if((i%2) == 0) {
                sum = sum + i;
                count++;
            }
        double avg = sum/count;

        System.out.println("The average of all even numbers from 1 to 10000 is:"+avg);
    }
}