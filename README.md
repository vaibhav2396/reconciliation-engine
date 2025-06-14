# reconciliation-engine
Backend service to reconcile bank transactions against internal records and generate reports.

## Table of Contents

- [About](#about)
- [Proposed Features](#proposed-features)
- [Completed Features](#completed-features)

---

## About

This project provides a backend service that enables uploading of bank transaction files (CSV), compares them against internal financial records stored in a PostgreSQL database, and generates reconciliation reports highlighting matched, unmatched, and discrepant transactions.

---

## Proposed Features

- Upload CSV files containing bank transactions
- Parse and validate CSV content
- Fetch internal transaction records from the database for a given date range
- Match transactions by invoice number, amount, and date tolerance
- Generate detailed reconciliation reports in JSON format
- Support file upload via REST API
- Extendable matching rules and reporting options
- Integration with PostgreSQL for data persistence
- Support for larger datasets (monthly/annual reconciliation)

---

## Completed Features


---


