package DSA;

public class move_Zero {


    public static void moveZero(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] !=0){
                nums[j++]=nums[i];
            }
        }
        while (j< nums.length){
            nums[j++]=0;
        }

    }
    public static void main(String[] args){
        int[] num={2,0,3,4,0,0,7,6};
        moveZero(num);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }



    }

}
