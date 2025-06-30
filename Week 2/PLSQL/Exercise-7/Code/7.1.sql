CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddNewCustomer(
        p_customerID IN NUMBER,
        p_name IN VARCHAR2,
        p_dob IN DATE,
        p_balance IN NUMBER
    );
    PROCEDURE UpdateCustomer(
        p_customerID IN NUMBER,
        p_name IN VARCHAR2,
        p_dob IN DATE,
        p_balance IN NUMBER
    );
    FUNCTION GetCustomerBalance(
        p_customerID IN NUMBER
    ) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
    PROCEDURE AddNewCustomer(
        p_customerID IN NUMBER,
        p_name IN VARCHAR2,
        p_dob IN DATE,
        p_balance IN NUMBER
    ) IS
    BEGIN
        INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
        VALUES (p_customerID, p_name, p_dob, p_balance, SYSDATE);
        COMMIT;
    END AddNewCustomer;

    PROCEDURE UpdateCustomer(
        p_customerID IN NUMBER,
        p_name IN VARCHAR2,
        p_dob IN DATE,
        p_balance IN NUMBER
    ) IS
    BEGIN
        UPDATE Customers
        SET Name = p_name,
            DOB = p_dob,
            Balance = p_balance,
            LastModified = SYSDATE
        WHERE CustomerID = p_customerID;
        COMMIT;
    END UpdateCustomer;

    FUNCTION GetCustomerBalance(
        p_customerID IN NUMBER
    ) RETURN NUMBER IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance INTO v_balance FROM Customers WHERE CustomerID = p_customerID;
        RETURN v_balance;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RETURN NULL;
    END GetCustomerBalance;
END CustomerManagement;
/