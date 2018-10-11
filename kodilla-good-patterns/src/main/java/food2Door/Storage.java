package food2Door;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Distributor> distributors = new ArrayList<>();
    private String name;

    public Storage(String name) {
        this.name = name;
    }

    public  void addDistributor(Distributor distributor) {
        distributors.add(distributor);
    }

    public  void addDistributors(List<Distributor> distributor) {
        distributors.addAll(distributor);
    }

    public boolean removeDistibutor(Distributor distributor) {
        return distributors.remove(distributor);
    }

    public List<Distributor> getDistributors() {
        return new ArrayList<>(distributors);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "distributors=" + distributors +
                ", name='" + name + '\'' +
                '}';
    }
}
