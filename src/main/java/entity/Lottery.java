package entity;

import gateway.CardsHeap;

import static gateway.CardsHeap.draw;

public class Lottery extends strategy_card{
    @Override
    public boolean needTarget() {
        return false;
    }

    public void use(){
        getSource().addToHand(draw(2));
    }

    @Override
    public String toString() {
        return "Lottery";
    }
}
