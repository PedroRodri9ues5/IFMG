/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */

public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 500;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Retorna o valor total em caixa
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {

        if (amount >= 0){
            balance = balance + amount;
        }
        else {
            prompt();
        }

    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket(){
        // Simulate the printing of a ticket.

        if (getBalance()  >= price) {

            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            // Update the total collected with the price.
            total = total + price;
            // Update the balance.
            balance = balance - price;
        } else {
            notEnoughMoney();
        }
    }

    public void printTicket(int amount){

//        int totalAmount = amount * getPrice();
        System.out.println("\nPrinting " + amount + " tickets\n");

        if (getBalance()  >= (amount * getPrice())) {
            for (int i = 0; i < amount; i++) {

                System.out.println("##################");
                System.out.println("# The BlueJ Line");
                System.out.println("# Ticket");
                System.out.println("# " + getPrice() + " cents.");
                System.out.println("##################");
                System.out.println();

                // Update the total collected with the price.
                total = getTotal() + getPrice();
                // Update the balance.
                balance = getBalance() - getPrice();

            }

//            total = getTotal() + totalAmount;
//            balance = getBalance() - totalAmount;

        } else notEnoughMoney();

    }

    public void notEnoughMoney(){

        System.out.print("Your current balance is $ " + getBalance() + ". ");
        int diference = getPrice() - getBalance();
        System.out.println("Please insert at least $" + diference+ " more to buy a ticket.");
    }

    public void prompt(){
        System.out.println("Please insert the correct anount of money");
    }

    public void showPrice(){
        System.out.println("The correct price of ticket is " + price + " Cents");
    }

    public int refundBalance() {
        int amountToRefound = balance;
        if (balance > 0) {
            balance = 0;
        } else {
            System.err.println("There is no balance to refund.");
            amountToRefound = 0;
        }
        return amountToRefound;
    }
}