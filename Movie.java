// CSE-111 LAB-3 UG-OP TASK- 7     []
// UG-OP T_7 A movie object !

public class Movie {
    public String name;
    public String director;
    public int count = 0;
    public double rating;
    public String[] actors = new String[10];

    public void updateRating(double kl){
        System.out.println("Updated rating of \"" + name + "\" to " + kl);
        rating = kl;
    }

    public void setMovieDetails(String na, String dna) {
        name = na;
        director = dna;
    }

    public void setMovieDetails(String na_1, String dna_1, double ra) {
        setMovieDetails(na_1, dna_1);
        rating = ra;
    }

    public void addActors(String ka) {
        System.out.println("Added actor \"" + ka + "\" to \"" + name + "\".");
        actors[count] = ka;
        count ++;
    }

    public void addActors(String ka_1, String ka_2) {
        addActors(ka_1);
        addActors(ka_2);
    }

    public void addActors(String ka_11, String ka_22, String ka_33) {
        addActors(ka_11, ka_22);
        addActors(ka_33);
    }

    public void showInfo() {
        System.out.println("Title : " + name + ".");
        System.out.println("Director : " + director + ".");
        System.out.println("Rating : " + rating);
        System.out.print("Actors : ");

        for (int i = 0; i < count; i++) {
            System.out.print(actors[i] + " , ");
        }
        System.out.println();
    }
    
}
 

