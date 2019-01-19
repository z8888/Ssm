package com.nbsp.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaters {

    // 日期转字符串
    public static  String formater(Date date){
        if(date!=null){
            SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
             return sp.format(date);
        }else{
            return "参数错误";
        }
    }



}
