package oops_practice.gcrcodebase.interfaces.AIBasedContentModerationPlatform;

public class ContentModerator implements TextModeration, SpamDetection {

    String[] posts;

    public ContentModerator(String[] posts) {
        this.posts = posts;
    }

    @Override
    public void checkOffensiveContent(String post) {

        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("\"" + post + "\" -> Offensive Post");
        }
    }

    @Override
    public void checkSpam(String post) {

        if (post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here")) {

            System.out.println("\"" + post + "\" -> Spam Post");
        }
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void moderatePosts() {

        for (String post : posts) {

            if (post.toLowerCase().contains("buy now")
                    || post.toLowerCase().contains("click here")) {

                checkSpam(post);

            } else if (TextModeration.containsRestrictedWords(post)) {

                checkOffensiveContent(post);

            } else {

                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}