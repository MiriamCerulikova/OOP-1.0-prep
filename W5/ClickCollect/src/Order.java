import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Order
{
    private static final double BASE_PRICE = 2.50;
    private int orderId;
    private Customer customer;
    private LocalDate orderDate;
    private Set<Product> products;

    public Order(int orderId, Customer customer, LocalDate orderDate)
    {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.products = new HashSet<>();
    }

    public int getOrderId()
    {
        return this.orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public LocalDate getOrderDate()
    {
        return this.orderDate;
    }

    public void setOrderDate(LocalDate orderDate)
    {
        this.orderDate = orderDate;
    }

    public Set<Product> getProducts()
    {
        return this.products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public double getTotalPrice()
    {
        double total = BASE_PRICE;
        for (Product product : products)
        {
            total += product.getPrice();
        }
        return total;
    }
}
