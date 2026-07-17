package oops_practice.gcrcodebase.interfaces.MultiServiceSmartTV;

public class Main {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar",
                "Spider-Man"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG",
                "Need for Speed"
        };

        SmartTV tv = new SmartTV(movies, games);

        tv.showSubscriptionDetails();

        System.out.println();

        tv.streamMovie();

        System.out.println();

        tv.playGame();
    }
}
