package com.aravindhan.StaffRest;

import javax.ws.rs.DELETE;
import java.util.*;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("staff")
public class MyResource {
	StaffRepository staff = new StaffRepository();
	@PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Staff staffAdd(Staff s) {
    	staff.AddStaff(s);
    	return s;
    }
    

	@Path("getStaff/{id}")
	@GET
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Staff getStaff(@PathParam("id") int id) {
		return staff.getStaff(id);
		}
	
	@Path("updateStaff")
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Staff updateStaff(Staff s) {
		staff.update(s);
		return s;
	}
	
	@Path("deleteStaff")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Staff deleteStaff(Staff s) {
		staff.deleteStaff(s);
		return null;
	}
	@Path("staffs")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Staff> getStaff(){
		return staff.getStaff();
	}
	
	
}
