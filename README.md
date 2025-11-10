# E-Recruitment System

A comprehensive database-driven electronic recruitment system connecting hiring managers with job seekers, developed as an academic project for the **Database Systems** course.

_**Created:** November 2018 - January 2019_

## Project Overview

This e-recruitment platform enables companies to post job openings through their recruitment managers while allowing candidates to search and apply for positions. The system features a fully-functional MySQL database with advanced features including triggers, stored procedures, and a complete audit trail, integrated with Java Swing-based graphical user interfaces using JDBC.

## System Architecture

### Database Design

The system is built on a relational database (`erecruit`) with 15+ interconnected tables implementing:

**Core Entities:**
- **Users** (candidates & recruiters)
- **Companies** (etaireia) with sector classifications
- **Job Postings** with requirements and deadlines
- **Applications** linking candidates to jobs
- **Interviews** with scoring and evaluation
- **Degrees** and candidate qualifications
- **Projects** showcasing candidate portfolios

**Key Database Features:**
- Comprehensive referential integrity with cascading rules
- Automatic history tracking for all CRUD operations
- Business logic enforcement through triggers
- Candidate ranking system via stored procedure

### Technology Stack

| Component | Technology |
|-----------|-----------|
| **Database** | MySQL 5.7+ |
| **Programming Language** | Java (JDK 8+) |
| **GUI Framework** | Java Swing |
| **Database Connectivity** | JDBC |
| **IDE** | Apache NetBeans |
| **Build Tool** | Maven (optional) |

## Features

### For Recruiters

- **Company Management**: View and edit company details (restrictions on AFM, DOY, and name changes)
- **Profile Management**: Update personal account information
- **Job Posting**: Create new job listings with requirements, salary, location, and submission deadlines
- **Job Management**: View, edit, and track all posted positions with application statistics
- **Interview Scheduling**: Record interview details including date, duration, score (1-5), and comments
- **Candidate Evaluation**: Assess applications across three criteria:
  - Personality (average of interview scores)
  - Education (number and quality of degrees)
  - Experience (number of projects)
- **Ranking System**: Generate ranked candidate lists for each position using stored procedure
- **Company-wide Overview**: View all jobs posted by the company

### For Candidates

- **Profile Management**: Create and maintain comprehensive profiles including:
  - Bio and personal information
  - Education credentials with grades and institutions
  - Project portfolios with descriptions and URLs
  - Language proficiencies
  - Recommendation letters and certificates
- **Job Search & Application**: Browse open positions and submit applications
- **Application Tracking**: Monitor application status:
  - "Open for submission"
  - "Under assessment"
  - Final ranking results (e.g., "Your ranking is: 3 out of 4 candidates")
- **Application Withdrawal**: Retract applications before submission deadlines

### For Administrators

- **User Management**: Create accounts for recruiters and candidates
- **System Data Management**:
  - Add new subjects/topics (antikeim)
  - Define company sectors (tomeas) with hierarchical structure
- **Audit System**: Comprehensive history tracking with filtering by:
  - Table name (candidate, recruiter, user, etaireia, job)
  - Username
  - Date range
  - Operation type (INSERT, UPDATE, DELETE)
  - Success status

## Database Schema

### Main Tables

| Table | Description | Key Fields |
|-------|-------------|-----------|
| `user` | Base user information | username (PK), password, name, surname, email, reg_date, lastLogin |
| `candidate` | Candidate-specific data | username (FK), bio, certificates, sistatikes |
| `recruiter` | Recruiter details | username (FK), exp_years, firm (FK) |
| `etaireia` | Company information | AFM (PK), DOY, name, tel, address |
| `job` | Job postings | id (PK), salary, position, edra, announce_date, submission_date |
| `interview` | Interview records | interviewID (PK), candidate_username (FK), recruiter_username (FK), score, duration |
| `applies` | Job applications | cand_usrname (FK), job_id (FK), user_submission |
| `has_degree` | Candidate degrees | degr_title (FK), degr_idryma (FK), cand_usrname (FK), grade |
| `tomeas` | Company sectors | title (PK), keimeno, tomeas_title (FK) - hierarchical |
| `history` | Audit trail | historyID (PK), user_username (FK), table_name, success, eidos, event_date |

## SQL Implementation

### Sample Queries

The system includes complex SQL queries for:

1. **High-salary positions** (>€1900) with recruiter details and application counts
2. **Candidate qualifications** aggregating degrees and average grades
3. **Application statistics** with salary averages per candidate
4. **Location-based job search** filtering by city and subject keywords
5. **Recruiter performance** metrics including job postings and interviews

### Triggers

**Audit Triggers** (30+ triggers total):
- `beforeInsert[Table]` & `historyInsert[Table]`: Track insertion attempts and success
- `historyUpdate[Table]`: Log modifications with old vs. new value comparison
- `beforeDelete[Table]` & `historyDelete[Table]`: Record deletion events

**Business Logic Triggers:**
- `beforeUpdateEtaireia`: Prevent changes to AFM, DOY, and company name
- `historyDeleteJob`: Block application withdrawal after submission deadline

### Stored Procedure

**`evaluate(IDjob INT)`**: Comprehensive candidate evaluation system
- Calculates scores across personality, education, and experience
- Generates ranked list of eligible candidates
- Identifies failed candidates with reasons:
  - "failed the interview" (personality score = 1)
  - "inadequate education" (no degrees)
  - "no prior experience" (no projects)
- Marks job status as "evaluated"


## Documentation

For complete system documentation including:
- Detailed ER diagram
- Database schema with cardinalities
- GUI screenshots for all user roles
- Query execution examples
- Trigger behavior demonstrations

Please refer to: `requirements_and_report/report.pdf`

## Contributors
- [Thomas Chatzopoulos](https://github.com/ThomasChatzopoulos)
- [Panagiotis Triantafyllopoulos](https://github.com/Ptriantafyll)
