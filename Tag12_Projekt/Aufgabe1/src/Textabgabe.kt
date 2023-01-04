// TODO: In dieser Aufgabe sind Codeausschnitte gegeben und du sollst vorhersagen, was für ein Wert in der
//  Konsole ausgegeben wird. Schreibe die Lösung in den Kommentar in der Datei, füge dann den Codeausschnitt hinzu
//  und überprüfe dein Ergebnis.

// Teilaufgabe a) 15

fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}


// Teilaufgabe b) gelb

fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "Grün", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

// Teilaufgabe c) 60

fun ersteZahl(): Int {
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {
    return 25 / 5
}

fun main() {
    println(subtrahieren()) //a
    println(lieblingsFarbe()) //b

    val ergebnis = ersteZahl() * zweiteZahl() //c
    println(ergebnis) //c
}