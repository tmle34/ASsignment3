public class demoDepartmentBilling {
    public static void main(String[]args){
        Grocery s1 = new Grocery(11,"Bread",2,1.50,0);
        Grocery s2 = new Grocery(12,"Apple",6,0.75,1);
        Clothing c1 = new Clothing(21,"Jeans","Levis",35,1,0);
        Clothing c2 = new Clothing(22,"Dress Shirt","Izod",25,2,10);
        s1.displayGrocery();
        s2.displayGrocery();
        c1.displayClothing();
        c2.displayClothing();
        System.out.println("Total bill amount: "+(s1.computeTotalPrice()+s2.computeTotalPrice()+c1.computeTotalPrice()+c2.computeTotalPrice()));
    }
}
