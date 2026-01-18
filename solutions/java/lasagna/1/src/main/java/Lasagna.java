public class Lasagna {

    // Task 1
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2
    public int remainingMinutesInOven(int minutesInOven) {
        return 40 - minutesInOven;
    }

    // Task 3
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // Task 4
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}