import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    private String productName;
    private int productId;
    private ArrayList<String> productCategory;
    private double productPrice;
    private int productCount;

    public Product()
    {
        this.productName = "";
        this.productId = 0;
        this.productCategory = null;
        this.productPrice = 0.0;
        this.productCount = 0;
    }

    public Product(String pN,int pI, ArrayList<String> pCt, double pP, int pCo)
    {
        setProductName(pN);
        setProductId(pI);
        setProductCategory(pCt);
        setProductPrice(pP);
        setProductCount(pCo);
    }

    public void setProductName(String productName) {
        if((productName.isEmpty())||(productName.equals("\\n")))
        {
            System.out.println("Product Name can't be empty!");
        }
        else
        {
            this.productName = productName;
        }

    }

    public void setProductId(int productId) {
        if(productId<=0)
        {
            System.out.println("You can't set a products id lower than zero!");
        }
        else
        {
            this.productId = productId;
        }
    }

    public void setProductCategory(ArrayList<String> productCategory) {
        if(productCategory.isEmpty())
        {
            System.out.println("Product Category can't be empty!");
        }
        else
        {
            this.productCategory = productCategory;
        }
    }

    public void addProductCategory(String productCategory)
    {
        if(productCategory.isEmpty())
        {
            System.out.println("You can't add an empty category!");
        }
        else
        {
            this.productCategory.add(productCategory);
        }
    }

    public void setProductPrice(double productPrice) {
        if(productPrice<=0)
        {
            System.out.println("Product Price can't be zero or lower than zero!");
        }
        else
        {
            this.productPrice = productPrice;
        }

    }

    public void setProductCount(int productCount) {
        if(productCount<0)
        {
            System.out.println("Product Count can't be lower than zero!");
        }
        else
        {
            this.productCount = productCount;
        }

    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public ArrayList<String> getProductCategory() {
        return productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    @Override public String toString()
    {
        return "Product Name: " + getProductName() +"<--> " + "Product Id: "+ getProductId() +"<--> " + "Product Category: " + productCategory.toString() + "<--> " + "Product Price: " + getProductPrice() + "<--> " + "Product Count: " + getProductCount();

    }
}
