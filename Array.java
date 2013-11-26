import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int arraySize;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the size of the array?");
        arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        int getInt, swap;
        for(int i = 0; i < arraySize; i++)
        {
            System.out.println("enter a number");
            getInt = scan.nextInt();
            if(i == 0)
            {
                array[arraySize - i -1] = getInt;
                continue;
            }
            
            if(getInt <= array[arraySize - 1])
                array[arraySize - i - 1] = getInt;
            else
            {
                swap = array[arraySize - i];
                array[arraySize - i] = getInt;
                array[arraySize - i - 1] = swap;
            }
        }
        
        for(int i = 0; i < arraySize; i++)
            System.out.print("\t" + array[i]);
    }
}
