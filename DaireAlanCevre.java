package Hesaplamalar;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        int r,a;
        double pi=3.14,alan,cevre,daireDilimi;

        Scanner input= new Scanner(System.in);
        System.out.println("Yaricapi Giriniz : ");
        r= input.nextInt();
        System.out.println("Merkez Aci Olcusunu Giriniz : ");
        a=input.nextInt();

        cevre=(2*pi*r);
        alan=(pi*r*r);
        daireDilimi=(pi * (r*r) * a) / 360;

        System.out.println("Dairenin Cevresi : "+cevre);
        System.out.println("Dairenin Alani : "+ alan);
        System.out.println("Daire Diliminin Alani : "+ daireDilimi);

    }
}
