
import java.text.ParseException;
import	java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import	java.util.Date;/**
 * @author xiaoliu
 * @date 2020/4/7 11:00
 */
public class TotolDay4Man {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1996-12-28");
        Date date2 = new Date();
        long l = date2.getTime() - date.getTime();
        if(l<0){
            System.out.println("你还没有出生");
        }else{
            System.out.println("你过了"+l/(1000*60*60*24)+"天");
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR,-2);
        System.out.println(sdf.format(c.getTime()));
        System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        sb.append(true);
        sb.append("11");
        sb.append(12);
        System.out.println("sb="+sb);
        String a = null ;
        String b = "1" ;
       if ((a == b) || (a != null && a.equals(b))){
            System.out.println(true);
        }


    }
}
