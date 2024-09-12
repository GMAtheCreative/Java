package Geography;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeopoliticalZonesTest {
    @Test
    public void testPoliticalZonesExists() {
        PoliticalZone politicalZones = new PoliticalZone();
        String expectedState = "Benue, FCT, Kogi, Kwara, Nasarawa, Niger, Plateau.";
        assertEquals(expectedState, politicalZones.getStates(GeoPoliticalZone.North_Central));
    }



}
