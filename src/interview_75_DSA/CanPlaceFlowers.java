package interview_75_DSA;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i=0;i< flowerbed.length;i++){
            boolean left=i==0 || flowerbed[i-1]==0;
            boolean right=i==flowerbed.length-1 || flowerbed[i+1]==0;

            if (left && right && flowerbed[i]==0){
                flowerbed[i]=i;
                n--;
            }



        }
        return n<=0;




    }

        public static void main(String[] args){
        int[] flowerbed={1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));

    }
}
