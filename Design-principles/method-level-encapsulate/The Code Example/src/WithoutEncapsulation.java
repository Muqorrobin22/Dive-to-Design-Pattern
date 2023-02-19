import helper.Items;

// This Method does'nt applying the Encapsulation Method
public class WithoutEncapsulation {
    
    public int getOrder(Items[] order) {

        int total = 0;

        for (Items items : order) {
            total += items.priceItem * items.quantityItem;

            // Calculate Taxes
            if(items.countryItem == "US") {
                total += total *  0.07;
            } 
            else if(items.countryItem == "EU") {
                total += total * 1.50;
            }
            // ------------------
        }

        return total;
    }

}
