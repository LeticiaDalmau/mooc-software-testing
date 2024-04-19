package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void discountApplier(){

        Product table = new Product("Table",1, "HOME");
        Product pc = new Product("PC", 1, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> list = Arrays.asList(table, pc);

        Mockito.when(dao.all()).thenReturn(list);

        DiscountApplier NewPrices = new DiscountApplier(dao);
        List<Product> result = NewPrices.setNewPrices();

        Assertions.assertEquals(0.9, result.get(1).getPrice());
        Assertions.assertEquals(2, result.size());

        dao.close();
    }
}
