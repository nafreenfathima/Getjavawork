

import java.util.Scanner;

public class Employee {

    void sort(int arr[])

    {
        int num = arr.length;

        for (int i = 0; i < num-1; i++)

        {
            int minofindex = i;

            for (int j = i+1; j < num; j++)

            {

            if (arr[j] < arr[minofindex])

                minofindex = j;

            }

            int temp = arr[minofindex];

            arr[minofindex] = arr[i];

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

        Employee ob = new Employee();

System.out.println("Number of employee id's you need to enter: ");

        int k =sc.nextInt();

        int array[] = new int[k];

        System.out.println("Input Employee Id:");

        for(int i = 0; i < k; i++)

        {

        array[i] = sc.nextInt();

        }

       ob.sort(array);

System.out.println("EmployeeId List after sorting:");

        ob.display(array);

    }

}