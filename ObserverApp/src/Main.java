import Subjects.BeerSubject;
import Subjects.CocktailSubject;
import Subjects.MusicSubject;

import java.text.CollationKey;

public class Main {
    public static void main(String[] args){
        BeerSubject beer = new BeerSubject();
        CocktailSubject cocktail = new CocktailSubject();
        MusicSubject music = new MusicSubject();

        beer.changeState();
        cocktail.changeState();
        music.changeState();
    }
}
