class IceCream{
    String Flavour;
    int sales;
    IceCream(String Flavour,int sales){
        this.Flavour=Flavour;
        this.sales=sales;
    }
    void display() {
         System.out.println(Flavour + " - " + sales + " sold");
    }
}
public class IceCreamRush{
    public static void main(String[] args){
       IceCream[] Flavour = {
            new IceCream("Vanilla", 30),
            new IceCream("Chocolate", 45),
            new IceCream("Strawberry", 25),
            new IceCream("Mango", 50),
            new IceCream("Butterscotch", 20),
            new IceCream("Black Currant", 35),
            new IceCream("Pista", 40),
            new IceCream("Blueberry", 15)
        
    };
    int n = Flavour.length;
    for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (Flavour[j].sales < Flavour[j + 1].sales) {
                    IceCream temp = Flavour[j];
                    Flavour[j] = Flavour[j + 1];
                    Flavour[j + 1] = temp;
                }
            }
    }
     System.out.println("Flavors sorted by popularity:");
        for (int i=0;i<n;i++) {
            Flavour[i].display();
        }
    }
}