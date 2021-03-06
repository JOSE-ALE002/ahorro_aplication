package com.achmadqomarudin.animatedbottombar.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.achmadqomarudin.animatedbottombar.controllers.operacionesAhorro;
import com.achmadqomarudin.animatedbottombar.controllers.operacionesMetaAhorro;
import com.achmadqomarudin.animatedbottombar.controllers.operacionesTransacciones;
import com.achmadqomarudin.animatedbottombar.models.AbonoAhorro;
import com.achmadqomarudin.animatedbottombar.models.Ahorro;

@Database(entities = {Ahorro.class, AbonoAhorro.class}, version = 1, exportSchema = false)
public abstract class conexion extends RoomDatabase {
    public abstract operacionesAhorro op();
    public abstract operacionesMetaAhorro op1();
    public abstract operacionesTransacciones op2();
}
