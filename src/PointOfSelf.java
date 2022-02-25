import java.util.ArrayList;

public class PointOfSelf {


    ArrayList <CartItem> item;
    public void addToCart(int quantity,Product product)
    {int cont;
        for (cont=0;cont<quantity;cont++)
        {
            item[cont]=product;

        }


    }
    public float getTotal()
    {
       int total;
        return total ;
    }

    public ArrayList<CartItem> getProduct() {
        return item;
    }
    public int getCountByName(String name)
    {int algo;
        return algo;
    }
}
