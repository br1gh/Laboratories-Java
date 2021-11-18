package com.company;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main
{
    public static void main(String[] args)
    {
        zadanie7();
        //zadanie5_no_char();
    }
    public static void zadanie1()
    {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21) - 10;//-10 10
            System.out.print(arr[i] + " ");
        }

        int minimum = arr[0], maximum = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
            if (arr[i] < minimum)
                minimum = arr[i];
        }

        System.out.println("\nMinimum: " + minimum + ", Maximum: " + maximum);



        //1.6
        System.out.printf("\nTablica odwrotnie: \n");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void zadanie2()
    {
        int arr[][] = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(11) - 5;//-5 5
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int minimum[] = new int[5];
        int maximum[] = new int[5];
        for (int i = 0; i < 5 ; i++) {
            maximum[i] = arr[i][0];
            minimum[i] = arr[i][0];
        }

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] > maximum[i]){
                    maximum[i] = arr[j][i];
                }
                if (arr[j][i] < minimum[i]){
                    minimum[i] = arr[j][i];
                }
            }
        }

        System.out.println("\nMinimalne:");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(minimum[i] + " ");
        }
        System.out.println("\nMaksymalne:");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(maximum[i] + " ");
        }
    }
    public static void zadanie3()
    {
        int[] arr = new int[32];
        System.out.println("Podaj liczbe:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0) System.out.print("0.");
        else System.out.print("1.");

        a = abs(a);
        int j = 0, counter = 0;
        while (a > 0 && j < 32 )
        {
            arr[j] = a % 2;
            a /= 2;
            j++;
            counter++;
        }
        for (int i = 0; i < counter; i++)
            System.out.print(arr[i]);
    }
    public static int NWD(int a,int  b)
    {
        int temp;
        while (b != 0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void zadanie4()
    {
        System.out.println("Podaj n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (NWD(i + 1, j + 1) == 1)
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                if (arr[i][j] == true)
                    System.out.print("+\t");
                else
                    System.out.print(".\t");
            }
            System.out.println();
        }
    }
    public static void zadanie5()
    {
        System.out.println("Podaj jakis ciag znakow:");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char last = x.charAt(x.length()-1);
        int counter = 0;
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) == last)
                counter++;
        System.out.println("Ostatni znak pojawil sie " + counter + " razy");
    }
    public static void zadanie5_no_char()
    {
        System.out.println("Podaj jakis ciag znakow:");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String last = x.substring(x.length()-1);
        int counter = 0;
        for (int i = 0; i < x.length(); i++)
            if (last.equals(x.substring(i,i+1)))
                counter++;
        System.out.println("Ostatni znak pojawil sie " + counter + " razy");
    }
    public static void zadanie6()
    {
        System.out.println("Podaj jakis ciag znakow:");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char temp;
        int counter = 0;
        for (int i = 0; i < x.length(); i++)
        {
            temp = x.charAt(i);
            if ((int)(temp) > 47 && (int)(temp) < 58)
                counter += (int)(temp) - 48;
        }
        System.out.println("Wynik to: " + counter);
    }
    public static void zadanie7()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj jakis ciag znakow:");
        String x = in.nextLine();
        System.out.println("Podaj n:");
        int n = in.nextInt();
        String output = "";
        char temp;
        if (n < 0) // Bez tego program nie działa poprawinie, na przykład python tego nie potrzebuje
            n += 26;
        for (int i = 0; i < x.length(); i++)
            output += (char)(((int)(x.charAt(i)) + n - 97) % 26 + 97);
        System.out.println(x + "\n zamienia sie w:");
        System.out.println(output);
    }
}
