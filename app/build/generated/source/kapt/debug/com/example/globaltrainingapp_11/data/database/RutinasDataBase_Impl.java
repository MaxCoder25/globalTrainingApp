package com.example.globaltrainingapp_11.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.globaltrainingapp_11.data.database.dao.EjerciciosDAO;
import com.example.globaltrainingapp_11.data.database.dao.EjerciciosDAO_Impl;
import com.example.globaltrainingapp_11.data.database.dao.RutinasDAO;
import com.example.globaltrainingapp_11.data.database.dao.RutinasDAO_Impl;
import com.example.globaltrainingapp_11.data.database.dao.UsuariosDAO;
import com.example.globaltrainingapp_11.data.database.dao.UsuariosDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RutinasDataBase_Impl extends RutinasDataBase {
  private volatile RutinasDAO _rutinasDAO;

  private volatile EjerciciosDAO _ejerciciosDAO;

  private volatile UsuariosDAO _usuariosDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `rutinas` (`id_rutinas` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nombre` TEXT NOT NULL, `categoria` TEXT NOT NULL, `nivel` TEXT NOT NULL, `musculos` TEXT NOT NULL, `tiempoMin` INTEGER NOT NULL, `series` INTEGER NOT NULL, `puntos` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ejercicios` (`id_ejercicios` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nombreEjercicio` TEXT NOT NULL, `descripcion` TEXT NOT NULL, `categoria` TEXT NOT NULL, `nivel` TEXT NOT NULL, `tipo_movimiento` TEXT NOT NULL, `repeticiones` INTEGER NOT NULL, `tieneTiempo` TEXT NOT NULL, `imagen` TEXT NOT NULL, `video` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `rutinas_ejercicios` (`id_rutinas` INTEGER NOT NULL, `id_ejercicios` INTEGER NOT NULL, PRIMARY KEY(`id_rutinas`, `id_ejercicios`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `semana_rutinas` (`dia` TEXT NOT NULL, `id_rutinas` INTEGER NOT NULL, PRIMARY KEY(`dia`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `categoria_rutinas` (`id_catRutina` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nombre` TEXT NOT NULL, `descripcion` TEXT NOT NULL, `cantidad` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `usuarios` (`idUsuario` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nombreUsuario` TEXT NOT NULL, `edadUsuario` INTEGER NOT NULL, `emailUsuario` TEXT NOT NULL, `nicknameUsuario` TEXT NOT NULL, `passwordUsuario` TEXT NOT NULL, `rutinasCompletadas` INTEGER NOT NULL, `puntos` INTEGER NOT NULL, `nivel` INTEGER NOT NULL, `premios` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `premios` (`id_premio` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `premio` TEXT NOT NULL, `ubicacion` TEXT NOT NULL, `codigoRetiro` TEXT NOT NULL, `img_premio` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `niveles` (`id_nivel` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nivel` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e2d6d127cb866c7f87ba741b3285a87')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `rutinas`");
        _db.execSQL("DROP TABLE IF EXISTS `ejercicios`");
        _db.execSQL("DROP TABLE IF EXISTS `rutinas_ejercicios`");
        _db.execSQL("DROP TABLE IF EXISTS `semana_rutinas`");
        _db.execSQL("DROP TABLE IF EXISTS `categoria_rutinas`");
        _db.execSQL("DROP TABLE IF EXISTS `usuarios`");
        _db.execSQL("DROP TABLE IF EXISTS `premios`");
        _db.execSQL("DROP TABLE IF EXISTS `niveles`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRutinas = new HashMap<String, TableInfo.Column>(8);
        _columnsRutinas.put("id_rutinas", new TableInfo.Column("id_rutinas", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("nombre", new TableInfo.Column("nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("categoria", new TableInfo.Column("categoria", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("nivel", new TableInfo.Column("nivel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("musculos", new TableInfo.Column("musculos", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("tiempoMin", new TableInfo.Column("tiempoMin", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("series", new TableInfo.Column("series", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinas.put("puntos", new TableInfo.Column("puntos", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRutinas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRutinas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRutinas = new TableInfo("rutinas", _columnsRutinas, _foreignKeysRutinas, _indicesRutinas);
        final TableInfo _existingRutinas = TableInfo.read(_db, "rutinas");
        if (! _infoRutinas.equals(_existingRutinas)) {
          return new RoomOpenHelper.ValidationResult(false, "rutinas(com.example.globaltrainingapp_11.entidades.RutinasEntity).\n"
                  + " Expected:\n" + _infoRutinas + "\n"
                  + " Found:\n" + _existingRutinas);
        }
        final HashMap<String, TableInfo.Column> _columnsEjercicios = new HashMap<String, TableInfo.Column>(10);
        _columnsEjercicios.put("id_ejercicios", new TableInfo.Column("id_ejercicios", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("nombreEjercicio", new TableInfo.Column("nombreEjercicio", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("descripcion", new TableInfo.Column("descripcion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("categoria", new TableInfo.Column("categoria", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("nivel", new TableInfo.Column("nivel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("tipo_movimiento", new TableInfo.Column("tipo_movimiento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("repeticiones", new TableInfo.Column("repeticiones", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("tieneTiempo", new TableInfo.Column("tieneTiempo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("imagen", new TableInfo.Column("imagen", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEjercicios.put("video", new TableInfo.Column("video", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEjercicios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEjercicios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEjercicios = new TableInfo("ejercicios", _columnsEjercicios, _foreignKeysEjercicios, _indicesEjercicios);
        final TableInfo _existingEjercicios = TableInfo.read(_db, "ejercicios");
        if (! _infoEjercicios.equals(_existingEjercicios)) {
          return new RoomOpenHelper.ValidationResult(false, "ejercicios(com.example.globaltrainingapp_11.entidades.EjerciciosEntity).\n"
                  + " Expected:\n" + _infoEjercicios + "\n"
                  + " Found:\n" + _existingEjercicios);
        }
        final HashMap<String, TableInfo.Column> _columnsRutinasEjercicios = new HashMap<String, TableInfo.Column>(2);
        _columnsRutinasEjercicios.put("id_rutinas", new TableInfo.Column("id_rutinas", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutinasEjercicios.put("id_ejercicios", new TableInfo.Column("id_ejercicios", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRutinasEjercicios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRutinasEjercicios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRutinasEjercicios = new TableInfo("rutinas_ejercicios", _columnsRutinasEjercicios, _foreignKeysRutinasEjercicios, _indicesRutinasEjercicios);
        final TableInfo _existingRutinasEjercicios = TableInfo.read(_db, "rutinas_ejercicios");
        if (! _infoRutinasEjercicios.equals(_existingRutinasEjercicios)) {
          return new RoomOpenHelper.ValidationResult(false, "rutinas_ejercicios(com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_CrossRef).\n"
                  + " Expected:\n" + _infoRutinasEjercicios + "\n"
                  + " Found:\n" + _existingRutinasEjercicios);
        }
        final HashMap<String, TableInfo.Column> _columnsSemanaRutinas = new HashMap<String, TableInfo.Column>(2);
        _columnsSemanaRutinas.put("dia", new TableInfo.Column("dia", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSemanaRutinas.put("id_rutinas", new TableInfo.Column("id_rutinas", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSemanaRutinas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSemanaRutinas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSemanaRutinas = new TableInfo("semana_rutinas", _columnsSemanaRutinas, _foreignKeysSemanaRutinas, _indicesSemanaRutinas);
        final TableInfo _existingSemanaRutinas = TableInfo.read(_db, "semana_rutinas");
        if (! _infoSemanaRutinas.equals(_existingSemanaRutinas)) {
          return new RoomOpenHelper.ValidationResult(false, "semana_rutinas(com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity).\n"
                  + " Expected:\n" + _infoSemanaRutinas + "\n"
                  + " Found:\n" + _existingSemanaRutinas);
        }
        final HashMap<String, TableInfo.Column> _columnsCategoriaRutinas = new HashMap<String, TableInfo.Column>(4);
        _columnsCategoriaRutinas.put("id_catRutina", new TableInfo.Column("id_catRutina", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoriaRutinas.put("nombre", new TableInfo.Column("nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoriaRutinas.put("descripcion", new TableInfo.Column("descripcion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoriaRutinas.put("cantidad", new TableInfo.Column("cantidad", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategoriaRutinas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategoriaRutinas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategoriaRutinas = new TableInfo("categoria_rutinas", _columnsCategoriaRutinas, _foreignKeysCategoriaRutinas, _indicesCategoriaRutinas);
        final TableInfo _existingCategoriaRutinas = TableInfo.read(_db, "categoria_rutinas");
        if (! _infoCategoriaRutinas.equals(_existingCategoriaRutinas)) {
          return new RoomOpenHelper.ValidationResult(false, "categoria_rutinas(com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity).\n"
                  + " Expected:\n" + _infoCategoriaRutinas + "\n"
                  + " Found:\n" + _existingCategoriaRutinas);
        }
        final HashMap<String, TableInfo.Column> _columnsUsuarios = new HashMap<String, TableInfo.Column>(10);
        _columnsUsuarios.put("idUsuario", new TableInfo.Column("idUsuario", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("nombreUsuario", new TableInfo.Column("nombreUsuario", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("edadUsuario", new TableInfo.Column("edadUsuario", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("emailUsuario", new TableInfo.Column("emailUsuario", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("nicknameUsuario", new TableInfo.Column("nicknameUsuario", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("passwordUsuario", new TableInfo.Column("passwordUsuario", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("rutinasCompletadas", new TableInfo.Column("rutinasCompletadas", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("puntos", new TableInfo.Column("puntos", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("nivel", new TableInfo.Column("nivel", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("premios", new TableInfo.Column("premios", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsuarios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsuarios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsuarios = new TableInfo("usuarios", _columnsUsuarios, _foreignKeysUsuarios, _indicesUsuarios);
        final TableInfo _existingUsuarios = TableInfo.read(_db, "usuarios");
        if (! _infoUsuarios.equals(_existingUsuarios)) {
          return new RoomOpenHelper.ValidationResult(false, "usuarios(com.example.globaltrainingapp_11.entidades.Usuarios).\n"
                  + " Expected:\n" + _infoUsuarios + "\n"
                  + " Found:\n" + _existingUsuarios);
        }
        final HashMap<String, TableInfo.Column> _columnsPremios = new HashMap<String, TableInfo.Column>(5);
        _columnsPremios.put("id_premio", new TableInfo.Column("id_premio", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPremios.put("premio", new TableInfo.Column("premio", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPremios.put("ubicacion", new TableInfo.Column("ubicacion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPremios.put("codigoRetiro", new TableInfo.Column("codigoRetiro", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPremios.put("img_premio", new TableInfo.Column("img_premio", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPremios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPremios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPremios = new TableInfo("premios", _columnsPremios, _foreignKeysPremios, _indicesPremios);
        final TableInfo _existingPremios = TableInfo.read(_db, "premios");
        if (! _infoPremios.equals(_existingPremios)) {
          return new RoomOpenHelper.ValidationResult(false, "premios(com.example.globaltrainingapp_11.entidades.PremiosEntity).\n"
                  + " Expected:\n" + _infoPremios + "\n"
                  + " Found:\n" + _existingPremios);
        }
        final HashMap<String, TableInfo.Column> _columnsNiveles = new HashMap<String, TableInfo.Column>(2);
        _columnsNiveles.put("id_nivel", new TableInfo.Column("id_nivel", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNiveles.put("nivel", new TableInfo.Column("nivel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNiveles = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNiveles = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNiveles = new TableInfo("niveles", _columnsNiveles, _foreignKeysNiveles, _indicesNiveles);
        final TableInfo _existingNiveles = TableInfo.read(_db, "niveles");
        if (! _infoNiveles.equals(_existingNiveles)) {
          return new RoomOpenHelper.ValidationResult(false, "niveles(com.example.globaltrainingapp_11.entidades.NivelesEntity).\n"
                  + " Expected:\n" + _infoNiveles + "\n"
                  + " Found:\n" + _existingNiveles);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4e2d6d127cb866c7f87ba741b3285a87", "3347b42f104ce75e0272cad9c70293ae");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "rutinas","ejercicios","rutinas_ejercicios","semana_rutinas","categoria_rutinas","usuarios","premios","niveles");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `rutinas`");
      _db.execSQL("DELETE FROM `ejercicios`");
      _db.execSQL("DELETE FROM `rutinas_ejercicios`");
      _db.execSQL("DELETE FROM `semana_rutinas`");
      _db.execSQL("DELETE FROM `categoria_rutinas`");
      _db.execSQL("DELETE FROM `usuarios`");
      _db.execSQL("DELETE FROM `premios`");
      _db.execSQL("DELETE FROM `niveles`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RutinasDAO.class, RutinasDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(EjerciciosDAO.class, EjerciciosDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(UsuariosDAO.class, UsuariosDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public RutinasDAO rutinasDao() {
    if (_rutinasDAO != null) {
      return _rutinasDAO;
    } else {
      synchronized(this) {
        if(_rutinasDAO == null) {
          _rutinasDAO = new RutinasDAO_Impl(this);
        }
        return _rutinasDAO;
      }
    }
  }

  @Override
  public EjerciciosDAO ejerciciosDao() {
    if (_ejerciciosDAO != null) {
      return _ejerciciosDAO;
    } else {
      synchronized(this) {
        if(_ejerciciosDAO == null) {
          _ejerciciosDAO = new EjerciciosDAO_Impl(this);
        }
        return _ejerciciosDAO;
      }
    }
  }

  @Override
  public UsuariosDAO usuariosDao() {
    if (_usuariosDAO != null) {
      return _usuariosDAO;
    } else {
      synchronized(this) {
        if(_usuariosDAO == null) {
          _usuariosDAO = new UsuariosDAO_Impl(this);
        }
        return _usuariosDAO;
      }
    }
  }
}
