public class SportsGame {
    String venue;
    String startTime;
    String startDate;
    int score1;
    int score2;
    int seatsLeft;

    SportsGame(String venue, String startTime, String startDate, int score1, int score2, int seatsLeft){
        this.venue = venue;
        this.startTime = startTime;
        this.startDate = startDate;
        this.score1 = score1;
        this.score2 = score2;
        this.seatsLeft = seatsLeft;

        if (venue == null || venue.trim().isEmpty()) {
            throw new IllegalArgumentException("Venue cannot be null or blank.");
        }

        if (startDate == null) {
            throw new IllegalArgumentException("Start date cannot be null.");
        }

        if (startTime == null) {
            throw new IllegalArgumentException("Start time cannot be null.");
        }
    }

    @Override
    public String toString() {
        return String.format("{%s,%s,%s,%d,%d,%d}", venue, startTime, startDate, score1, score2, seatsLeft);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SportsGame)) {
            return false;
        }

        SportsGame game = (SportsGame) obj;
        return venue.equals(game.venue) && startTime.equals(game.startTime) &&
                startDate.equals(game.startDate) && score1 == game.score1 &&
                score2 == game.score2 && seatsLeft == game.seatsLeft;
    }


}
