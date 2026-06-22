# Write your MySQL query statement below
SELECT 
    S.student_id,
    S.student_name,
    sub.subject_name,
    COUNT(e.student_id) AS attended_exams
FROM Students S
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
ON S.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY S.student_id, S.student_name, sub.subject_name
ORDER BY S.student_id, sub.subject_name;