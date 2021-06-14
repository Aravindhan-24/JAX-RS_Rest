# StaffRESTAPI
The purpose if this project is to implement Representational State Transfer Web Services using JAX-RX and Hibernate.

This project implements four HTTP calls GET, PUT, POST, DELETE to implement Read, Update, Add and delete functionalities respectively.

The following urls are used to perform the basic functionalies: 

1. To retirve all staffs,<br />
   @GET<br />
   localhost:8080/staffs<br />
  
2. To retive a particular staff,<br />
   @GET<br />
   localhost:8080/getStaff/{id}<br />

3. To add  staff,<br />
   @POST<br />
   localhost:8080/staff<br />
   pass the staff details(id, name, desgination, salary) in body.<br />
   
4. To update staff,<br />
   @PUT<br />
   localhost:8080/updateStaff<br />
   pass the staff details(id, name, desgination, salary) in body.<br />
  
5. To delete staff, <br />
   @DELETE<br />
   localhost:8080/deleteStaff<br />
   pass the staff details(id, name, desgination, salary) in body.<br />
    

Tools : Eclipse IDE, MYSQL, POSTMAN.<br />
Technolgy : JAX-RS, JAVA, Hibernate, JPA, HQL.
