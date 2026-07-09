SELECT report_date,
       AVG(total_deaths) AS average_daily_deaths
FROM covid_deaths
GROUP BY report_date
ORDER BY report_date;