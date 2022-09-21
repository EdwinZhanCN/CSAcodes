
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many salesperson you want to add");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int average = 0;
        int max = sales[0];
        int maxPerson = 0;
        int min = sales[0];
        int minPerson = 0;
        int answer;

        for(int i = 1; i < sales.length +1; i++){
            System.out.println("Enter sales for salesperson " + i + ": ");
            sales[i-1] = scan.nextInt();
        }
        System.out.println("\n Salesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        for(int i = 0; i< sales.length; i++){
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            average = sum / sales.length;
            if(sales[i] > max){
                max = sales[i];
                maxPerson = i;
            }
            if(sales[i] < max){
                min = sales[i];
                minPerson = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nSales Average: " + average);
        System.out.println("\nSalesperson " + maxPerson + " had the highest sale with $" + max);
        System.out.println("\nSalesperson " + minPerson + " had the lowest sale with $" + min);

        System.out.println("Enter an integer value: ");
        answer = scan.nextInt();
        int count = 0;
        for(int i = 1; i < sales.length+1; i++){
            if(sales[i-1] > answer){
                count ++;
            }
        }

        System.out.println("There are/is "+ count + " salespeople's sales exceed the value you just input.");


    }
}
