// ORM class for table 'fe_prm_enrr'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 31 15:48:28 PST 2019
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

public class fe_prm_enrr extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Y2016", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2016 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2015", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2015 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2014", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2014 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2013", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2013 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2012", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2012 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2011", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2011 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2010", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2010 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2009", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2009 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2008", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2008 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2007", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2007 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2006", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2006 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2005", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2005 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2004", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2004 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2003", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2003 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2002", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2002 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2001", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2001 = (java.math.BigDecimal)value;
      }
    });
    setters.put("Y2000", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2000 = (java.math.BigDecimal)value;
      }
    });
  }
  public fe_prm_enrr() {
    init0();
  }
  private java.math.BigDecimal Y2016;
  public java.math.BigDecimal get_Y2016() {
    return Y2016;
  }
  public void set_Y2016(java.math.BigDecimal Y2016) {
    this.Y2016 = Y2016;
  }
  public fe_prm_enrr with_Y2016(java.math.BigDecimal Y2016) {
    this.Y2016 = Y2016;
    return this;
  }
  private java.math.BigDecimal Y2015;
  public java.math.BigDecimal get_Y2015() {
    return Y2015;
  }
  public void set_Y2015(java.math.BigDecimal Y2015) {
    this.Y2015 = Y2015;
  }
  public fe_prm_enrr with_Y2015(java.math.BigDecimal Y2015) {
    this.Y2015 = Y2015;
    return this;
  }
  private java.math.BigDecimal Y2014;
  public java.math.BigDecimal get_Y2014() {
    return Y2014;
  }
  public void set_Y2014(java.math.BigDecimal Y2014) {
    this.Y2014 = Y2014;
  }
  public fe_prm_enrr with_Y2014(java.math.BigDecimal Y2014) {
    this.Y2014 = Y2014;
    return this;
  }
  private java.math.BigDecimal Y2013;
  public java.math.BigDecimal get_Y2013() {
    return Y2013;
  }
  public void set_Y2013(java.math.BigDecimal Y2013) {
    this.Y2013 = Y2013;
  }
  public fe_prm_enrr with_Y2013(java.math.BigDecimal Y2013) {
    this.Y2013 = Y2013;
    return this;
  }
  private java.math.BigDecimal Y2012;
  public java.math.BigDecimal get_Y2012() {
    return Y2012;
  }
  public void set_Y2012(java.math.BigDecimal Y2012) {
    this.Y2012 = Y2012;
  }
  public fe_prm_enrr with_Y2012(java.math.BigDecimal Y2012) {
    this.Y2012 = Y2012;
    return this;
  }
  private java.math.BigDecimal Y2011;
  public java.math.BigDecimal get_Y2011() {
    return Y2011;
  }
  public void set_Y2011(java.math.BigDecimal Y2011) {
    this.Y2011 = Y2011;
  }
  public fe_prm_enrr with_Y2011(java.math.BigDecimal Y2011) {
    this.Y2011 = Y2011;
    return this;
  }
  private java.math.BigDecimal Y2010;
  public java.math.BigDecimal get_Y2010() {
    return Y2010;
  }
  public void set_Y2010(java.math.BigDecimal Y2010) {
    this.Y2010 = Y2010;
  }
  public fe_prm_enrr with_Y2010(java.math.BigDecimal Y2010) {
    this.Y2010 = Y2010;
    return this;
  }
  private java.math.BigDecimal Y2009;
  public java.math.BigDecimal get_Y2009() {
    return Y2009;
  }
  public void set_Y2009(java.math.BigDecimal Y2009) {
    this.Y2009 = Y2009;
  }
  public fe_prm_enrr with_Y2009(java.math.BigDecimal Y2009) {
    this.Y2009 = Y2009;
    return this;
  }
  private java.math.BigDecimal Y2008;
  public java.math.BigDecimal get_Y2008() {
    return Y2008;
  }
  public void set_Y2008(java.math.BigDecimal Y2008) {
    this.Y2008 = Y2008;
  }
  public fe_prm_enrr with_Y2008(java.math.BigDecimal Y2008) {
    this.Y2008 = Y2008;
    return this;
  }
  private java.math.BigDecimal Y2007;
  public java.math.BigDecimal get_Y2007() {
    return Y2007;
  }
  public void set_Y2007(java.math.BigDecimal Y2007) {
    this.Y2007 = Y2007;
  }
  public fe_prm_enrr with_Y2007(java.math.BigDecimal Y2007) {
    this.Y2007 = Y2007;
    return this;
  }
  private java.math.BigDecimal Y2006;
  public java.math.BigDecimal get_Y2006() {
    return Y2006;
  }
  public void set_Y2006(java.math.BigDecimal Y2006) {
    this.Y2006 = Y2006;
  }
  public fe_prm_enrr with_Y2006(java.math.BigDecimal Y2006) {
    this.Y2006 = Y2006;
    return this;
  }
  private java.math.BigDecimal Y2005;
  public java.math.BigDecimal get_Y2005() {
    return Y2005;
  }
  public void set_Y2005(java.math.BigDecimal Y2005) {
    this.Y2005 = Y2005;
  }
  public fe_prm_enrr with_Y2005(java.math.BigDecimal Y2005) {
    this.Y2005 = Y2005;
    return this;
  }
  private java.math.BigDecimal Y2004;
  public java.math.BigDecimal get_Y2004() {
    return Y2004;
  }
  public void set_Y2004(java.math.BigDecimal Y2004) {
    this.Y2004 = Y2004;
  }
  public fe_prm_enrr with_Y2004(java.math.BigDecimal Y2004) {
    this.Y2004 = Y2004;
    return this;
  }
  private java.math.BigDecimal Y2003;
  public java.math.BigDecimal get_Y2003() {
    return Y2003;
  }
  public void set_Y2003(java.math.BigDecimal Y2003) {
    this.Y2003 = Y2003;
  }
  public fe_prm_enrr with_Y2003(java.math.BigDecimal Y2003) {
    this.Y2003 = Y2003;
    return this;
  }
  private java.math.BigDecimal Y2002;
  public java.math.BigDecimal get_Y2002() {
    return Y2002;
  }
  public void set_Y2002(java.math.BigDecimal Y2002) {
    this.Y2002 = Y2002;
  }
  public fe_prm_enrr with_Y2002(java.math.BigDecimal Y2002) {
    this.Y2002 = Y2002;
    return this;
  }
  private java.math.BigDecimal Y2001;
  public java.math.BigDecimal get_Y2001() {
    return Y2001;
  }
  public void set_Y2001(java.math.BigDecimal Y2001) {
    this.Y2001 = Y2001;
  }
  public fe_prm_enrr with_Y2001(java.math.BigDecimal Y2001) {
    this.Y2001 = Y2001;
    return this;
  }
  private java.math.BigDecimal Y2000;
  public java.math.BigDecimal get_Y2000() {
    return Y2000;
  }
  public void set_Y2000(java.math.BigDecimal Y2000) {
    this.Y2000 = Y2000;
  }
  public fe_prm_enrr with_Y2000(java.math.BigDecimal Y2000) {
    this.Y2000 = Y2000;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_prm_enrr)) {
      return false;
    }
    fe_prm_enrr that = (fe_prm_enrr) o;
    boolean equal = true;
    equal = equal && (this.Y2016 == null ? that.Y2016 == null : this.Y2016.equals(that.Y2016));
    equal = equal && (this.Y2015 == null ? that.Y2015 == null : this.Y2015.equals(that.Y2015));
    equal = equal && (this.Y2014 == null ? that.Y2014 == null : this.Y2014.equals(that.Y2014));
    equal = equal && (this.Y2013 == null ? that.Y2013 == null : this.Y2013.equals(that.Y2013));
    equal = equal && (this.Y2012 == null ? that.Y2012 == null : this.Y2012.equals(that.Y2012));
    equal = equal && (this.Y2011 == null ? that.Y2011 == null : this.Y2011.equals(that.Y2011));
    equal = equal && (this.Y2010 == null ? that.Y2010 == null : this.Y2010.equals(that.Y2010));
    equal = equal && (this.Y2009 == null ? that.Y2009 == null : this.Y2009.equals(that.Y2009));
    equal = equal && (this.Y2008 == null ? that.Y2008 == null : this.Y2008.equals(that.Y2008));
    equal = equal && (this.Y2007 == null ? that.Y2007 == null : this.Y2007.equals(that.Y2007));
    equal = equal && (this.Y2006 == null ? that.Y2006 == null : this.Y2006.equals(that.Y2006));
    equal = equal && (this.Y2005 == null ? that.Y2005 == null : this.Y2005.equals(that.Y2005));
    equal = equal && (this.Y2004 == null ? that.Y2004 == null : this.Y2004.equals(that.Y2004));
    equal = equal && (this.Y2003 == null ? that.Y2003 == null : this.Y2003.equals(that.Y2003));
    equal = equal && (this.Y2002 == null ? that.Y2002 == null : this.Y2002.equals(that.Y2002));
    equal = equal && (this.Y2001 == null ? that.Y2001 == null : this.Y2001.equals(that.Y2001));
    equal = equal && (this.Y2000 == null ? that.Y2000 == null : this.Y2000.equals(that.Y2000));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_prm_enrr)) {
      return false;
    }
    fe_prm_enrr that = (fe_prm_enrr) o;
    boolean equal = true;
    equal = equal && (this.Y2016 == null ? that.Y2016 == null : this.Y2016.equals(that.Y2016));
    equal = equal && (this.Y2015 == null ? that.Y2015 == null : this.Y2015.equals(that.Y2015));
    equal = equal && (this.Y2014 == null ? that.Y2014 == null : this.Y2014.equals(that.Y2014));
    equal = equal && (this.Y2013 == null ? that.Y2013 == null : this.Y2013.equals(that.Y2013));
    equal = equal && (this.Y2012 == null ? that.Y2012 == null : this.Y2012.equals(that.Y2012));
    equal = equal && (this.Y2011 == null ? that.Y2011 == null : this.Y2011.equals(that.Y2011));
    equal = equal && (this.Y2010 == null ? that.Y2010 == null : this.Y2010.equals(that.Y2010));
    equal = equal && (this.Y2009 == null ? that.Y2009 == null : this.Y2009.equals(that.Y2009));
    equal = equal && (this.Y2008 == null ? that.Y2008 == null : this.Y2008.equals(that.Y2008));
    equal = equal && (this.Y2007 == null ? that.Y2007 == null : this.Y2007.equals(that.Y2007));
    equal = equal && (this.Y2006 == null ? that.Y2006 == null : this.Y2006.equals(that.Y2006));
    equal = equal && (this.Y2005 == null ? that.Y2005 == null : this.Y2005.equals(that.Y2005));
    equal = equal && (this.Y2004 == null ? that.Y2004 == null : this.Y2004.equals(that.Y2004));
    equal = equal && (this.Y2003 == null ? that.Y2003 == null : this.Y2003.equals(that.Y2003));
    equal = equal && (this.Y2002 == null ? that.Y2002 == null : this.Y2002.equals(that.Y2002));
    equal = equal && (this.Y2001 == null ? that.Y2001 == null : this.Y2001.equals(that.Y2001));
    equal = equal && (this.Y2000 == null ? that.Y2000 == null : this.Y2000.equals(that.Y2000));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Y2016 = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.Y2015 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.Y2014 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.Y2013 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.Y2012 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Y2011 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Y2010 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Y2009 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Y2008 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Y2007 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Y2006 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Y2005 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Y2004 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Y2003 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Y2002 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Y2001 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.Y2000 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Y2016 = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.Y2015 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.Y2014 = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.Y2013 = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.Y2012 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.Y2011 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.Y2010 = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.Y2009 = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.Y2008 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.Y2007 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.Y2006 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.Y2005 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Y2004 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Y2003 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Y2002 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.Y2001 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.Y2000 = JdbcWritableBridge.readBigDecimal(17, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(Y2016, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2015, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2014, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2013, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2012, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2011, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2010, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2009, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2008, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2007, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2006, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2005, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2004, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2003, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2002, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2001, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2000, 17 + __off, 3, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(Y2016, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2015, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2014, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2013, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2012, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2011, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2010, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2009, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2008, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2007, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2006, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2005, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2004, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2003, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2002, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2001, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y2000, 17 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Y2016 = null;
    } else {
    this.Y2016 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2015 = null;
    } else {
    this.Y2015 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2014 = null;
    } else {
    this.Y2014 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2013 = null;
    } else {
    this.Y2013 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2012 = null;
    } else {
    this.Y2012 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2011 = null;
    } else {
    this.Y2011 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2010 = null;
    } else {
    this.Y2010 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2009 = null;
    } else {
    this.Y2009 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2008 = null;
    } else {
    this.Y2008 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2007 = null;
    } else {
    this.Y2007 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2006 = null;
    } else {
    this.Y2006 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2005 = null;
    } else {
    this.Y2005 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2004 = null;
    } else {
    this.Y2004 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2003 = null;
    } else {
    this.Y2003 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2002 = null;
    } else {
    this.Y2002 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2001 = null;
    } else {
    this.Y2001 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y2000 = null;
    } else {
    this.Y2000 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2016, __dataOut);
    }
    if (null == this.Y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2015, __dataOut);
    }
    if (null == this.Y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2014, __dataOut);
    }
    if (null == this.Y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2013, __dataOut);
    }
    if (null == this.Y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2012, __dataOut);
    }
    if (null == this.Y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2011, __dataOut);
    }
    if (null == this.Y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2010, __dataOut);
    }
    if (null == this.Y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2009, __dataOut);
    }
    if (null == this.Y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2008, __dataOut);
    }
    if (null == this.Y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2007, __dataOut);
    }
    if (null == this.Y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2006, __dataOut);
    }
    if (null == this.Y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2005, __dataOut);
    }
    if (null == this.Y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2004, __dataOut);
    }
    if (null == this.Y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2003, __dataOut);
    }
    if (null == this.Y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2002, __dataOut);
    }
    if (null == this.Y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2001, __dataOut);
    }
    if (null == this.Y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2000, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2016, __dataOut);
    }
    if (null == this.Y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2015, __dataOut);
    }
    if (null == this.Y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2014, __dataOut);
    }
    if (null == this.Y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2013, __dataOut);
    }
    if (null == this.Y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2012, __dataOut);
    }
    if (null == this.Y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2011, __dataOut);
    }
    if (null == this.Y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2010, __dataOut);
    }
    if (null == this.Y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2009, __dataOut);
    }
    if (null == this.Y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2008, __dataOut);
    }
    if (null == this.Y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2007, __dataOut);
    }
    if (null == this.Y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2006, __dataOut);
    }
    if (null == this.Y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2005, __dataOut);
    }
    if (null == this.Y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2004, __dataOut);
    }
    if (null == this.Y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2003, __dataOut);
    }
    if (null == this.Y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2002, __dataOut);
    }
    if (null == this.Y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2001, __dataOut);
    }
    if (null == this.Y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y2000, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(Y2016==null?"null":Y2016.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2015==null?"null":Y2015.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2014==null?"null":Y2014.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2013==null?"null":Y2013.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2012==null?"null":Y2012.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2011==null?"null":Y2011.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2010==null?"null":Y2010.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2009==null?"null":Y2009.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2008==null?"null":Y2008.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2007==null?"null":Y2007.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2006==null?"null":Y2006.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2005==null?"null":Y2005.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2004==null?"null":Y2004.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2003==null?"null":Y2003.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2002==null?"null":Y2002.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2001==null?"null":Y2001.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2000==null?"null":Y2000.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Y2016==null?"null":Y2016.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2015==null?"null":Y2015.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2014==null?"null":Y2014.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2013==null?"null":Y2013.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2012==null?"null":Y2012.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2011==null?"null":Y2011.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2010==null?"null":Y2010.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2009==null?"null":Y2009.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2008==null?"null":Y2008.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2007==null?"null":Y2007.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2006==null?"null":Y2006.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2005==null?"null":Y2005.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2004==null?"null":Y2004.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2003==null?"null":Y2003.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2002==null?"null":Y2002.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2001==null?"null":Y2001.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2000==null?"null":Y2000.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2016 = null; } else {
      this.Y2016 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2015 = null; } else {
      this.Y2015 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2014 = null; } else {
      this.Y2014 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2013 = null; } else {
      this.Y2013 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2012 = null; } else {
      this.Y2012 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2011 = null; } else {
      this.Y2011 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2010 = null; } else {
      this.Y2010 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2009 = null; } else {
      this.Y2009 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2008 = null; } else {
      this.Y2008 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2007 = null; } else {
      this.Y2007 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2006 = null; } else {
      this.Y2006 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2005 = null; } else {
      this.Y2005 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2004 = null; } else {
      this.Y2004 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2003 = null; } else {
      this.Y2003 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2002 = null; } else {
      this.Y2002 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2001 = null; } else {
      this.Y2001 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2000 = null; } else {
      this.Y2000 = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2016 = null; } else {
      this.Y2016 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2015 = null; } else {
      this.Y2015 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2014 = null; } else {
      this.Y2014 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2013 = null; } else {
      this.Y2013 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2012 = null; } else {
      this.Y2012 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2011 = null; } else {
      this.Y2011 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2010 = null; } else {
      this.Y2010 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2009 = null; } else {
      this.Y2009 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2008 = null; } else {
      this.Y2008 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2007 = null; } else {
      this.Y2007 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2006 = null; } else {
      this.Y2006 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2005 = null; } else {
      this.Y2005 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2004 = null; } else {
      this.Y2004 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2003 = null; } else {
      this.Y2003 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2002 = null; } else {
      this.Y2002 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2001 = null; } else {
      this.Y2001 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2000 = null; } else {
      this.Y2000 = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    fe_prm_enrr o = (fe_prm_enrr) super.clone();
    return o;
  }

  public void clone0(fe_prm_enrr o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Y2016", this.Y2016);
    __sqoop$field_map.put("Y2015", this.Y2015);
    __sqoop$field_map.put("Y2014", this.Y2014);
    __sqoop$field_map.put("Y2013", this.Y2013);
    __sqoop$field_map.put("Y2012", this.Y2012);
    __sqoop$field_map.put("Y2011", this.Y2011);
    __sqoop$field_map.put("Y2010", this.Y2010);
    __sqoop$field_map.put("Y2009", this.Y2009);
    __sqoop$field_map.put("Y2008", this.Y2008);
    __sqoop$field_map.put("Y2007", this.Y2007);
    __sqoop$field_map.put("Y2006", this.Y2006);
    __sqoop$field_map.put("Y2005", this.Y2005);
    __sqoop$field_map.put("Y2004", this.Y2004);
    __sqoop$field_map.put("Y2003", this.Y2003);
    __sqoop$field_map.put("Y2002", this.Y2002);
    __sqoop$field_map.put("Y2001", this.Y2001);
    __sqoop$field_map.put("Y2000", this.Y2000);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Y2016", this.Y2016);
    __sqoop$field_map.put("Y2015", this.Y2015);
    __sqoop$field_map.put("Y2014", this.Y2014);
    __sqoop$field_map.put("Y2013", this.Y2013);
    __sqoop$field_map.put("Y2012", this.Y2012);
    __sqoop$field_map.put("Y2011", this.Y2011);
    __sqoop$field_map.put("Y2010", this.Y2010);
    __sqoop$field_map.put("Y2009", this.Y2009);
    __sqoop$field_map.put("Y2008", this.Y2008);
    __sqoop$field_map.put("Y2007", this.Y2007);
    __sqoop$field_map.put("Y2006", this.Y2006);
    __sqoop$field_map.put("Y2005", this.Y2005);
    __sqoop$field_map.put("Y2004", this.Y2004);
    __sqoop$field_map.put("Y2003", this.Y2003);
    __sqoop$field_map.put("Y2002", this.Y2002);
    __sqoop$field_map.put("Y2001", this.Y2001);
    __sqoop$field_map.put("Y2000", this.Y2000);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
