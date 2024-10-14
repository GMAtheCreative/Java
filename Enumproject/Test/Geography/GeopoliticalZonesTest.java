package Geography;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeopoliticalZonesTest {
    @Test
    public void testPoliticalZonesExists() {
        GeoPoliticalZone result = GeoPoliticalZone.valueOf("OGUN");
        assertSame(result, GeoPoliticalZone.OGUN);

    }
}
