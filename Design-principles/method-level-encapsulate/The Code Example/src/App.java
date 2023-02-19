import helper.Items;

public class App {
    public static void main(String[] args) throws Exception {
        
        Items cloth = new Items(20, 10, "US");
        Items jogger = new Items(30, 12, "US");
        Items shoes = new Items(12, 20, "US");

        Items[] itemsList = {cloth, jogger, shoes};


        // Applying the method that has no ---------- Encapsulate Method level -------------- 
        WithoutEncapsulation getTotal = new WithoutEncapsulation();
        WithEncapsulation getTotal2 = new WithEncapsulation();

        int totalTaxesWithoutEncapsulation = getTotal.getOrder(itemsList);
        int totalTaxesWithEncapsulation = getTotal2.getOrder(itemsList);

        System.out.println("The total Taxes withtout encapsulation is : " + totalTaxesWithoutEncapsulation);
        System.out.println("The total Taxes with encapsulation is : " + totalTaxesWithEncapsulation);

        
    }
}
