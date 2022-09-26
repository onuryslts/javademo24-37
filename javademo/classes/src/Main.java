public class Main {
    public static void main(String[] args) {
    CustomerMenager customerMenager;
    CustomerMenager customerMenager1 = new CustomerMenager();
    customerMenager = customerMenager1;
    customerMenager.Add();
    customerMenager.Remove();
    customerMenager.Update();

    int sayi1 = 10;
    int sayi2 = 20;
    sayi2 = sayi1;
    sayi1=30;
    System.out.println(sayi2);

    int[] sayilar1 = new int[]{1,2,3};
    int[] sayila2 = new int[]{4,5,6};
    sayila2 = sayilar1;
    sayilar1[0]=10;
    System.out.println(sayila2[0]);

    }

}
