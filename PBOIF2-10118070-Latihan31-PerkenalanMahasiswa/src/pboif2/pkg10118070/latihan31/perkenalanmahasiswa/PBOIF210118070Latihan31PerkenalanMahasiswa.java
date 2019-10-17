/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = "10118070";
        mhs.nama = "Aufa Ilyasha";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        
        mhs.perkenalkanDiri();
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
