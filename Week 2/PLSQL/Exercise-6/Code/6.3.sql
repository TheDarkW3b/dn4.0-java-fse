DECLARE
    CURSOR cur_loans IS
        SELECT LoanID, InterestRate
        FROM Loans;
    
    v_newInterestRate NUMBER;
BEGIN
    FOR rec IN cur_loans LOOP
        v_newInterestRate := rec.InterestRate + 0.5;  
        UPDATE Loans
        SET InterestRate = v_newInterestRate
        WHERE LoanID = rec.LoanID;
    END LOOP;
    COMMIT;
END;
/