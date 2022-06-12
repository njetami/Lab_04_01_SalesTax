public class SalesTax {
    public static void main(String[] args)
    {
        double TAX_RATE = 0.05;
        double itemCost = 100;
        double salesTax;

        salesTax = itemCost * TAX_RATE;
        System.out.println("The sales tax of the product of " + itemCost + " and " + TAX_RATE  +  " is " + salesTax);


    }
}
