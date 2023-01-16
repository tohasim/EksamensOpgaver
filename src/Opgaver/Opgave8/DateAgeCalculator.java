package Opgaver.Opgave8;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    private int lowestAcceptableAge(){
        return yourAge/2+7;
    }

    public boolean dateAcceptable(){
        return dateAge >= lowestAcceptableAge();
    }

    public static void main(String[] args) {
        DateAgeCalculator dateOlder = new DateAgeCalculator(24, 30);
        DateAgeCalculator dateYoungerButAcceptable = new DateAgeCalculator(24, 20);
        DateAgeCalculator dateTooYoung = new DateAgeCalculator(24, 12);
        DateAgeCalculator dateOnBorder = new DateAgeCalculator(24, 19);

        System.out.printf("dateOlder: %s\n" +
                "dateYoungerButAcceptable: %s\n" +
                "dateTooYoung: %s\n" +
                "dateOnBorder: %s\n", dateOlder.dateAcceptable(), dateYoungerButAcceptable.dateAcceptable(), dateTooYoung.dateAcceptable(), dateOnBorder.dateAcceptable());
    }
}
