package com.company;
import java.util.Calendar;


public class GregorianCalendar
{
    public static void main(String[] args)
    {
        //menampilkan tanggal,bulan,tahun saat ini
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());

        //menghitung waktu
        Calendar cal = Calendar.getInstance();
            System.out.println("\n\n\nWaktu sekarang: " + cal.getTime());

        //setel waktu ke 2000millisec setelah 1 januari 1970
        cal.setTimeInMillis(2000); // long millis

            System.out.println("Waktu awal :" + cal.getTime());

    }

}
