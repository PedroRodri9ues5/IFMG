import java.util.ArrayList;

public class Player {

    private ArrayList<Item> bag; // cria a Bag
    private byte health = 100;          // cria o hp com valor inicial de 100

    public Player() {
    }

    public byte getHp() {
        return health;              //retorna valor de health
    }

    public void addHp(byte hpToAdd) {
        this.health += hpToAdd;     // aumenta valor de hp
    }

    public void removeHp(byte hpToRemove){
        this.health -= hpToRemove;  // subtrai valor de hp
    }

    public int bagSize(){
        return bag.size();
    }

    public void addItemToBag(Item itemToAdd){
        bag.add(itemToAdd);    // adiciona um item a bag.
    }

    public void removeBagItem(Integer key){
        bag.remove(key);             // remove um item da bag a partir  de sua chave.
    }

    public Item getBagItens(Integer key){
        return bag.get(key);         // retorna um item a partir de sua chave.
    }
}
