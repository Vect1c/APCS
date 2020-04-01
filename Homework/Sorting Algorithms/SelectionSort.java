public class SelectionSort 
{ 
    public void sort(int[] arr) 
    { 
        for (int k = 0; k < arr.length - 1; k++) 
        { 
            int min = k; 
            for (int j = k + 1; j < arr.length; j++) 
                if (arr[j] < arr[min]) 
                    min = j; 

            int temp = arr[min]; 
            arr[min] = arr[k]; 
            arr[k] = temp; 
        } 
    } 
  
    public void printArr(int arr[]) 
    { 
        for (int j = 0; j < arr.length; j++) 
            System.out.print(arr[j] + " "); 
    } 

    
    public static void main(String args[]) 
    { 
        SelectionSort select = new SelectionSort(); 
        int[] arr = new int[30];
        for (int j = 0; j < arr.length; j++)
        {
          arr[j] = (int)(Math.random() * 100);
        }
        select.printArr(arr);
        select.sort(arr); 
        System.out.print("\nAfter sort: "); 
        select.printArr(arr); 
    } 
} 
