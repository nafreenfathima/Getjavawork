import java.util.Scanner;

public class Sorting {

    void sort(int arr[])

    {
        int num = arr.length;

        for (int i = 0; i < num-1; i++)

        {
            int m = i;

            for (int j = i+1; j < num; j++)

            {

            if (arr[j] < arr[m])

                m = j;

            }

            int temp = arr[m];

            arr[m] = arr[i];

            arr[i] = temp;

        }

    }

    public void display(int arr[])

    {

        int n = arr.length;

        for (int i=0; i<n; ++i)

            System.out.print(arr[i]+" ");

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sorting ob = new Sorting();

System.out.println("Array size: ");

        int k =sc.nextInt();

        int array[] = new int[k];

        System.out.println("Enter array elemants:");

        for(int i = 0; i < k; i++)

        {

        array[i] = sc.nextInt();

        }

       ob.sort(array);

System.out.println(" after array elements sorting:");

        ob.display(array);

    }

}

