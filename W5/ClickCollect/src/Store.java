import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store
{
    private List<Order> orders;

    public Store()
    {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders()
    {
        return this.orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public boolean placeOrder(Order order)
    {
        if (order.getTotalPrice() >= 15)
        {
            orders.add(order);
            return true;
        }
        return false;
    }

    public Order pickupOrder(int orderId, Customer customer)
    {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext())
        {
            Order order = iterator.next();
            if (order.getOrderId() == orderId && order.getCustomer().equals(customer))
            {
                iterator.remove();
                return order;
            }
        }
        return null;
    }

    public void removeOldOrders()
    {
        LocalDate today = LocalDate.now();
        orders.removeIf(order -> Period.between(order.getOrderDate(), today).getDays() > 14);
    }

    public double calculateTotalValue()
    {
        double total = 0;
        for (Order order : orders)
        {
            total += order.getTotalPrice();
        }
        return total;
    }
}
