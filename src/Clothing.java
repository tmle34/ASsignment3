public class Clothing extends Item {
    private String brand;
    private double price;
    private double units;
    private double discount;
    private double tax;
    private double finala;
    private double subtotal;
    private double unitPrice;
    private double savings;
    final double taxp=8.5;
    public Clothing(int x, String y,String a,double b,double c,double d){
        super(x,y);
        brand = a;
        price = b;
        units = c;
        discount = d;
        unitPrice = price/units;
    }
    public void computeDiscount(){
        discount = price *discount/100;
        subtotal = price - discount;
        savings = discount;
    }
    public void computeTax(){
        tax = taxp*price;
    }
    public double computeTotalPrice(){
        finala = price +tax-discount;
        return finala;
    }
    public void displayClothing(){
        computeDiscount();
        computeTax();
        computeTotalPrice();
        System.out.println("Brand: "+brand+" \tUnit Price: "+unitPrice);
        System.out.println("Units: "+units+" \tSubtotal: "+subtotal);
        System.out.println("Savings: "+savings+" \tTax Amount: "+tax);
        System.out.println("Final Price: "+finala+"\n");
    }
}
