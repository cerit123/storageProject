package storageProject;


public class Product {

    public int id;
    public String name;  // urun adi
    public String manufacturer;// uretici
    public int quantity = 0 ;      //adet
    public String unit;       //birim
    public String shelf = null;//raf

    public Product(int id, String  name, String manufacturer, String unit) { //int id ekle
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.unit = unit;

    }

    @Override
    public String toString() {
        return  "Product{" +
                "id=" +id +
                ",name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}