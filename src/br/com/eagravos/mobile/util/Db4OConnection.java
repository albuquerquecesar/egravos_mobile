/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eagravos.mobile.util;

import android.content.Context;
import android.util.Log;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;

/**
 *
 * @author barbosa
 */
public class Db4OConnection {

    private ObjectContainer database = null;

    private String DATABASE_NAME = "EagravosMobile.db4o";

    public Db4OConnection(Context context) {
        try {
            if (database == null || database.ext().isClosed()) {
                database = Db4oEmbedded.openFile(config(),
                        db4oDBFullPath(context));
            }
        } catch (Exception ie) {
            Log.e(Db4OConnection.class.getName(), ie.getMessage());
        }
    }

    /**
     * Cria uma nova instância de configuração
     *
     * @return
     */
    private EmbeddedConfiguration config() {
        EmbeddedConfiguration configuration = Db4oEmbedded.newConfiguration();
        return configuration;
    }

    /**
     *
     * @param ctx
     * @return retorna o caminho da base
     */
    private String db4oDBFullPath(Context ctx) {
        return ctx.getDir("data", 0) + "/" + DATABASE_NAME;
    }

    public void commit() {
        database.commit();
    }

    public void rollBack() {
        database.rollback();
    }

    public void close() {
        if (this.database != null) {
            this.database.close();
        }
    }

    /**
     *
     * @return A data base para os providers utilizarem.
     */
    public ObjectContainer getDatabase() {
        return this.database;
    }
} 

