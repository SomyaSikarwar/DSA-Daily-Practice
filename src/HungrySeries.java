public class HungrySeries {
    public boolean Hungry(int n){
        for(int i = 2 ; i < n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void hungrySeries(){
        for(int i = 2 ; i < 50 ;i++){
            if(Hungry(i) == true) {
                System.out.print(i + ",");
            }
        }
    }

   public  void alternate(int n){
        for(int i = n ; i <= 2*n -1; i++){
            System.out.print(i + " ");
        }
    }


}
