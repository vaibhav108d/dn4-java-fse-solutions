BEGIN   
UPDATE Customers
   SET DOB = TO_DATE('1950-05-15', 'YYYY-MM-DD')
 WHERE CustomerID = 1;
COMMIT;
END;
/
SELECT CustomerID, Name, DOB, TRUNC(MONTHS_BETWEEN(SYSDATE, DOB)/12) AS AGE FROM Customers;
/
BEGIN
  FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
    IF MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12 > 60 THEN
      UPDATE Loans
         SET InterestRate = InterestRate - 1
       WHERE CustomerID = cust_rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
SELECT * FROM LOANS;