package com.elemica.supply.chain.assign07;

public class Item {
    private String item;
    private int itemNo;
    private String itemCode;
    private int itemQty;
    private long  price;

    public Item(String item, int itemNo, long price, String itemCode, int itemQty) {
        this.item = item;
        this.itemNo = itemNo;
        this.itemCode = itemCode;
        this.itemQty = itemQty;
        this.price=price;
    }

    public int getItemNo() {
        return itemNo;
    }
    public int getItQty() {
    	return itemQty;
    }
    public long getPrice() {
    	return price;
    }
    public String getItemName() {
        return item;
    }
    public String getItemCode() {
        return itemCode;
    }

    @Override
    public String toString() {
        return "Item: " + item + ", Item No: " + itemNo + ", Code: " + itemCode + ", Qty: " + itemQty;
    }
}

