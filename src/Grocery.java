public class Grocery extends Item {
    private double price;
    private double units;
    private double discount;
    private double unitPrice;
    private double savings;
    private double subtotal;
    private double taxAmount;
    private double finalAmount;
    private int itemcode;
    private String name;
    public Grocery(int x,String y,double a,double b,double c){
        super(x,y);
        itemcode = x;
        name = y;
        price = a;
        units = b;
        discount = c;
        unitPrice = price/units;
    }
    public void computeDiscount(){
        subtotal = price-(price * (discount/100));
        savings = price*(discount/100);
    }
    public void computeTax(){
        taxAmount = subtotal * 0.00825;
    }
    public double computeTotalPrice(){
        finalAmount = subtotal+taxAmount;
        return finalAmount;
    }
    public void displayGrocery(){
        computeDiscount();
        computeTax();
        computeTotalPrice();
        System.out.println("Item Code: "+itemcode+"\t Name: "+name+" Unit Price: "+unitPrice);
        System.out.println("Units: "+units+" Savings: "+savings+" \tSubtotal: "+subtotal);
        System.out.println("Tax Amount: "+taxAmount+" \t Price: "+finalAmount+"\n");
    }

}
