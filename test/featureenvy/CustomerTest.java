package featureenvy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    
    @Test
    public void getFullAddress() {
        Customer customer = new Customer("Carlos Acosta");
        customer.setAddress(new Address("Viera y Clavijo 20", "Las Palmas", "35003"));
        String expected = "Carlos Acosta.Viera y Clavijo 20.Las Palmas.35003";
        String result = customer.getFullAddress();
        assertEquals(expected, result);
    }
}
