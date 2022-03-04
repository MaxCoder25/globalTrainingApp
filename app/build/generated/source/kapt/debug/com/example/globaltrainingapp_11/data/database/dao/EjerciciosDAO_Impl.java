package com.example.globaltrainingapp_11.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity;
import com.example.globaltrainingapp_11.entidades.RutinasEntity;
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EjerciciosDAO_Impl implements EjerciciosDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EjerciciosEntity> __insertionAdapterOfEjerciciosEntity;

  private final EntityDeletionOrUpdateAdapter<EjerciciosEntity> __deletionAdapterOfEjerciciosEntity;

  private final EntityDeletionOrUpdateAdapter<EjerciciosEntity> __updateAdapterOfEjerciciosEntity;

  private final SharedSQLiteStatement __preparedStmtOfCleanDbEjercicios;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEjerciciosById;

  public EjerciciosDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEjerciciosEntity = new EntityInsertionAdapter<EjerciciosEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ejercicios` (`id_ejercicios`,`nombreEjercicio`,`descripcion`,`categoria`,`nivel`,`tipo_movimiento`,`repeticiones`,`imagen`,`video`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EjerciciosEntity value) {
        stmt.bindLong(1, value.getId_ejercicios());
        if (value.getNombreEjercicio() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombreEjercicio());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescripcion());
        }
        if (value.getCategoria() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategoria());
        }
        if (value.getNivel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNivel());
        }
        if (value.getTipo_movimiento() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTipo_movimiento());
        }
        stmt.bindLong(7, value.getRepeticiones());
        if (value.getImagen() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImagen());
        }
        if (value.getVideo() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getVideo());
        }
      }
    };
    this.__deletionAdapterOfEjerciciosEntity = new EntityDeletionOrUpdateAdapter<EjerciciosEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ejercicios` WHERE `id_ejercicios` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EjerciciosEntity value) {
        stmt.bindLong(1, value.getId_ejercicios());
      }
    };
    this.__updateAdapterOfEjerciciosEntity = new EntityDeletionOrUpdateAdapter<EjerciciosEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `ejercicios` SET `id_ejercicios` = ?,`nombreEjercicio` = ?,`descripcion` = ?,`categoria` = ?,`nivel` = ?,`tipo_movimiento` = ?,`repeticiones` = ?,`imagen` = ?,`video` = ? WHERE `id_ejercicios` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EjerciciosEntity value) {
        stmt.bindLong(1, value.getId_ejercicios());
        if (value.getNombreEjercicio() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombreEjercicio());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescripcion());
        }
        if (value.getCategoria() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategoria());
        }
        if (value.getNivel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNivel());
        }
        if (value.getTipo_movimiento() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTipo_movimiento());
        }
        stmt.bindLong(7, value.getRepeticiones());
        if (value.getImagen() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImagen());
        }
        if (value.getVideo() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getVideo());
        }
        stmt.bindLong(10, value.getId_ejercicios());
      }
    };
    this.__preparedStmtOfCleanDbEjercicios = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ejercicios";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEjerciciosById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ejercicios WHERE id_ejercicios = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertEjercicios(final EjerciciosEntity ejercicio,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEjerciciosEntity.insert(ejercicio);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOneEjercicios(final EjerciciosEntity ejercicio,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfEjerciciosEntity.handle(ejercicio);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object updateEjercicios(final EjerciciosEntity ejercicio,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfEjerciciosEntity.handle(ejercicio);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object cleanDbEjercicios(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfCleanDbEjercicios.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfCleanDbEjercicios.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object deleteEjerciciosById(final int idEjercicios,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEjerciciosById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, idEjercicios);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteEjerciciosById.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public Object getAllEjercicios(final Continuation<? super List<EjerciciosEntity>> arg0) {
    final String _sql = "SELECT * FROM ejercicios";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EjerciciosEntity>>() {
      @Override
      public List<EjerciciosEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdEjercicios = CursorUtil.getColumnIndexOrThrow(_cursor, "id_ejercicios");
          final int _cursorIndexOfNombreEjercicio = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreEjercicio");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfTipoMovimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo_movimiento");
          final int _cursorIndexOfRepeticiones = CursorUtil.getColumnIndexOrThrow(_cursor, "repeticiones");
          final int _cursorIndexOfImagen = CursorUtil.getColumnIndexOrThrow(_cursor, "imagen");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final List<EjerciciosEntity> _result = new ArrayList<EjerciciosEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EjerciciosEntity _item;
            final int _tmpId_ejercicios;
            _tmpId_ejercicios = _cursor.getInt(_cursorIndexOfIdEjercicios);
            final String _tmpNombreEjercicio;
            if (_cursor.isNull(_cursorIndexOfNombreEjercicio)) {
              _tmpNombreEjercicio = null;
            } else {
              _tmpNombreEjercicio = _cursor.getString(_cursorIndexOfNombreEjercicio);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpTipo_movimiento;
            if (_cursor.isNull(_cursorIndexOfTipoMovimiento)) {
              _tmpTipo_movimiento = null;
            } else {
              _tmpTipo_movimiento = _cursor.getString(_cursorIndexOfTipoMovimiento);
            }
            final int _tmpRepeticiones;
            _tmpRepeticiones = _cursor.getInt(_cursorIndexOfRepeticiones);
            final String _tmpImagen;
            if (_cursor.isNull(_cursorIndexOfImagen)) {
              _tmpImagen = null;
            } else {
              _tmpImagen = _cursor.getString(_cursorIndexOfImagen);
            }
            final String _tmpVideo;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmpVideo = null;
            } else {
              _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
            }
            _item = new EjerciciosEntity(_tmpId_ejercicios,_tmpNombreEjercicio,_tmpDescripcion,_tmpCategoria,_tmpNivel,_tmpTipo_movimiento,_tmpRepeticiones,_tmpImagen,_tmpVideo);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg0);
  }

  @Override
  public Object getEjerciciosById(final int idEjercicio,
      final Continuation<? super EjerciciosEntity> arg1) {
    final String _sql = "SELECT * FROM ejercicios WHERE id_ejercicios = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idEjercicio);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<EjerciciosEntity>() {
      @Override
      public EjerciciosEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdEjercicios = CursorUtil.getColumnIndexOrThrow(_cursor, "id_ejercicios");
          final int _cursorIndexOfNombreEjercicio = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreEjercicio");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfTipoMovimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo_movimiento");
          final int _cursorIndexOfRepeticiones = CursorUtil.getColumnIndexOrThrow(_cursor, "repeticiones");
          final int _cursorIndexOfImagen = CursorUtil.getColumnIndexOrThrow(_cursor, "imagen");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final EjerciciosEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId_ejercicios;
            _tmpId_ejercicios = _cursor.getInt(_cursorIndexOfIdEjercicios);
            final String _tmpNombreEjercicio;
            if (_cursor.isNull(_cursorIndexOfNombreEjercicio)) {
              _tmpNombreEjercicio = null;
            } else {
              _tmpNombreEjercicio = _cursor.getString(_cursorIndexOfNombreEjercicio);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpTipo_movimiento;
            if (_cursor.isNull(_cursorIndexOfTipoMovimiento)) {
              _tmpTipo_movimiento = null;
            } else {
              _tmpTipo_movimiento = _cursor.getString(_cursorIndexOfTipoMovimiento);
            }
            final int _tmpRepeticiones;
            _tmpRepeticiones = _cursor.getInt(_cursorIndexOfRepeticiones);
            final String _tmpImagen;
            if (_cursor.isNull(_cursorIndexOfImagen)) {
              _tmpImagen = null;
            } else {
              _tmpImagen = _cursor.getString(_cursorIndexOfImagen);
            }
            final String _tmpVideo;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmpVideo = null;
            } else {
              _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
            }
            _result = new EjerciciosEntity(_tmpId_ejercicios,_tmpNombreEjercicio,_tmpDescripcion,_tmpCategoria,_tmpNivel,_tmpTipo_movimiento,_tmpRepeticiones,_tmpImagen,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Object getEjerciciosByCategory(final String EjerciciosCategory,
      final Continuation<? super EjerciciosEntity> arg1) {
    final String _sql = "SELECT * FROM ejercicios WHERE categoria = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (EjerciciosCategory == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, EjerciciosCategory);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<EjerciciosEntity>() {
      @Override
      public EjerciciosEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdEjercicios = CursorUtil.getColumnIndexOrThrow(_cursor, "id_ejercicios");
          final int _cursorIndexOfNombreEjercicio = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreEjercicio");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfTipoMovimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo_movimiento");
          final int _cursorIndexOfRepeticiones = CursorUtil.getColumnIndexOrThrow(_cursor, "repeticiones");
          final int _cursorIndexOfImagen = CursorUtil.getColumnIndexOrThrow(_cursor, "imagen");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final EjerciciosEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId_ejercicios;
            _tmpId_ejercicios = _cursor.getInt(_cursorIndexOfIdEjercicios);
            final String _tmpNombreEjercicio;
            if (_cursor.isNull(_cursorIndexOfNombreEjercicio)) {
              _tmpNombreEjercicio = null;
            } else {
              _tmpNombreEjercicio = _cursor.getString(_cursorIndexOfNombreEjercicio);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpTipo_movimiento;
            if (_cursor.isNull(_cursorIndexOfTipoMovimiento)) {
              _tmpTipo_movimiento = null;
            } else {
              _tmpTipo_movimiento = _cursor.getString(_cursorIndexOfTipoMovimiento);
            }
            final int _tmpRepeticiones;
            _tmpRepeticiones = _cursor.getInt(_cursorIndexOfRepeticiones);
            final String _tmpImagen;
            if (_cursor.isNull(_cursorIndexOfImagen)) {
              _tmpImagen = null;
            } else {
              _tmpImagen = _cursor.getString(_cursorIndexOfImagen);
            }
            final String _tmpVideo;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmpVideo = null;
            } else {
              _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
            }
            _result = new EjerciciosEntity(_tmpId_ejercicios,_tmpNombreEjercicio,_tmpDescripcion,_tmpCategoria,_tmpNivel,_tmpTipo_movimiento,_tmpRepeticiones,_tmpImagen,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Object getEjerciciosByTipoMovimiento(final String EjerciciosTipoMovimiento,
      final Continuation<? super EjerciciosEntity> arg1) {
    final String _sql = "SELECT * FROM ejercicios WHERE tipo_movimiento = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (EjerciciosTipoMovimiento == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, EjerciciosTipoMovimiento);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<EjerciciosEntity>() {
      @Override
      public EjerciciosEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdEjercicios = CursorUtil.getColumnIndexOrThrow(_cursor, "id_ejercicios");
          final int _cursorIndexOfNombreEjercicio = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreEjercicio");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfTipoMovimiento = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo_movimiento");
          final int _cursorIndexOfRepeticiones = CursorUtil.getColumnIndexOrThrow(_cursor, "repeticiones");
          final int _cursorIndexOfImagen = CursorUtil.getColumnIndexOrThrow(_cursor, "imagen");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final EjerciciosEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId_ejercicios;
            _tmpId_ejercicios = _cursor.getInt(_cursorIndexOfIdEjercicios);
            final String _tmpNombreEjercicio;
            if (_cursor.isNull(_cursorIndexOfNombreEjercicio)) {
              _tmpNombreEjercicio = null;
            } else {
              _tmpNombreEjercicio = _cursor.getString(_cursorIndexOfNombreEjercicio);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpTipo_movimiento;
            if (_cursor.isNull(_cursorIndexOfTipoMovimiento)) {
              _tmpTipo_movimiento = null;
            } else {
              _tmpTipo_movimiento = _cursor.getString(_cursorIndexOfTipoMovimiento);
            }
            final int _tmpRepeticiones;
            _tmpRepeticiones = _cursor.getInt(_cursorIndexOfRepeticiones);
            final String _tmpImagen;
            if (_cursor.isNull(_cursorIndexOfImagen)) {
              _tmpImagen = null;
            } else {
              _tmpImagen = _cursor.getString(_cursorIndexOfImagen);
            }
            final String _tmpVideo;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmpVideo = null;
            } else {
              _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
            }
            _result = new EjerciciosEntity(_tmpId_ejercicios,_tmpNombreEjercicio,_tmpDescripcion,_tmpCategoria,_tmpNivel,_tmpTipo_movimiento,_tmpRepeticiones,_tmpImagen,_tmpVideo);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public List<Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_Relaciones() {
    final String _sql = "SELECT * FROM rutinas";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfIdRutinas = CursorUtil.getColumnIndexOrThrow(_cursor, "id_rutinas");
        final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
        final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
        final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
        final int _cursorIndexOfMusculos = CursorUtil.getColumnIndexOrThrow(_cursor, "musculos");
        final int _cursorIndexOfTiempoMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tiempoMin");
        final LongSparseArray<ArrayList<EjerciciosEntity>> _collectionEjercicios = new LongSparseArray<ArrayList<EjerciciosEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfIdRutinas);
          ArrayList<EjerciciosEntity> _tmpEjerciciosCollection = _collectionEjercicios.get(_tmpKey);
          if (_tmpEjerciciosCollection == null) {
            _tmpEjerciciosCollection = new ArrayList<EjerciciosEntity>();
            _collectionEjercicios.put(_tmpKey, _tmpEjerciciosCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipejerciciosAscomExampleGlobaltrainingapp11EntidadesEjerciciosEntity(_collectionEjercicios);
        final List<Rutinas_Ejercicios_Relaciones> _result = new ArrayList<Rutinas_Ejercicios_Relaciones>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Rutinas_Ejercicios_Relaciones _item;
          final RutinasEntity _tmpRutinas;
          if (! (_cursor.isNull(_cursorIndexOfIdRutinas) && _cursor.isNull(_cursorIndexOfNombre) && _cursor.isNull(_cursorIndexOfCategoria) && _cursor.isNull(_cursorIndexOfNivel) && _cursor.isNull(_cursorIndexOfMusculos) && _cursor.isNull(_cursorIndexOfTiempoMin))) {
            final int _tmpId_rutinas;
            _tmpId_rutinas = _cursor.getInt(_cursorIndexOfIdRutinas);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpMusculos;
            if (_cursor.isNull(_cursorIndexOfMusculos)) {
              _tmpMusculos = null;
            } else {
              _tmpMusculos = _cursor.getString(_cursorIndexOfMusculos);
            }
            final int _tmpTiempoMin;
            _tmpTiempoMin = _cursor.getInt(_cursorIndexOfTiempoMin);
            _tmpRutinas = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin);
          }  else  {
            _tmpRutinas = null;
          }
          ArrayList<EjerciciosEntity> _tmpEjerciciosCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfIdRutinas);
          _tmpEjerciciosCollection_1 = _collectionEjercicios.get(_tmpKey_1);
          if (_tmpEjerciciosCollection_1 == null) {
            _tmpEjerciciosCollection_1 = new ArrayList<EjerciciosEntity>();
          }
          _item = new Rutinas_Ejercicios_Relaciones(_tmpRutinas,_tmpEjerciciosCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_RelacionesFiltradas(
      final int id_rutinas) {
    final String _sql = "SELECT * FROM rutinas  WHERE id_rutinas=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id_rutinas);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfIdRutinas = CursorUtil.getColumnIndexOrThrow(_cursor, "id_rutinas");
        final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
        final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
        final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
        final int _cursorIndexOfMusculos = CursorUtil.getColumnIndexOrThrow(_cursor, "musculos");
        final int _cursorIndexOfTiempoMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tiempoMin");
        final LongSparseArray<ArrayList<EjerciciosEntity>> _collectionEjercicios = new LongSparseArray<ArrayList<EjerciciosEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfIdRutinas);
          ArrayList<EjerciciosEntity> _tmpEjerciciosCollection = _collectionEjercicios.get(_tmpKey);
          if (_tmpEjerciciosCollection == null) {
            _tmpEjerciciosCollection = new ArrayList<EjerciciosEntity>();
            _collectionEjercicios.put(_tmpKey, _tmpEjerciciosCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipejerciciosAscomExampleGlobaltrainingapp11EntidadesEjerciciosEntity(_collectionEjercicios);
        final List<Rutinas_Ejercicios_Relaciones> _result = new ArrayList<Rutinas_Ejercicios_Relaciones>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Rutinas_Ejercicios_Relaciones _item;
          final RutinasEntity _tmpRutinas;
          if (! (_cursor.isNull(_cursorIndexOfIdRutinas) && _cursor.isNull(_cursorIndexOfNombre) && _cursor.isNull(_cursorIndexOfCategoria) && _cursor.isNull(_cursorIndexOfNivel) && _cursor.isNull(_cursorIndexOfMusculos) && _cursor.isNull(_cursorIndexOfTiempoMin))) {
            final int _tmpId_rutinas;
            _tmpId_rutinas = _cursor.getInt(_cursorIndexOfIdRutinas);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpCategoria;
            if (_cursor.isNull(_cursorIndexOfCategoria)) {
              _tmpCategoria = null;
            } else {
              _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
            }
            final String _tmpNivel;
            if (_cursor.isNull(_cursorIndexOfNivel)) {
              _tmpNivel = null;
            } else {
              _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
            }
            final String _tmpMusculos;
            if (_cursor.isNull(_cursorIndexOfMusculos)) {
              _tmpMusculos = null;
            } else {
              _tmpMusculos = _cursor.getString(_cursorIndexOfMusculos);
            }
            final int _tmpTiempoMin;
            _tmpTiempoMin = _cursor.getInt(_cursorIndexOfTiempoMin);
            _tmpRutinas = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin);
          }  else  {
            _tmpRutinas = null;
          }
          ArrayList<EjerciciosEntity> _tmpEjerciciosCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfIdRutinas);
          _tmpEjerciciosCollection_1 = _collectionEjercicios.get(_tmpKey_1);
          if (_tmpEjerciciosCollection_1 == null) {
            _tmpEjerciciosCollection_1 = new ArrayList<EjerciciosEntity>();
          }
          _item = new Rutinas_Ejercicios_Relaciones(_tmpRutinas,_tmpEjerciciosCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipejerciciosAscomExampleGlobaltrainingapp11EntidadesEjerciciosEntity(
      final LongSparseArray<ArrayList<EjerciciosEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<EjerciciosEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<EjerciciosEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipejerciciosAscomExampleGlobaltrainingapp11EntidadesEjerciciosEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<EjerciciosEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipejerciciosAscomExampleGlobaltrainingapp11EntidadesEjerciciosEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `ejercicios`.`id_ejercicios` AS `id_ejercicios`,`ejercicios`.`nombreEjercicio` AS `nombreEjercicio`,`ejercicios`.`descripcion` AS `descripcion`,`ejercicios`.`categoria` AS `categoria`,`ejercicios`.`nivel` AS `nivel`,`ejercicios`.`tipo_movimiento` AS `tipo_movimiento`,`ejercicios`.`repeticiones` AS `repeticiones`,`ejercicios`.`imagen` AS `imagen`,`ejercicios`.`video` AS `video`,_junction.`id_rutinas` FROM `rutinas_ejercicios` AS _junction INNER JOIN `ejercicios` ON (_junction.`id_ejercicios` = `ejercicios`.`id_ejercicios`) WHERE _junction.`id_rutinas` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 9; // _junction.id_rutinas;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfIdEjercicios = 0;
      final int _cursorIndexOfNombreEjercicio = 1;
      final int _cursorIndexOfDescripcion = 2;
      final int _cursorIndexOfCategoria = 3;
      final int _cursorIndexOfNivel = 4;
      final int _cursorIndexOfTipoMovimiento = 5;
      final int _cursorIndexOfRepeticiones = 6;
      final int _cursorIndexOfImagen = 7;
      final int _cursorIndexOfVideo = 8;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<EjerciciosEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final EjerciciosEntity _item_1;
          final int _tmpId_ejercicios;
          _tmpId_ejercicios = _cursor.getInt(_cursorIndexOfIdEjercicios);
          final String _tmpNombreEjercicio;
          if (_cursor.isNull(_cursorIndexOfNombreEjercicio)) {
            _tmpNombreEjercicio = null;
          } else {
            _tmpNombreEjercicio = _cursor.getString(_cursorIndexOfNombreEjercicio);
          }
          final String _tmpDescripcion;
          if (_cursor.isNull(_cursorIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
          }
          final String _tmpCategoria;
          if (_cursor.isNull(_cursorIndexOfCategoria)) {
            _tmpCategoria = null;
          } else {
            _tmpCategoria = _cursor.getString(_cursorIndexOfCategoria);
          }
          final String _tmpNivel;
          if (_cursor.isNull(_cursorIndexOfNivel)) {
            _tmpNivel = null;
          } else {
            _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
          }
          final String _tmpTipo_movimiento;
          if (_cursor.isNull(_cursorIndexOfTipoMovimiento)) {
            _tmpTipo_movimiento = null;
          } else {
            _tmpTipo_movimiento = _cursor.getString(_cursorIndexOfTipoMovimiento);
          }
          final int _tmpRepeticiones;
          _tmpRepeticiones = _cursor.getInt(_cursorIndexOfRepeticiones);
          final String _tmpImagen;
          if (_cursor.isNull(_cursorIndexOfImagen)) {
            _tmpImagen = null;
          } else {
            _tmpImagen = _cursor.getString(_cursorIndexOfImagen);
          }
          final String _tmpVideo;
          if (_cursor.isNull(_cursorIndexOfVideo)) {
            _tmpVideo = null;
          } else {
            _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
          }
          _item_1 = new EjerciciosEntity(_tmpId_ejercicios,_tmpNombreEjercicio,_tmpDescripcion,_tmpCategoria,_tmpNivel,_tmpTipo_movimiento,_tmpRepeticiones,_tmpImagen,_tmpVideo);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
