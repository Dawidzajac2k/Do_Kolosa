import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Wybiesz zadanie\n\n--- Zajęcia nr 1 ---\n\n1.Podaj imie\n2.Wyświetl zadekarowaną liczbe\n3.Suma dwóch liczb\n4.Kalkulator\n5.Liczby parzyste\n6.Test liczby pierwszej\n\n--- Zajęcia nr 2 ---\n\n7.Choinka\n8.Tekst\n");
    Scanner Scanner_opcja = new Scanner(System.in);
    int opcja = Scanner_opcja.nextInt();
    if(opcja <1 || opcja >10)
      System.out.println("Wybiez poprawna opcje");
      
    else{
    switch(opcja){
//Lab 1 Zad 1 Poddaj Imie 
      case 1:
    System.out.println("Podaj imie :)");
    Scanner scanner_imie = new Scanner(System.in);
    String imie =scanner_imie.nextLine();
    
    System.out.println("Witaj " +imie);
        break;
//Lab 1 zad 2 Wyświelt zadeklarowaną zmeinną 
        case 2:
    System.out.println("\nPodaj liczbe ");
    Scanner scanner_liczba =new Scanner(System.in);
    int liczba = scanner_liczba.nextInt();

    System.out.println(" liczba a="+liczba);
        break;
//Lab 1 zad 3 Suma dwóch liczb
        case 3:
     System.out.println("\nPodaj liczby ktore chcesz dodac:");
        Scanner scanner_suma =new Scanner(System.in);
        double a = scanner_suma.nextDouble();
        double b = scanner_suma.nextDouble();

        double wynik = a+b;
        System.out.println("Otrzymany wynik to:"+wynik);
        break;
//Lab 1 zad 4 Prosty Kalkulator
      case 4:
        Scanner scanner_kalkulator = new Scanner(System.in);
         System.out.println("\nPodaj a oraz b");
            double c = scanner_kalkulator.nextDouble();
            double d = scanner_kalkulator.nextDouble();
          System.out.println("\n Wybierz działanie\n1.Dodawanie (a+b)\n2.Odejmowanie (a-b)\n3.Mnożenie (a*b)\n4.Dzielenie (a/b)\n");
        int dzialanie = scanner_kalkulator.nextInt();
        switch(dzialanie){
          case 1:
          System.out.println("\n**Dodawanie**\n");
         wynik = c+d;
           System.out.println("Otrzymany wynik to:"+wynik); 
          break;   
         case 2:
          System.out.println("\n**Dodawanie**\n");
         wynik = c-d;
           System.out.println("Otrzymany wynik to:"+wynik);
            break;
         case 3:
          System.out.println("\n**Mnożenie**\n");
         wynik = c*d;
          System.out.println("Otrzymany wynik to:"+wynik);
           break;
          case 4:
          System.out.println("\n**Dzielenie**\n");
         if(d==0){System.out.println("Dzielenie przez 0\n");}
            else{
         wynik = c/d;
          System.out.println("Otrzymany wynik to:"+wynik);
           break;
        }
           
    }  
    }
    }
    }
}
