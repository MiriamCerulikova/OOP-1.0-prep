import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class GamingPCTest
{

    private GamingPC gamingPC;

    @BeforeEach
    void setUp()
    {
        Motherboard motherboard = new Motherboard(10);
        SSD ssd1 = new SSD(1000, 2000);
        SSD ssd2 = new SSD(500, 1000);

        motherboard.addSSD(ssd1);
        motherboard.addSSD(ssd2);

        gamingPC = new GamingPC(motherboard);
    }

    @Test
    void hasEnoughSpace()
    {
        assertTrue(gamingPC.hasEnoughSpace());
        gamingPC.getMotherboard().getSsds().get(0).setUsedSpace(1950);
        gamingPC.getMotherboard().getSsds().get(1).setUsedSpace(990);

        assertTrue(gamingPC.hasEnoughSpace());
    }
}
