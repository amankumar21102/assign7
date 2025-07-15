package com.elemica.supply.chain.assign07;

import java.util.*;

public class Inventory {
    private List<Item> items;
    private Set<Integer> itemNos;  // to ensure no duplicate itemNo

    public Inventory() {
        items = new ArrayList<>();
        itemNos = new HashSet<>();
    }

    // Add item if itemNo is unique
    public boolean addItem(String item, int itemNo,long price, String itemCode, int itemQty) {
        if (itemNos.contains(itemNo)) {
            System.out.println("Item No " + itemNo + " already exists. Skipping...");
            return false;
        }
        Item newItem = new Item(item, itemNo,price, itemCode, itemQty);
        items.add(newItem);
        itemNos.add(itemNo);
        return true;
    }

    // Display all items
    public void displayItems() {
        for (Item it: items) {
            System.out.println("Price : " + it.getPrice() + " Item : " + it.getItemName()+" ItemNo : " + it.getItemNo() + " Item Code : " + it.getItemCode()+" Item Quantity : " +it.getItQty());
        }
    }

    // Sort ascending by itemNo
    public void sortAscendingByItemNo() {
        items.sort(Comparator.comparingLong(Item::getItemNo));
    }

    // Sort descending by itemNo
    public void sortDescendingByPrice() {
        items.sort(Comparator.comparingInt(Item::getItemNo).reversed());
    }
    public void sortAscendingByPrice() {
        items.sort(Comparator.comparingLong(Item::getPrice));
    }

    // Sort descending by itemNo
    public void sortDescendingByItemNo() {
        items.sort(Comparator.comparingInt(Item::getItemNo).reversed());
    }
}