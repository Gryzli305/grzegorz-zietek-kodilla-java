package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        Product monitor = new Product("Belinea");
        Product keyboard = new Product("Genesys");

        Product powerSupply = new Product("SeaSonic");
        Product mouse = new Product("A4");
        Product speaker = new Product("Creative");

        Item item = new Item(monitor, BigDecimal.TEN, 10, BigDecimal.valueOf(100));
        Item itemTwo = new Item(keyboard, BigDecimal.TEN, 15, BigDecimal.valueOf(50));
        Item itemThree = new Item(powerSupply, BigDecimal.TEN, 20, BigDecimal.valueOf(250));
        Item itemFour = new Item(mouse, BigDecimal.TEN, 150, BigDecimal.valueOf(45));
        Item itemFive = new Item(speaker, BigDecimal.TEN, 100, BigDecimal.valueOf(70));

        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(itemTwo);

        List<Item> itemsTwo = new ArrayList<>();
        itemsTwo.add(itemThree);
        itemsTwo.add(itemFour);
        itemsTwo.add(itemFive);

        Invoice invoice = new Invoice("123", items);
        Invoice invoiceTwo = new Invoice("456", itemsTwo);

        item.setInvoice(invoice);
        itemTwo.setInvoice(invoice);

        itemThree.setInvoice(invoiceTwo);
        itemFour.setInvoice(invoiceTwo);
        itemFive.setInvoice(invoiceTwo);

        productDao.save(monitor);
        productDao.save(keyboard);
        productDao.save(powerSupply);
        productDao.save(mouse);
        productDao.save(speaker);

        invoiceDao.save(invoice);
        invoiceDao.save(invoiceTwo);

        itemDao.save(item);
        itemDao.save(itemTwo);

        itemDao.save(itemThree);
        itemDao.save(itemFour);
        itemDao.save(itemFive);

        Invoice result = invoiceDao.findOne(invoice.getId());

        Invoice resultTwo = invoiceDao.findOne(invoiceTwo.getId());

        Assert.assertNotNull(result);
        Assert.assertNotNull(resultTwo);

        Assert.assertEquals(2, result.getItems().size());
        Assert.assertEquals(3, resultTwo.getItems().size());

    }

}
