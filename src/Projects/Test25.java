package Projects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Supplier;

public class Test25 {


    public static void main(String[] args) throws InterruptedException {
         Logger logger = Logger.getLogger(Test25.class.getName());

//        // HashMap -> HashSet
//        Map<Integer, String> map1 = new HashMap<>();
//        Set<Integer> set1 = new HashSet<>(map1.keySet());
//
//        // HashSet -> HashMap
//        Map<Integer, String> map2 = new HashMap<>();
//        Set<Map.Entry<Integer, String>> set2 = map2.entrySet();
//
//        for (Map.Entry<Integer, String> entry : set2) {
//            map2.put(entry.getKey(), entry.getValue());
//        }
//
////        String pattern = "yyyy-MM-dd HH:mm:ss";
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
////        String date = simpleDateFormat.format(new Date());
////        System.out.println(date);
////        System.out.println("hello");

//        Timestamp stamp = new Timestamp(System.currentTimeMillis());
//        System.out.println(stamp);
//        Date date = new Date(stamp.getTime());
//        System.out.println(date);
//
//        Calendar calendar = Calendar.getInstance();
//        Date now = calendar.getTime();
//        System.out.println(now);
//        Timestamp currTime = new Timestamp(now.getTime());
//        System.out.println(currTime);
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime = simpleDateFormat.format(new Date());
//
//        System.out.println();
////        Date currentDate = new Date();
////        Timestamp ts = new Timestamp(currentDate.getTime());
////        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM HH:mm:ss");
////        System.out.println(formatter.format(ts));
//
//
//        Thread.sleep(1000);
//
//        System.out.println(formatter.format(System.currentTimeMillis()));


        LocalDateTime localDateTime = LocalDateTime.parse("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime);

    }
}
