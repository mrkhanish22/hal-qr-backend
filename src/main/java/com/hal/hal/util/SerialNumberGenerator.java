package com.hal.hal.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class SerialNumberGenerator {

    // Example: HAL-20260207-A1B2
    public static String generateSerial() {

        String date = LocalDate.now()
                .format(DateTimeFormatter.BASIC_ISO_DATE);

        String random = UUID.randomUUID()
                .toString()
                .substring(0, 4)
                .toUpperCase();

        return "HAL-" + date + "-" + random;
    }
}