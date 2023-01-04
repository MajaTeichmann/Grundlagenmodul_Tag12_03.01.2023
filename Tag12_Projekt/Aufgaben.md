
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Funktionen</h3>
<br>

<p align="center">
  <img src="img/meme.jpeg" />
</p>

#### Beschreibung:

- Willkommen zurück zu den Übungsaufgaben von Tag 12! Heute habt ihr alles rund um das Thema Rückgabewert gelernt. Wenden wir gleich einmal das Gelernte an!

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Funktionen → verstehen → Rückgabewerte](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.aatkaqflpfcc)
  - [Handbuch: Funktionen → implementieren → Rückgabewerte](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.4vbpsnw0nape)
  - [Handbuch: Variablen & Datentypen → Nachschlagen → Kochrezept: Compilerfehler lösen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bpw3da2qtpg9)



---

<details>
<summary><b>Aufgabe 1 - Rückgabewert vorhersagen </b></summary>

In dieser Aufgabe sind Codeausschnitte gegeben und du sollst vorhersagen, 
was für ein Wert in der Konsole ausgegeben wird.
Schreibe die Lösung in den Kommentar in der Datei, 
füge dann den Codeausschnitt hinzu und überprüfe dein Ergebnis.

a)
- Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}

fun main() {ㅤㅤ
    println(subtrahieren())
}

```

b)

- Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```

fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "Grün", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

fun main() {
    println(lieblingsFarbe())
}

```

c)

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
fun ersteZahl(): Int {
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {
    return 25 / 5 
}

fun main() {
    val ergebnis = ersteZahl() * zweiteZahl()
    println(ergebnis)
}
```

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *Textabgabe.kt* 

</details>

---

<details>
<summary><b>Aufgabe 2 - Funktion + Rückgabewert implementieren und aufrufen </b></summary>

In dieser Aufgabe erstellen wir Schritt für Schritt eine Funktion.
Führe die gegebenen Teilaufgaben durch:

- Schreibe das Keyword für Funktionen <class style="color:#ff8800">fun</class>.
- Nenne deine Funktion <class style="color:#FFFFFF">zehnfach</class>.
- Schreibe hinter dem Namen der Funktion eine öffnende und eine schließende Klammer.
- Schreibe nach den Klammern ein Doppelpunkt und den Typ der Rückgabe. Hier ist der Typ Int.
- Öffne den Körper der Funktion mit einer öffnenden, geschwungenen Klammer und schließe ihn 
mit einer schließenden, geschwungenen Klammer.
- Lege im Körper eine Variable mit dem Namen <class style="color:#FFFFFF">zahl</class>, 
vom Typ Int an und weise ihr den Wert 3 zu.
- Berechne im Körper das Zehnfache deiner Zahl, weise das Ergebnis einer neuen Variable 
mit dem Namen <class style="color:#FFFFFF">ergebnis</class> zu.
- Schreibe das Schlüsselwort <class style="color:#ff8800">return</class>.
- schreibe direkt nach return den Variablennamen <class style="color:#FFFFFF">ergebnis</class>.
- Rufe deine Funktion <class style="color:#FFFFFF">zehnfach()</class> in der Main-Funktion auf
und gib das Ergebnis in der Konsole aus.

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *ReturnImplementieren.kt*

</details>

---

<details>
<summary><b>Aufgabe 3 - Funktionen entwerfen I </b></summary>

In dieser Aufgabe sollst du ein paar Funktionen entwerfen, um etwas Übung zu bekommen.
Achte dabei auf den richtigen Rückgabewert. 
Prüfe dann jede Funktion programmatisch, indem du sie in der main() Funktion, 
wie in Aufgabe 1, aufrufst und den Rückgabewert in der Konsole ausgibst.

Ein Beispiel:

```

fun main() {
    println(eineFunktion())
}

fun eineFunktion(): String {
    return "Das ist eine Funktion!"
}

```

a)

Schreibe eine Funktion mit passendem Rückgabewert, die 5 zurückgibt. 

b)

Schreibe eine Funktion mit passendem Rückgabewert, die 6.234 zurückgibt.

c)

Schreibe eine Funktion mit passendem Rückgabewert, die "Hallo" zurückgibt.

d)

Schreibe eine Funktion, die eine Liste vom Typ String zurückgibt.
Die Liste ist dabei initial (also zu Begin) mit folgenden Werten gefüllt:

```

"Hallo", "Welt", "!"

```

e)

Schreibe eine Funktion, die eine MutableMap zurückgibt.
Der Key der MutableMap ist vom Typ String, der Wert der MutableMap ist vom Typ Boolean.
Die MutableMap ist dabei initial (also zu Begin) mit folgenden Paaren gefüllt:

```

"Lernen wir die Sprache Französisch?" -> false
"Lernen wir die Sprache Kotlin?" -> true

```

f)

Schreibe eine Funktion, die nichts zurückgibt.

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *FunktionenEntwerfen.kt*

</details>

---

<details>
<summary><b>Aufgabe 4 - Funktionen entwerfen II </b></summary>

Hier üben wir das Erstellen von Funktionen weiter.

a)

- Schreibe eine Funktion mit dem Namen <i>doppelterWert</i>.
- Lege in der Funktion eine Variable vom Typ Int mit dem Wert 12 an.
- Verdreifache den Wert der Variable und gib sie zurück.

Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben, auf
und gib das Ergebnis in der Konsole aus.  
Ist das Ergebnis 36?

b)

Wir bauen uns eine kleine Videothek.

- Schreibe eine Funktion mit einem beliebigen Namen.
- Lege in der Funktion eine Liste vom Typ String an, die Liste soll initial folgende Werte besitzen:  
"Star Wars", "Shrek", "Toy Story"  
Das sind unsere Filme.
- Gebe dann in der Funktion eine Begrüßung und die Filme in der Konsole aus.  
Frage dann den Nutzer, welchen Film er ausleihen möchte.
- Nimm dann eine Eingabe über die Konsole entgegen, die Eingabe ist ein Index für die Liste an Filmen. 
(Also ein Integer zwischen 0 und 2).
- Gib dann den Film für den eingegebenen Index zurück.

Rufe dann die Funktion in der main() Funktion, wie in den vorherigen Teilaufgaben, auf
und gib das Ergebnis in der Konsole aus.

c)

Du kannst dir als Hilfe für diese Aufgabe die Aufgaben aus der zweiten Woche anschauen.

- Schreibe eine Funktion mit beliebigen Namen.
- Lege in der Funktion eine passende MutableMap an.  
Ein Paar der MutableMap besteht aus dem Namen einer Person (als Schlüssel) und dem Alter einer Person (Als Wert).
- Fülle dann die MutableMap mit drei Personen, der Name sowie das Alter werden über die Konsole eingegeben.
- Gebe dann mit Funktionen, die du in der letzten Woche gelernt hast, die jüngste Person 
sowie die älteste Person aus.
- Gebe das durchschnittliche Alter aller Personen aus.
- Gebe das summierte Alter aller Personen aus.
- Gebe dann die MutableMap zurück.

Prüfe deine Funktion, indem du sie in der Main-Funktion aufrufst.  
Gib beim Ausführen deines Programs die folgenden drei Personen ein.

```
"Herbert" -> 46
"Gundula" -> 85
"Franz" -> 37
```

d)

Die letzte Aufgabe ist etwas kreativer, wir bauen eine Funktion, die einen Würfelwurf simuliert.

- Erstelle eine Funktion, die einen Würfelwurf simuliert.
D.h. die Funktion gibt mit gleicher Wahrscheinlichkeit einen Integer zwischen 1 und 6 aus.

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *WeitereFunktionenEntwerfen.kt*

</details>

---

<details>
<summary><b>Aufgabe 5 - Fehler beheben </b></summary>

Die Katze ist über die Tastatur gelaufen und hat den Code kaput gemacht.

- Korrigiere die Fehler in der Datei.

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *FehlerBeheben.kt*

</details>

---

---







