
    package storageProject;

    public class Runner {
        public static void main(String[] args) {

            System.out.println("==== Depo Yönetim Sistemine Hoş Geldiniz ====");
            System.out.println("Bu program ile depoya ürün girişi, çıkışı ve diğer işlemleri yapabilirsiniz.");

            // Storage sınıfının ana menüsünü çalıştır.
            Storage storage = new Storage();
            storage.Start(); // Ana menüyü başlatan metodu çağır
        }
    }




