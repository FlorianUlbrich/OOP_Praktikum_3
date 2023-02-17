### Modul Praktikum Objektorientierte Programmierung

## Aufgabe 3.5: Textextraktion aus HTML
<br>

Beschreibung

Ein HTML (Hyper Text Markup Language) Dokument besteht aus Tags, welche festlegen, wie ein Text auf dem Bildschirm dargestellt werden soll, und dem eigentlichen Text. Will man nun den Text aus einem HTML-Dokument extrahieren, so müssen die Tags entfernt werden.

Tags sollten in der Regel paarweise auftreten. Das erste Element besteht aus einer öffnenden spitzen Klammer, dem Tag selbst, sowie möglicherweise Parameter, und einer schließenden spitzen Klammer.

Das zweite Element besteht aus einer öffnenden spitzen Klammer, dem Zeichen "/", dem Tag, und einer schließenden spitzen Klammer. Beispiel:

\<H1 align=center> </H1>

Im Prinzip könnten nun einfach alle Tags entfernt werden, indem spitze öffnende und schließende Klammern erkannt werden. Allerdings können diese auch in folgenden Fällen auftreten:

* Innerhalb von Kommentaren
    <br><! - - Kommentar - ->
* Innerhalb von Anführungszeichen "text" und 'text' bei Werten von Attributen.
    <br><tag attribut=" 'Wert' '> <br>\<tag attribut='Wert'>
* Zwischen den Tags
    <br>\<style> ... \</style><br>
    \<head> ... \<head>

Daher werden Kommentare, Werte in Anführungszeichen, und style- bzw. head-Elemente überlesen. Des weiteren müssen Sonderzeichen entsprechend der folgenden Tabelle dekodiert werden:

|HTML|\&auml;|\&Auml;|\&ouml;|\&Ouml;|\&uuml;|\&Uuml;|\&szlig;|
--- | --- | ---| ---|---| ---| ---| ---| 
|Text|ä|Ä|ö|Ö|ü|ü|ß|

<br>

|HTML|\&lt;|\&gt;|\&amp;|\&quot;|\&znbsp;|
---| ---|---|---|---|---|
|Text|<|>|&|"|Leerzeichen|


### Aufgabenstellung

Schreiben Sie ein Programm, welches aus einem HTML-Dokument alle Tags entfernt und anschliessend alle Sonderzeichen in ASCII-Zeichen wandelt.
<br>

#### Testprogramme

Wählen Sie mehrere Internetseiten, speichern Sie diese und extrahieren Sie aus diesen den Text.
<br>

### Eingabe
Dateinamen für das HTML-Dokument und für Textdatei.

### Ausgabe
Text, sowohl am Bildschirm als auch als Textdatei.

### Abbruch
Das Programm bricht nach der Ausführung ab.
