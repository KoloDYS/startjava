\echo '--all table' 
SELECT *
  FROM Jaegers;

\echo '--only Active robots'
SELECT *
  FROM Jaegers
 WHERE status = 'Active';

\echo '--only robots 1 and 4 series' 
SELECT *
  FROM Jaegers
 WHERE mark IN ('1', '4');

\echo '--all robots except 1 and 4 series'
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('1', '4');

\echo '--robots in desc order of series'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\echo '--Info about the oldest robot'
SELECT *
  FROM Jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM Jaegers);

\echo '--robots that destroyed the most'
SELECT *
  FROM Jaegers
 WHERE kaijukill =
       (SELECT MAX(kaijukill)
          FROM Jaegers);

\echo '--AVG weight of robots'
SELECT AVG(weight)
  FROM Jaegers;

\echo '--increment kajukill for active robots'
UPDATE Jaegers
   SET kaijukill = kaijukill + 1 
 WHERE status = 'Active';

\echo '--Delete all destroyed robots' 
DELETE FROM Jaegers
 WHERE status = 'Destroyed';