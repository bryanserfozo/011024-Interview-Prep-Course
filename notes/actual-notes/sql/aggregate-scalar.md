Aggregate functions take multiple rows, and combine the values into one single column

Some popular aggregates functions are as follows:

-   MAX(Column): returns the max value of that column
-   MIN(Column): returns the min value of that column
-   AVG(Column): returns the average value of that column
-   SUM(Column): adds and returns the sum of the values in the column
-   COUNT(column): returns the number of elements in that column

These function are used in the SELECT clause, and cannot be used with the WHERE clause

If more than one column is being selected in the SELECT column section of the query, a GROUP By is required

You can use the HAVING clause with an aggregate function instead of WHERE

Scalar functions operate on a single row, these can be used with SELECT and WHERE

Some popular scalar functions are as follows:

-   LENGTH(string): returns the length of a string in the given row
-   UPPER(string): returns the string in upper case
-   LOWER(string): returns the string in lower case
-   ABS(num): returns the absolute value of the row
-   CEILING(num): returns the rounded up number
-   FLOOR(num): returns the rounded down number