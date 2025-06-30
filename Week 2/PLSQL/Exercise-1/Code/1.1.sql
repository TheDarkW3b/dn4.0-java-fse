DECLARE
    CURSOR cur_customers IS
        SELECT CustomerID, DOB
        FROM Customers;
    v_customerID Customers.CustomerID%TYPE;
    v_dob Customers.DOB%TYPE;
    v_age NUMBER;
BEGIN
    FOR rec IN cur_customers LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
END;
/