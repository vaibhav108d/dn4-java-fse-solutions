CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
     SET Balance = (Balance * 0.1)+ Balance,
         LastModified = SYSDATE
   WHERE AccountType = 'Savings';
  COMMIT;
END;
/
SELECT * FROM Accounts;--Before
/
EXEC ProcessMonthlyInterest;
/
SELECT * FROM Accounts;--After