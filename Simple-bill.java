import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total price: ");
        double total = 0;
        System.out.println("Enter -1 to exit: ");
        while(true){
            double price = input.nextDouble();
            if(price == -1) break;
             total += price;   
        }
        System.out.println("Total bill with tax: " + total);
    }
}
