package pl.samouczekprogramisty.ćwiczenia.metody;

public class Metody {
    public static void main(String[] args) {
        System.out.println(wiek());
        System.out.println(imię());
        System.out.println(działania(9,4));
        System.out.println(czyParzysta(58));
        System.out.println(czyPodzielna(30,3*5));
        System.out.println(czyPodzielna2(49));
        System.out.println(sześcianLiczby(5,3));
        System.out.println(pierwiastekKwadratowy(6));
        System.out.println(trójkąt(3,5,5));
    }

    public static int wiek(){
        return 28;
    }

    public static String imię(){
        return "Beata";
    }

    public static String działania(int a, int b){
        int suma = a+b;
        int różnica = a-b;
        int iloczyn = a*b;
        return "Suma, różnica i iloczyn liczb "+a + " i " + b + " wynoszą odpowiednio "+suma +", "+różnica+", "+iloczyn+".";
    }

    public static boolean czyParzysta (int a){
        return a%2==0;
        //return Math.multiplyExact(a,2)==0;
    }

    public static boolean czyPodzielna(int a, int b){
        return a % b == 0;
    }

    public static boolean czyPodzielna2(int a){
        return a % 3 == 0 && a % 5 == 0;
    }

    public static double sześcianLiczby(double a, double b){
        return Math.pow(a,b);
    }

    public static double pierwiastekKwadratowy(double a){
        return Math.sqrt(a);
    }

    public static boolean trójkąt(int a, int b, int c) {
        int maksimum = Math.max(Math.max(a, b), c);
        if (a < 0 || b < 0 || c < 0) {
            return false;
        } else {
            if (a == maksimum && maksimum>b && maksimum > c) {
                return Math.pow(maksimum, 2) == Math.pow(b, 2) + Math.pow(c, 2);
            } else {
                if (b == maksimum && maksimum>a && maksimum > c) {
                    return Math.pow(maksimum, 2) == Math.pow(a, 2) + Math.pow(c, 2);
                } else {
                    if (c == maksimum && maksimum>a && maksimum > b) {
                        return Math.pow(maksimum, 2) == Math.pow(b, 2) + Math.pow(a, 2);
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
