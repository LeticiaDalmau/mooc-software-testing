package tudelft.invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFilter {

    private InvoiceDao dao;

    public InvoiceFilter(InvoiceDao dao) {
        this.dao = dao;
    }

    public List<Invoice> filter() {

        List<Invoice> all = dao.all();
        List<Invoice> filtered = new ArrayList<>();

        for(Invoice inv : all) {
            if(inv.getValue() < 100.0)
                filtered.add(inv);
        }

        return filtered;

    }
}