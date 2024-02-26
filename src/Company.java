import java.util.ArrayList;

public class Company {
    private String companyName;
    private String companyAdress;
    private ArrayList<Product> companyProducts = new ArrayList<Product>();

    public Company()
    {
        this.companyName = "";
        this.companyAdress = "";

    }
    public Company(String cN, String cA, ArrayList<Product> products)
    {
        setCompanyName(cN);
        setCompanyAdress(cA);
        setCompanyProducts(products);
    }

    public Company(String cN, String cA)
    {
        setCompanyName(cN);
        setCompanyAdress(cA);

    }

    public void setCompanyName(String companyName) {
        if(companyName.isEmpty())
        {
            System.out.println("Company Name can't be empty!");
        }
        else
        {
            this.companyName = companyName;
        }
    }

    public void setCompanyAdress(String companyAdress) {

        if(companyAdress.isEmpty())
        {
            System.out.println("Company Adress can't be empty!");
        }
        else
        {
            this.companyAdress = companyAdress;
        }
    }

    public void setCompanyProducts(ArrayList<Product> companyProducts) {
        this.companyProducts = companyProducts;
    }

    public void addCompanyProduct(Product newProduct)
    {
        this.companyProducts.add(newProduct);
    }

    public void addCompanyProduct(String pN,int pI, ArrayList<String> pCt, double pP, int pCo)
    {
        Product newProduct = new Product(pN,pI,pCt,pP,pCo);
        this.companyProducts.add(newProduct);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public ArrayList<Product> getCompanyProducts() {
        return companyProducts;
    }

    @Override public String toString()
    {
        String companyProductsInfo;
        if(this.companyProducts.isEmpty())
        {
            companyProductsInfo = "None";
        }
        else
        {
            companyProductsInfo = getCompanyProducts().toString();
        }
        return "Company Name: "+ getCompanyName() +"\n" + "Company Adress: " + getCompanyAdress() + "\n" + "Company Products: " + companyProductsInfo;


    }

}
