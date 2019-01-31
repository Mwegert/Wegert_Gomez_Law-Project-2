create database project2;
use project2;

create temporary table Gender_StatsTemp(Country_Name varchar(20), country_code varchar(3), indicator_name string, 
indicator_code varchar(20),y1960 decimal(15,8), y1961 decimal(15,8), y1962 decimal(15,8), y1963 decimal(15,8), y1964 decimal(15,8), 
y1965 decimal(15,8), y1966 decimal(15,8), y1967 decimal(15,8), y1968 decimal(15,8), y1969 decimal(15,8), y1970 decimal(15,8), 
y1971 decimal(15,8), y1972 decimal(15,8), y1973 decimal(15,8), y1974 decimal(15,8), y1975 decimal(15,8), y1976 decimal(15,8), 
y1977 decimal(15,8), y1978 decimal(15,8), y1979 decimal(15,8), y1980 decimal(15,8), y1981 decimal(15,8), y1982 decimal(15,8), 
y1983 decimal(15,8), y1984 decimal(15,8), y1985 decimal(15,8), y1986 decimal(15,8), y1987 decimal(15,8), y1988 decimal(15,8), 
y1989 decimal(15,8), y1990 decimal(15,8), y1991 decimal(15,8), y1992 decimal(15,8), y1993 decimal(15,8), y1994 decimal(15,8), 
y1995 decimal(15,8), y1996 decimal(15,8), y1997 decimal(15,8), y1998 decimal(15,8), y1999 decimal(15,8), y2000 decimal(15,8), 
y2001 decimal(15,8), y2002 decimal(15,8), y2003 decimal(15,8), y2004 decimal(15,8), y2005 decimal(15,8), y2006 decimal(15,8), 
y2007 decimal(15,8), y2008 decimal(15,8), y2009 decimal(15,8), y2010 decimal(15,8), y2011 decimal(15,8), y2012 decimal(15,8), 
y2013 decimal(15,8), y2014 decimal(15,8), y2015 decimal(15,8), y2016 decimal(15,8)) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
"separatorChar" = ",",
"quoteChar"= "\""
);


load data local inpath '/home/cloudera/Desktop/project1_input/Gender_StatsData.txt' into table gender_statstemp;


set hive.exec.max.dynamic.partitions.pernode = 1000;
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.mapred.mode = nonstrict;
set hive.exec.max.dynamic.partitions = 1000;


create table gender_stats( country_code varchar(3), y1960 decimal(15,8), y1961 decimal(15,8), y1962 decimal(15,8), 
y1963 decimal(15,8), y1964 decimal(15,8), y1965 decimal(15,8), y1966 decimal(15,8), y1967 decimal(15,8), y1968 decimal(15,8), 
y1969 decimal(15,8), y1970 decimal(15,8), y1971 decimal(15,8), y1972 decimal(15,8), y1973 decimal(15,8), y1974 decimal(15,8), 
y1975 decimal(15,8), y1976 decimal(15,8), y1977 decimal(15,8), y1978 decimal(15,8), y1979 decimal(15,8), y1980 decimal(15,8), 
y1981 decimal(15,8), y1982 decimal(15,8), y1983 decimal(15,8), y1984 decimal(15,8), y1985 decimal(15,8), y1986 decimal(15,8), 
y1987 decimal(15,8), y1988 decimal(15,8), y1989 decimal(15,8), y1990 decimal(15,8), y1991 decimal(15,8), y1992 decimal(15,8), 
y1993 decimal(15,8), y1994 decimal(15,8), y1995 decimal(15,8), y1996 decimal(15,8), y1997 decimal(15,8), y1998 decimal(15,8), 
y1999 decimal(15,8), y2000 decimal(15,8), y2001 decimal(15,8), y2002 decimal(15,8), y2003 decimal(15,8), y2004 decimal(15,8), 
y2005 decimal(15,8), y2006 decimal(15,8), y2007 decimal(15,8), y2008 decimal(15,8), y2009 decimal(15,8), y2010 decimal(15,8),
 y2011 decimal(15,8), y2012 decimal(15,8), y2013 decimal(15,8), y2014 decimal(15,8), y2015 decimal(15,8), y2016 decimal(15,8))
partitioned by (indicator_code varchar(20))
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

insert overwrite table gender_stats partition(indicator_code) 
select country_code, y1960, y1961, y1962, y1963, y1964, y1965, y1966, y1967, y1968, y1969, y1970, y1971, y1972, 
y1973, y1974, y1975, y1976, y1977, y1978, y1979, y1980, y1981, y1982, y1983, y1984, y1985, y1986, y1987, y1988, 
y1989, y1990, y1991, y1992, y1993, y1994, y1995, y1996, y1997, y1998, y1999, y2000, y2001,y2002, y2003, y2004, 
y2005, y2006, y2007, y2008, y2009, y2010, y2011, y2012, y2013, y2014, y2015, y2016, indicator_code 
from gender_stats;

create table countries(Country_Code char(3),Short_Name string,Table_Name string,Long_Name string,2_alpha_code string,Currency_Unit string) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
               WITH SERDEPROPERTIES (
               "separatorChar" = ",",
               "quoteChar"     = "\""
               );
load data local inpath '/home/cloudera/Desktop/project1_input/Gender_StatsCountry.txt' into table countries;

select gender_stats.* from gender_stats left outer join countries on 
gender_stats.country_code = countries.country_code where countries.currency_unit <> null limit 30000;

select gender_stats.* from gender_stats inner join countries on gender_stats.country_code = countries.country_code 
where countries.currency_unit <> "" limit 5;

--rowcount before: 165165

insert overwrite table gender_stats partition(indicator_code) select gender_stats.* from gender_stats left outer join countries 
on gender_stats.country_code = countries.country_code 
where countries.currency_unit <> "" and coalesce(gender_stats.y1960, gender_stats.y1961, gender_stats.y1962, 
gender_stats.y1963, gender_stats.y1964, gender_stats.y1965, gender_stats.y1966, gender_stats.y1967, 
gender_stats.y1968, gender_stats.y1969, gender_stats.y1970, gender_stats.y1971, gender_stats.y1972, 
gender_stats.y1973, gender_stats.y1974, gender_stats.y1975, gender_stats.y1976, gender_stats.y1977, 
gender_stats.y1978, gender_stats.y1979, gender_stats.y1980, gender_stats.y1981, gender_stats.y1982, 
gender_stats.y1983, gender_stats.y1984, gender_stats.y1985, gender_stats.y1986, gender_stats.y1987, 
gender_stats.y1988, gender_stats.y1989, gender_stats.y1990, gender_stats.y1991, gender_stats.y1992, 
gender_stats.y1993, gender_stats.y1994, gender_stats.y1995, gender_stats.y1996, gender_stats.y1997, 
gender_stats.y1998, gender_stats.y1999, gender_stats.y2000, gender_stats.y2001,gender_stats.y2002, 
gender_stats.y2003, gender_stats.y2004, gender_stats.y2005, gender_stats.y2006, gender_stats.y2007, 
gender_stats.y2008, gender_stats.y2009, gender_stats.y2010, gender_stats.y2011, gender_stats.y2012, 
gender_stats.y2013, gender_stats.y2014, gender_stats.y2015, gender_stats.y2016) <> 0;

--rowcount after: 78640
