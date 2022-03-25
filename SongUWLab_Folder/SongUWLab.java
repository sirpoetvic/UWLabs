//Victor Wong
//March 19th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #1
//
//This program is intended to print out the lyrics of the song
//"There Was An Old Woman Who Swallowed a Fly"
package SongUWLab_Folder;
public class SongUWLab {

    public static void main(String[] args) {
        stanza1();
        System.out.println();
        stanza2();
        System.out.println();
        stanza3();
        System.out.println();
        stanza4();
        System.out.println();
        stanza5();
        System.out.println();
        stanza6();
        System.out.println();
        stanza7();
    }

    public static void stanza1 () {
        System.out.println("There was an old woman who swallowed a fly,");
        lastLines();
    }
    
    public static void stanza2 () {
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        lastLines();
    }

    public static void stanza3 () {
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        swallowBird();
        swallowSpider();
        lastLines();
    }
    
    public static void stanza4 () {
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        swallowCat();
        swallowBird();
        swallowSpider();
        lastLines();
    }

    public static void stanza5 () {
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        swallowDog();
        swallowCat();
        swallowBird();
        swallowSpider();
        lastLines();
    }

    public static void stanza6 () {
        System.out.println("There was an old woman who swallowed a tiger,");
        System.out.println("She thought it was cake, but it was a snake.");
        swallowTiger();
        swallowDog();
        swallowCat();
        swallowBird();
        swallowSpider();
        lastLines();
    }

    public static void stanza7 () {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void swallowSpider() {
        System.out.println("She swallowed the spider to catch the fly,");
    }

    public static void swallowBird() {
        System.out.println("She swallowed the bird to catch the spider,");
    }

    public static void swallowCat() {
        System.out.println("She swallowed the cat to catch the bird,");
    }

    public static void swallowDog() {
        System.out.println("She swallowed the dog to catch the cat,");
    }

    public static void swallowTiger() {
        System.out.println("She swallowed the tiger to catch the dog,");
    }

    public static void swallowHorse() {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void lastLines() {
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
    }

  
}

