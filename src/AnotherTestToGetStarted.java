
/*
        # Java

## Variablen und Datentypen

### Aufgabe 1.2 - Einfache Rechenaufgaben

Deklariere zwei numerische Variablen mit beliebigen Werten. Errechne deren Summe, Differenz, Produkt und Quotient
und gib die Rechnung mit dem Ergebnis mit `System.out.println`/`System.out.printf` auf der Konsole aus.
Rechne einmal mit ganzzahligen und einmal mit gebrochenen Zahlen!

Bonus: Gib die Kommazahlen schön formatiert auf der Konsole aus.

%s String
%d Integer
%f Float / Double
%.3f Float mit 3 Nachkommastellen

*/

public class AnotherTestToGetStarted {
    public static void main(String[] args) {

        // Variablen

        int Zahl1, Zahl2;
        double Ergebnis;

        // Zuweisung

        Zahl1 = 1254;
        Zahl2 = 5487;

        // Berechnung

        Ergebnis = Zahl1 + Zahl2;
        System.out.printf("%d + %d = %.0f\n", Zahl1, Zahl2, Ergebnis);
        Ergebnis = Zahl1 - Zahl2;
        System.out.printf("%d - %d = %.0f\n", Zahl1, Zahl2, Ergebnis);
        Ergebnis = Zahl1 * Zahl2;
        System.out.printf("%d * %d = %.0f\n", Zahl1, Zahl2, Ergebnis);
        Ergebnis = ((double) Zahl1) / Zahl2;
        System.out.printf("%d / %d = %.2f\n", Zahl1, Zahl2, Ergebnis);

    }

}


