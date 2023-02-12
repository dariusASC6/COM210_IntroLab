

package com.mycompany.com210_lab1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 *
 * @author darius
 */
public class Com210_Lab1 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#, ##0.00");
        
        String item1 = JOptionPane.showInputDialog("What is the name of your first item?");
        String nprice1 = JOptionPane.showInputDialog("What is the price of your first item?");
        double price1 = Integer.parseInt(nprice1);
        
        String item2 = JOptionPane.showInputDialog("What is the name of your second item?");
        String nprice2 = JOptionPane.showInputDialog("What is the price of your second item?");
        double price2 = Integer.parseInt(nprice2);
        
        String item3 = JOptionPane.showInputDialog("What is the name of your third item?");
        String nprice3 = JOptionPane.showInputDialog("What is the price of your third item?");
        double price3 = Integer.parseInt(nprice3);
        
        double average = (price1 + price2 + price3) / 3;
        
        JOptionPane.showMessageDialog(null, "Your three items include 1 " + 
                item1 + ", 1 " + item2 + ", and 1 " + item3 + ". \n"
                + "The average price for these items is $" + df.format(average) + ".");
        
        
        //Question 2
        
        String item11 = JOptionPane.showInputDialog("What is the name of your first item?");
        String nprice11 = JOptionPane.showInputDialog("What is the price of your first item?");
        double price11 = Integer.parseInt(nprice11);
        
        String item22 = JOptionPane.showInputDialog("What is the name of your second item?");
        String nprice22 = JOptionPane.showInputDialog("What is the price of your second item?");
        double price22 = Integer.parseInt(nprice22);
        
        String item33 = JOptionPane.showInputDialog("What is the name of your third item?");
        String nprice33 = JOptionPane.showInputDialog("What is the price of your third item?");
        double price33 = Integer.parseInt(nprice33);
        
        double average2 = (price1 + price2 + price3) / 3;
       
        
        
        
        if(item11.equalsIgnoreCase("Peas")){
            JOptionPane.showMessageDialog(null, "Your three items include 1 "
                    + item11 + ", 1 " + item22 + ", and 1 " + item33 + ". \n"
                    + "The average price for these items is $" + df.format(average2) + ".");
            
        }
        
        else if(item22.equalsIgnoreCase("Peas")){
            JOptionPane.showMessageDialog(null, "Your three items include 1 "
                    + item11 + ", 1 " + item22 + ", and 1 " + item33 + ". \n"
                    + "The average price for these items is $" + df.format(average2) + ".");
            
        }
        
        else if(item33.equalsIgnoreCase("Peas")){
            JOptionPane.showMessageDialog(null, "Your three items include 1 "
                    + item11 + ", 1 " + item22 + ", and 1 " + item33 + ". \n"
                    + "The average price for these items is $" + df.format(average2) + ".");
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "No average output");
        }
        
        
        //Question 3
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numOfItems = input.nextInt();
        String[] items = new String[numOfItems];
        double[] prices = new double[numOfItems];
        double total = 0;
        int peasIndex = -1;
        for (int i = 0; i < numOfItems; i++) {
            System.out.print("Enter item name: ");
            items[i] = input.next();
            System.out.print("Enter item price: ");
            prices[i] = input.nextDouble();
            if (items[i].equalsIgnoreCase("peas")) {
                peasIndex = i;
            }
            total += prices[i];
        }
        if (peasIndex == -1) {
            System.out.println("no average output");
        } else {
            System.out.println("Average price: " + (total / numOfItems));
        }
        System.out.println("Items in reverse order: ");
        for (int i = numOfItems - 1; i >= 0; i--) {
            System.out.println(items[i] + ": " + prices[i]);
        }
        input.close();

        
        
        
    }
}
