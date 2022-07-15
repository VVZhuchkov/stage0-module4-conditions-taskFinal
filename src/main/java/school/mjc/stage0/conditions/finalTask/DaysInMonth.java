package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap = true;
        if (year % 4 != 0 || year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            isLeap = false;
        }
        String amountOfDays = switch (month) {
            case 1, 3, 5, 7, 9, 11 -> {
                yield "31";
            }
            case 4, 6, 8, 10, 12 -> {
                yield "30";
            }
            case 2-> {
                if (isLeap){
                    yield "29";}
                    else {
                       yield  "28";
                }
            }
            default -> {
                yield "invalid date";
            }
        };
        System.out.println(amountOfDays);
    }
}
