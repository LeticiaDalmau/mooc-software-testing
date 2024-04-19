package tudelft.discount;

import tudelft.invoice.Invoice;

import java.util.ArrayList;
import java.util.List;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public List<Product> setNewPrices() {

        List<Product> all = dao.all();
        List<Product> prices = new ArrayList<>();

        for(Product product : dao.all()) {
            if(product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice() * 0.9);
                prices.add(product);
            }
            if(product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice() * 1.1);
                prices.add(product);
            }
        }

        return prices;
    }
}
