DECLARE
    CURSOR cur_transactions IS
        SELECT a.CustomerID, t.TransactionID, t.TransactionDate, t.Amount, t.TransactionType
        FROM Transactions t
        JOIN Accounts a ON t.AccountID = a.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);
    
    v_customerID Customers.CustomerID%TYPE;
    v_statement VARCHAR2(4000);
BEGIN
    FOR rec IN cur_transactions LOOP
        v_customerID := rec.CustomerID;
        v_statement := 'Customer ID: ' || v_customerID ||
                       ', Transaction ID: ' || rec.TransactionID ||
                       ', Date: ' || TO_CHAR(rec.TransactionDate, 'YYYY-MM-DD') ||
                       ', Amount: ' || rec.Amount ||
                       ', Type: ' || rec.TransactionType;
        DBMS_OUTPUT.PUT_LINE(v_statement);
    END LOOP;
END;
/