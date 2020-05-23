package br.com.martins.valdelar.helper;

import br.com.martins.valdelar.exception.ApiException;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataHelper {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public static LocalDate parseData(String data) throws ApiException {
        try {
            LocalDate localDate = LocalDate.parse(data, FORMATTER);
            validateData(localDate);

            return localDate;
        } catch (DateTimeParseException e) {
            throw new ApiException("Formato de data inválida. O formato deve ser MM-dd-aaaa");
        }
    }

    public static String getDiaUtil(LocalDate localDate) {
        if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY)
            return localDate.minusDays(1).format(FORMATTER);
        else if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY)
            return localDate.minusDays(2).format(FORMATTER);
        else return localDate.format(FORMATTER);
    }

    private static void validateData(LocalDate data) throws ApiException {
        if (data.isAfter(LocalDate.now())) {
            throw new ApiException("A data não pode ser uma data futura");
        }
    }
}
