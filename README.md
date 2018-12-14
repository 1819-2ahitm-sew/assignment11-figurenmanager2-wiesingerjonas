# Übung Figuren-Manager 2.0

## Lehrziele

- Vererbung von Klassen

## Aufgabenstellung

Das Programm soll in der Lage sein, den Flächeninhalt und den Umfang einiger geometrischer Figuren zu berechnen. Folgende Figuren sollen berücksichtigt werden:

- Polygon (Koordinaten aller Punkte)
- Rechteck (Koordinaten des linken oberen Punktes, Länge, Breite) 
- Quadrat (Koordinaten des linken oberen Punktes, Länge)
- Ellipse (Koordinaten des Mittelpunktes, Hauptachse, Nebenachse) - Kreis (Koordinaten des Mittelpunktes, Radius).

Es können Menu-gesteuert beliebige Figuren erstellt werden, welche alle in einer ArrayList gespeichert werden.

Es können außerdem die Flächeninhalte und Umfänge aller gespeicherten Figuren angezeigt werden, wobei die Reihenfolge der Figuren wahlweise nach Flächeninhalt oder Umfang sortiert ist.

## Bildschirmausgabe

```
Datenanzeige nach Fläche sortiert:
----------------------------------
Quadrat mit Seitenlänge 3: Fläche -> 9, Umfang -> 12
Kreis mit Radius 5: Fläche -> 78.54, Umfang -> 31.416
Ellipse mit Hauptachse 10 und Nebenachse 6: Fläche -> 188.496, Umfang -> 51.054
```

## Hinweis

Erstelle folgende abstrakte Methoden in der Basisklasse (Figure), welche dann in den Subklassen überschrieben werden:

```
double area();           // berechnet den Flächeninhalt
double circumference();  // berechnet den Umfang
String toString();       // erstellt die Zeichenkette zur Datenausgabe
```

Die eigentlichen Berechnungen können zur Gänze in den Klassen Ellipse und Polygon durchgeführt werden. Das Polygon verwaltet die Eckpunkte in einer ArrayList. Zur Berechnung des Flächeninhalts suche nach der Gaußschen Trapezformel.


## Erweiterung

Erstelle zusätzlich eine Klasse DrawingFigure als Subklasse von Figure. Diese besitzt die Methode: 

```
void draw(Screen screen);  // zeichnet die Figur auf ein Lanterna-Konsolenfenster
```

Verwende dazu die Bibliothek Processing.
Es werden alle in der ArrayList gespeicherten Figuren gezeichnet. Die Textausgabe erfolgt nach wie vor in der Konsole.