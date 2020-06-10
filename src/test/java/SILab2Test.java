import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {

    private final SILab2 SI = new SILab2();

    @Test
    void EveryStatementTest() {
        assertTrue(SI.function(new User("vdedejski", "?", "vdedejski@gmail.com"), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", "vdedejski@gmail.com"), Collections.singletonList("vdedejski")));
    }

    @Test
    void EveryPathTest() {
        assertFalse(SI.function(new User(null, null, null), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", null), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", ""), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", "vdedejskigmail"), new ArrayList<>()));
        assertTrue(SI.function(new User("vdedejski", "?", "vdedejski@gmail.com"), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", "vdedejski@gmailcom"), new ArrayList<>()));
        assertFalse(SI.function(new User("vdedejski", "?", "vdedejski#gmail.com"), new ArrayList<>()));
    }
}
