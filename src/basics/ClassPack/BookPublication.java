package basics.ClassPack;

public class BookPublication {

    public int price;
    public String publicationName;
    public String bookName;
    public double totalProfit;
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Book Name: " + bookName);
        System.out.println("Publication: " + publicationName);
        System.out.println("Price: $" + price);
        System.out.println("Profit Percentage: " + totalProfit + "%");
    }

    public void calculateTotalProfit()
    {
        totalProfit = (double) (price + price * 0.10 );
    }

}
