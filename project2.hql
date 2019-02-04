create database if not exists project2;
use project2;

--Q1
insert overwrite directory '/user/cloudera/project2/out/q1'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select country_code,
cast(coalesce(
y2016+2016,y2015+2015,y2014+2014,y2013+2013,y2012+2012,y2011+2011,y2010+2010)-
coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) as int) as year, 
coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) as value
from gender_stats where coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) < 30.0 
and indicator_code = 'SE.PRM.CMPL.FE.ZS'
order by value asc;

insert overwrite directory '/user/cloudera/project2/out/q1p2'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select country_code,
cast(coalesce(
y2016+2016,y2015+2015,y2014+2014,y2013+2013,y2012+2012,y2011+2011,y2010+2010)-
coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) as int) as year, 
coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) as value
from gender_stats where coalesce(y2016,y2015,y2014,y2013,y2012,y2011,y2010) < 30.0 
and indicator_code = 'SE.TER.CMPL.FE.ZS'
order by value asc;
!echo;
!echo q1 done;
!echo;

--Q2
insert overwrite directory '/user/cloudera/project2/out/q2'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010,Y2009,Y2008,Y2007,Y2006,Y2005,Y2004,Y2003,Y2002,Y2001,Y2000 
from gender_stats 
where country_code='USA' and indicator_code = 'SE.SEC.ENRR.FE';

insert overwrite directory '/user/cloudera/project2/out/q2p2'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010,Y2009,Y2008,Y2007,Y2006,Y2005,Y2004,Y2003,Y2002,Y2001,Y2000 
from gender_stats 
where country_code='USA' and indicator_code = 'SE.PRM.ENRR.FE';

insert overwrite directory '/user/cloudera/project2/out/q2p3'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010,Y2009,Y2008,Y2007,Y2006,Y2005,Y2004,Y2003,Y2002,Y2001,Y2000 
from gender_stats 
where country_code='USA' and indicator_code = 'SE.TER.ENRR.FE';

insert overwrite directory '/user/cloudera/project2/out/q2Avgs'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select indicator_code,
cast((coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013,Y2012+2012,Y2011+2011,Y2010+2010) - coalesce(Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010)) as int) as recentYear,
cast((coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+2002, y1998+1998) - coalesce(Y2000,Y2001,Y1999,Y2002,1998)) as int) as initialYear,
((coalesce(Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010) - coalesce(Y2000,Y2001,Y1999,Y2002,1998))/coalesce(Y2000,Y2001,Y1999,Y2002,1998)) /
(cast((coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013,Y2012+2012,Y2011+2011,Y2010+2010) - coalesce(Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010)) as int) -
cast((coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+2002, y1998+1998) - coalesce(Y2000,Y2001,Y1999,Y2002,Y1998)) as int)) as avgRelativeAnnualChange
from gender_stats
where country_code = 'USA' and indicator_code like 'SE%FE%' and indicator_code != 'SE.SCH.LIFE.MA' and 
((coalesce(Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010) - coalesce(Y2000,Y2001,Y1999,Y2002,1998))/coalesce(Y2000,Y2001,Y1999,Y2002,1998)) /
(cast((coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013,Y2012+2012,Y2011+2011,Y2010+2010) - coalesce(Y2016,Y2015,Y2014,Y2013,Y2012,Y2011,Y2010)) as int) -
cast((coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+2002, y1998+1998) - coalesce(Y2000,Y2001,Y1999,Y2002,Y1998)) as int)) != 0;

!echo;
!echo q2 done;
!echo;

--Q3
insert overwrite directory '/user/cloudera/project2/out/q3'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select country_code,
cast(coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013)-coalesce(Y2016,Y2015,Y2014,Y2013) as int) as yearL,
coalesce(Y2016,y2015,y2014,y2013) as valueL,
cast(coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+2002, y1998+1998)-coalesce(Y2000,Y2001,Y1999,Y2002,1998) as int) as yearF,
coalesce(y2000,y2001,y1999,y2002,y1998) as valueF,
((coalesce(Y2016,y2015,y2014,y2013)-coalesce(y2000,y2001,y1999,y2002,y1998))/
(cast(coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013)-coalesce(Y2016,Y2015,Y2014,Y2013) as int) - 
cast(coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+20002, y1998+1998)-coalesce(Y2000,Y2001,Y1999,Y2002,1998) as int))) as avg
from gender_stats where indicator_code = 'SL.TLF.CACT.MA.ZS'
order by avg asc;
!echo;
!echo q3 done;
!echo;

--Q4
insert overwrite directory '/user/cloudera/project2/out/q4'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select country_code,
cast(coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013)-coalesce(Y2016,Y2015,Y2014,Y2013) as int) as yearL,
coalesce(Y2016,y2015,y2014,y2013) as valueL,
cast(coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+2002, y1998+1998)-coalesce(Y2000,Y2001,Y1999,Y2002,1998) as int) as yearF,
coalesce(y2000,y2001,y1999,y2002,y1998) as valueF,
((coalesce(Y2016,y2015,y2014,y2013)-coalesce(y2000,y2001,y1999,y2002,y1998))/
(cast(coalesce(Y2016+2016,Y2015+2015,Y2014+2014,Y2013+2013)-coalesce(Y2016,Y2015,Y2014,Y2013) as int) - 
cast(coalesce(Y2000+2000,Y2001+2001,Y1999+1999,Y2002+20002, y1998+1998)-coalesce(Y2000,Y2001,Y1999,Y2002,1998) as int))) as avg
from gender_stats where indicator_code = 'SL.TLF.CACT.FE.ZS'
order by avg asc;
!echo;
!echo q4 done;
!echo;

--Q5
insert overwrite directory '/user/cloudera/project2/out/q5'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select round(sum(y2000)/count(case when y2000 != 0 then y2000 else null end),2) as y2000,
round(sum(y2001)/count(case when y2001 != 0 then y2001 else null end),2) as y2001,round(sum(y2002)/count(case when y2002 != 0 then y2002 else null end),2) as y2002,
round(sum(y2003)/count(case when y2003 != 0 then y2003 else null end),2) as y2003,round(sum(y2004)/count(case when y2004 != 0 then y2004 else null end),2) as y2004,
round(sum(y2005)/count(case when y2005 != 0 then y2005 else null end),2) as y2005,round(sum(y2006)/count(case when y2006 != 0 then y2006 else null end),2) as y2006,
round(sum(y2007)/count(case when y2007 != 0 then y2007 else null end),2) as y2007,round(sum(y2008)/count(case when y2008 != 0 then y2008 else null end),2) as y2008,
round(sum(y2009)/count(case when y2009 != 0 then y2009 else null end),2) as y2009,round(sum(y2010)/count(case when y2010 != 0 then y2010 else null end),2) as y2010,
round(sum(y2011)/count(case when y2011 != 0 then y2011 else null end),2) as y2011,round(sum(y2012)/count(case when y2012 != 0 then y2012 else null end),2) as y2012,
round(sum(y2013)/count(case when y2013 != 0 then y2013 else null end),2) as y2013,round(sum(y2014)/count(case when y2014 != 0 then y2014 else null end),2) as y2014,
round(sum(y2015)/count(case when y2015 != 0 then y2015 else null end),2) as y2015,round(sum(y2016)/count(case when y2016 != 0 then y2016 else null end),2) as y2016
from gender_stats where indicator_code = 'SL.UEM.ADVN.FE.ZS' or indicator_code = 'SL.UEM.ADVN.MA.ZS';
-- 'case when' rather than nullif

insert overwrite directory '/user/cloudera/project2/out/q5p2'
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
stored as textfile
select (100 - round(sum(y2000)/count(case when y2000 != 0 then y2000 else null end),2)) as y2000,
(100 - round(sum(y2001)/count(case when y2001 != 0 then y2001 else null end),2)) as y2001,(100 - round(sum(y2002)/count(case when y2002 != 0 then y2002 else null end),2)) as y2002,
(100 - round(sum(y2003)/count(case when y2003 != 0 then y2003 else null end),2)) as y2003,(100 - round(sum(y2004)/count(case when y2004 != 0 then y2004 else null end),2)) as y2004,
(100 - round(sum(y2005)/count(case when y2005 != 0 then y2005 else null end),2)) as y2005,(100 - round(sum(y2006)/count(case when y2006 != 0 then y2006 else null end),2)) as y2006,
(100 - round(sum(y2007)/count(case when y2007 != 0 then y2007 else null end),2)) as y2007,(100 - round(sum(y2008)/count(case when y2008 != 0 then y2008 else null end),2)) as y2008,
(100 - round(sum(y2009)/count(case when y2009 != 0 then y2009 else null end),2)) as y2009,(100 - round(sum(y2010)/count(case when y2010 != 0 then y2010 else null end),2)) as y2010,
(100 - round(sum(y2011)/count(case when y2011 != 0 then y2011 else null end),2)) as y2011,(100 - round(sum(y2012)/count(case when y2012 != 0 then y2012 else null end),2)) as y2012,
(100 - round(sum(y2013)/count(case when y2013 != 0 then y2013 else null end),2)) as y2013,(100 - round(sum(y2014)/count(case when y2014 != 0 then y2014 else null end),2)) as y2014,
(100 - round(sum(y2015)/count(case when y2015 != 0 then y2015 else null end),2)) as y2015,(100 - round(sum(y2016)/count(case when y2016 != 0 then y2016 else null end),2)) as y2016
from gender_stats where indicator_code = 'SL.EMP.TOTL.SP.NE.ZS';

!echo;
!echo q5 done;
!echo;