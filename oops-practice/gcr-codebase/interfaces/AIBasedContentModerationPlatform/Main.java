package oops_practice.gcrcodebase.interfaces.AIBasedContentModerationPlatform;

public class Main {

    public static void main(String[] args) {

        String[] posts = {
                "Welcome to our community!",
                "Buy now and get 50% OFF",
                "I hate this product",
                "Click here to win a prize",
                "Have a great day!"
        };

        ContentModerator moderator = new ContentModerator(posts);

        moderator.displayModerationPolicy();

        System.out.println();

        moderator.moderatePosts();
    }
}