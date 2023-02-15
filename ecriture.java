public class ecriture {
    //création d'une date
LocalDateTime localDateTime = LocalDateTime.now();
//On réduit de un jour puis de 1 heure la date.
LocalDateTime localDateTimeSup = localDateTime.minusDays(1);
localDateTimeSup = localDateTimeSup.minusHours(1);
System.out.println("dates creation - plus une heure :"+localDateTime+" - "+localDateTimeSup);
//Comparaison de ces dates
System.out.println("localDateTime.isAfter(localDateTimeSup) : "+localDateTime.isAfter(localDateTimeSup));
System.out.println("localDateTime.isAfter(localDateTimeSup) : "+localDateTime.isBefore(localDateTimeSup));
}

