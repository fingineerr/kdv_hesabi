import java.util.Scanner;
public class kdv_hesabi {
    public static void main(String[] args) {
        double tutar,kdvOran ;
        Scanner input= new Scanner(System.in); //klavyeden alma fonksiyonu
        System.out.print ("ücret Tutarını giriniz: ");
        tutar =input.nextDouble();//klavyeden girilecek değerin sonuna nokta iki sıfırı koyar.değer girdirmek istewnen satır.
        if  (tutar>0 && tutar <1000){
            kdvOran=0.18;
        double kdvTutar =tutar*kdvOran;
        double kdvlifiyat=tutar+kdvTutar;
        System.out.print ("kdvsizfiyat: "+tutar);
        System.out.print ("\n kdvlifiyat: "+kdvlifiyat);
        System.out.print ("\n kdvlifiyat: "+kdvTutar);
            }
        else {
            kdvOran=0.08;
            double kdvTutar =tutar*kdvOran;
            double kdvlifiyat=tutar+kdvTutar;
            System.out.print ("kdvsizfiyat: "+tutar);
            System.out.print ("\n kdvlifiyat: "+kdvlifiyat);
            System.out.print ("\n kdvtutarı: "+kdvTutar);
        }


    }
}
