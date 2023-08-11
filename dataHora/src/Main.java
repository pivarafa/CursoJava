import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-08-11T01:30:26Z");

        LocalDate data1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        System.out.println("Data do Sistema: "+ data1);

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDateTime pastHourDate = d05.minus(180, ChronoUnit.MINUTES);
        LocalDateTime pastWeekLocalTime = d05.minus(180, ChronoUnit.DAYS);

        System.out.println("pastWeek: " + pastWeekLocalDate);
        System.out.println("pastHourDate: " + pastHourDate);
        System.out.println("nextWeek: " + nextWeekLocalDate);
        System.out.println("d05 dia do ano " + d05.getDayOfYear());

        Duration duracao1 = Duration.between(pastWeekLocalTime,d05);

        System.out.println("Duração " + duracao1.toHours());





    }
}