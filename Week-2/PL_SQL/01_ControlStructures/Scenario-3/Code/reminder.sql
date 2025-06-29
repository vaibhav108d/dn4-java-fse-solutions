SET SERVEROUTPUT ON
UPDATE loans SET enddate = sysdate + 10 WHERE loanid = 1;
COMMIT;

DECLARE
  v_name customers.NAME%TYPE;
BEGIN
  FOR loan_rec IN (
    SELECT loanid, customerid, enddate
      FROM loans
     WHERE enddate BETWEEN sysdate AND sysdate + 30
  ) LOOP
    SELECT NAME INTO v_name FROM customers WHERE customerid = loan_rec.customerid;
    dbms_output.put_line('Reminder: Loan ' || loan_rec.loanid || ' for customer ' || v_name ||
                         ' is due on ' || to_char(loan_rec.enddate, 'YYYY-MM-DD'));
  END LOOP;
END;
/
SELECT * FROM loans;
SELECT * FROM customers;