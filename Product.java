public class Product {
    //Attributes
    private String productName;
    private int productId;
    private double productPrice;
    private int stockQuantity=0;
    public int quantity;
    public  Product(String productName,int productId,double productPrice){
        this.productName=productName;
        this.productId=productId;
        this.productPrice=productPrice;
    }
    //Setters
    public void setName(String productName){
        this.productName=productName;
    }
    public void setProductIt(int productId){
        if(productId<0){
            System.out.println("Id cannot be negative");
        }
        else{
        this.productId=productId;
        }
    }
    public void setProductPrice(double productPrice){
        if(productPrice<0){
            System.out.println("Price cannot be negative");
        }
        else{
        this.productPrice=productPrice;
        }
    }
    public void purchasedProduct(int quantity){
          if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("Invalid purchase quantity or not enough stock.");
        }
    }
    public void restockProduct(int quantity){
        if (quantity > 0) {
            stockQuantity += quantity;
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }
    //Getters
    public String getProductName(){
        return productName;
    }
    public int getProductId(){
        return productId;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
}
class StockCalculation{
    public static void main(String[]args){
        Product product = new Product("Iphone",1,20000);
        product.restockProduct(10);
        System.out.println(product.getStockQuantity());
        
    }
}
