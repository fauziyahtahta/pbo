import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n, int q) {
        items.add(new Item(c, n, p, q));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        boolean found = false;

        // Cek jumlah item di list
        System.out.println("Jumlah item sebelum dihapus: " + items.size());

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Cek item dengan kode: " + items.get(i).getCode());
            
            if (items.get(i).getCode().equals(code.trim())) {
                items.remove(i);  u
                System.out.println("Barang dengan kode " + code + " berhasil dihapus.");
                found = true;
                break;  
            }
        }

        if (!found) {
            System.out.println("Barang dengan kode " + code + " tidak ditemukan.");
        }

        System.out.println("Jumlah item setelah dihapus: " + items.size());
    }

    public void displayItems() {
        System.out.println("Daftar Barang: ");
        double grandTotal= 0;
        for (Item item : items) {
            double subTotal = item.getsubTotal();
            grandTotal += subTotal;
            System.out.println(item.getCode() + " | " + item.getName() + " | Rp" + item.getPrice() + " | " + item.getQuantity() + " pcs | Subtotal: Rp" + subTotal);
        }
        System.out.println("Total Harga Semua Barang: Rp" + grandTotal);
    }

    public double getTotal() {
        double grandTotal = 0;
            for (Item item : items) {
                grandTotal += item.getsubTotal();
            }
            return grandTotal;
        }

    public void processPayment(double payment) {
        double totalPrice = getTotal();
        if (payment >= totalPrice) {
            double change = payment - totalPrice;
            System.out.println("Dibayar: Rp" + payment);
            System.out.println("Kembalian: Rp" + change);
        } else {
            System.out.println("Uang tidak cukup!");
        }
    }
}
