package entity;

public class Dodge extends basic_card{
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
