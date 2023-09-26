import java.util.Scanner;

public class kdvHesap {
    public static void main(String[] args) {
        double miktar, kdvOrani=0.18,kdvCiktisi,kdvliTutar;
        Scanner giris = new Scanner(System.in);
        System.out.print("Ödeyeceğiniz tutarı giriniz: ");
        miktar=giris.nextDouble();
        kdvCiktisi = miktar*kdvOrani;
        kdvliTutar = miktar+kdvCiktisi;
        System.out.print("Kdv Tutarı: %" +kdvCiktisi+"\nKdv'li ödeyeceğiniz Tutar: ₺"+kdvliTutar+"\nKdv'siz Ödeyeceğiniz Tutar: ₺"+miktar);
        }
    }
