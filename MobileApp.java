public abstract class MobileApp { // Abstraction
    /* A class or method can be declared as abstract. */
    public String name;
    String description;
    String thumbnailImage;
    String category;
    String setOfActorActresses;
    double rating;

    String ActorActessesName;
    String VideoContent;

    public MobileApp() {

    }

    public MobileApp(String name, String description, String thumbnailImage, String category,
            String setOfActorActresses, double rating) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.category = category;
        this.setOfActorActresses = setOfActorActresses;
        this.rating = rating;

    }

    public void register() {
        System.out.println("Users can register... ");
    }

    public void maintainProfile() {
        System.out.println("Users can maintain their profiles... ");
    }

    public void filter() {
        System.out.println("User can filter througth this streaming app.. ");
    }

    public void selectAndWatch() {
        System.out.println("User can select any video content and watch in on the app... ");
    }

    public void maintainFavourites() {
        System.out.println(
                "User can maintain favorite liast and also will able to select their preferred type of video and category.");
    }

    public void setActorActessesName(String text) { // Encapsulation (getters and setters)
        ActorActessesName = text;
    }

    public void setrating(double value) { // Encapsulation
        rating = value;
    }

    public void setVideoContent(String text) { // Encapsulation
        VideoContent = text;
    }

    public String getName() { // Encapsulation
        return name;
    }

}
