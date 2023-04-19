package tasks.grocery;
//1.addGroceryItem
//2.printGroceryItem
//3.removeGroceryItem
//4.modifyGroceryItem
//5.searchItem

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item) {
      groceryList.add(item);
}

    public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items in your grocery list");
    for (int i=0; i < groceryList.size(); i++) {
        System.out.println((i+1) + ". " + groceryList.get(i));
    }
}

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position>=0){
        groceryList.remove(position);
        System.out.println(item + " was deleted");}
        else {
            System.out.println("Item is not in the list");
        }

    }
    public void modifyGroceryItem(int position, String newItem){
        if(position>=0 && position<groceryList.size()){
            groceryList.set(position,newItem);
            System.out.println( " Grocery item was modified");}
        else {
            System.out.println("Items position is not valid");
        }
    }

    public boolean searchItem(String searchItem){
        return findItem(searchItem)>=0;
    }

    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
}
