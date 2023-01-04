// TODO: In dieser Aufgabe erstellen wir Schritt für Schritt eine Funktion. Führe die gegebenen Teilaufgaben durch:
//  Schreibe das Keyword für Funktionen fun.
//  Nenne deine Funktion zehnfach.
//  Schreibe hinter dem Namen der Funktion eine öffnende und eine schließende Klammer.
//  Schreibe nach den Klammern ein Doppelpunkt und den Typ der Rückgabe. Hier ist der Typ Int.
//  Öffne den Körper der Funktion mit einer öffnenden, geschwungenen Klammer und schließe ihn mit einer schließenden, geschwungenen Klammer.
//  Lege im Körper eine Variable mit dem Namen zahl, vom Typ Int an und weise ihr den Wert 3 zu.
//  Berechne im Körper das Zehnfache deiner Zahl, weise das Ergebnis einer neuen Variable mit dem Namen ergebnis zu.
//  Schreibe das Schlüsselwort return.
//  Schreibe direkt nach return den Variablennamen ergebnis.
//  Rufe deine Funktion zehnfach() in der Main-Funktion auf und gib das Ergebnis in der Konsole aus.

fun zehnfach(): Int{
    var zahl: Int = 3
    var ergebnis = zahl * 10
    return ergebnis
}

fun main() {
 println(zehnfach())
}