package org.example;

/*
Task1: készítsünk egy metodust ami egy  char[][] tömböt vár bemenetként és eldönti, hogy az adot tömb valid sakk állást reprezentál-e, .
A feladat szempontjából valid sakk állás ha az alábbi feltételeknek mind megfelel a tábla (a valóságban ennél kicsit bonyolultabb):
- a tábla mérete 8x8.
- az első és utolsó sor nem tartalma gyalogot.
- egy adott színben gyalogból legfeljebb 8 lehet a táblán.
- kell a táblán legyen 1 db világos és 1 db sötét király.
- a vezér, a bástya, a futó, és a huszár bábu kell a táblán legyen 1 db világos és 1 db sötét király.
- a vezér, a bástya, a futó, és a huszár bábukra igaz az, hogy egy adot bábu tipusból, egy adott színből az adott tipusú bábuk száma + gyalogok száma <= 10.
- opcionális: a két király nem álhat egymás melett.
jelölések:
világos király : k
sötét király   : K
világos vezér  : v
sötét vezér    : V
világos bástya : b
sötét bástya   : B
világos futó   : f
sötét futó     : F
világos huszár : h
sötét huszár   : H
világos gyalog : g
sötét gyalog   : G
Task 2:
az alkalmazás olvason be egy fájlt ami saktábla állásokat tartalmaz.
ellenörzze, hogy ezek közül melyik valid és azokat írja bele egy másik fájlba.
*/

public class Main {
    public static void main(String[] args) {

        char[][] board = new char[8][5];
        int sizeY = board.length;
        int sizeX = board[0].length;
        System.out.println("Row: "+sizeY +" Col: "+sizeX );
    }
}