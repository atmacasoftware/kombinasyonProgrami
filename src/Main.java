import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, n_faktoriyel = 1, r_faktoriyel = 1, n_r_faktoriyel = 1, kombinasyon;

        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin elaman sayısını giriniz : ");
        n = input.nextInt();

        System.out.print("Oluşturulacak grup sayısını giriniz : ");
        r = input.nextInt();

        if (r<n){
            System.out.println("Hatalı değer girdiniz.");
        }else{
            for(int i = 1; i<=n; i++){
                n_faktoriyel = n_faktoriyel * i;
            }

            for(int i = 1; i<=r; i++){
                r_faktoriyel = r_faktoriyel * i;
            }

            for(int i = 1; i<=n-r; i++){
                n_r_faktoriyel = n_r_faktoriyel * i;
            }

            System.out.println(n_faktoriyel);
            System.out.println(r_faktoriyel);
            System.out.println(n_r_faktoriyel);

            kombinasyon = n_faktoriyel / (n_r_faktoriyel * r_faktoriyel);
            System.out.println(n + "'in '" + r + "'li kombinasyonu : " + kombinasyon);
        }

    }
}