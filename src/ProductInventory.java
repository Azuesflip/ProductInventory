/*
 * This class will be used to in the future gain a basis to hold 
 * inventory items. It will be a basis for practically any business based
 * inventory project.
 */
public class ProductInventory 
{
    
    public String name;
    public String description;
    public int id;
    public double price;
    public int quantity;
    
    public ProductInventory(String startName, String startDescription,
            int startId, double startPrice, int startQuantity)
    {
        name = startName;
        description = startDescription;
        id = startId;
        price = startPrice;
        quantity = startQuantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
