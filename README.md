# StaffRESTAPI
The purpose if this project is to implement Representational State Transfer Web Services using JAX-RX and Hibernate.

This project implements four HTTP calls GET, PUT, POST, DELETE to implement Read, Update, Add and delete functionalities respectively.

The following urls are used to perform the basic functionalies: 

1. To retirve all staffs,
   @GET
   localhost:8080/staffs
  
2. To retive a particular staff
   @GET
   localhost:8080/getStaff/{id}

3. To add  staff,
   @POST
   localhost:8080/staff
   pass the staff details(id, name, desgination, salary) in body.
   
4. To update staff,
   @PUT
   localhost:8080/updateStaff
   pass the staff details(id, name, desgination, salary) in body.
  
5. To delete staff, 
   @DELETE
   localhost:8080/deleteStaff
   pass the staff details(id, name, desgination, salary) in body.
    

Tools : Eclipse IDE, MYSQL, POSTMAn.
Technolgy : JAX-RS, JAVA, Hibernate, JPA, HQL.
