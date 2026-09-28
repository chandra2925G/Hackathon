# KLEHB-FED-26-10-8--clinic-Appointment-prescription-manager
A web application designed to streamline clinic workflows by managing patient appointment scheduling, tracking doctor availability, organizing medical records, and generating digital prescriptions efficiently to enhance healthcare management.
# README.md

**Project Title:**  Clinic Appointment And Prescription Manager

**Team No:** KLHB-FED-26-10-8

**Team Member Names with ID Numbers:**
1. 2620030354 - Sujan
2. 2620030636 - Chandra Paul

**Supervisor's Name:** Dr. Rajesh K

**Abstract:** 
The Clinic Management System is a comprehensive, console-based Java application designed to streamline healthcare workflows and improve patient-doctor interactions. The system automates core administrative processes, including patient registration, doctor scheduling, and multi-slot appointment booking with built-in clash detection. A key feature of the software is its integrated medical prescription module, which cross-references drug components using a data interaction checker to warn clinicians of potential adverse drug events. Furthermore, the application features an automated persistent storage engine that saves records dynamically across custom text files (`doctors.txt`, `patients.txt`, `appointments.txt`, and `prescriptions.txt`) within a secure folder structure. To optimize operational workflows, the program also provides advanced diagnostic tools that calculate doctor utilization percentages and track peak patient visitation hours recursively, providing clinics with data-driven insights to manage administrative workloads efficiently.

**Project Structure:**
Clinic-Management-System (under this folder)
|— README.md
|— src
    |— Javaproject2.java
|— docs
|— data
    |— clinic_data
        |— doctors.txt
        |— patients.txt
        |— appointments.txt
        |— prescriptions.txt
|— results
|— reports

**Execution Instructions:**
> javac src/Javaproject2.java
> java src/Javaproject2

**Git Commands:**
> git init
> git add .
> git commit -m "Initial commit of Clinic Management System"
> git branch -M main
> git remote add origin <your-repository-url>
> git push -u origin main
