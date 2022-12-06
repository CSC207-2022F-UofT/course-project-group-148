package entities;

import entity.Card.Medkit;
import entity.Player;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class MedkitTest {
    Medkit card = new Medkit();
    Player noOne = new Player(1);

    @Test
    @DisplayName("Test needTarget")
    public void testNeedTarget(){
        Assertions.assertFalse(card.needTarget());}

    @Test
    @DisplayName("Test use")
    public void testUse(){
        card.setSource(noOne);
        noOne.setHp(2);
        card.use();
        int b = noOne.getHp();
        Assertions.assertEquals(3,b);
    }

    @Test
    @DisplayName("Test toString")
    public void testToString(){
        Assertions.assertEquals("Medkit",card.toString());}
}
