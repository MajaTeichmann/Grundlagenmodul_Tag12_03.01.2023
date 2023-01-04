// TODO: In dieser Aufgabe sollst du ein paar Funktionen entwerfen, um etwas Übung zu bekommen. Achte dabei auf den
//  richtigen Rückgabewert. Prüfe dann jede Funktion programmatisch, indem du sie in der main() Funktion, wie in
//  Aufgabe 1, aufrufst und den Rückgabewert in der Konsole ausgibst.

//a) Schreibe eine Funktion mit passendem Rückgabewert, die 5 zurückgibt.
fun aufgabeA(): Int{
    return 5
}
//
//b) Schreibe eine Funktion mit passendem Rückgabewert, die 6.234 zurückgibt.
fun aufgabeB(): Double{
    return 6.234
}
//
//c) Schreibe eine Funktion mit passendem Rückgabewert, die "Hallo" zurückgibt.
fun aufgabeC(): String{
    return "Hallo"
}
//
//d) Schreibe eine Funktion, die eine Liste vom Typ String zurückgibt. Die Liste ist dabei initial (also zu Begin) mit
// folgenden Werten gefüllt:
//"Hallo", "Welt", "!"
fun aufgabeD(): List<String> {
    return listOf<String>("Hallo", "Welt", "!")
}
//
//e) Schreibe eine Funktion, die eine MutableMap zurückgibt. Der Key der MutableMap ist vom Typ String, der
// Wert der MutableMap ist vom Typ Boolean. Die MutableMap ist dabei initial (also zu Begin) mit folgenden Paaren gefüllt:
//"Lernen wir die Sprache Französisch?" -> false
//"Lernen wir die Sprache Kotlin?" -> true
fun aufgabeE(): MutableMap<String,Boolean>{
    return mutableMapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )
}
//
//f) Schreibe eine Funktion, die nichts zurückgibt.
fun aufgabeF():String{
return " "
}

fun main() {
println(aufgabeA())
    println(aufgabeB())
    println(aufgabeC())
    println(aufgabeD())
    println(aufgabeE())
    println(aufgabeF())
}