package RegularExpressionsExercises;


public class regularExpressionsExercises {
  public static void main(String[] args) {

    CheckNumberOddIven.checkNumberOddIven();

    CheckCityCode.checkCityCode();

    LoginValidation.loginValidation();

    StringValidation.stringValidation();

    DatePatternValidation.datePatternValidation();

    SerialNumberValidatin.serialNumberValidatin();

    VATInvoiceValidation.vatInvoiceValidation();


//    String fromConsole = "Brylant Dynia Agat Cyjan"/*BaseConsole.getTextFromConsole()*/;
//    String[] words = fromConsole.split(" ");
//    StatisticFromString.statisticFromString(words);
//    for (int i = 0; i < fromConsole.length(); i++) {
//      System.out.println(words[i]);
//    }

  }
}

////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//  Przygotuj poniższe aplikacje wykorzystując klasy i metody (OOP). Dla każdego zadania
//        przygotuj osobną klasę, a w niej metodę lub metody rozwiązujące problem bądź realizujące
//        określone zadanie zadanie.

//        1. Pamiętaj o poprawnym nazywaniu klas, metod, argumentów metod i zmiennych.
//        2. Korzystaj z domyślnego formatowania dostępnego w IntelliJ (CTRL + ALT + L)
//        3. Ustaw odpowiedni package dla projektu
//        4. Postaraj się tworzyć opisy metod i klas typu JavaDoc

////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***
//        Wyrażenia regularne
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        1. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
//        liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
//        użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
//        nieparzystości.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        2. Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
//        podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        3. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//        uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//        a maksymalna 16 znaków.

//        4. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość zawiera słowo "ala".
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        5. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
//        czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
//        "10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
//        też poprawna wartość.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        6. Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
//        liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        7. Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
//        gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
//        myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
//        wyrażenie regularne sprawdzające numer seryjny.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        8. Przygotuj wyrażenie regularne sprawdzające czy numer faktury VAT jest poprawny.
//        Przykładowy numer faktury to "FV/1024/02/2018", gdzie
//        FV - stały wpis
//        / - stały znak rozdzielający sekcje
//        1024 - kolejny numer faktury w danym miesiącu. Numer rozpoczyna się od 1
//        / - stały znak rozdzielający sekcje
//        02 - numer miesiąca w danym roku kalendarzowym
//        / - stały znak rozdzielający sekcje
//        2018 - rok
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***

//        9. Przygotuj aplikację pobierającą od użytkownika dowolny tekst. Wprowadzony tekst
//        powinien zostać podzielony na słowa (korzystając z metody split klasy String), a
//        następnie program powinien wyświetlić statystyki wpisanego przez użytkownika
//        tekstu.
////  ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***    ***