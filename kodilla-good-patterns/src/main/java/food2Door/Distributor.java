package food2Door;

public class Distributor {

    private String nameCompany;
    private String product;
    private int quantity;

    public Distributor(String nameCompany, String product, int quantity) {
        this.nameCompany = nameCompany;
        this.product = product;
        this.quantity = quantity;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "nameCompany='" + nameCompany + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Distributor)) return false;

        Distributor that = (Distributor) o;

        if (quantity != that.quantity) return false;
        if (nameCompany != null ? !nameCompany.equals(that.nameCompany) : that.nameCompany != null) return false;
        return product != null ? product.equals(that.product) : that.product == null;
    }

    @Override
    public int hashCode() {
        int result = nameCompany != null ? nameCompany.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}
