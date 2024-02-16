/*
Bismillah Saya Themy Sabri Syuhada dengan NIM 2203903.
Demi keberkahan-Nya, saya berjanji mengerjakan
latihan praktikum 2 DPBO dengan jujur dan
tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Aplikasi untuk Mengelola Produk Busana");
        System.out.println("Masukkan berapa banyak item yang akan ditambahkan:");

        int input;

        input = scanner.nextInt();

        // Input data dari pengguna
        for (int i = 0; i < input; i++) {
            System.out.println("Masukan detail produk " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Membuang karakter newline

            System.out.print("Size: ");
            String size = scanner.nextLine();
            System.out.print("Material: ");
            String material = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Sleeve Type: ");
            String sleeveType = scanner.nextLine();

            products.add(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
        }

        // Menentukan lebar kolom header untuk menyesuaikan data terpanjang
        int[] columnWidths = new int[9];
        columnWidths[0] = "Product".length();
        columnWidths[1] = "Name".length();
        columnWidths[2] = "Brand".length();
        columnWidths[3] = "Price".length();
        columnWidths[4] = "Size".length();
        columnWidths[5] = "Material".length();
        columnWidths[6] = "Gender".length();
        columnWidths[7] = "Color".length();
        columnWidths[8] = "Sleeve Type".length();

        for (Product product : products) {
            if (columnWidths[0] < String.valueOf(product.idProduct).length()) {
                columnWidths[0] = String.valueOf(product.idProduct).length();
            }
            if (columnWidths[1] < product.name.length()) {
                columnWidths[1] = product.name.length();
            }
            if (columnWidths[2] < product.brand.length()) {
                columnWidths[2] = product.brand.length();
            }
            if (columnWidths[3] < String.valueOf(product.price).length() + 3) {
                columnWidths[3] = String.valueOf(product.price).length() + 3;
            }

            if (product instanceof Clothing) {
                Clothing clothing = (Clothing) product;
                if (columnWidths[4] < clothing.size.length()) {
                    columnWidths[4] = clothing.size.length();
                }
                if (columnWidths[5] < clothing.material.length()) {
                    columnWidths[5] = clothing.material.length();
                }
                if (columnWidths[6] < clothing.gender.length()) {
                    columnWidths[6] = clothing.gender.length();
                }

                if (product instanceof Shirt) {
                    Shirt shirt = (Shirt) product;
                    if (columnWidths[7] < shirt.color.length()) {
                        columnWidths[7] = shirt.color.length();
                    }
                    if (columnWidths[8] < shirt.sleeveType.length()) {
                        columnWidths[8] = shirt.sleeveType.length();
                    }
                }
            }
        }

        // Tampilkan header tabel dengan lebar kolom yang disesuaikan
        System.out.print("+");
        for (int width : columnWidths) {
            for (int i = 0; i < width + 2; i++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();

        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[0] + 1) + "s", "Product");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[1] + 1) + "s", "Name");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[2] + 1) + "s", "Brand");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[3] + 1) + "s", "Price");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[4] + 1) + "s", "Size");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[5] + 1) + "s", "Material");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[6] + 1) + "s", "Gender");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[7] + 1) + "s", "Color");
        System.out.print("|");
        System.out.printf(" %-" + (columnWidths[8] + 1) + "s", "Sleeve Type");
        System.out.print("|");
        System.out.println();

        // Tampilkan garis pembatas antara header dan data
        System.out.print("+");
        for (int width : columnWidths) {
            for (int i = 0; i < width + 2; i++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();

        // Tampilkan data dalam bentuk tabel dengan lebar kolom yang disesuaikan
        for (Product product : products) {
            System.out.print("|");
            System.out.printf(" %-" + (columnWidths[0] + 1) + "d", product.idProduct);
            System.out.print("|");
            System.out.printf(" %-" + (columnWidths[1] + 1) + "s", product.name);
            System.out.print("|");
            System.out.printf(" %-" + (columnWidths[2] + 1) + "s", product.brand);
            System.out.print("|");
            System.out.printf(" %-" + (columnWidths[3] + 1) + ".2f", product.price);
            System.out.print("|");

            if (product instanceof Clothing) {
                Clothing clothing = (Clothing) product;
                System.out.printf(" %-" + (columnWidths[4] + 1) + "s", clothing.size);
                System.out.print("|");
                System.out.printf(" %-" + (columnWidths[5] + 1) + "s", clothing.material);
                System.out.print("|");
                System.out.printf(" %-" + (columnWidths[6] + 1) + "s", clothing.gender);
                System.out.print("|");

                if (product instanceof Shirt) {
                    Shirt shirt = (Shirt) product;
                    System.out.printf(" %-" + (columnWidths[7] + 1) + "s", shirt.color);
                    System.out.print("|");
                    System.out.printf(" %-" + (columnWidths[8] + 1) + "s", shirt.sleeveType);
                    System.out.print("|");
                }
            }

            System.out.println();
        }

        // Tampilkan garis pembatas akhir tabel
        System.out.print("+");
        for (int width : columnWidths) {
            for (int i = 0; i < width + 2; i++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();

        // Tutup scanner
        scanner.close();
    }

}