import java.io.FileWriter;
import java.io.IOException;

public class items {
    public String name;
    public double price;
    public int stock;
    public double average;
    public int voters;
    public static final String Itemfile = "Items.csv";

    public items(String name , double price , int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
        average = 5.0;
        voters = 0;
        save();

    }

    public void save(){
        try(FileWriter typer = new FileWriter(Itemfile,true)){
            typer.write(
                    name + "&" + price + "&" + stock + "&" + average + "&" + voters + "/n"
            );}
            catch(IOException e){
        }
    }
}


