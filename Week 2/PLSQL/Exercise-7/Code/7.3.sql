CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(
        p_accountID IN NUMBER,
        p_customerID IN NUMBER,
        p_accountType IN VARCHAR2,
        p_balance IN NUMBER
    );
    PROCEDURE CloseAccount(
        p_accountID IN NUMBER
    );
    FUNCTION GetTotalBalance(
        p_customerID IN NUMBER
    ) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount(
        p_accountID IN NUMBER,
        p_customerID IN NUMBER,
        p_accountType IN VARCHAR2,
        p_balance IN NUMBER
    ) IS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_accountID, p_customerID, p_accountType, p_balance, SYSDATE);
        COMMIT;
    END OpenAccount;

    PROCEDURE CloseAccount(
        p_accountID IN NUMBER
    ) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_accountID;
        COMMIT;
    END CloseAccount;

    FUNCTION GetTotalBalance(
        p_customerID IN NUMBER
    ) RETURN NUMBER IS
        v_totalBalance NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO v_totalBalance FROM Accounts WHERE CustomerID = p_customerID;
        RETURN v_totalBalance;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RETURN 0;
    END GetTotalBalance;
END AccountOperations;
/