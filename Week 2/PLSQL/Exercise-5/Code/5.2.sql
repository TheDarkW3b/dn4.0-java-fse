CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('TransactionID: ' || :NEW.TransactionID || ', Action: INSERT, Date: ' || TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));
END LogTransaction;
/