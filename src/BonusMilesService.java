public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int costs = 20;
        int numberOfMiles = ticketPrice / costs;
        return numberOfMiles;
    }
}
