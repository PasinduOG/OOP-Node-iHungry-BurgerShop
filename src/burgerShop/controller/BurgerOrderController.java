package burgerShop.controller;

import burgerShop.model.BurgerList;
import burgerShop.model.BurgerOrder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BurgerOrderController {
    
    public static final int BURGER_PRICE=500;
    public static final int CANCEL=0;
    public static final int PREPARING=1;
    public static final int DELIVERED=2;

    public static String generateOrderId() {
        try {
            File file = new File("BurgerOrders.txt");
            
            if(!file.exists()){
                file.createNewFile();
                return "B0001";
            }
            
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            String line = br.readLine();
            String lastLine = null;
            while (line != null) {
                lastLine = line;
                line = br.readLine();
            }
            if (lastLine == null) {
                return "B0001";
            }
            return String.format("B%04d", Integer.parseInt(lastLine.substring(1, 5)) + 1);
        } catch (IOException e) {
        }
        return null;
    }

    public static String getStatusNameById(int statusId) {
        return statusId == CANCEL ? "Cancelled"
                : statusId == PREPARING ? "Processing"
                        : statusId == DELIVERED ? "Delivered" : null;

    }

    public static boolean isValidPhoneNumber(String id) {
        if (id.length() != 10) {
            return false;
        }
        if (id.charAt(0) != '0') {
            return false;
        }
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isDuplicateCustomer(String id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            String line = br.readLine();

            while (line != null) {
                String[] rowData = line.split(",");
                if (id.equalsIgnoreCase(rowData[1])) {
                    return true;
                }
                line = br.readLine();
            }
        } catch (IOException e) {
        }
        return false;
    }

    public static String getDuplicateCustomerName(String id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            String line = br.readLine();

            while (line != null) {
                String[] rowData = line.split(",");
                if (id.equalsIgnoreCase(rowData[1])) {
                    return rowData[2];
                }
                line = br.readLine();
            }
        } catch (IOException e) {
        }
        return null;
    }

    public static BurgerOrder searchBurgerOrder(String orderId) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            String line = br.readLine();

            while (line != null) {
                String[] rowData = line.split(",");
                if (orderId.equalsIgnoreCase(rowData[0])) {
                    return new BurgerOrder(rowData[0], rowData[1], rowData[2], Integer.parseInt(rowData[3]), Integer.parseInt(rowData[4]));
                }
                line = br.readLine();
            }
        } catch (IOException ex) {
        }
        return null;
    }

    public static boolean placeOrder(BurgerOrder burgerOrder) {
        try {
            FileWriter fw = new FileWriter("BurgerOrders.txt", true);
            fw.write(burgerOrder.toString() + "\n");
            fw.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }

    public static boolean updateOrder(BurgerOrder burgerOrder) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            BurgerList burgerList = new BurgerList();
            String line=br.readLine();
            while(line!=null){
                String[] rowData = line.split(",");
                burgerList.add(new BurgerOrder(rowData[0],rowData[1],rowData[2],Integer.parseInt(rowData[3]),Integer.parseInt(rowData[4])));
                line = br.readLine();
            }
            if(burgerList.set(burgerOrder)){
                FileWriter fw = new FileWriter("BurgerOrders.txt");
                for(int i=0; i<burgerList.size(); i++){
                    fw.write(burgerList.get(i).toString()+"\n");
                    fw.flush();
                }
                fw.close();
                return true;
            }
        } catch (IOException e) {
        }
        return false;
    }
    
    public static boolean search(BurgerOrder[] burgerOrders, String customerId){
        for(int i=0; i<burgerOrders.length; i++){
            if(burgerOrders[i].getCustomerId().equals(customerId)){
                return true;
            }
        }
        return false;
    }
    
    public static BurgerList loadAllOrders(){
        BurgerList burgerList = new BurgerList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("BurgerOrders.txt"));
            String line = br.readLine();
            while(line!=null){
                String[] rowData = line.split(",");
                burgerList.add(new BurgerOrder(rowData[0],rowData[1],rowData[2],Integer.parseInt(rowData[3]),Integer.parseInt(rowData[4])));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
        }
        return burgerList;
    }
}
