
package smd4446assignment;

public class Tochscreen extends Mobile{

    private int price;
    
    Tochscreen(int mno,String color,int ramsize ,int price)
    {
        this.setvalues(mno,ramsize,color);
        this.price=price;
    }
    @Override
    public void displyDiscription() {
        System.out.println("Model No:"+this.modelNo);
        System.out.println("RamSize :"+this.ramsize);
        System.out.println("Color:"+this.color);
        System.out.println("Price:"+this.price);
        System.out.println("Company Made:"+this.IphoneMade());
        System.out.println("Company Made:"+this.SamsungMade());
        System.out.println("Company Made:"+this.NokiaMade());
    }

}
