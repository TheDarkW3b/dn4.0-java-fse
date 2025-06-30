DECLARE
    CURSOR cur_accounts IS
        SELECT AccountID, Balance
        FROM Accounts;
    
    v_fee NUMBER := 50;  
BEGIN
    FOR rec IN cur_accounts LOOP
        UPDATE Accounts
        SET Balance = Balance - v_fee
        WHERE AccountID = rec.AccountID;
    END LOOP;
    COMMIT;
END;
/