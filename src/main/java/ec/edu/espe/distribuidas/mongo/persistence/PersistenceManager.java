/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author PabloA
 */
public class PersistenceManager {

    private static final Morphia morphia;
    private static final MongoClient mongoClient;
    private final Datastore mds;

    static {
        MongoClientOptions mongoOptions = MongoClientOptions.builder().socketTimeout(60000).connectTimeout(60000).build();
        try {
            mongoClient = new MongoClient(new ServerAddress("localhost", 27017), mongoOptions);
        } catch (Exception e) {
            throw new RuntimeException("Error de Mongo BD", e);
        }
        mongoClient.setWriteConcern(WriteConcern.SAFE);
        morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.distribuidas.mongo.modelo", true);

    }

    public PersistenceManager() {
        mds = morphia.createDatastore(mongoClient, "castiel");
        mds.ensureIndexes();
    }

    public Datastore context() {
        return this.mds;
    }
     

}
