public class Documentaries extends MobileApp { // Inheritance

    public Documentaries(String name, String description, String thumbnailImage, String category,
            String setOfActorActresses, double rating) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.category = category;
        this.setOfActorActresses = setOfActorActresses;
        this.rating = rating;
    }

    public Documentaries() {
    }

    public void register() {
        super.register();
        System.out.println("User can register...");
    }

    public void DocumentariesHave(String name, String description, String thumbnailImage, String categoty,
            String setOfActorActresses, double rating) {
        System.out.println("Documentarie Name: " + name + "\nDocumentarie Description : " + description
                + "\nDocumentarie Thumbnail Image : " + thumbnailImage + "\nDocumentarie Category :"
                + categoty + "\nDocumentarie Actor & Actresses : " + setOfActorActresses + "\nRating :"
                + rating);
    }

}
