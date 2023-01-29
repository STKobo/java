public class ecriture {
    LocalDatetime LocalDatetime = LocalDateTime.now();
    System.out.println(LocalDateTime);
    ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
    System.out.println("Zoned Local Date object : "+zonedDateTime2);

}

