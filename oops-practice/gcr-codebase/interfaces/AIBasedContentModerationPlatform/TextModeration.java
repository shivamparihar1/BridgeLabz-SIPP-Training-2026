package oops_practice.gcrcodebase.interfaces.AIBasedContentModerationPlatform;
public interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String[] restrictedWords = {"bad", "hate", "abuse"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }

        return false;
    }
}