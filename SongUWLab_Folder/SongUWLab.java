//Victor Wong 
//March 19th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #1
//
//This program is intended to print out the lyrics of the song
//"There Was An Old Woman Who Swallowed a Fly"
package UWLabs.SongUWLab_Folder;
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

    //prints out the first stanza
    public static void stanza1 () {
        System.out.println("There was an old woman who swallowed a fly,");
        lastLines();
    }
    
    // prints out the second stanza
    public static void stanza2 () {
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        lastLines();
    }

    //prints out the third stanza
    public static void stanza3 () {
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        swallowBird();
        swallowSpider();
        lastLines();
    }
    
    //prints out the fourth stanza
    public static void stanza4 () {
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        swallowCat();
        swallowBird();
        swallowSpider();
        lastLines();
    }

    //prints out the fifth stanza
    public static void stanza5 () {
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        swallowDog();
        swallowCat();
        swallowBird();
        swallowSpider();
        lastLines();
    }

    //prints out the sixth stanza
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

    //prints out the seventh stanza
    public static void stanza7 () {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    //prints out why the lady swallowed a spider
    public static void swallowSpider() {
        System.out.println("She swallowed the spider to catch the fly,");
    }
    //prints out why the lady swallowed a bird
    public static void swallowBird() {
        System.out.println("She swallowed the bird to catch the spider,");
    }

    //prints out why the lady swallowed a cat
    public static void swallowCat() {
        System.out.println("She swallowed the cat to catch the bird,");
    }

    //prints out why the lady swallowed a dog
    public static void swallowDog() {
        System.out.println("She swallowed the dog to catch the cat,");
    }
    
    //prints out why the lady swallowed a tiger
    public static void swallowTiger() {
        System.out.println("She swallowed the tiger to catch the dog,");
    }

    //prints out why the lady swallowed a horse
    public static void swallowHorse() {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

    //prints out the last line of all of the stanzas
    public static void lastLines() {
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
    }

  
}

