public class TvSeries extends MobileApp { // Inheritance

    public TvSeries(String name, String description, String thumbnailImage, String category,
            String setOfActorActresses, double rating) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.category = category;
        this.setOfActorActresses = setOfActorActresses;
        this.rating = rating;
    }

    public TvSeries() {
    }

    public void register() {
        super.register();
        System.out.println("User can register...");
    }

    public void TvSeriesHave(String name, String description, String thumbnailImage, String categoty,
            String setOfActorActresses, double rating) {
        System.out.println("Tv Series Name: " + name + "\nTv Series Description : " + description
                + "\nTv Series Thumbnail Image : " + thumbnailImage + "\nTv Series Category :"
                + categoty + "\nTv Series Actor & Actresses : " + setOfActorActresses + "\nRating :"
                + rating);
    }

}
