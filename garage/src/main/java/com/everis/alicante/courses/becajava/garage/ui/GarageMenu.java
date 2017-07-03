package com.everis.alicante.courses.becajava.garage.ui;

import java.util.Scanner;

public class GarageMenu {

    private final String insertTheOptionYouWant = "Insert the option you want?";
    private final String separator = "************************************************************";

    private static GarageMenu garageMenu;

    public static GarageMenu getInstance() {
        if (garageMenu == null) {
            garageMenu = new GarageMenu();
        }
        return garageMenu;
    }

    private GarageMenu() {
    }

    public void start() {
        int mainOption = GarageMenu.getInstance().getMainOption();
        if (mainOption != 0) {
            int submenuOption = GarageMenu.getInstance().getSubmenuOption(mainOption);
            if (submenuOption == 0) {
                this.start();
            }
        }
    }

    private int getMainOption() {
        GarageMenu.getInstance().printMainMenu();
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i < 0 || i > 3) {
            this.printError();
            return this.getMainOption();
        }
        return i;
    }

    private int getSubmenuOption(int option) {
        GarageMenu.getInstance().printSubMenu(option);
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i < 0 || i > 3) {
            this.printError();
            return this.getSubmenuOption(option);
        }
        return i;
    }

    private void printMainMenu() {
        this.clearScreen();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(separator).append("\n");
        stringBuilder.append("MAIN MENU").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append("1. Clients").append("\n");
        stringBuilder.append("2. Vehicles").append("\n");
        stringBuilder.append("3. Booking").append("\n");
        stringBuilder.append("0. Exit").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append(insertTheOptionYouWant).append("\n");
        System.out.println(stringBuilder.toString());
    }

    private void printError() {
        System.out.println("ERROR!!");
    }

    private void printSubMenu(int option) {
        switch (option) {
            case 1:
                printClientMenu();
                break;
            case 2:
                printVehicleMenu();
                break;
            case 3:
                printBookingMenu();
                break;
            default:
                printError();
                break;
        }
    }

    private void printClientMenu() {
        this.printSubMenu("CLIENT");
    }

    private void printVehicleMenu() {
        this.printSubMenu("VEHICLE");
    }

    private void printBookingMenu() {
        this.printSubMenu("BOOKING");
    }

    private void clearScreen() {
//        try {
//            Runtime.getRuntime().exec("cls");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    private void printSubMenu(final String subMenu) {
        this.clearScreen();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(separator).append("\n");
        stringBuilder.append(subMenu.toUpperCase()).append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append("1. List").append("\n");
        stringBuilder.append("2. New").append("\n");
        stringBuilder.append("3. Delete").append("\n");
        stringBuilder.append("0. Out").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append(insertTheOptionYouWant).append("\n");
        System.out.println(stringBuilder.toString());
    }

}
