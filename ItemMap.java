package com.cdl.supermarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemMap {
    private Map<Character,Double> itemMap = new HashMap<>();


    public Map<Character, Double> getItemMap() {
        return itemMap;
    }

    public  void setItemMap(Map<Character, Double> itemMap) {
        shoppingItemsAndPrices(itemMap);
        itemMap.put('A',50.0);
        itemMap.put('B',30.0);
        itemMap.put('C',20.0);
        itemMap.put('D',15.0);
        this.itemMap = itemMap;

    }

    public Map<Character,Double> shoppingItemsAndPrices(Map<Character, Double> itemMap){
        itemMap.put('A',50.0);
        itemMap.put('B',30.0);
        itemMap.put('C',20.0);
        itemMap.put('D',15.0);
        return itemMap;
    }

    public void checkout(){
        Scanner scanner = new Scanner(System.in);
        double itemTotal = 0.0;
        int itemCountForA = 0;
        int itemCountForB = 0;
        int itemCountForC = 0;
        int itemCountForD = 0;
        System.out.println("How many items would you like: ");
        int numberOfItems = scanner.nextInt();
        double []items;
        items = new double[numberOfItems];
        for(int i =0; i<items.length; i++){
            System.out.println("Please enter item : ");
            char input = scanner. next().charAt(0);
            if (input == 'A'){
                itemTotal = itemTotal + itemMap.get('A');
                System.out.println("running total = "  + itemTotal);
                itemCountForA++;
                itemTotal = buyThreeAsFor130(itemCountForA,itemTotal);

            } else if(input == 'B'){
                itemTotal = itemTotal + itemMap.get('B');
                System.out.println("running total = "  + itemTotal);
                itemCountForB++;
                itemTotal = buyTwoBsFor45(itemCountForB,itemTotal);


            }else if(input == 'C'){
                itemTotal = itemTotal + itemMap.get('C');
                System.out.println("running total = "  + itemTotal);
                itemCountForC++;

            }else if(input == 'D'){
                itemTotal = itemTotal + itemMap.get('D');
                System.out.println("running total = "  + itemTotal);
                itemCountForD++;
            }else{
                System.out.println("Please select A, B, C, D");
                while (input!='A' && input!='B' && input!='C' && input!='D') {
                    System.out.println("Please select item from [A, B, C, D]");
                    input = scanner. next().charAt(0);
                }
            }

        }
        printReceipt(itemCountForA, itemCountForB, itemCountForC, itemCountForD, itemTotal);

    }

    private double buyThreeAsFor130(double itemCount, double itemTotal) {
        if(itemCount == 3 && itemTotal ==150){
            return itemTotal - 20;
        }
        return itemTotal;
    }

    private double buyTwoBsFor45(double itemCount, double itemTotal) {
        if(itemCount == 2 && itemTotal ==60){
            return itemTotal - 15;
        }
        return itemTotal;
    }

    private void printReceipt(int itemCountForA,int itemCountForB,int itemCountForC,int itemCountForD, double itemTotal){
        System.out.println(String.format("number of A: %d, number of B: %d,number of C: %d,number of D: %d ",itemCountForA, itemCountForB,itemCountForC,itemCountForD));
        System.out.println("TOTAL PRICE = " + itemTotal);
        System.out.println("THANKS FOR SHOPPING");
    }

}
