import java.util.Scanner;

public class CardsLogic {
    private  int level;
    private void input() {
        System.out.println("Enter the number of levels: ");
        Scanner sc = new Scanner(System.in);
        level = sc.nextInt();
    }
     public void logic(){
        input();
        int result;
        result = level*(3 * level + 1)/2;
         System.out.println(result);
     }

}
