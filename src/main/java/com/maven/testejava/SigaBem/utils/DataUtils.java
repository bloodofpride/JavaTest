package com.maven.testejava.SigaBem.utils;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DAY_OF_MONTH;

public class DataUtils {
    public static Date adicionarDias(Date data, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(DAY_OF_MONTH, dias);
        return calendar.getTime();
    }
}
