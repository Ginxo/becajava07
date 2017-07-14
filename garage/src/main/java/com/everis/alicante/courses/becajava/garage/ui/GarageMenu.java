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

    public String play() {
        final StringBuilder option = new StringBuilder(GarageMenu.getInstance().getMainOption());
        if (!"0".equals(option.toString())) {
            final String submenuOption = GarageMenu.getInstance().getSubmenuOption(option.toString());
            if ("0".equals(submenuOption)) {
                this.play();
            } else{
                return option.append(".").append(submenuOption).toString();
            }
        }
        return option.toString();
    }

    private String getMainOption() {
        GarageMenu.getInstance().printMainMenu();
        Scanner in = new Scanner(System.in);
        Integer mainOption = in.nextInt();
        if (mainOption < 0 || mainOption > 3) {
            this.printError();
            return this.getMainOption();
        }
        return mainOption.toString();
    }

    private String getSubmenuOption(final String mainOption) {
        GarageMenu.getInstance().buildSubMenu(mainOption);
        Scanner in = new Scanner(System.in);
        Integer subMenuOption = in.nextInt();
        if (subMenuOption < 0 || subMenuOption > 4) {
            this.printError();
            return this.getSubmenuOption(mainOption);
        }
        return subMenuOption.toString();
    }

    private void printMainMenu() {
        this.clearScreen();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(separator).append("\n");
        stringBuilder.append("MAIN MENU").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append("1. Cars").append("\n");
        stringBuilder.append("2. Motor Bikes").append("\n");
        stringBuilder.append("3. Bicycles").append("\n");
        stringBuilder.append("0. Exit").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append(insertTheOptionYouWant).append("\n");
        System.out.println(stringBuilder.toString());
    }

    private void printError() {
        System.out.println("ERROR!!");
    }

    private void buildSubMenu(final String subMenu) {
        switch (subMenu) {
            case "1":
                printClientMenu();
                break;
            case "2":
                printVehicleMenu();
                break;
            case "3":
                printBookingMenu();
                break;
            default:
                printError();
                break;
        }
    }

    private void printClientMenu() {
        this.printSubMenu("CARS");
    }

    private void printVehicleMenu() {
        this.printSubMenu("MOTOR BIKES");
    }

    private void printBookingMenu() {
        this.printSubMenu("BiCYCLES");
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
        stringBuilder.append("4. Get").append("\n");
        stringBuilder.append("0. Out").append("\n");
        stringBuilder.append(separator).append("\n");
        stringBuilder.append(insertTheOptionYouWant).append("\n");
        System.out.println(stringBuilder.toString());
    }

}
