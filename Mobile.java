public class Mobile {
    String name;
    int price;
    String brand ;


    public void show(){
       System.out.println( " Brand: "+ brand +" Name: "+name+" Price "+ price);
   }
public static void main(String[] args) {
    Mobile obj1=new Mobile();
    obj1.brand="Apple";
    obj1.name="smartPhone";
    obj1.price=1700;
    Mobile obj2=new Mobile();
    obj2.brand="Galaxy";
    obj2.name="smartPhone";
    obj2.price=1500;

    obj1.show();
    obj2.show();

}
}
