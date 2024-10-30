import java.util.Arrays;

public class Main {
    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                index = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[index];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int a = 0;
        int b = totalWasteKgPerCapitaPerYear[0];
        for (int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > b) {
                b = totalWasteKgPerCapitaPerYear[i];
                a = i;
            }
        }
        return countries[a];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double largestValue = 0.0;

        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] > largestValue) {
                largestValue = percentagesShareInPoverty[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == largestValue) {
                counter++;
            }
        }

        String[] countriesWithHighestPoverty = new String[counter];
        int index = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == largestValue) {
                countriesWithHighestPoverty[index++] = countries[i];
            }
        }

        return countriesWithHighestPoverty;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        int counter = 0;

        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                counter++;
            }
        }
        String[] countriesWithHighConfidence = new String[counter];
        int index = 0;
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")){
                countriesWithHighConfidence[index++] = countries[i];
            }
        }
        return countriesWithHighConfidence;
    }
}