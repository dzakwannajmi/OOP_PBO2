package com.mycompany.tugas02;
/**
 * Class representing a Motorcycle object.
 * This class demonstrates basic OOP concepts:
 * - Attributes (fields)
 * - Constructors
 * - Methods (void and return type)
 */
public class SepedaMotor {

    // Attributes (instance variables)
    private String merk;
    private String tipe;
    private int cc;

    /**
     * Default constructor
     * Initializes object with default values
     */
    public SepedaMotor() {
        this.merk = "Not Set";
        this.tipe = "General";
        this.cc = 0;
    }

    /**
     * Parameterized constructor
     * @param merk Motorcycle brand
     * @param tipe Motorcycle type/model
     * @param cc Engine capacity (cc)
     */
    public SepedaMotor(String merk, String tipe, int cc) {
        this.merk = merk;
        this.tipe = tipe;
        this.cc = cc;
    }

    /**
     * Method to display motorcycle information (READ)
     */
    public void tampilkanInfo() {
        System.out.println("Motorcycle Details: " + merk + " " + tipe + " (" + cc + "cc)");
    }

    /**
     * Method to calculate estimated annual tax
     * @return estimated tax value
     */
    public double hitungEstimasiPajak() {
        return cc * 500.0;
    }

    // Optional Setter (for UPDATE concept)
    public void setMerk(String merk) {
        this.merk = merk;
    }
}