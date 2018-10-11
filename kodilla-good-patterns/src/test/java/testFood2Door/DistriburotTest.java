package testFood2Door;

import food2Door.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DistriburotTest {

    public List<Distributor> prepareTestData() {
        Distributor distributor = new Distributor("ExtraFoodShop", "Extra Fish" , 150);
        Distributor distributor2 = new Distributor("HealthyShop", "Healthy Bread", 100);
        Distributor distributor3 = new Distributor("GlutenFreeShop", "Water Free Gluten ", 250);

        Storage storageActual = new Storage("Actual Distibutor");
        storageActual.addDistributor(distributor);
        storageActual.addDistributor(distributor2);
        storageActual.addDistributor(distributor3);
        System.out.println(storageActual.getName());
        System.out.println(storageActual.getDistributors());
        return storageActual.getDistributors();
    }

    @Test
    public void testAddNewDistributor() {
        List<Distributor> project = prepareTestData();

        Distributor distributor4 = new Distributor("NoMeatInMeat", "Free Meat", 50);
        Distributor distributor5 = new Distributor("Danonki","Danio",50);
        Distributor distributor6 = new Distributor("McDownald", "McBurger", 50);

        Storage storageNewDistributor = new Storage("new Distributor");
        storageNewDistributor.addDistributor(distributor4);
        storageNewDistributor.addDistributor(distributor5);
        storageNewDistributor.addDistributor(distributor6);
        System.out.println(storageNewDistributor.getName());
        System.out.println(storageNewDistributor.getDistributors());

        Assert.assertEquals(3,storageNewDistributor.getDistributors().size());

        storageNewDistributor.addDistributors(project);
//        for (Distributor element : project ) {
//            storageNewDistributor.addDistributor(element);
//        }
        Assert.assertEquals(6,storageNewDistributor.getDistributors().size());
    }

    @Test
    public void testOrder() {

        List<Distributor> project = prepareTestData();

        Order order = new Order(new Client("Jerry", "Mouse"),"Extra Fish",5);
        boolean result = project.stream()
                .anyMatch(x -> x.getProduct().equals(order.getProduct()) && x.getQuantity() >= order.quantity());

        Assert.assertTrue(result);
    }
}
