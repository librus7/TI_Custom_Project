-- HEADER-START
-- DESCRIPTION This is the db2 customisation data definition script generated on 2016-05-05 21:00:30
--  Note that this script has DROP dtatements that may generate errors when the script is first run -
--  these can be ignored.
-- PARAMETER schema
-- DESCRIPTION Specify the database schema where these tables will be created.
-- DEFAULT [TRADEIN1]
-- VALUE ${schema}
--
-- HEADER-END
INSERT INTO ${schema}.CHPFLOG ( TIMESEQ, DBVERSION, SOURCE, ACTION, COMMENTS ) VALUES ( TIMESTAMP_ISO(CURRENT TIMESTAMP), 'CUSTOM', 'ExtData.sql', 'Starting Custom Creation', 'Executing drop/create script for extra customisation tables'  );

DROP TABLE ${schema}.EXTPMAPI;
CREATE TABLE ${schema}.EXTPMAPI ("GZSEQ" INTEGER, "GZWSID" CHAR(36));
CREATE UNIQUE INDEX ${schema}.X0EXTPMAPI on ${schema}.EXTPMAPI("GZSEQ", "GZWSID");

DROP TABLE ${schema}.EXTEVENT;
CREATE TABLE ${schema}.EXTEVENT ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "INITED" INTEGER, "EVENT" BIGINT, "AGNTWAMT" DECIMAL(12, 2), "AGNTAMT" DECIMAL(12, 2));
CREATE UNIQUE INDEX ${schema}.X0EXTEVENT on ${schema}.EXTEVENT("KEY29");

DROP TABLE ${schema}.EXTEVSTEP;
CREATE TABLE ${schema}.EXTEVSTEP ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "EVENTSTEP" BIGINT, "INITED" INTEGER);
CREATE UNIQUE INDEX ${schema}.X0EXTEVSTEP on ${schema}.EXTEVSTEP("KEY29");

DROP TABLE ${schema}.EXTMASTER;
CREATE TABLE ${schema}.EXTMASTER ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "INITED" INTEGER, "MASTER" BIGINT);
CREATE UNIQUE INDEX ${schema}.X0EXTMASTER on ${schema}.EXTMASTER("KEY29");

DROP TABLE ${schema}.EXTMSS;
CREATE TABLE ${schema}.EXTMSS ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "INITED" INTEGER, "MASTER" BIGINT);
CREATE UNIQUE INDEX ${schema}.X0EXTMSS on ${schema}.EXTMSS("KEY29");

DROP TABLE ${schema}.EXTPOSTING;
CREATE TABLE ${schema}.EXTPOSTING ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "FAPOST" BIGINT, "INITED" INTEGER, "POSTTYPE" CHAR(1), "PCAPOST" BIGINT, "POST" BIGINT, "EVENT" BIGINT, "MASTER" BIGINT);
CREATE UNIQUE INDEX ${schema}.X0EXTPOSTING on ${schema}.EXTPOSTING("KEY29");

DROP TABLE ${schema}.EXTCUST;
CREATE TABLE ${schema}.EXTCUST ("CUST_SBB" CHAR(8), "CUST" CHAR(20), "INITED" INTEGER, "AGNTWPRC" INTEGER);
CREATE UNIQUE INDEX ${schema}.X0EXTCUST on ${schema}.EXTCUST("CUST_SBB", "CUST");

DROP TABLE ${schema}.EXTICUST;
CREATE TABLE ${schema}.EXTICUST ("KEY29" BIGINT, "TYPEFLAG" INTEGER, "TSTAMP" INTEGER, "INITED" INTEGER, "TICUST" BIGINT);
CREATE UNIQUE INDEX ${schema}.X0EXTICUST on ${schema}.EXTICUST("KEY29");

INSERT INTO ${schema}.CHPFLOG ( TIMESEQ, DBVERSION, SOURCE, ACTION, COMMENTS ) VALUES ( TIMESTAMP_ISO(CURRENT TIMESTAMP), 'CUSTOM' , 'ExtData.sql' , 'Custom Creation Complete', 'Completed drop/create script for extra customisation tables');

COMMIT;
