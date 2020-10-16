/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Tumau {
    private int t;
    private int m;

    public Tumau(int t, int m) {
      this.t = t;
      this.m = m;
    }

    public Tumau() {
        m=1;
    }
    public Tumau(Tumau B) {
        t=B.t;
        m=B.m;
    }

    public int getT() {
        return t;
    }

    public int getM() {
        return m;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setM(int m) {
        this.m = m;
    }
    public void nhapphanso(String thongbao){
       System.out.println(thongbao);
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("nhap tu so: ");
       t = scanner.nextInt();
       
       do{
       System.out.println("nhap mau so:");
       m = scanner.nextInt();
       } while(m==0);
    }
     public void xuat()
    {
        if(t == 0)
            System.out.println("Phan so vua nhap la: 0");
        else if(m == 1)
            System.out.println("Phan so vua nhap la: " + t);
        else
            System.out.println("Phan so vua nhap la: " + t + "/" + m); 
    }  
     public void nghichdao(){
        int a = t;
        int b = m;
        t = b;
        m = a;
    }
    public int USCLN(int a, int b){
        while(a!=b){
            if(a>b){
                a -=b;
            }else{
                b -=a;
            }
        }
        return a;
    }
    public void toiGianPhanSo(){
        int i=USCLN(this.getT(), this.getM());
        this.setT(this.getT() / i);
        this.setM(this.getM() / i);
    }
    public float GiaTriSoThuc(){
        return (float)t / m;
    }
    public void congPhanSo(Tumau p) {
        int ts = (this.getT() * p.getM()) + (p.getT() * this.getM());
        int ms = (this.getM() * p.getM());
        Tumau phanSoTong = new Tumau(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tong hai phân số = " + phanSoTong.t + "/" + phanSoTong.m);
    }
    public void truPhanSo(Tumau p) {
        int ts = this.getT() * p.getM() - p.getT() * this.getM();
        int ms = this.getM() * p.getM();
        Tumau phanSoHieu = new Tumau(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hieu hai phân số = " + phanSoHieu.t + "/" + phanSoHieu.m);
    }
   
    public void nhanPhanSo(Tumau p) {
        int ts = this.getT() * p.getT();
        int ms = this.getM() * p.getM();
        Tumau phanSoTich = new Tumau(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tich hai phân số = " + phanSoTich.t + "/" + phanSoTich.m);
    }
    public void chiaPhanSo(Tumau p) {
        int ts = this.getT() * p.getM();
        int ms = this.getM() * p.getT();
        Tumau phanSoThuong = new Tumau(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Tich hai phân số = " + phanSoThuong.t + "/" + phanSoThuong.m);
    }
}
