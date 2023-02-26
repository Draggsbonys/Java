package Lesson12_HomeWork.entity;

public class Room {
    private int amountPeople;
    private int costRoom;
    private boolean isFree;

    public Room(int amountPeople, int costRoom, boolean isFree) {
        this.amountPeople = amountPeople;
        this.costRoom = costRoom;
        this.isFree = isFree;
    }
    public int getAmountPeople() {
        return amountPeople;
    }
    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }
    public int getCostRoom() {
        return costRoom;
    }
    public void setCostRoom(int costRoom) {
        this.costRoom = costRoom;
    }
    public boolean getIsFree() {
        return isFree;
    }
    public void setIsFree(boolean free) {
        isFree = free;
    }
}
