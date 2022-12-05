package entity.Card;

import entity.Card.Card;

/**
 * Implementation of the card Dodge which allows the source player to dodge a shoot card
 */
public class Dodge extends Card {
    @Override
    public boolean needTarget() {
        return false;
    }

    @Override
    public void use(){}
    @Override
    public String toString(){
        return "Dodge";
    }
}
