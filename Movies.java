public class Movies extends MobileApp { // Inheritance

    /*
     * A way to form new classes based on existing classes, taking on
     * theirattributes/behavior.
     * Movies is the sub class and MobileApp is the Super class
     */

    public Movies(String name, String description, String thumbnailImage, String category,
            String setOfActorActresses, double rating) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.category = category;
        this.setOfActorActresses = setOfActorActresses;
        this.rating = rating;
    }

    public Movies() {
    }

    public void MoviesHave(String name, String description, String thumbnailImage, String categoty,
            String setOfActorActresses, double rating) {
        System.out.println("Movie Name: " + name + "\nMovie Description : " + description
                + "\nMovie Thumbnail Image : " + thumbnailImage + "\nMovie Category :"
                + categoty + "\nMovie Actor & Actresses : " + setOfActorActresses + "\nRating :"
                + rating);
    }
}
