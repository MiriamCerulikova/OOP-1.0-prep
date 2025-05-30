import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class OrderTest
{

    private Order order;
    private Customer customer;
    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp()
    {
        customer = new Customer("John Soe", "2442423", "23423", "Emmen");
        order = new Order(1001, customer, LocalDate.of(2025, 3, 16));
        product1 = new Product("Product 1", 10.0);
        product2 = new Product("Product 2", 15.0);
    }

    @Test
    void addProduct()
    {
        // Arrange
        order.addProduct(product1);

        // Act
        int productCount = order.getProducts().size();

        // Assert
        assertEquals(1, productCount);
    }

    @Test
    void getTotalPrice()
    {
        // Arrange
        order.addProduct(product1);
        order.addProduct(product2);

        // Act
        double totalPrice = order.getTotalPrice();

        // Assert
        double expectedTotal = 2.50 + product1.getPrice() + product2.getPrice();
        assertEquals(expectedTotal, totalPrice);
    }
}
