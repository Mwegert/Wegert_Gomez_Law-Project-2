// ORM class for table 'uem_adv_avg'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 31 15:55:41 PST 2019
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

public class uem_adv_avg extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
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
  }
  public uem_adv_avg() {
    init0();
  }
  private java.math.BigDecimal y2000;
  public java.math.BigDecimal get_y2000() {
    return y2000;
  }
  public void set_y2000(java.math.BigDecimal y2000) {
    this.y2000 = y2000;
  }
  public uem_adv_avg with_y2000(java.math.BigDecimal y2000) {
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
  public uem_adv_avg with_y2001(java.math.BigDecimal y2001) {
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
  public uem_adv_avg with_y2002(java.math.BigDecimal y2002) {
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
  public uem_adv_avg with_y2003(java.math.BigDecimal y2003) {
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
  public uem_adv_avg with_y2004(java.math.BigDecimal y2004) {
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
  public uem_adv_avg with_y2005(java.math.BigDecimal y2005) {
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
  public uem_adv_avg with_y2006(java.math.BigDecimal y2006) {
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
  public uem_adv_avg with_y2007(java.math.BigDecimal y2007) {
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
  public uem_adv_avg with_y2008(java.math.BigDecimal y2008) {
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
  public uem_adv_avg with_y2009(java.math.BigDecimal y2009) {
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
  public uem_adv_avg with_y2010(java.math.BigDecimal y2010) {
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
  public uem_adv_avg with_y2011(java.math.BigDecimal y2011) {
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
  public uem_adv_avg with_y2012(java.math.BigDecimal y2012) {
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
  public uem_adv_avg with_y2013(java.math.BigDecimal y2013) {
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
  public uem_adv_avg with_y2014(java.math.BigDecimal y2014) {
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
  public uem_adv_avg with_y2015(java.math.BigDecimal y2015) {
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
  public uem_adv_avg with_y2016(java.math.BigDecimal y2016) {
    this.y2016 = y2016;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof uem_adv_avg)) {
      return false;
    }
    uem_adv_avg that = (uem_adv_avg) o;
    boolean equal = true;
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
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof uem_adv_avg)) {
      return false;
    }
    uem_adv_avg that = (uem_adv_avg) o;
    boolean equal = true;
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
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.y2000 = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.y2001 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.y2002 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.y2003 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.y2004 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.y2005 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.y2006 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.y2007 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.y2008 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.y2009 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.y2010 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.y2011 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.y2012 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.y2013 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.y2014 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.y2015 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.y2016 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.y2000 = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.y2001 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.y2002 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.y2003 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.y2004 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.y2005 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.y2006 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.y2007 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.y2008 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.y2009 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.y2010 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.y2011 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.y2012 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.y2013 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.y2014 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.y2015 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.y2016 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(y2000, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2001, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2002, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2003, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2004, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2005, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2006, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2007, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2008, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2009, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2010, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2011, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2012, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2013, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2014, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2015, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2016, 17 + __off, 3, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(y2000, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2001, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2002, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2003, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2004, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2005, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2006, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2007, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2008, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2009, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2010, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2011, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2012, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2013, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2014, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2015, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(y2016, 17 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
  }
  public void write(DataOutput __dataOut) throws IOException {
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
  }
  public void write0(DataOutput __dataOut) throws IOException {
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
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
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

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
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

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    uem_adv_avg o = (uem_adv_avg) super.clone();
    return o;
  }

  public void clone0(uem_adv_avg o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
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
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
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
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
