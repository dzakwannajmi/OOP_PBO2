package com.mycompany.tugas02;

public class Main {
    public static void main(String[] args) {

        // CREATE: Object using default constructor
        SepedaMotor motor1 = new SepedaMotor();

        // CREATE: Object using parameterized constructor
        SepedaMotor motor2 = new SepedaMotor("Kawasaki", "KLX 150", 150);

        // READ: Display object data
        System.out.println("--- Object 1 ---");
        motor1.tampilkanInfo();

        System.out.println("\n--- Object 2 ---");
        motor2.tampilkanInfo();

        // Method with return value
        System.out.println("Estimated Tax: Rp" + motor2.hitungEstimasiPajak());
    }
}