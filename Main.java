public class Main {
        public static void main(String args[]) {

                MobileApp videoStream = new Movies("Cinderella", "Walt Disney Studio Motion Pictures",
                                "Disney Prinsess",
                                "Disney Cartoon", "Cartoon Characters", 6.9); // Polymorphism
                videoStream.register();
                videoStream.maintainProfile();
                videoStream.filter();
                videoStream.selectAndWatch();
                videoStream.maintainFavourites();

                System.out.println("\n");

                Movies MovieDetails = new Movies(); // Polymorphism
                /*
                 * Ability for the same code to be used with different types of
                 * objects and behave differently with each. Can call any methode from Movies
                 */

                MovieDetails.MoviesHave("Cinderella", "Walt Disney Studio Motion Pictures", "Disney Prinsess",
                                "Disney Cartoon", "Cartoon Characters", 6.9);

                System.out.println("\n");

                TvSeries TvSeriesDetails = new TvSeries(); // Polymorphism
                TvSeriesDetails.TvSeriesHave("Friends", "American Tv Series with 236 episodes", "FRIENDS",
                                "Netflix Tv Series", "Amarican actors and Actresses", 8.9);

                System.out.println("\n");

                Documentaries DocumentariesDetails = new Documentaries(); // Polymorphism
                DocumentariesDetails.DocumentariesHave("He Named me Malala",
                                "The story of the girl who stood up for education and was shot by the Taliban",
                                "Malala's Photo", "Motivational Documnetry", "Malala Yousafzai", 7);

                System.out.println("\n");

        }
}
