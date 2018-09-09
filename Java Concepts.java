package smd4446assignment;

public interface Iphone {
    
    public String IphoneMade();
}



package smd4446assignment;

public class Keypad {
    
}



package smd4446assignment;

public abstract class Mobile {
       
     public int  modelNo;
     public int ramsize;
     public String color;
     
     Mobile()
     {
         
     }
     public void setvalues(int mno,int ramsize,String color)
     {
         this.modelNo=mno;
         this.color=color;
         this.ramsize=ramsize;
     }
     // abstract 
     public abstract void displyDiscription();
         
       public String NokiaMade()
       {
            return "Nokia";
       }
       
       public String SamsungMade(){
           return "Samsung";
       }
       
        public String IphoneMade(){
            return "Iphone";
        }
}



package smd4446assignment;

public interface Nokia {
    public String NokiaMade();
}



package smd4446assignment;

public interface Samsung {
    public String SamsungMade();
}


package smd4446assignment;

public class SMD4446Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try{
	    Mobile myCellphone=new  Tochscreen(420,"pinki",64 ,4446);
           myCellphone.displyDiscription();
	}
        catch(Exception e){
	   System.out.println("There is Some Exception Occure in your Code");
	}
        
       
    }
    
}



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
