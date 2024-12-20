public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,-3,-4};
        int movementRight = 0;
        int movementLeft = 0;
        int count =0;
        for(int i =0; i<nums.length; i++){
        if(nums[i]>0){
            movementRight+=nums[i];
        }
         if(nums[i]<0){
            movementLeft+=nums[i];
        }
         if(movementRight+movementLeft==0){
            count++;
        }
        }
        System.out.println(count);
    }
}
