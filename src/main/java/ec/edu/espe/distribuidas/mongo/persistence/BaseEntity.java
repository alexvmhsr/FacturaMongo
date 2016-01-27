/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.persistence;


import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Version;

/**
 *
 * @author PabloA
 */
public abstract class BaseEntity {
    
    protected Date creationDate;
    protected Date lastchange;
    
   @Id
   protected ObjectId Id;
   
   @Version
   private long version;
   

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastchange() {
        return lastchange;
    }

    public void setLastchange(Date lastchange) {
        this.lastchange = lastchange;
    }

    public ObjectId getId() {
        return Id;
    }

    public void setId(ObjectId Id) {
        this.Id = Id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }


    @Override
    public abstract String toString();
       
    
   
   
    
}
