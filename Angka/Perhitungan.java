package Angka;

public class Perhitungan implements angka{
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int a , int b , int hasil){
        this.a = a;
        this.b = b;
        this.hasil = hasil;
    }
    public void penjumlahan(){
        this.hasil = this.a + this.b;
    }
    public void pengurangan(){
        this.hasil = this.a - this.b;
    }
    public void perkalian(){
        this.hasil = this.a * this.b;
    }
    public void pembagian(){
        this.hasil = this.a / this.b;
    }
    public int hitungjumlah(int a,int b){
        this.a = a;
        this.b = b;
        penjumlahan();
        return this.hasil;
    }
    public int hitungkurang(int a,int b){
        this.a = a;
        this.b = b;
        pengurangan();
        return this.hasil;
    }
    public int hitungkali(int a,int b){
        this.a = a;
        this.b = b;
        perkalian();
        return this.hasil;
    }
    public int hitungbagi(int a,int b){
        this.a = a;
        this.b = b;
        pembagian();
        return this.hasil;
    }
}
