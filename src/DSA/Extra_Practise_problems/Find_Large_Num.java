package DSA.Extra_Practise_problems;

public class Find_Large_Num {
    public static void main(String[] args){
        int []arr={2,10,5,3,9,7,1,11};
        int large=arr[0];

//        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[j]>large){
                    large=arr[j];
                }
            }
//        }
        System.out.println(large);
    }
}
