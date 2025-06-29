CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_account IN NUMBER,
  p_to_account   IN NUMBER,
  p_amount       IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account FOR UPDATE;
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  UPDATE Accounts
     SET Balance = Balance - p_amount,
         LastModified = SYSDATE
   WHERE AccountID = p_from_account;

  UPDATE Accounts
     SET Balance = Balance + p_amount,
         LastModified = SYSDATE
   WHERE AccountID = p_to_account;
  COMMIT;
END;
/
SELECT * FROM Accounts;
SELECT * FROM Transactions;
/
EXEC TransferFunds(1, 2, 300);
/
SELECT * FROM Accounts;
SELECT * FROM Transactions;