package com.company;

public class Main {

    public static void main(String[] args) {
        Developer ion = new Developer("Ion Padurean");
        GameDeveloper vasile = new GameDeveloper("Vasile Pumn", 5, "Gamestud");

        ion.develope();
        vasile.develope();

        Post post1 = new Post("Victorie in primul tur", "Ou", "https://www.youtube.com/watch?v=Z__gFlboNUg&ab_channel=EmisiuneaLumina");
        post1.printArticle();
    }
}
