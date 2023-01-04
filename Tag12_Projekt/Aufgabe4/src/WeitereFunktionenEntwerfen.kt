//Hier üben wir das Erstellen von Funktionen weiter.
//
//a) Schreibe eine Funktion mit dem Namen doppelterWert.
//Lege in der Funktion eine Variable vom Typ Int mit dem Wert 12 an.
//Verdreifache den Wert der Variable und gib sie zurück.
//Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben, auf und gib das Ergebnis in der Konsole aus.
//Ist das Ergebnis 36?

fun doppelterWert():Int{
    var aufgabeA:Int = 12
    return aufgabeA*3
}

//b) Wir bauen uns eine kleine Videothek.
//
//Schreibe eine Funktion mit einem beliebigen Namen.
//Lege in der Funktion eine Liste vom Typ String an, die Liste soll initial folgende Werte besitzen:
//"Star Wars", "Shrek", "Toy Story"
//Das sind unsere Filme.
//Gebe dann in der Funktion eine Begrüßung und die Filme in der Konsole aus.
//Frage dann den Nutzer, welchen Film er ausleihen möchte.
//Nimm dann eine Eingabe über die Konsole entgegen, die Eingabe ist ein Index für die Liste an Filmen. (Also ein Integer zwischen 0 und 2).
//Gib dann den Film für den eingegebenen Index zurück.
//Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben, auf und gib das Ergebnis in der Konsole aus.

fun videothek(): Int {
    var filme: List<String> = listOf(
        "Star Wars",
        "Shrek",
        "Toy Story"
    )


    println(
        "Hallo lieber Kunde, wir haben aktuell folgende Filme im Angebot: $filme. \n" +
                "Welchen Film möchten Sie ausleihen? Geben Sie 0 für Star Wars, 1 für Shrek und 2 für Toy Story ein!"
    )
    var filmWunsch = readln().toInt()


    println(filme.get(filmWunsch))
    return filmWunsch
}


//c) Du kannst dir als Hilfe für diese Aufgabe die Aufgaben aus der zweiten Woche anschauen.
//
//Schreibe eine Funktion mit beliebigen Namen.
//Lege in der Funktion eine passende MutableMap an.
//Ein Paar der MutableMap besteht aus dem Namen einer Person (als Schlüssel) und dem Alter einer Person (Als Wert).
//Fülle dann die MutableMap mit drei Personen, der Name sowie das Alter werden über die Konsole eingegeben.
//Gebe dann mit Funktionen, die du in der letzten Woche gelernt hast, die jüngste Person sowie die älteste Person aus.
//Gebe das durchschnittliche Alter aller Personen aus.
//Gebe das summierte Alter aller Personen aus.
//Gebe dann die MutableMap zurück.
//Prüfe deine Funktion, indem du sie in der Main-Funktion aufrufst.
//Gib beim Ausführen deines Programs die folgenden drei Personen ein.
//"Herbert" -> 46
//"Gundula" -> 85
//"Franz" -> 37

fun personen(){
    var personenListe:MutableMap<String,Int> = mutableMapOf(
    "Tick" to 20,
    "Trick" to 21,
    "Track" to 19)

    var juengstePerson = personenListe.values.min()
    var aeltestePerson = personenListe.values.max()
    println("Die jüngste Person ist ${juengstePerson} und die älteste Person ist ${aeltestePerson}.")
    var summe = personenListe.values.sum()
    var size = personenListe.size
    var durchschnitt = summe/size // personenListe.values.average()

    println("Das Durchschnittsalter aller Personen beträgt: ${durchschnitt}.")
    println("Das summierte Alter beträgt ${summe}.")
    println(personenListe)

}

//d) Die letzte Aufgabe ist etwas kreativer, wir bauen eine Funktion, die einen Würfelwurf simuliert.
//
//Erstelle eine Funktion, die einen Würfelwurf simuliert. D.h. die Funktion gibt mit gleicher Wahrscheinlichkeit einen Integer zwischen 1 und 6 aus.

fun wuerfelWurf(){
    var wuerfel = mutableListOf<Int>(1,2,3,4,5,6)
    println("Du hast eine ${wuerfel.random()} gewürfelt.")
}

fun main() {
    println(doppelterWert())
    println(videothek())
    println(personen())
    println(wuerfelWurf())

}