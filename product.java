package day2;

public class product {
	String Prdname;       
    int Prdprice;
    int Prdgst;
    double Prddiscount;

	public static void main(String[]args) {
		product P1 = new product();
		P1.Prdname = "Computer";
        P1.Prdprice = 10000;
        P1.Prdgst = 18;
        P1.Prddiscount = 19.5;
        
        System.out.println("Product Name: " + P1.Prdname);
        System.out.println("Product price: " + P1.Prdprice);
        System.out.println("Product GST: " + P1.Prdgst);
        System.out.println("Product discount: " + P1.Prddiscount);
	}

}
