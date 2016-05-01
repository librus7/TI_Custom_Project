-- HEADER-START
-- DESCRIPTION This is the oracle customisation static data management definition script generated on 2016-04-10 14:44:21
--
-- PARAMETER schema
-- DESCRIPTION Specify the database schema where these tables will be created.
-- DEFAULT [TRADEIN1]
-- VALUE ${schema}
--
-- HEADER-END
INSERT INTO ${schema}.CHPFLOG ( TIMESEQ, DBVERSION, SOURCE, ACTION, COMMENTS ) VALUES ( TO_CHAR ( SYSDATE, 'YYYY/MM/DD-HH24:MI:SS' ), 'CUSTOM', 'oExtDefns.sql', 'Updating table metadata', 'Updating the customisation version stamp and static table definitions in EXTSTATT and EXTSTATF' );

UPDATE ${schema}.CHPFVER SET TICUSTVER = '73FF8DC5CF4F6DA1A2927BE64CB7C3F5';

DELETE FROM ${schema}.EXTSTATT;
DELETE FROM ${schema}.EXTSTATF;
 
INSERT INTO ${schema}.CHPFLOG ( TIMESEQ, DBVERSION, SOURCE, ACTION, COMMENTS ) VALUES ( TO_CHAR ( SYSDATE+ 1, 'YYYY/MM/DD-HH24:MI:SS' ), 'CUSTOM' , 'oExtDefns.sql' , 'Table metadata complete', 'Customisation version stamp updated to 73FF8DC5CF4F6DA1A2927BE64CB7C3F5. Static table metadata insertion complete');

COMMIT;
