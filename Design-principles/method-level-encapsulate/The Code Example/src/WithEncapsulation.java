import helper.Items;

public class WithEncapsulation {
    public int getOrder(Items[] order) {

        int total = 0;

        for (Items items : order) {
            total += items.priceItem * items.quantityItem;

            // Separate Concern : calculate Taxes 
            total += total * calculateTaxes(items.countryItem);
        }

        return total;
    }

    private double calculateTaxes(String country) {
        // Calculate Taxes
        if(country == "US") {
           return  0.07;
        } 
        else if(country == "EU") {
            return 1.50;
        } 
        else {
            return 0;
        }
        // ------------------
    }
}
