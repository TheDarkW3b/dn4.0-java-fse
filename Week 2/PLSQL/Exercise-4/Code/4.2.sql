CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loanAmount NUMBER,
    p_interestRate NUMBER,
    p_loanDurationYears NUMBER
) RETURN NUMBER IS
    v_monthlyInstall掊Installment NUMBER;
    v_monthlyInterestRate NUMBER;
    v_totalMonths NUMBER;
BEGIN
    v_totalMonths := p_loanDurationYears * 12;
    v_monthlyInterestRate := p_interestRate / 1200;
    v_monthlyInstallment := (p_loanAmount * v_monthlyInterestRate) / (1 - POWER(1 + v_monthlyInterestRate, -v_totalMonths));
    RETURN v_monthlyInstallment;
END CalculateMonthlyInstallment;
/