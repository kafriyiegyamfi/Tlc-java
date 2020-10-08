package objectandclasses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
class TradeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getQuantity() {
    }
    @Test
    void trade_can_construct() {


        objectandclasses.Trade t1 = new objectandclasses.Trade("t1", "TTBL", 6, 23.60);

        assertTrue (t1 instanceof objectanndclasses.Trade);



    }

    @Test
    void setQuantity() {
    }

    @Test
    void getID() {
    }

    @Test
    void setID() {
    }

    @Test
    void getSymbol() {
    }

    @Test
    void setSymbol() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }
}