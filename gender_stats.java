// ORM class for table 'gender_stats'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Feb 04 09:25:39 PST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class gender_stats extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("country_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        country_code = (String)value;
      }
    });
    setters.put("y1960", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1960 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1961", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1961 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1962", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1962 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1963", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1963 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1964", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1964 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1965", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1965 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1966", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1966 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1967", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1967 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1968", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1968 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1969", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1969 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1970", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1970 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1971", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1971 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1972", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1972 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1973", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1973 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1974", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1974 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1975", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1975 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1976", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1976 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1977", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1977 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1978", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1978 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1979", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1979 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1980", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1980 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1981", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1981 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1982", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1982 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1983", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1983 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1984", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1984 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1985", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1985 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1986", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1986 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1987", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1987 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1988", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1988 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1989", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1989 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1990", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1990 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1991", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1991 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1992", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1992 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1993", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1993 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1994", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1994 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1995", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1995 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1996", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1996 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1997", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1997 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1998", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1998 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y1999", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y1999 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2000", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2000 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2001", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2001 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2002", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2002 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2003", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2003 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2004", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2004 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2005", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2005 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2006", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2006 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2007", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2007 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2008", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2008 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2009", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2009 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2010", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2010 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2011", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2011 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2012", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2012 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2013", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2013 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2014", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2014 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2015", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2015 = (java.math.BigDecimal)value;
      }
    });
    setters.put("y2016", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        y2016 = (java.math.BigDecimal)value;
      }
    });
    setters.put("indicator_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        indicator_code = (String)value;
      }
    });
  }
  public gender_stats() {
    init0();
  }
  private String country_code;
  public String get_country_code() {
    return country_code;
  }
  public void set_country_code(String country_code) {
    this.country_code = country_code;
  }
  public gender_stats with_country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }
  private java.math.BigDecimal y1960;
  public java.math.BigDecimal get_y1960() {
    return y1960;
  }
  public void set_y1960(java.math.BigDecimal y1960) {
    this.y1960 = y1960;
  }
  public gender_stats with_y1960(java.math.BigDecimal y1960) {
    this.y1960 = y1960;
    return this;
  }
  private java.math.BigDecimal y1961;
  public java.math.BigDecimal get_y1961() {
    return y1961;
  }
  public void set_y1961(java.math.BigDecimal y1961) {
    this.y1961 = y1961;
  }
  public gender_stats with_y1961(java.math.BigDecimal y1961) {
    this.y1961 = y1961;
    return this;
  }
  private java.math.BigDecimal y1962;
  public java.math.BigDecimal get_y1962() {
    return y1962;
  }
  public void set_y1962(java.math.BigDecimal y1962) {
    this.y1962 = y1962;
  }
  public gender_stats with_y1962(java.math.BigDecimal y1962) {
    this.y1962 = y1962;
    return this;
  }
  private java.math.BigDecimal y1963;
  public java.math.BigDecimal get_y1963() {
    return y1963;
  }
  public void set_y1963(java.math.BigDecimal y1963) {
    this.y1963 = y1963;
  }
  public gender_stats with_y1963(java.math.BigDecimal y1963) {
    this.y1963 = y1963;
    return this;
  }
  private java.math.BigDecimal y1964;
  public java.math.BigDecimal get_y1964() {
    return y1964;
  }
  public void set_y1964(java.math.BigDecimal y1964) {
    this.y1964 = y1964;
  }
  public gender_stats with_y1964(java.math.BigDecimal y1964) {
    this.y1964 = y1964;
    return this;
  }
  private java.math.BigDecimal y1965;
  public java.math.BigDecimal get_y1965() {
    return y1965;
  }
  public void set_y1965(java.math.BigDecimal y1965) {
    this.y1965 = y1965;
  }
  public gender_stats with_y1965(java.math.BigDecimal y1965) {
    this.y1965 = y1965;
    return this;
  }
  private java.math.BigDecimal y1966;
  public java.math.BigDecimal get_y1966() {
    return y1966;
  }
  public void set_y1966(java.math.BigDecimal y1966) {
    this.y1966 = y1966;
  }
  public gender_stats with_y1966(java.math.BigDecimal y1966) {
    this.y1966 = y1966;
    return this;
  }
  private java.math.BigDecimal y1967;
  public java.math.BigDecimal get_y1967() {
    return y1967;
  }
  public void set_y1967(java.math.BigDecimal y1967) {
    this.y1967 = y1967;
  }
  public gender_stats with_y1967(java.math.BigDecimal y1967) {
    this.y1967 = y1967;
    return this;
  }
  private java.math.BigDecimal y1968;
  public java.math.BigDecimal get_y1968() {
    return y1968;
  }
  public void set_y1968(java.math.BigDecimal y1968) {
    this.y1968 = y1968;
  }
  public gender_stats with_y1968(java.math.BigDecimal y1968) {
    this.y1968 = y1968;
    return this;
  }
  private java.math.BigDecimal y1969;
  public java.math.BigDecimal get_y1969() {
    return y1969;
  }
  public void set_y1969(java.math.BigDecimal y1969) {
    this.y1969 = y1969;
  }
  public gender_stats with_y1969(java.math.BigDecimal y1969) {
    this.y1969 = y1969;
    return this;
  }
  private java.math.BigDecimal y1970;
  public java.math.BigDecimal get_y1970() {
    return y1970;
  }
  public void set_y1970(java.math.BigDecimal y1970) {
    this.y1970 = y1970;
  }
  public gender_stats with_y1970(java.math.BigDecimal y1970) {
    this.y1970 = y1970;
    return this;
  }
  private java.math.BigDecimal y1971;
  public java.math.BigDecimal get_y1971() {
    return y1971;
  }
  public void set_y1971(java.math.BigDecimal y1971) {
    this.y1971 = y1971;
  }
  public gender_stats with_y1971(java.math.BigDecimal y1971) {
    this.y1971 = y1971;
    return this;
  }
  private java.math.BigDecimal y1972;
  public java.math.BigDecimal get_y1972() {
    return y1972;
  }
  public void set_y1972(java.math.BigDecimal y1972) {
    this.y1972 = y1972;
  }
  public gender_stats with_y1972(java.math.BigDecimal y1972) {
    this.y1972 = y1972;
    return this;
  }
  private java.math.BigDecimal y1973;
  public java.math.BigDecimal get_y1973() {
    return y1973;
  }
  public void set_y1973(java.math.BigDecimal y1973) {
    this.y1973 = y1973;
  }
  public gender_stats with_y1973(java.math.BigDecimal y1973) {
    this.y1973 = y1973;
    return this;
  }
  private java.math.BigDecimal y1974;
  public java.math.BigDecimal get_y1974() {
    return y1974;
  }
  public void set_y1974(java.math.BigDecimal y1974) {
    this.y1974 = y1974;
  }
  public gender_stats with_y1974(java.math.BigDecimal y1974) {
    this.y1974 = y1974;
    return this;
  }
  private java.math.BigDecimal y1975;
  public java.math.BigDecimal get_y1975() {
    return y1975;
  }
  public void set_y1975(java.math.BigDecimal y1975) {
    this.y1975 = y1975;
  }
  public gender_stats with_y1975(java.math.BigDecimal y1975) {
    this.y1975 = y1975;
    return this;
  }
  private java.math.BigDecimal y1976;
  public java.math.BigDecimal get_y1976() {
    return y1976;
  }
  public void set_y1976(java.math.BigDecimal y1976) {
    this.y1976 = y1976;
  }
  public gender_stats with_y1976(java.math.BigDecimal y1976) {
    this.y1976 = y1976;
    return this;
  }
  private java.math.BigDecimal y1977;
  public java.math.BigDecimal get_y1977() {
    return y1977;
  }
  public void set_y1977(java.math.BigDecimal y1977) {
    this.y1977 = y1977;
  }
  public gender_stats with_y1977(java.math.BigDecimal y1977) {
    this.y1977 = y1977;
    return this;
  }
  private java.math.BigDecimal y1978;
  public java.math.BigDecimal get_y1978() {
    return y1978;
  }
  public void set_y1978(java.math.BigDecimal y1978) {
    this.y1978 = y1978;
  }
  public gender_stats with_y1978(java.math.BigDecimal y1978) {
    this.y1978 = y1978;
    return this;
  }
  private java.math.BigDecimal y1979;
  public java.math.BigDecimal get_y1979() {
    return y1979;
  }
  public void set_y1979(java.math.BigDecimal y1979) {
    this.y1979 = y1979;
  }
  public gender_stats with_y1979(java.math.BigDecimal y1979) {
    this.y1979 = y1979;
    return this;
  }
  private java.math.BigDecimal y1980;
  public java.math.BigDecimal get_y1980() {
    return y1980;
  }
  public void set_y1980(java.math.BigDecimal y1980) {
    this.y1980 = y1980;
  }
  public gender_stats with_y1980(java.math.BigDecimal y1980) {
    this.y1980 = y1980;
    return this;
  }
  private java.math.BigDecimal y1981;
  public java.math.BigDecimal get_y1981() {
    return y1981;
  }
  public void set_y1981(java.math.BigDecimal y1981) {
    this.y1981 = y1981;
  }
  public gender_stats with_y1981(java.math.BigDecimal y1981) {
    this.y1981 = y1981;
    return this;
  }
  private java.math.BigDecimal y1982;
  public java.math.BigDecimal get_y1982() {
    return y1982;
  }
  public void set_y1982(java.math.BigDecimal y1982) {
    this.y1982 = y1982;
  }
  public gender_stats with_y1982(java.math.BigDecimal y1982) {
    this.y1982 = y1982;
    return this;
  }
  private java.math.BigDecimal y1983;
  public java.math.BigDecimal get_y1983() {
    return y1983;
  }
  public void set_y1983(java.math.BigDecimal y1983) {
    this.y1983 = y1983;
  }
  public gender_stats with_y1983(java.math.BigDecimal y1983) {
    this.y1983 = y1983;
    return this;
  }
  private java.math.BigDecimal y1984;
  public java.math.BigDecimal get_y1984() {
    return y1984;
  }
  public void set_y1984(java.math.BigDecimal y1984) {
    this.y1984 = y1984;
  }
  public gender_stats with_y1984(java.math.BigDecimal y1984) {
    this.y1984 = y1984;
    return this;
  }
  private java.math.BigDecimal y1985;
  public java.math.BigDecimal get_y1985() {
    return y1985;
  }
  public void set_y1985(java.math.BigDecimal y1985) {
    this.y1985 = y1985;
  }
  public gender_stats with_y1985(java.math.BigDecimal y1985) {
    this.y1985 = y1985;
    return this;
  }
  private java.math.BigDecimal y1986;
  public java.math.BigDecimal get_y1986() {
    return y1986;
  }
  public void set_y1986(java.math.BigDecimal y1986) {
    this.y1986 = y1986;
  }
  public gender_stats with_y1986(java.math.BigDecimal y1986) {
    this.y1986 = y1986;
    return this;
  }
  private java.math.BigDecimal y1987;
  public java.math.BigDecimal get_y1987() {
    return y1987;
  }
  public void set_y1987(java.math.BigDecimal y1987) {
    this.y1987 = y1987;
  }
  public gender_stats with_y1987(java.math.BigDecimal y1987) {
    this.y1987 = y1987;
    return this;
  }
  private java.math.BigDecimal y1988;
  public java.math.BigDecimal get_y1988() {
    return y1988;
  }
  public void set_y1988(java.math.BigDecimal y1988) {
    this.y1988 = y1988;
  }
  public gender_stats with_y1988(java.math.BigDecimal y1988) {
    this.y1988 = y1988;
    return this;
  }
  private java.math.BigDecimal y1989;
  public java.math.BigDecimal get_y1989() {
    return y1989;
  }
  public void set_y1989(java.math.BigDecimal y1989) {
    this.y1989 = y1989;
  }
  public gender_stats with_y1989(java.math.BigDecimal y1989) {
    this.y1989 = y1989;
    return this;
  }
  private java.math.BigDecimal y1990;
  public java.math.BigDecimal get_y1990() {
    return y1990;
  }
  public void set_y1990(java.math.BigDecimal y1990) {
    this.y1990 = y1990;
  }
  public gender_stats with_y1990(java.math.BigDecimal y1990) {
    this.y1990 = y1990;
    return this;
  }
  private java.math.BigDecimal y1991;
  public java.math.BigDecimal get_y1991() {
    return y1991;
  }
  public void set_y1991(java.math.BigDecimal y1991) {
    this.y1991 = y1991;
  }
  public gender_stats with_y1991(java.math.BigDecimal y1991) {
    this.y1991 = y1991;
    return this;
  }
  private java.math.BigDecimal y1992;
  public java.math.BigDecimal get_y1992() {
    return y1992;
  }
  public void set_y1992(java.math.BigDecimal y1992) {
    this.y1992 = y1992;
  }
  public gender_stats with_y1992(java.math.BigDecimal y1992) {
    this.y1992 = y1992;
    return this;
  }
  private java.math.BigDecimal y1993;
  public java.math.BigDecimal get_y1993() {
    return y1993;
  }
  public void set_y1993(java.math.BigDecimal y1993) {
    this.y1993 = y1993;
  }
  public gender_stats with_y1993(java.math.BigDecimal y1993) {
    this.y1993 = y1993;
    return this;
  }
  private java.math.BigDecimal y1994;
  public java.math.BigDecimal get_y1994() {
    return y1994;
  }
  public void set_y1994(java.math.BigDecimal y1994) {
    this.y1994 = y1994;
  }
  public gender_stats with_y1994(java.math.BigDecimal y1994) {
    this.y1994 = y1994;
    return this;
  }
  private java.math.BigDecimal y1995;
  public java.math.BigDecimal get_y1995() {
    return y1995;
  }
  public void set_y1995(java.math.BigDecimal y1995) {
    this.y1995 = y1995;
  }
  public gender_stats with_y1995(java.math.BigDecimal y1995) {
    this.y1995 = y1995;
    return this;
  }
  private java.math.BigDecimal y1996;
  public java.math.BigDecimal get_y1996() {
    return y1996;
  }
  public void set_y1996(java.math.BigDecimal y1996) {
    this.y1996 = y1996;
  }
  public gender_stats with_y1996(java.math.BigDecimal y1996) {
    this.y1996 = y1996;
    return this;
  }
  private java.math.BigDecimal y1997;
  public java.math.BigDecimal get_y1997() {
    return y1997;
  }
  public void set_y1997(java.math.BigDecimal y1997) {
    this.y1997 = y1997;
  }
  public gender_stats with_y1997(java.math.BigDecimal y1997) {
    this.y1997 = y1997;
    return this;
  }
  private java.math.BigDecimal y1998;
  public java.math.BigDecimal get_y1998() {
    return y1998;
  }
  public void set_y1998(java.math.BigDecimal y1998) {
    this.y1998 = y1998;
  }
  public gender_stats with_y1998(java.math.BigDecimal y1998) {
    this.y1998 = y1998;
    return this;
  }
  private java.math.BigDecimal y1999;
  public java.math.BigDecimal get_y1999() {
    return y1999;
  }
  public void set_y1999(java.math.BigDecimal y1999) {
    this.y1999 = y1999;
  }
  public gender_stats with_y1999(java.math.BigDecimal y1999) {
    this.y1999 = y1999;
    return this;
  }
  private java.math.BigDecimal y2000;
  public java.math.BigDecimal get_y2000() {
    return y2000;
  }
  public void set_y2000(java.math.BigDecimal y2000) {
    this.y2000 = y2000;
  }
  public gender_stats with_y2000(java.math.BigDecimal y2000) {
    this.y2000 = y2000;
    return this;
  }
  private java.math.BigDecimal y2001;
  public java.math.BigDecimal get_y2001() {
    return y2001;
  }
  public void set_y2001(java.math.BigDecimal y2001) {
    this.y2001 = y2001;
  }
  public gender_stats with_y2001(java.math.BigDecimal y2001) {
    this.y2001 = y2001;
    return this;
  }
  private java.math.BigDecimal y2002;
  public java.math.BigDecimal get_y2002() {
    return y2002;
  }
  public void set_y2002(java.math.BigDecimal y2002) {
    this.y2002 = y2002;
  }
  public gender_stats with_y2002(java.math.BigDecimal y2002) {
    this.y2002 = y2002;
    return this;
  }
  private java.math.BigDecimal y2003;
  public java.math.BigDecimal get_y2003() {
    return y2003;
  }
  public void set_y2003(java.math.BigDecimal y2003) {
    this.y2003 = y2003;
  }
  public gender_stats with_y2003(java.math.BigDecimal y2003) {
    this.y2003 = y2003;
    return this;
  }
  private java.math.BigDecimal y2004;
  public java.math.BigDecimal get_y2004() {
    return y2004;
  }
  public void set_y2004(java.math.BigDecimal y2004) {
    this.y2004 = y2004;
  }
  public gender_stats with_y2004(java.math.BigDecimal y2004) {
    this.y2004 = y2004;
    return this;
  }
  private java.math.BigDecimal y2005;
  public java.math.BigDecimal get_y2005() {
    return y2005;
  }
  public void set_y2005(java.math.BigDecimal y2005) {
    this.y2005 = y2005;
  }
  public gender_stats with_y2005(java.math.BigDecimal y2005) {
    this.y2005 = y2005;
    return this;
  }
  private java.math.BigDecimal y2006;
  public java.math.BigDecimal get_y2006() {
    return y2006;
  }
  public void set_y2006(java.math.BigDecimal y2006) {
    this.y2006 = y2006;
  }
  public gender_stats with_y2006(java.math.BigDecimal y2006) {
    this.y2006 = y2006;
    return this;
  }
  private java.math.BigDecimal y2007;
  public java.math.BigDecimal get_y2007() {
    return y2007;
  }
  public void set_y2007(java.math.BigDecimal y2007) {
    this.y2007 = y2007;
  }
  public gender_stats with_y2007(java.math.BigDecimal y2007) {
    this.y2007 = y2007;
    return this;
  }
  private java.math.BigDecimal y2008;
  public java.math.BigDecimal get_y2008() {
    return y2008;
  }
  public void set_y2008(java.math.BigDecimal y2008) {
    this.y2008 = y2008;
  }
  public gender_stats with_y2008(java.math.BigDecimal y2008) {
    this.y2008 = y2008;
    return this;
  }
  private java.math.BigDecimal y2009;
  public java.math.BigDecimal get_y2009() {
    return y2009;
  }
  public void set_y2009(java.math.BigDecimal y2009) {
    this.y2009 = y2009;
  }
  public gender_stats with_y2009(java.math.BigDecimal y2009) {
    this.y2009 = y2009;
    return this;
  }
  private java.math.BigDecimal y2010;
  public java.math.BigDecimal get_y2010() {
    return y2010;
  }
  public void set_y2010(java.math.BigDecimal y2010) {
    this.y2010 = y2010;
  }
  public gender_stats with_y2010(java.math.BigDecimal y2010) {
    this.y2010 = y2010;
    return this;
  }
  private java.math.BigDecimal y2011;
  public java.math.BigDecimal get_y2011() {
    return y2011;
  }
  public void set_y2011(java.math.BigDecimal y2011) {
    this.y2011 = y2011;
  }
  public gender_stats with_y2011(java.math.BigDecimal y2011) {
    this.y2011 = y2011;
    return this;
  }
  private java.math.BigDecimal y2012;
  public java.math.BigDecimal get_y2012() {
    return y2012;
  }
  public void set_y2012(java.math.BigDecimal y2012) {
    this.y2012 = y2012;
  }
  public gender_stats with_y2012(java.math.BigDecimal y2012) {
    this.y2012 = y2012;
    return this;
  }
  private java.math.BigDecimal y2013;
  public java.math.BigDecimal get_y2013() {
    return y2013;
  }
  public void set_y2013(java.math.BigDecimal y2013) {
    this.y2013 = y2013;
  }
  public gender_stats with_y2013(java.math.BigDecimal y2013) {
    this.y2013 = y2013;
    return this;
  }
  private java.math.BigDecimal y2014;
  public java.math.BigDecimal get_y2014() {
    return y2014;
  }
  public void set_y2014(java.math.BigDecimal y2014) {
    this.y2014 = y2014;
  }
  public gender_stats with_y2014(java.math.BigDecimal y2014) {
    this.y2014 = y2014;
    return this;
  }
  private java.math.BigDecimal y2015;
  public java.math.BigDecimal get_y2015() {
    return y2015;
  }
  public void set_y2015(java.math.BigDecimal y2015) {
    this.y2015 = y2015;
  }
  public gender_stats with_y2015(java.math.BigDecimal y2015) {
    this.y2015 = y2015;
    return this;
  }
  private java.math.BigDecimal y2016;
  public java.math.BigDecimal get_y2016() {
    return y2016;
  }
  public void set_y2016(java.math.BigDecimal y2016) {
    this.y2016 = y2016;
  }
  public gender_stats with_y2016(java.math.BigDecimal y2016) {
    this.y2016 = y2016;
    return this;
  }
  private String indicator_code;
  public String get_indicator_code() {
    return indicator_code;
  }
  public void set_indicator_code(String indicator_code) {
    this.indicator_code = indicator_code;
  }
  public gender_stats with_indicator_code(String indicator_code) {
    this.indicator_code = indicator_code;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof gender_stats)) {
      return false;
    }
    gender_stats that = (gender_stats) o;
    boolean equal = true;
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.y1960 == null ? that.y1960 == null : this.y1960.equals(that.y1960));
    equal = equal && (this.y1961 == null ? that.y1961 == null : this.y1961.equals(that.y1961));
    equal = equal && (this.y1962 == null ? that.y1962 == null : this.y1962.equals(that.y1962));
    equal = equal && (this.y1963 == null ? that.y1963 == null : this.y1963.equals(that.y1963));
    equal = equal && (this.y1964 == null ? that.y1964 == null : this.y1964.equals(that.y1964));
    equal = equal && (this.y1965 == null ? that.y1965 == null : this.y1965.equals(that.y1965));
    equal = equal && (this.y1966 == null ? that.y1966 == null : this.y1966.equals(that.y1966));
    equal = equal && (this.y1967 == null ? that.y1967 == null : this.y1967.equals(that.y1967));
    equal = equal && (this.y1968 == null ? that.y1968 == null : this.y1968.equals(that.y1968));
    equal = equal && (this.y1969 == null ? that.y1969 == null : this.y1969.equals(that.y1969));
    equal = equal && (this.y1970 == null ? that.y1970 == null : this.y1970.equals(that.y1970));
    equal = equal && (this.y1971 == null ? that.y1971 == null : this.y1971.equals(that.y1971));
    equal = equal && (this.y1972 == null ? that.y1972 == null : this.y1972.equals(that.y1972));
    equal = equal && (this.y1973 == null ? that.y1973 == null : this.y1973.equals(that.y1973));
    equal = equal && (this.y1974 == null ? that.y1974 == null : this.y1974.equals(that.y1974));
    equal = equal && (this.y1975 == null ? that.y1975 == null : this.y1975.equals(that.y1975));
    equal = equal && (this.y1976 == null ? that.y1976 == null : this.y1976.equals(that.y1976));
    equal = equal && (this.y1977 == null ? that.y1977 == null : this.y1977.equals(that.y1977));
    equal = equal && (this.y1978 == null ? that.y1978 == null : this.y1978.equals(that.y1978));
    equal = equal && (this.y1979 == null ? that.y1979 == null : this.y1979.equals(that.y1979));
    equal = equal && (this.y1980 == null ? that.y1980 == null : this.y1980.equals(that.y1980));
    equal = equal && (this.y1981 == null ? that.y1981 == null : this.y1981.equals(that.y1981));
    equal = equal && (this.y1982 == null ? that.y1982 == null : this.y1982.equals(that.y1982));
    equal = equal && (this.y1983 == null ? that.y1983 == null : this.y1983.equals(that.y1983));
    equal = equal && (this.y1984 == null ? that.y1984 == null : this.y1984.equals(that.y1984));
    equal = equal && (this.y1985 == null ? that.y1985 == null : this.y1985.equals(that.y1985));
    equal = equal && (this.y1986 == null ? that.y1986 == null : this.y1986.equals(that.y1986));
    equal = equal && (this.y1987 == null ? that.y1987 == null : this.y1987.equals(that.y1987));
    equal = equal && (this.y1988 == null ? that.y1988 == null : this.y1988.equals(that.y1988));
    equal = equal && (this.y1989 == null ? that.y1989 == null : this.y1989.equals(that.y1989));
    equal = equal && (this.y1990 == null ? that.y1990 == null : this.y1990.equals(that.y1990));
    equal = equal && (this.y1991 == null ? that.y1991 == null : this.y1991.equals(that.y1991));
    equal = equal && (this.y1992 == null ? that.y1992 == null : this.y1992.equals(that.y1992));
    equal = equal && (this.y1993 == null ? that.y1993 == null : this.y1993.equals(that.y1993));
    equal = equal && (this.y1994 == null ? that.y1994 == null : this.y1994.equals(that.y1994));
    equal = equal && (this.y1995 == null ? that.y1995 == null : this.y1995.equals(that.y1995));
    equal = equal && (this.y1996 == null ? that.y1996 == null : this.y1996.equals(that.y1996));
    equal = equal && (this.y1997 == null ? that.y1997 == null : this.y1997.equals(that.y1997));
    equal = equal && (this.y1998 == null ? that.y1998 == null : this.y1998.equals(that.y1998));
    equal = equal && (this.y1999 == null ? that.y1999 == null : this.y1999.equals(that.y1999));
    equal = equal && (this.y2000 == null ? that.y2000 == null : this.y2000.equals(that.y2000));
    equal = equal && (this.y2001 == null ? that.y2001 == null : this.y2001.equals(that.y2001));
    equal = equal && (this.y2002 == null ? that.y2002 == null : this.y2002.equals(that.y2002));
    equal = equal && (this.y2003 == null ? that.y2003 == null : this.y2003.equals(that.y2003));
    equal = equal && (this.y2004 == null ? that.y2004 == null : this.y2004.equals(that.y2004));
    equal = equal && (this.y2005 == null ? that.y2005 == null : this.y2005.equals(that.y2005));
    equal = equal && (this.y2006 == null ? that.y2006 == null : this.y2006.equals(that.y2006));
    equal = equal && (this.y2007 == null ? that.y2007 == null : this.y2007.equals(that.y2007));
    equal = equal && (this.y2008 == null ? that.y2008 == null : this.y2008.equals(that.y2008));
    equal = equal && (this.y2009 == null ? that.y2009 == null : this.y2009.equals(that.y2009));
    equal = equal && (this.y2010 == null ? that.y2010 == null : this.y2010.equals(that.y2010));
    equal = equal && (this.y2011 == null ? that.y2011 == null : this.y2011.equals(that.y2011));
    equal = equal && (this.y2012 == null ? that.y2012 == null : this.y2012.equals(that.y2012));
    equal = equal && (this.y2013 == null ? that.y2013 == null : this.y2013.equals(that.y2013));
    equal = equal && (this.y2014 == null ? that.y2014 == null : this.y2014.equals(that.y2014));
    equal = equal && (this.y2015 == null ? that.y2015 == null : this.y2015.equals(that.y2015));
    equal = equal && (this.y2016 == null ? that.y2016 == null : this.y2016.equals(that.y2016));
    equal = equal && (this.indicator_code == null ? that.indicator_code == null : this.indicator_code.equals(that.indicator_code));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof gender_stats)) {
      return false;
    }
    gender_stats that = (gender_stats) o;
    boolean equal = true;
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.y1960 == null ? that.y1960 == null : this.y1960.equals(that.y1960));
    equal = equal && (this.y1961 == null ? that.y1961 == null : this.y1961.equals(that.y1961));
    equal = equal && (this.y1962 == null ? that.y1962 == null : this.y1962.equals(that.y1962));
    equal = equal && (this.y1963 == null ? that.y1963 == null : this.y1963.equals(that.y1963));
    equal = equal && (this.y1964 == null ? that.y1964 == null : this.y1964.equals(that.y1964));
    equal = equal && (this.y1965 == null ? that.y1965 == null : this.y1965.equals(that.y1965));
    equal = equal && (this.y1966 == null ? that.y1966 == null : this.y1966.equals(that.y1966));
    equal = equal && (this.y1967 == null ? that.y1967 == null : this.y1967.equals(that.y1967));
    equal = equal && (this.y1968 == null ? that.y1968 == null : this.y1968.equals(that.y1968));
    equal = equal && (this.y1969 == null ? that.y1969 == null : this.y1969.equals(that.y1969));
    equal = equal && (this.y1970 == null ? that.y1970 == null : this.y1970.equals(that.y1970));
    equal = equal && (this.y1971 == null ? that.y1971 == null : this.y1971.equals(that.y1971));
    equal = equal && (this.y1972 == null ? that.y1972 == null : this.y1972.equals(that.y1972));
    equal = equal && (this.y1973 == null ? that.y1973 == null : this.y1973.equals(that.y1973));
    equal = equal && (this.y1974 == null ? that.y1974 == null : this.y1974.equals(that.y1974));
    equal = equal && (this.y1975 == null ? that.y1975 == null : this.y1975.equals(that.y1975));
    equal = equal && (this.y1976 == null ? that.y1976 == null : this.y1976.equals(that.y1976));
    equal = equal && (this.y1977 == null ? that.y1977 == null : this.y1977.equals(that.y1977));
    equal = equal && (this.y1978 == null ? that.y1978 == null : this.y1978.equals(that.y1978));
    equal = equal && (this.y1979 == null ? that.y1979 == null : this.y1979.equals(that.y1979));
    equal = equal && (this.y1980 == null ? that.y1980 == null : this.y1980.equals(that.y1980));
    equal = equal && (this.y1981 == null ? that.y1981 == null : this.y1981.equals(that.y1981));
    equal = equal && (this.y1982 == null ? that.y1982 == null : this.y1982.equals(that.y1982));
    equal = equal && (this.y1983 == null ? that.y1983 == null : this.y1983.equals(that.y1983));
    equal = equal && (this.y1984 == null ? that.y1984 == null : this.y1984.equals(that.y1984));
    equal = equal && (this.y1985 == null ? that.y1985 == null : this.y1985.equals(that.y1985));
    equal = equal && (this.y1986 == null ? that.y1986 == null : this.y1986.equals(that.y1986));
    equal = equal && (this.y1987 == null ? that.y1987 == null : this.y1987.equals(that.y1987));
    equal = equal && (this.y1988 == null ? that.y1988 == null : this.y1988.equals(that.y1988));
    equal = equal && (this.y1989 == null ? that.y1989 == null : this.y1989.equals(that.y1989));
    equal = equal && (this.y1990 == null ? that.y1990 == null : this.y1990.equals(that.y1990));
    equal = equal && (this.y1991 == null ? that.y1991 == null : this.y1991.equals(that.y1991));
    equal = equal && (this.y1992 == null ? that.y1992 == null : this.y1992.equals(that.y1992));
    equal = equal && (this.y1993 == null ? that.y1993 == null : this.y1993.equals(that.y1993));
    equal = equal && (this.y1994 == null ? that.y1994 == null : this.y1994.equals(that.y1994));
    equal = equal && (this.y1995 == null ? that.y1995 == null : this.y1995.equals(that.y1995));
    equal = equal && (this.y1996 == null ? that.y1996 == null : this.y1996.equals(that.y1996));
    equal = equal && (this.y1997 == null ? that.y1997 == null : this.y1997.equals(that.y1997));
    equal = equal && (this.y1998 == null ? that.y1998 == null : this.y1998.equals(that.y1998));
    equal = equal && (this.y1999 == null ? that.y1999 == null : this.y1999.equals(that.y1999));
    equal = equal && (this.y2000 == null ? that.y2000 == null : this.y2000.equals(that.y2000));
    equal = equal && (this.y2001 == null ? that.y2001 == null : this.y2001.equals(that.y2001));
    equal = equal && (this.y2002 == null ? that.y2002 == null : this.y2002.equals(that.y2002));
    equal = equal && (this.y2003 == null ? that.y2003 == null : this.y2003.equals(that.y2003));
    equal = equal && (this.y2004 == null ? that.y2004 == null : this.y2004.equals(that.y2004));
    equal = equal && (this.y2005 == null ? that.y2005 == null : this.y2005.equals(that.y2005));
    equal = equal && (this.y2006 == null ? that.y2006 == null : this.y2006.equals(that.y2006));
    equal = equal && (this.y2007 == null ? that.y2007 == null : this.y2007.equals(that.y2007));
    equal = equal && (this.y2008 == null ? that.y2008 == null : this.y2008.equals(that.y2008));
    equal = equal && (this.y2009 == null ? that.y2009 == null : this.y2009.equals(that.y2009));
    equal = equal && (this.y2010 == null ? that.y2010 == null : this.y2010.equals(that.y2010));
    equal = equal && (this.y2011 == null ? that.y2011 == null : this.y2011.equals(that.y2011));
    equal = equal && (this.y2012 == null ? that.y2012 == null : this.y2012.equals(that.y2012));
    equal = equal && (this.y2013 == null ? that.y2013 == null : this.y2013.equals(that.y2013));
    equal = equal && (this.y2014 == null ? that.y2014 == null : this.y2014.equals(that.y2014));
    equal = equal && (this.y2015 == null ? that.y2015 == null : this.y2015.equals(that.y2015));
    equal = equal && (this.y2016 == null ? that.y2016 == null : this.y2016.equals(that.y2016));
    equal = equal && (this.indicator_code == null ? that.indicator_code == null : this.indicator_code.equals(that.indicator_code));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.country_code = JdbcWritableBridge.readString(1, __dbResults);
    this.y1960 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.y1961 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.y1962 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.y1963 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.y1964 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.y1965 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.y1966 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.y1967 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.y1968 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.y1969 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.y1970 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.y1971 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.y1972 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.y1973 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.y1974 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.y1975 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.y1976 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.y1977 = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.y1978 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.y1979 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.y1980 = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.y1981 = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.y1982 = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.y1983 = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.y1984 = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.y1985 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.y1986 = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.y1987 = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.y1988 = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.y1989 = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.y1990 = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.y1991 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.y1992 = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.y1993 = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.y1994 = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.y1995 = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.y1996 = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.y1997 = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.y1998 = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.y1999 = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.y2000 = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.y2001 = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.y2002 = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.y2003 = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.y2004 = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.y2005 = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.y2006 = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.y2007 = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.y2008 = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.y2009 = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.y2010 = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.y2011 = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.y2012 = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.y2013 = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.y2014 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.y2015 = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.y2016 = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.indicator_code = JdbcWritableBridge.readString(59, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.country_code = JdbcWritableBridge.readString(1, __dbResults);
    this.y1960 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.y1961 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.y1962 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.y1963 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.y1964 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.y1965 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.y1966 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.y1967 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.y1968 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.y1969 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.y1970 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.y1971 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.y1972 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.y1973 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.y1974 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.y1975 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.y1976 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.y1977 = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.y1978 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.y1979 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.y1980 = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.y1981 = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.y1982 = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.y1983 = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.y1984 = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.y1985 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.y1986 = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.y1987 = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.y1988 = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.y1989 = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.y1990 = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.y1991 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.y1992 = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.y1993 = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.y1994 = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.y1995 = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.y1996 = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.y1997 = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.y1998 = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.y1999 = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.y2000 = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.y2001 = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.y2002 = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.y2003 = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.y2004 = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.y2005 = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.y2006 = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.y2007 = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.y2008 = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.y2009 = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.y2010 = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.y2011 = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.y2012 = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.y2013 = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.y2014 = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.y2015 = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.y2016 = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.indicator_code = JdbcWritableBridge.readString(59, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(country_code, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1960, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1961, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1962, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1963, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1964, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1965, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1966, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1967, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1968, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1969, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1970, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1971, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1972, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1973, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1974, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1975, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1976, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1977, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1978, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1979, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1980, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1981, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1982, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1983, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1984, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1985, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1986, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1987, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1988, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1989, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1990, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1991, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1992, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1993, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1994, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1995, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1996, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1997, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1998, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1999, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2000, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2001, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2002, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2003, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2004, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2005, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2006, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2007, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2008, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2009, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2010, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2011, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2012, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2013, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2014, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2015, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2016, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(indicator_code, 59 + __off, 12, __dbStmt);
    return 59;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(country_code, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1960, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1961, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1962, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1963, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1964, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1965, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1966, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1967, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1968, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1969, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1970, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1971, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1972, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1973, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1974, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1975, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1976, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1977, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1978, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1979, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1980, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1981, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1982, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1983, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1984, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1985, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1986, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1987, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1988, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1989, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1990, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1991, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1992, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1993, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1994, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1995, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1996, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1997, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1998, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y1999, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2000, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2001, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2002, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2003, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2004, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2005, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2006, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2007, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2008, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2009, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2010, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2011, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2012, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2013, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2014, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2015, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2016, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(indicator_code, 59 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.country_code = null;
    } else {
    this.country_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1960 = null;
    } else {
    this.y1960 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1961 = null;
    } else {
    this.y1961 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1962 = null;
    } else {
    this.y1962 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1963 = null;
    } else {
    this.y1963 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1964 = null;
    } else {
    this.y1964 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1965 = null;
    } else {
    this.y1965 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1966 = null;
    } else {
    this.y1966 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1967 = null;
    } else {
    this.y1967 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1968 = null;
    } else {
    this.y1968 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1969 = null;
    } else {
    this.y1969 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1970 = null;
    } else {
    this.y1970 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1971 = null;
    } else {
    this.y1971 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1972 = null;
    } else {
    this.y1972 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1973 = null;
    } else {
    this.y1973 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1974 = null;
    } else {
    this.y1974 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1975 = null;
    } else {
    this.y1975 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1976 = null;
    } else {
    this.y1976 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1977 = null;
    } else {
    this.y1977 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1978 = null;
    } else {
    this.y1978 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1979 = null;
    } else {
    this.y1979 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1980 = null;
    } else {
    this.y1980 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1981 = null;
    } else {
    this.y1981 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1982 = null;
    } else {
    this.y1982 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1983 = null;
    } else {
    this.y1983 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1984 = null;
    } else {
    this.y1984 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1985 = null;
    } else {
    this.y1985 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1986 = null;
    } else {
    this.y1986 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1987 = null;
    } else {
    this.y1987 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1988 = null;
    } else {
    this.y1988 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1989 = null;
    } else {
    this.y1989 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1990 = null;
    } else {
    this.y1990 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1991 = null;
    } else {
    this.y1991 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1992 = null;
    } else {
    this.y1992 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1993 = null;
    } else {
    this.y1993 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1994 = null;
    } else {
    this.y1994 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1995 = null;
    } else {
    this.y1995 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1996 = null;
    } else {
    this.y1996 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1997 = null;
    } else {
    this.y1997 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1998 = null;
    } else {
    this.y1998 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y1999 = null;
    } else {
    this.y1999 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2000 = null;
    } else {
    this.y2000 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2001 = null;
    } else {
    this.y2001 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2002 = null;
    } else {
    this.y2002 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2003 = null;
    } else {
    this.y2003 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2004 = null;
    } else {
    this.y2004 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2005 = null;
    } else {
    this.y2005 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2006 = null;
    } else {
    this.y2006 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2007 = null;
    } else {
    this.y2007 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2008 = null;
    } else {
    this.y2008 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2009 = null;
    } else {
    this.y2009 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2010 = null;
    } else {
    this.y2010 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2011 = null;
    } else {
    this.y2011 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2012 = null;
    } else {
    this.y2012 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2013 = null;
    } else {
    this.y2013 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2014 = null;
    } else {
    this.y2014 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2015 = null;
    } else {
    this.y2015 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.y2016 = null;
    } else {
    this.y2016 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.indicator_code = null;
    } else {
    this.indicator_code = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.y1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1960, __dataOut);
    }
    if (null == this.y1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1961, __dataOut);
    }
    if (null == this.y1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1962, __dataOut);
    }
    if (null == this.y1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1963, __dataOut);
    }
    if (null == this.y1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1964, __dataOut);
    }
    if (null == this.y1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1965, __dataOut);
    }
    if (null == this.y1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1966, __dataOut);
    }
    if (null == this.y1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1967, __dataOut);
    }
    if (null == this.y1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1968, __dataOut);
    }
    if (null == this.y1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1969, __dataOut);
    }
    if (null == this.y1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1970, __dataOut);
    }
    if (null == this.y1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1971, __dataOut);
    }
    if (null == this.y1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1972, __dataOut);
    }
    if (null == this.y1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1973, __dataOut);
    }
    if (null == this.y1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1974, __dataOut);
    }
    if (null == this.y1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1975, __dataOut);
    }
    if (null == this.y1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1976, __dataOut);
    }
    if (null == this.y1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1977, __dataOut);
    }
    if (null == this.y1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1978, __dataOut);
    }
    if (null == this.y1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1979, __dataOut);
    }
    if (null == this.y1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1980, __dataOut);
    }
    if (null == this.y1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1981, __dataOut);
    }
    if (null == this.y1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1982, __dataOut);
    }
    if (null == this.y1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1983, __dataOut);
    }
    if (null == this.y1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1984, __dataOut);
    }
    if (null == this.y1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1985, __dataOut);
    }
    if (null == this.y1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1986, __dataOut);
    }
    if (null == this.y1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1987, __dataOut);
    }
    if (null == this.y1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1988, __dataOut);
    }
    if (null == this.y1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1989, __dataOut);
    }
    if (null == this.y1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1990, __dataOut);
    }
    if (null == this.y1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1991, __dataOut);
    }
    if (null == this.y1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1992, __dataOut);
    }
    if (null == this.y1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1993, __dataOut);
    }
    if (null == this.y1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1994, __dataOut);
    }
    if (null == this.y1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1995, __dataOut);
    }
    if (null == this.y1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1996, __dataOut);
    }
    if (null == this.y1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1997, __dataOut);
    }
    if (null == this.y1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1998, __dataOut);
    }
    if (null == this.y1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1999, __dataOut);
    }
    if (null == this.y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2000, __dataOut);
    }
    if (null == this.y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2001, __dataOut);
    }
    if (null == this.y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2002, __dataOut);
    }
    if (null == this.y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2003, __dataOut);
    }
    if (null == this.y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2004, __dataOut);
    }
    if (null == this.y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2005, __dataOut);
    }
    if (null == this.y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2006, __dataOut);
    }
    if (null == this.y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2007, __dataOut);
    }
    if (null == this.y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2008, __dataOut);
    }
    if (null == this.y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2009, __dataOut);
    }
    if (null == this.y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2010, __dataOut);
    }
    if (null == this.y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2011, __dataOut);
    }
    if (null == this.y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2012, __dataOut);
    }
    if (null == this.y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2013, __dataOut);
    }
    if (null == this.y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2014, __dataOut);
    }
    if (null == this.y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2015, __dataOut);
    }
    if (null == this.y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2016, __dataOut);
    }
    if (null == this.indicator_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator_code);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.y1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1960, __dataOut);
    }
    if (null == this.y1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1961, __dataOut);
    }
    if (null == this.y1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1962, __dataOut);
    }
    if (null == this.y1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1963, __dataOut);
    }
    if (null == this.y1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1964, __dataOut);
    }
    if (null == this.y1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1965, __dataOut);
    }
    if (null == this.y1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1966, __dataOut);
    }
    if (null == this.y1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1967, __dataOut);
    }
    if (null == this.y1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1968, __dataOut);
    }
    if (null == this.y1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1969, __dataOut);
    }
    if (null == this.y1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1970, __dataOut);
    }
    if (null == this.y1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1971, __dataOut);
    }
    if (null == this.y1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1972, __dataOut);
    }
    if (null == this.y1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1973, __dataOut);
    }
    if (null == this.y1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1974, __dataOut);
    }
    if (null == this.y1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1975, __dataOut);
    }
    if (null == this.y1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1976, __dataOut);
    }
    if (null == this.y1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1977, __dataOut);
    }
    if (null == this.y1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1978, __dataOut);
    }
    if (null == this.y1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1979, __dataOut);
    }
    if (null == this.y1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1980, __dataOut);
    }
    if (null == this.y1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1981, __dataOut);
    }
    if (null == this.y1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1982, __dataOut);
    }
    if (null == this.y1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1983, __dataOut);
    }
    if (null == this.y1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1984, __dataOut);
    }
    if (null == this.y1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1985, __dataOut);
    }
    if (null == this.y1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1986, __dataOut);
    }
    if (null == this.y1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1987, __dataOut);
    }
    if (null == this.y1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1988, __dataOut);
    }
    if (null == this.y1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1989, __dataOut);
    }
    if (null == this.y1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1990, __dataOut);
    }
    if (null == this.y1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1991, __dataOut);
    }
    if (null == this.y1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1992, __dataOut);
    }
    if (null == this.y1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1993, __dataOut);
    }
    if (null == this.y1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1994, __dataOut);
    }
    if (null == this.y1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1995, __dataOut);
    }
    if (null == this.y1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1996, __dataOut);
    }
    if (null == this.y1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1997, __dataOut);
    }
    if (null == this.y1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1998, __dataOut);
    }
    if (null == this.y1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y1999, __dataOut);
    }
    if (null == this.y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2000, __dataOut);
    }
    if (null == this.y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2001, __dataOut);
    }
    if (null == this.y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2002, __dataOut);
    }
    if (null == this.y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2003, __dataOut);
    }
    if (null == this.y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2004, __dataOut);
    }
    if (null == this.y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2005, __dataOut);
    }
    if (null == this.y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2006, __dataOut);
    }
    if (null == this.y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2007, __dataOut);
    }
    if (null == this.y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2008, __dataOut);
    }
    if (null == this.y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2009, __dataOut);
    }
    if (null == this.y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2010, __dataOut);
    }
    if (null == this.y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2011, __dataOut);
    }
    if (null == this.y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2012, __dataOut);
    }
    if (null == this.y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2013, __dataOut);
    }
    if (null == this.y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2014, __dataOut);
    }
    if (null == this.y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2015, __dataOut);
    }
    if (null == this.y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.y2016, __dataOut);
    }
    if (null == this.indicator_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator_code);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1960==null?"null":y1960.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1961==null?"null":y1961.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1962==null?"null":y1962.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1963==null?"null":y1963.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1964==null?"null":y1964.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1965==null?"null":y1965.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1966==null?"null":y1966.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1967==null?"null":y1967.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1968==null?"null":y1968.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1969==null?"null":y1969.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1970==null?"null":y1970.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1971==null?"null":y1971.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1972==null?"null":y1972.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1973==null?"null":y1973.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1974==null?"null":y1974.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1975==null?"null":y1975.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1976==null?"null":y1976.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1977==null?"null":y1977.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1978==null?"null":y1978.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1979==null?"null":y1979.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1980==null?"null":y1980.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1981==null?"null":y1981.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1982==null?"null":y1982.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1983==null?"null":y1983.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1984==null?"null":y1984.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1985==null?"null":y1985.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1986==null?"null":y1986.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1987==null?"null":y1987.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1988==null?"null":y1988.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1989==null?"null":y1989.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1990==null?"null":y1990.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1991==null?"null":y1991.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1992==null?"null":y1992.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1993==null?"null":y1993.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1994==null?"null":y1994.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1995==null?"null":y1995.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1996==null?"null":y1996.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1997==null?"null":y1997.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1998==null?"null":y1998.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1999==null?"null":y1999.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2000==null?"null":y2000.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2001==null?"null":y2001.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2002==null?"null":y2002.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2003==null?"null":y2003.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2004==null?"null":y2004.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2005==null?"null":y2005.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2006==null?"null":y2006.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2007==null?"null":y2007.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2008==null?"null":y2008.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2009==null?"null":y2009.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2010==null?"null":y2010.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2011==null?"null":y2011.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2012==null?"null":y2012.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2013==null?"null":y2013.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2014==null?"null":y2014.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2015==null?"null":y2015.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2016==null?"null":y2016.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(indicator_code==null?"null":indicator_code, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1960==null?"null":y1960.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1961==null?"null":y1961.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1962==null?"null":y1962.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1963==null?"null":y1963.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1964==null?"null":y1964.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1965==null?"null":y1965.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1966==null?"null":y1966.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1967==null?"null":y1967.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1968==null?"null":y1968.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1969==null?"null":y1969.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1970==null?"null":y1970.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1971==null?"null":y1971.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1972==null?"null":y1972.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1973==null?"null":y1973.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1974==null?"null":y1974.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1975==null?"null":y1975.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1976==null?"null":y1976.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1977==null?"null":y1977.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1978==null?"null":y1978.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1979==null?"null":y1979.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1980==null?"null":y1980.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1981==null?"null":y1981.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1982==null?"null":y1982.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1983==null?"null":y1983.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1984==null?"null":y1984.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1985==null?"null":y1985.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1986==null?"null":y1986.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1987==null?"null":y1987.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1988==null?"null":y1988.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1989==null?"null":y1989.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1990==null?"null":y1990.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1991==null?"null":y1991.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1992==null?"null":y1992.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1993==null?"null":y1993.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1994==null?"null":y1994.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1995==null?"null":y1995.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1996==null?"null":y1996.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1997==null?"null":y1997.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1998==null?"null":y1998.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y1999==null?"null":y1999.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2000==null?"null":y2000.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2001==null?"null":y2001.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2002==null?"null":y2002.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2003==null?"null":y2003.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2004==null?"null":y2004.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2005==null?"null":y2005.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2006==null?"null":y2006.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2007==null?"null":y2007.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2008==null?"null":y2008.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2009==null?"null":y2009.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2010==null?"null":y2010.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2011==null?"null":y2011.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2012==null?"null":y2012.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2013==null?"null":y2013.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2014==null?"null":y2014.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2015==null?"null":y2015.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(y2016==null?"null":y2016.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(indicator_code==null?"null":indicator_code, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1960 = null; } else {
      this.y1960 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1961 = null; } else {
      this.y1961 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1962 = null; } else {
      this.y1962 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1963 = null; } else {
      this.y1963 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1964 = null; } else {
      this.y1964 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1965 = null; } else {
      this.y1965 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1966 = null; } else {
      this.y1966 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1967 = null; } else {
      this.y1967 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1968 = null; } else {
      this.y1968 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1969 = null; } else {
      this.y1969 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1970 = null; } else {
      this.y1970 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1971 = null; } else {
      this.y1971 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1972 = null; } else {
      this.y1972 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1973 = null; } else {
      this.y1973 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1974 = null; } else {
      this.y1974 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1975 = null; } else {
      this.y1975 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1976 = null; } else {
      this.y1976 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1977 = null; } else {
      this.y1977 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1978 = null; } else {
      this.y1978 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1979 = null; } else {
      this.y1979 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1980 = null; } else {
      this.y1980 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1981 = null; } else {
      this.y1981 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1982 = null; } else {
      this.y1982 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1983 = null; } else {
      this.y1983 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1984 = null; } else {
      this.y1984 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1985 = null; } else {
      this.y1985 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1986 = null; } else {
      this.y1986 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1987 = null; } else {
      this.y1987 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1988 = null; } else {
      this.y1988 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1989 = null; } else {
      this.y1989 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1990 = null; } else {
      this.y1990 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1991 = null; } else {
      this.y1991 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1992 = null; } else {
      this.y1992 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1993 = null; } else {
      this.y1993 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1994 = null; } else {
      this.y1994 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1995 = null; } else {
      this.y1995 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1996 = null; } else {
      this.y1996 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1997 = null; } else {
      this.y1997 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1998 = null; } else {
      this.y1998 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1999 = null; } else {
      this.y1999 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2000 = null; } else {
      this.y2000 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2001 = null; } else {
      this.y2001 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2002 = null; } else {
      this.y2002 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2003 = null; } else {
      this.y2003 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2004 = null; } else {
      this.y2004 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2005 = null; } else {
      this.y2005 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2006 = null; } else {
      this.y2006 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2007 = null; } else {
      this.y2007 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2008 = null; } else {
      this.y2008 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2009 = null; } else {
      this.y2009 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2010 = null; } else {
      this.y2010 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2011 = null; } else {
      this.y2011 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2012 = null; } else {
      this.y2012 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2013 = null; } else {
      this.y2013 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2014 = null; } else {
      this.y2014 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2015 = null; } else {
      this.y2015 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2016 = null; } else {
      this.y2016 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.indicator_code = null; } else {
      this.indicator_code = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1960 = null; } else {
      this.y1960 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1961 = null; } else {
      this.y1961 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1962 = null; } else {
      this.y1962 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1963 = null; } else {
      this.y1963 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1964 = null; } else {
      this.y1964 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1965 = null; } else {
      this.y1965 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1966 = null; } else {
      this.y1966 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1967 = null; } else {
      this.y1967 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1968 = null; } else {
      this.y1968 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1969 = null; } else {
      this.y1969 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1970 = null; } else {
      this.y1970 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1971 = null; } else {
      this.y1971 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1972 = null; } else {
      this.y1972 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1973 = null; } else {
      this.y1973 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1974 = null; } else {
      this.y1974 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1975 = null; } else {
      this.y1975 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1976 = null; } else {
      this.y1976 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1977 = null; } else {
      this.y1977 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1978 = null; } else {
      this.y1978 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1979 = null; } else {
      this.y1979 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1980 = null; } else {
      this.y1980 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1981 = null; } else {
      this.y1981 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1982 = null; } else {
      this.y1982 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1983 = null; } else {
      this.y1983 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1984 = null; } else {
      this.y1984 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1985 = null; } else {
      this.y1985 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1986 = null; } else {
      this.y1986 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1987 = null; } else {
      this.y1987 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1988 = null; } else {
      this.y1988 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1989 = null; } else {
      this.y1989 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1990 = null; } else {
      this.y1990 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1991 = null; } else {
      this.y1991 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1992 = null; } else {
      this.y1992 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1993 = null; } else {
      this.y1993 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1994 = null; } else {
      this.y1994 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1995 = null; } else {
      this.y1995 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1996 = null; } else {
      this.y1996 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1997 = null; } else {
      this.y1997 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1998 = null; } else {
      this.y1998 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y1999 = null; } else {
      this.y1999 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2000 = null; } else {
      this.y2000 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2001 = null; } else {
      this.y2001 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2002 = null; } else {
      this.y2002 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2003 = null; } else {
      this.y2003 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2004 = null; } else {
      this.y2004 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2005 = null; } else {
      this.y2005 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2006 = null; } else {
      this.y2006 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2007 = null; } else {
      this.y2007 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2008 = null; } else {
      this.y2008 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2009 = null; } else {
      this.y2009 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2010 = null; } else {
      this.y2010 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2011 = null; } else {
      this.y2011 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2012 = null; } else {
      this.y2012 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2013 = null; } else {
      this.y2013 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2014 = null; } else {
      this.y2014 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2015 = null; } else {
      this.y2015 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.y2016 = null; } else {
      this.y2016 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.indicator_code = null; } else {
      this.indicator_code = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    gender_stats o = (gender_stats) super.clone();
    return o;
  }

  public void clone0(gender_stats o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("y1960", this.y1960);
    __sqoop$field_map.put("y1961", this.y1961);
    __sqoop$field_map.put("y1962", this.y1962);
    __sqoop$field_map.put("y1963", this.y1963);
    __sqoop$field_map.put("y1964", this.y1964);
    __sqoop$field_map.put("y1965", this.y1965);
    __sqoop$field_map.put("y1966", this.y1966);
    __sqoop$field_map.put("y1967", this.y1967);
    __sqoop$field_map.put("y1968", this.y1968);
    __sqoop$field_map.put("y1969", this.y1969);
    __sqoop$field_map.put("y1970", this.y1970);
    __sqoop$field_map.put("y1971", this.y1971);
    __sqoop$field_map.put("y1972", this.y1972);
    __sqoop$field_map.put("y1973", this.y1973);
    __sqoop$field_map.put("y1974", this.y1974);
    __sqoop$field_map.put("y1975", this.y1975);
    __sqoop$field_map.put("y1976", this.y1976);
    __sqoop$field_map.put("y1977", this.y1977);
    __sqoop$field_map.put("y1978", this.y1978);
    __sqoop$field_map.put("y1979", this.y1979);
    __sqoop$field_map.put("y1980", this.y1980);
    __sqoop$field_map.put("y1981", this.y1981);
    __sqoop$field_map.put("y1982", this.y1982);
    __sqoop$field_map.put("y1983", this.y1983);
    __sqoop$field_map.put("y1984", this.y1984);
    __sqoop$field_map.put("y1985", this.y1985);
    __sqoop$field_map.put("y1986", this.y1986);
    __sqoop$field_map.put("y1987", this.y1987);
    __sqoop$field_map.put("y1988", this.y1988);
    __sqoop$field_map.put("y1989", this.y1989);
    __sqoop$field_map.put("y1990", this.y1990);
    __sqoop$field_map.put("y1991", this.y1991);
    __sqoop$field_map.put("y1992", this.y1992);
    __sqoop$field_map.put("y1993", this.y1993);
    __sqoop$field_map.put("y1994", this.y1994);
    __sqoop$field_map.put("y1995", this.y1995);
    __sqoop$field_map.put("y1996", this.y1996);
    __sqoop$field_map.put("y1997", this.y1997);
    __sqoop$field_map.put("y1998", this.y1998);
    __sqoop$field_map.put("y1999", this.y1999);
    __sqoop$field_map.put("y2000", this.y2000);
    __sqoop$field_map.put("y2001", this.y2001);
    __sqoop$field_map.put("y2002", this.y2002);
    __sqoop$field_map.put("y2003", this.y2003);
    __sqoop$field_map.put("y2004", this.y2004);
    __sqoop$field_map.put("y2005", this.y2005);
    __sqoop$field_map.put("y2006", this.y2006);
    __sqoop$field_map.put("y2007", this.y2007);
    __sqoop$field_map.put("y2008", this.y2008);
    __sqoop$field_map.put("y2009", this.y2009);
    __sqoop$field_map.put("y2010", this.y2010);
    __sqoop$field_map.put("y2011", this.y2011);
    __sqoop$field_map.put("y2012", this.y2012);
    __sqoop$field_map.put("y2013", this.y2013);
    __sqoop$field_map.put("y2014", this.y2014);
    __sqoop$field_map.put("y2015", this.y2015);
    __sqoop$field_map.put("y2016", this.y2016);
    __sqoop$field_map.put("indicator_code", this.indicator_code);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("y1960", this.y1960);
    __sqoop$field_map.put("y1961", this.y1961);
    __sqoop$field_map.put("y1962", this.y1962);
    __sqoop$field_map.put("y1963", this.y1963);
    __sqoop$field_map.put("y1964", this.y1964);
    __sqoop$field_map.put("y1965", this.y1965);
    __sqoop$field_map.put("y1966", this.y1966);
    __sqoop$field_map.put("y1967", this.y1967);
    __sqoop$field_map.put("y1968", this.y1968);
    __sqoop$field_map.put("y1969", this.y1969);
    __sqoop$field_map.put("y1970", this.y1970);
    __sqoop$field_map.put("y1971", this.y1971);
    __sqoop$field_map.put("y1972", this.y1972);
    __sqoop$field_map.put("y1973", this.y1973);
    __sqoop$field_map.put("y1974", this.y1974);
    __sqoop$field_map.put("y1975", this.y1975);
    __sqoop$field_map.put("y1976", this.y1976);
    __sqoop$field_map.put("y1977", this.y1977);
    __sqoop$field_map.put("y1978", this.y1978);
    __sqoop$field_map.put("y1979", this.y1979);
    __sqoop$field_map.put("y1980", this.y1980);
    __sqoop$field_map.put("y1981", this.y1981);
    __sqoop$field_map.put("y1982", this.y1982);
    __sqoop$field_map.put("y1983", this.y1983);
    __sqoop$field_map.put("y1984", this.y1984);
    __sqoop$field_map.put("y1985", this.y1985);
    __sqoop$field_map.put("y1986", this.y1986);
    __sqoop$field_map.put("y1987", this.y1987);
    __sqoop$field_map.put("y1988", this.y1988);
    __sqoop$field_map.put("y1989", this.y1989);
    __sqoop$field_map.put("y1990", this.y1990);
    __sqoop$field_map.put("y1991", this.y1991);
    __sqoop$field_map.put("y1992", this.y1992);
    __sqoop$field_map.put("y1993", this.y1993);
    __sqoop$field_map.put("y1994", this.y1994);
    __sqoop$field_map.put("y1995", this.y1995);
    __sqoop$field_map.put("y1996", this.y1996);
    __sqoop$field_map.put("y1997", this.y1997);
    __sqoop$field_map.put("y1998", this.y1998);
    __sqoop$field_map.put("y1999", this.y1999);
    __sqoop$field_map.put("y2000", this.y2000);
    __sqoop$field_map.put("y2001", this.y2001);
    __sqoop$field_map.put("y2002", this.y2002);
    __sqoop$field_map.put("y2003", this.y2003);
    __sqoop$field_map.put("y2004", this.y2004);
    __sqoop$field_map.put("y2005", this.y2005);
    __sqoop$field_map.put("y2006", this.y2006);
    __sqoop$field_map.put("y2007", this.y2007);
    __sqoop$field_map.put("y2008", this.y2008);
    __sqoop$field_map.put("y2009", this.y2009);
    __sqoop$field_map.put("y2010", this.y2010);
    __sqoop$field_map.put("y2011", this.y2011);
    __sqoop$field_map.put("y2012", this.y2012);
    __sqoop$field_map.put("y2013", this.y2013);
    __sqoop$field_map.put("y2014", this.y2014);
    __sqoop$field_map.put("y2015", this.y2015);
    __sqoop$field_map.put("y2016", this.y2016);
    __sqoop$field_map.put("indicator_code", this.indicator_code);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
