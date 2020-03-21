package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = new int[]{1,3,5,6};
        System.out.println(searchInsert(arr, 5));


        System.out.println(searchInsert(arr, 2));


        System.out.println(searchInsert(arr, 7));


        System.out.println(searchInsert(arr, 0));

    }

    public static int searchInsert(int[] nums, int target){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;
            } else if(nums[i] > target) {
                index = i;
                break;
            } else {
                index= i+1;
            }
        }
        return index;
    }
}
