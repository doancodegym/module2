package Refactoring;

public class TennisGame {
    private final static int LOVE = 1;
    private final static int FIFTEEN = 2;
    private final static int THIRTY = 3;
    private final static int FORTY = 4;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {

        String score = player1Name + " vs " + player2Name + "\n";
        if (scorePlayer1 == scorePlayer2) {
            return score += getPlayerScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            return score += collateResults(player1Name, player2Name, scorePlayer1, scorePlayer2);
        }
        return score;
    }

    private static String getPlayerScore(int scorePlayer1) {
        switch (scorePlayer1) {
            case LOVE:
                return "Love - All";
            case FIFTEEN:
                return "Fifteen - All";
            case THIRTY:
                return "Thirty - All";
            case FORTY:
                return "Forty - All";
        }
        return null;
    }

    public static String collateResults(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        int result = scorePlayer1 - scorePlayer2;
        switch (result) {
            case 1:
                return "Advantage : " + player1Name;
            case 2:
                return player1Name + " is winer !";
            case -1:
                return "Advantage : " + player2Name;
            case -2:
                return player2Name + " is winer !";
            default:
                return "No result !";
        }
    }

    public static void main(String[] args) {
        System.out.println(TennisGame.getScore("Đoàn","Đăng",FORTY,THIRTY));
    }
}

