import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ArrayList<String> kategori = new ArrayList<>();
        kategori.add("Meyve");
        kategori.add("Tropikal");
        Product newProduct = new Product("Elma",1,kategori,2.6,100);
        System.out.println(newProduct.toString());

        Company newCompany = new Company("Asımın Lezzetleri", "Os. Handlowe 5/37");
        System.out.println(newCompany.toString());
        newCompany.addCompanyProduct(newProduct);
        System.out.println(newCompany.toString());

        User newUser = new User("Asim","Avutmuslu","ahmedavutmus@yahoo.com","test123","os Kolorowe 9/35");
        System.out.println(newUser.toString());





    }
}