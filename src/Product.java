public abstract class Product
{
    protected long productId;
    protected int price;

    public Product(long productId, int price) {
            this.productId = productId;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printDetails()
    {
        System.out.println("\nProduct Details");
        System.out.println("  ---------------");
        System.out.println("Price is " + this.price);
        System.out.println("ProductID is " + this.productId);
    }
}
