import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class StoreTest
{

    private Store store;
    private Customer customer;
    private Product product1;
    private Product product2;
    private Order order1;
    private Order order2;

    @BeforeEach
    void setUp()
    {
        store = new Store();
        customer = new Customer("John Soe", "123213", "1423", "Emmen");
        product1 = new Product("Product 1", 10.0);
        product2 = new Product("Product 2", 15.0);

        // Create two orders
        order1 = new Order(1001, customer, LocalDate.of(2025, 3, 1));
        order1.addProduct(product1);

        order2 = new Order(1002, customer, LocalDate.of(2025, 3, 10));
        order2.addProduct(product1);
        order2.addProduct(product2);
    }

    @Test
    void placeOrder()
    {
        // Act
        boolean result1 = store.placeOrder(order1);
        boolean result2 = store.placeOrder(order2);

        // Assert
        assertFalse(result1);
        assertTrue(result2);
    }

    @Test
    void pickupOrder()
    {
        // Act
        store.placeOrder(order2);
        Order pickedUpOrder = store.pickupOrder(1002, customer);

        // Assert
        assertNotNull(pickedUpOrder);
        assertEquals(order2, pickedUpOrder);
    }

    @Test
    void pickupOrderNotFound()
    {
        // Act
        store.placeOrder(order2);
        Order pickedUpOrder = store.pickupOrder(1001, customer);

        // Assert
        assertNull(pickedUpOrder);
    }

    @Test
    void removeOldOrders()
    {
        // Arrange
        store.placeOrder(order1);
        store.placeOrder(order2);

        // Act
        store.removeOldOrders();

        // Assert
        assertEquals(1, store.getOrders().size());
        assertTrue(store.getOrders().contains(order2));
        assertFalse(store.getOrders().contains(order1));
    }

    @Test
    void calculateTotalValue()
    {
        // Act
        store.placeOrder(order2);

        // Assert
        double expectedTotal = order2.getTotalPrice();
        assertEquals(expectedTotal, store.calculateTotalValue());
    }
}
