package com.chohee;

import com.chohee.desserts.Dessert;
import com.chohee.qualifiers.Cold;
import com.chohee.qualifiers.Creamy;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Chohee on 8/28/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertShopTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    @Creamy
    @Cold
    private Dessert dessert;

    @Autowired
    private DessertShop dessertShop;

    @Test
    public void DessertShouldNotBeNull() {
        assertNotNull(dessert);
    }

    @Test
    public void DessertShopShouldNotBeNull() {
        assertNotNull(dessertShop);
    }

    @Test
    public void dessertName() {
        dessert.getName();
        assertEquals("IceCream\n", log.getLog());
    }

    @Test
    public void dessertStoreOrder() {
        dessertShop.confirmOrder();
        assertEquals("You have ordered IceCream\n", log.getLog());
    }
}
