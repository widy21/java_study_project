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

        String[] strArr = {"topicName","platform","fullFieldName","sampleData","jmqTopicAssetId","fieldName","tag"};

        //todo --
        String tableName = "t_jmq_topic_col_asset";
        String comment = "10.5 获取TOPIC涉及的字段信息";

        StringBuffer sb = new StringBuffer();

        sb.append("# "+comment+"\n");
        sb.append("CREATE TABLE "+tableName+" (\n");
        sb.append("`id` int(10) NOT NULL AUTO_INCREMENT,\n");

//        sb.append("`app_name` varchar(255) NOT NULL,\n");
//        sb.append("`platform` varchar(255) NOT NULL DEFAULT '',\n");

        for (int i = 0; i <strArr.length ; i++) {
            String s = upperCharToUnderLine(strArr[i]);
            sb.append(String.format("`%s` varchar(255) NOT NULL DEFAULT '',\n", s));
//            System.out.println(s);
        }

        sb.append("`create_at` datetime NOT NULL COMMENT 'create time',\n");
        sb.append("`updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n");
        sb.append("PRIMARY KEY (`id`)\n");
        sb.append(") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='"+comment+"'\n");

        System.out.println(sb.toString());
    }
}
