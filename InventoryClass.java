package com.elemica.supply.chain.assign07;

public class InventoryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Inventory inventory = new Inventory();

	        inventory.addItem("Laptop", 102, 50000, "LT102", 10);
	        inventory.addItem("Mouse", 101, 350, "MS101", 50);
	        inventory.addItem("Keyboard", 103, 500, "KB103", 20);
	        inventory.addItem("Monitor", 101, 15000, "MN101", 15);  // Duplicate itemNo - should be skipped

	        System.out.println("Original List:");
	        inventory.displayItems();
            
	        // Printing in ascending order
	        System.out.println("\nSorted Ascending by Item No. :");
	        inventory.sortAscendingByItemNo();
	        inventory.displayItems();
	        
            // Printing in Descending order
	        System.out.println("\nSorted Descending by Item No. :");
	        inventory.sortDescendingByItemNo();
	        inventory.displayItems();
	        
	        // Printing in ascending order
	        System.out.println("\nSorted Ascending by Price. :");
	        inventory.sortAscendingByPrice();
	        inventory.displayItems();
	        
            // Printing in Descending order
	        System.out.println("\nSorted Descending by Price. :");
	        inventory.sortDescendingByPrice();
	        inventory.displayItems();


	}

}
