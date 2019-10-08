package com.hospitalservices.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    int id;

    String name;
    String address;
    String capacity;
    String phone;

    // constructor
    public Hospital(int id, String name, String address,String capacity,String phone)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity  = capacity;
        this.phone = phone;
    }

    // setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setCapacity(String capacity)
    {
        this.capacity = capacity;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    // Getter

    public int getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getCapacity()
    {
        return capacity;
    }
    public String getPhone()
    {
        return phone;
    }
}
