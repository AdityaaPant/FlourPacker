public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
            }
        boolean result = false;
        int big = (bigCount * 5);
        if(big>=goal){
            int bigWeightValue =5;
            int remaining = goal % bigWeightValue;
            if(smallCount >=remaining ){
                return true;
            }
        }else{
            if(smallCount >= goal-big){
                result = true;
            }
        }


        return result;
    }
}