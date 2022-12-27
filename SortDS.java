public class SortDS {
    public static void main(String[] args){
         //Initialize array
       
        int [] array =new int[]{1,-3,40,106,81,26,15,5};
        int temp = 0;
        //Diplaying elements of original array
    

    System.out.println("Elements of original array");
    for(int i =0; i<array.length; i++){
        System.out.println(array[i] + "");
    }
    //Sort the array in descending order
    
    for(int i =0; i<array.length; i++){
        for(int j =i+1; j<array.length; j++){
            if(array[i] <array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            
        }
    }
    System.out.println();
       //Displaying elements of array after sorting 
   
    System.out.println("Elements of array after sorted in descending order:");
    for(int i =0; i<array.length; i++){
        System.out.println(array[i] + "");
    }


    }
    
}