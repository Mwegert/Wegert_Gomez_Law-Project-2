create database if not exists project2;
use project2;

set hive.exec.max.dynamic.partitions.pernode = 1000;
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.mapred.mode = nonstrict;
set hive.exec.max.dynamic.partitions = 1000;

drop table gender_stats;
drop table countries;

--INITIAL TEMPORARY TABLE LOADED FROM FLAT FILE
create temporary table if not exists Gender_StatsTempRaw(Country_Name varchar(20), country_code char(3), indicator_name string, indicator_code varchar(20),
y1960 decimal(15,8), y1961 decimal(15,8), y1962 decimal(15,8), y1963 decimal(15,8), y1964 decimal(15,8),
y1965 decimal(15,8), y1966 decimal(15,8), y1967 decimal(15,8), y1968 decimal(15,8), y1969 decimal(15,8), 
y1970 decimal(15,8), y1971 decimal(15,8), y1972 decimal(15,8), y1973 decimal(15,8), y1974 decimal(15,8), 
y1975 decimal(15,8), y1976 decimal(15,8), y1977 decimal(15,8), y1978 decimal(15,8), y1979 decimal(15,8), 
y1980 decimal(15,8), y1981 decimal(15,8), y1982 decimal(15,8), y1983 decimal(15,8), y1984 decimal(15,8), 
y1985 decimal(15,8), y1986 decimal(15,8), y1987 decimal(15,8), y1988 decimal(15,8), y1989 decimal(15,8), 
y1990 decimal(15,8), y1991 decimal(15,8), y1992 decimal(15,8), y1993 decimal(15,8), y1994 decimal(15,8), 
y1995 decimal(15,8), y1996 decimal(15,8), y1997 decimal(15,8), y1998 decimal(15,8), y1999 decimal(15,8), 
y2000 decimal(15,8), y2001 decimal(15,8), y2002 decimal(15,8), y2003 decimal(15,8), y2004 decimal(15,8), 
y2005 decimal(15,8), y2006 decimal(15,8), y2007 decimal(15,8), y2008 decimal(15,8), y2009 decimal(15,8), 
y2010 decimal(15,8), y2011 decimal(15,8), y2012 decimal(15,8), y2013 decimal(15,8), y2014 decimal(15,8), 
y2015 decimal(15,8), y2016 decimal(15,8))
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\""
);
load data inpath '/user/cloudera/project2/input/Gender_StatsData.txt' overwrite into table gender_statstempraw;
!echo;
!echo aggregate data loaded;
!echo;

create temporary table if not exists Gender_StatsTemp(country_code char(3),
y1960 decimal(15,8), y1961 decimal(15,8), y1962 decimal(15,8), y1963 decimal(15,8), y1964 decimal(15,8),
y1965 decimal(15,8), y1966 decimal(15,8), y1967 decimal(15,8), y1968 decimal(15,8), y1969 decimal(15,8), 
y1970 decimal(15,8), y1971 decimal(15,8), y1972 decimal(15,8), y1973 decimal(15,8), y1974 decimal(15,8), 
y1975 decimal(15,8), y1976 decimal(15,8), y1977 decimal(15,8), y1978 decimal(15,8), y1979 decimal(15,8), 
y1980 decimal(15,8), y1981 decimal(15,8), y1982 decimal(15,8), y1983 decimal(15,8), y1984 decimal(15,8), 
y1985 decimal(15,8), y1986 decimal(15,8), y1987 decimal(15,8), y1988 decimal(15,8), y1989 decimal(15,8), 
y1990 decimal(15,8), y1991 decimal(15,8), y1992 decimal(15,8), y1993 decimal(15,8), y1994 decimal(15,8), 
y1995 decimal(15,8), y1996 decimal(15,8), y1997 decimal(15,8), y1998 decimal(15,8), y1999 decimal(15,8), 
y2000 decimal(15,8), y2001 decimal(15,8), y2002 decimal(15,8), y2003 decimal(15,8), y2004 decimal(15,8), 
y2005 decimal(15,8), y2006 decimal(15,8), y2007 decimal(15,8), y2008 decimal(15,8), y2009 decimal(15,8), 
y2010 decimal(15,8), y2011 decimal(15,8), y2012 decimal(15,8), y2013 decimal(15,8), y2014 decimal(15,8), 
y2015 decimal(15,8), y2016 decimal(15,8), indicator_code varchar(20))
row format delimited
fields terminated by ',';

insert overwrite table gender_statstemp select country_code,
y1960 , y1961 , y1962 , y1963 , y1964 ,
y1965 , y1966 , y1967 , y1968 , y1969 , 
y1970 , y1971 , y1972 , y1973 , y1974 , 
y1975 , y1976 , y1977 , y1978 , y1979 , 
y1980 , y1981 , y1982 , y1983 , y1984 , 
y1985 , y1986 , y1987 , y1988 , y1989 , 
y1990 , y1991 , y1992 , y1993 , y1994 , 
y1995 , y1996 , y1997 , y1998 , y1999 , 
y2000 , y2001 , y2002 , y2003 , y2004 , 
y2005 , y2006 , y2007 , y2008 , y2009 , 
y2010 , y2011 , y2012 , y2013 , y2014 , 
y2015 , y2016 , indicator_code from gender_statstempraw;

--COUNTRIES TABLE CREATION FOR CLEANSING 
create table if not exists countries(Country_Code char(3),Short_Name string,Table_Name string,Long_Name string,2_alpha_code string,Currency_Unit string) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
"separatorChar" = ",",
"quoteChar"     = "\""
);
load data inpath '/user/cloudera/project2/input/Gender_StatsCountry.txt' overwrite into table countries;

--CLEANSING OF TABLE
insert overwrite table Gender_StatsTemp
select Gender_StatsTemp.* from Gender_StatsTemp left outer join countries 
on Gender_StatsTemp.country_code = countries.country_code 
where countries.currency_unit <> "" and 
coalesce(
Gender_StatsTemp.y1960, Gender_StatsTemp.y1961, Gender_StatsTemp.y1962, Gender_StatsTemp.y1963, Gender_StatsTemp.y1964, 
Gender_StatsTemp.y1965, Gender_StatsTemp.y1966, Gender_StatsTemp.y1967, Gender_StatsTemp.y1968, Gender_StatsTemp.y1969, 
Gender_StatsTemp.y1970, Gender_StatsTemp.y1971, Gender_StatsTemp.y1972, Gender_StatsTemp.y1973, Gender_StatsTemp.y1974, 
Gender_StatsTemp.y1975, Gender_StatsTemp.y1976, Gender_StatsTemp.y1977, Gender_StatsTemp.y1978, Gender_StatsTemp.y1979, 
Gender_StatsTemp.y1980, Gender_StatsTemp.y1981, Gender_StatsTemp.y1982, Gender_StatsTemp.y1983, Gender_StatsTemp.y1984, 
Gender_StatsTemp.y1985, Gender_StatsTemp.y1986, Gender_StatsTemp.y1987, Gender_StatsTemp.y1988, Gender_StatsTemp.y1989, 
Gender_StatsTemp.y1990, Gender_StatsTemp.y1991, Gender_StatsTemp.y1992, Gender_StatsTemp.y1993, Gender_StatsTemp.y1994, 
Gender_StatsTemp.y1995, Gender_StatsTemp.y1996, Gender_StatsTemp.y1997, Gender_StatsTemp.y1998, Gender_StatsTemp.y1999, 
Gender_StatsTemp.y2000, Gender_StatsTemp.y2001,Gender_StatsTemp.y2002, Gender_StatsTemp.y2003, Gender_StatsTemp.y2004, 
Gender_StatsTemp.y2005, Gender_StatsTemp.y2006, Gender_StatsTemp.y2007, Gender_StatsTemp.y2008, Gender_StatsTemp.y2009, 
Gender_StatsTemp.y2010, Gender_StatsTemp.y2011, Gender_StatsTemp.y2012, Gender_StatsTemp.y2013, Gender_StatsTemp.y2014, 
Gender_StatsTemp.y2015, Gender_StatsTemp.y2016) <> 0;

!echo;
!echo data cleansed;
!echo;


--PARTITIONED TABLE CREATION

create table if not exists gender_stats( country_code varchar(3), 
y1960 decimal(15,8), y1961 decimal(15,8), y1962 decimal(15,8), y1963 decimal(15,8), y1964 decimal(15,8), 
y1965 decimal(15,8), y1966 decimal(15,8), y1967 decimal(15,8), y1968 decimal(15,8), y1969 decimal(15,8), 
y1970 decimal(15,8), y1971 decimal(15,8), y1972 decimal(15,8), y1973 decimal(15,8), y1974 decimal(15,8), 
y1975 decimal(15,8), y1976 decimal(15,8), y1977 decimal(15,8), y1978 decimal(15,8), y1979 decimal(15,8), 
y1980 decimal(15,8), y1981 decimal(15,8), y1982 decimal(15,8), y1983 decimal(15,8), y1984 decimal(15,8), 
y1985 decimal(15,8), y1986 decimal(15,8), y1987 decimal(15,8), y1988 decimal(15,8), y1989 decimal(15,8), 
y1990 decimal(15,8), y1991 decimal(15,8), y1992 decimal(15,8), y1993 decimal(15,8), y1994 decimal(15,8), 
y1995 decimal(15,8), y1996 decimal(15,8), y1997 decimal(15,8), y1998 decimal(15,8), y1999 decimal(15,8), 
y2000 decimal(15,8), y2001 decimal(15,8), y2002 decimal(15,8), y2003 decimal(15,8), y2004 decimal(15,8), 
y2005 decimal(15,8), y2006 decimal(15,8), y2007 decimal(15,8), y2008 decimal(15,8), y2009 decimal(15,8), 
y2010 decimal(15,8), y2011 decimal(15,8), y2012 decimal(15,8), y2013 decimal(15,8), y2014 decimal(15,8), 
y2015 decimal(15,8), y2016 decimal(15,8))
partitioned by (indicator_code varchar(20))
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

insert overwrite table gender_stats partition(indicator_code) 
select country_code, 
y1960, y1961, y1962, y1963, y1964, y1965, y1966, y1967, y1968, y1969, 
y1970, y1971, y1972, y1973, y1974, y1975, y1976, y1977, y1978, y1979, 
y1980, y1981, y1982, y1983, y1984, y1985, y1986, y1987, y1988, y1989, 
y1990, y1991, y1992, y1993, y1994, y1995, y1996, y1997, y1998, y1999, 
y2000, y2001,y2002, y2003, y2004, y2005, y2006, y2007, y2008, y2009, 
y2010, y2011, y2012, y2013, y2014, y2015, y2016, 
indicator_code 
from Gender_StatsTemp;

!echo;
!echo data successfully partitioned;
!echo;