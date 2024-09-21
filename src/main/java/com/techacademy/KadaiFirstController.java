package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;

@RestController
public class KadaiFirstController {
    
    @GetMapping("/dayofweek/{date}")
        public String dispDayOfWeek(@PathVariable String date1) {

            String yyyy = date1.substring(0, 4); // 年
            String mm = date1.substring(4, 6); // 月
            String dd = date1.substring(6, 8); // 日

            Calendar cal = Calendar.getInstance();
            int year = Integer.parseInt(yyyy); // 年
            int month = Integer.parseInt(mm) - 1; // 月
            int date = Integer.parseInt(dd); // 日

            cal.set(year, month, date);

            // 日付から曜日を取得する
            String weekName = "";
            switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: // Calendar.SUNDAY:1
                // 日曜日
                weekName = "日曜日";
                break;
            case Calendar.MONDAY: // Calendar.MONDAY:2
                // 月曜日
                weekName = "月曜日";
                break;
            case Calendar.TUESDAY: // Calendar.TUESDAY:3
                // 火曜日
                weekName = "火曜日";
                break;
            case Calendar.WEDNESDAY: // Calendar.WEDNESDAY:4
                // 水曜日
                weekName = "水曜日";
                break;
            case Calendar.THURSDAY: // Calendar.THURSDAY:5
                // 木曜日
                weekName = "木曜日";
                break;
            case Calendar.FRIDAY: // Calendar.FRIDAY:6
                // 金曜日
                weekName = "金曜日";
                break;
            case Calendar.SATURDAY: // Calendar.SATURDAY:7
                // 土曜日
                weekName = "土曜日";
                break;
            }
            return weekName;
        }
    
 // 足し算
    @GetMapping("/plus/{num1}/{num2}")
    public int calcPlus(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
   
    // 引き算
    @GetMapping("/minus/{num1}/{num2}")
    public int calcMinus(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    // 掛け算
    @GetMapping("/times/{num1}/{num2}")
    public int calcTimes(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    // 割り算
    @GetMapping("/divide/{num1}/{num2}")
    public int calcDivide(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }
       
 }
    

