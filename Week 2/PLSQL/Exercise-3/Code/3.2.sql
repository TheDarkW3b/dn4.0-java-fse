CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonusPercentage IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary * (1 + p_bonusPercentage / 100)
    WHERE Department = p_department;
    COMMIT;
END UpdateEmployeeBonus;
/