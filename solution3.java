import java.util.ArrayList;

public class solution3 {
    
    public  ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = Integer.MIN_VALUE;
          int min = Integer.MAX_VALUE;
      
      for(int k = 0;k<=(arr.length-1); k++){
        if(arr[k]>max){
          max = arr[k];
        }
         
        if(arr[k]<min){
          min = arr[k];
          }
         } 
     ArrayList<Integer> result = new ArrayList<>();
      result.add(min);
      result.add(max);
      return result;
      }
      public class test{
          public static void main(String[] args) {
                int[] arr = {3,5,1,8,2,-4,7};
                solution3 sol = new solution3();
                ArrayList<Integer> result = sol.getMinMax(arr);
        
                if (result != null) {
                    System.out.println("Min: " + result.get(0) + ", Max: " + result.get(1));
                } else {
                    System.out.println("No result found");
                }
          }
      }
      
    }  

