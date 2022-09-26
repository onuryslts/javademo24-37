public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Bilgisayar",5000,2,"Siyah");


        ProductMenager productMenager = new ProductMenager();
        productMenager.Add(product);

    }
}