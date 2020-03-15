package com.hx.hxdemo.util;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2020-03-15 08:32
 **/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: hongniu_serverManage
 * @description: 带驼峰属性转为SQL带下划线并大写
 * @author: qlinchao
 * @create: 2019-02-18 14:57
 **/
public class ToSql {
    static Pattern p = Pattern.compile("[A-Z]");


    public static String upperCharToUnderLine(String param) {

        if (param == null || param.equals("")) {
            return "";
        }
        StringBuilder builder = new StringBuilder(param);
        Matcher mc = p.matcher(param);
        int i = 0;
        while (mc.find()) {
//            System.out.println(builder.toString());
//            System.out.println("mc.start():" + mc.start() + ", i: " + i);
//            System.out.println("mc.end():" + mc.start() + ", i: " + i);
            builder.replace(mc.start() + i, mc.end() + i, "_" + mc.group().toLowerCase());
            i++;
        }

        if ('_' == builder.charAt(0)) {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }

    public static void main(String[] args) {

//        String[] strArr = {"SubAccount","SubAccName","Order", "TransCode","OtherSubAccount","OtherSubAccName",
//                "CreMoney","PayPayeeSign","SubAccountMoney", "MerchantSqlId","SysSqlId","TradeTimes",
//                "PayOrderid","CurrCode","FeeAmt", "PayBankNo","TranDate","FreezeAccbal",
//
//                "BusiSummary","CustPayFee","MerchantFee","AppType", "FeeFlag","Remark1","Remark2", "TransCodeId","Remark3","Remark4","Remark5"
//        };

        String[] strArr = {"subAccount"};
        for (int i = 0; i <strArr.length ; i++) {
            String s = upperCharToUnderLine(strArr[i]);
            System.out.println(s);
        }


    }
}
