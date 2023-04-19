package educarvr.introspring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator{
   private DateFormat format;

   public  void setPattern(String pattern){
       this.format=new SimpleDateFormat(pattern);
   }
    @Override
    public String getPrefix() {
        return format.format(new Date());
    }
}
