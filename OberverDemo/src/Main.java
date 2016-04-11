import Subjects.BeerSubject;
import Subjects.CocktailSubject;
import Subjects.MusicSubject;

/**
 * Created by cipri_000 on 4/10/2016.
 */
public class Main {

    public static void main(String[] args){
        BeerSubject beerSubject = new BeerSubject();
        CocktailSubject cocktailsSubject = new CocktailSubject();
        MusicSubject musicSubject = new MusicSubject();

        beerSubject.changeState();
        cocktailsSubject.changeState();
        musicSubject.changeState();
    }
}
