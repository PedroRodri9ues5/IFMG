
import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Room
{
    private final String description;
    private final HashMap<String, Room> exits;        // stores exits of this room.
    private HashMap<Integer, Item> items;  // armazena os itens.
    private Integer mapInt = 0;

    public void addItems(Item item){
        items.put(mapInt, item);    // adiciona o item à lista de items com a próxima chave.
        mapInt++;

    }

    public HashMap<Integer, Item> getItems() {
        return items;
    }

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        items = new HashMap<Integer, Item>();
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public void getLongDescription()
    {
        System.out.println("Você está no(a) " + description);

        if (items.isEmpty()){
            System.out.println("No items in the room");

        }else if (getItems().size() > 1){
            System.out.println("Items in the room: ");
            for (int i = 0; i < items.size(); i++) {

                System.out.println((i+1) + ") " + items.get(i).getItemName());
            }
        }else if (items.size() == 1){
            System.out.println("Item in the room: ");
            System.out.println(items.get(0).getItemName());
        }

        System.out.println(getExitString());
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }

    public Boolean isTheSame(Room toCompare){
        if (this.description.equals(toCompare.description)){
            return true;
        }else return false;
    }
}

