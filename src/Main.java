public class Main {
    public static void main(String[] args) {
        System.out.println(flourPacker(2,4,14));
    }
    public static boolean flourPacker(int bigCount, int smallCount, int goal) {
        int big= (bigCount*5);
        int small=smallCount*1;
        int totalCount = big+small;
        if(totalCount == goal){
            return true;
        }

        return false;
    }

}