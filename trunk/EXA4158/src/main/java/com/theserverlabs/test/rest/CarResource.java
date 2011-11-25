package com.theserverlabs.test.rest;

import com.theserverlabs.test.db.CarDb;
import com.theserverlabs.namespaces.cars.Car;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

/**
 * JAX-RS resource for a Car object.
 *
 * @author Kevin McCormack
 */
public class CarResource {

    @Context private UriInfo uriInfo;
    @Context private Request request;
    
    private String id; 
    private Car car;
    
    public CarResource(String id) {
        this.id = id;
        car = CarDb.getInstance().findById(id);
    }

    /**
     * Get a specific car object represented by the ID passed in the constructor.
     *
     * @return the Car object that corresponds to the constructor ID.
     */
    @GET
    @Produces({"application/xml","application/json"})
    public Car getCar() {
    	return car;
    }

    /**
     * Update an existing Car object. Note that the ID in the car object passed
     * as args must be the same as that which was passed as args in the URL.
     *
     * To create a Car object, you must use the POST method in the CarsResource
     * class since creation must be idempotent.
     *
     * @param car the car object to create.
     * @return the updated Car object.
     */
    @PUT
    @Consumes({"application/xml","application/json"})
    public JAXBElement<Car> putCar(JAXBElement<Car> car) {
        CarDb.getInstance().updateCar(id, car.getValue());
        return car;
    }

    /**
     * Remove a car from the database.
     */
    @DELETE
    public void deleteCar() {
        CarDb.getInstance().deleteCar(id);
    }
}
