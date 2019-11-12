public class Item {
    private int itemCode;
    private String Name;
    public Item(int x,String y){
        this.itemCode = x;
        this.Name = y;
    }
    public void display(){
        System.out.println("Item code: "+itemCode+" Name: "+Name);
    }

}
