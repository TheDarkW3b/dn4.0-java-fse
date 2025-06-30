CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_fromAccountID IN NUMBER,
    p_toAccountID IN NUMBER,
    p_amount IN NUMBER
) IS
    v_fromBalance NUMBER;
    v_toBalance NUMBER;
BEGIN
    BEGIN
        SELECT Balance INTO v_fromBalance FROM Accounts WHERE AccountID = p_fromAccountID FOR UPDATE;
        IF v_fromBalance < p_amount THEN
            RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
        END IF;
        SELECT Balance INTO v_toBalance FROM Accounts WHERE AccountID = p_toAccountID FOR UPDATE;
        UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_fromAccountID;
        UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_toAccountID;
        COMMIT;
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Error during fund transfer: ' || SQLERRM);
            RAISE;
    END;
END SafeTransferFunds;
/