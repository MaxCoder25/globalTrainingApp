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
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity;
import com.example.globaltrainingapp_11.entidades.RutinasEntity;
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity;
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones;
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
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RutinasDAO_Impl implements RutinasDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RutinasEntity> __insertionAdapterOfRutinasEntity;

  private final EntityDeletionOrUpdateAdapter<RutinasEntity> __deletionAdapterOfRutinasEntity;

  private final EntityDeletionOrUpdateAdapter<RutinasEntity> __updateAdapterOfRutinasEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRutinasById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSemanaRutinas;

  public RutinasDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRutinasEntity = new EntityInsertionAdapter<RutinasEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `rutinas` (`id_rutinas`,`nombre`,`categoria`,`nivel`,`musculos`,`tiempoMin`,`series`,`puntos`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RutinasEntity value) {
        stmt.bindLong(1, value.getId_rutinas());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getCategoria() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategoria());
        }
        if (value.getNivel() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNivel());
        }
        if (value.getMusculos() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMusculos());
        }
        stmt.bindLong(6, value.getTiempoMin());
        stmt.bindLong(7, value.getSeries());
        stmt.bindLong(8, value.getPuntos());
      }
    };
    this.__deletionAdapterOfRutinasEntity = new EntityDeletionOrUpdateAdapter<RutinasEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `rutinas` WHERE `id_rutinas` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RutinasEntity value) {
        stmt.bindLong(1, value.getId_rutinas());
      }
    };
    this.__updateAdapterOfRutinasEntity = new EntityDeletionOrUpdateAdapter<RutinasEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `rutinas` SET `id_rutinas` = ?,`nombre` = ?,`categoria` = ?,`nivel` = ?,`musculos` = ?,`tiempoMin` = ?,`series` = ?,`puntos` = ? WHERE `id_rutinas` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RutinasEntity value) {
        stmt.bindLong(1, value.getId_rutinas());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getCategoria() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategoria());
        }
        if (value.getNivel() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNivel());
        }
        if (value.getMusculos() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMusculos());
        }
        stmt.bindLong(6, value.getTiempoMin());
        stmt.bindLong(7, value.getSeries());
        stmt.bindLong(8, value.getPuntos());
        stmt.bindLong(9, value.getId_rutinas());
      }
    };
    this.__preparedStmtOfDeleteRutinasById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM rutinas WHERE id_rutinas = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSemanaRutinas = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE semana_rutinas SET id_rutinas=? WHERE dia = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertRutinas(final RutinasEntity Rutina,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRutinasEntity.insert(Rutina);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOneRutinas(final RutinasEntity Rutina,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRutinasEntity.handle(Rutina);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateRutinas(final RutinasEntity Rutina,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRutinasEntity.handle(Rutina);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteRutinasById(final int idRutinas,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRutinasById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, idRutinas);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteRutinasById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updateSemanaRutinas(final int id_rutinas, final String dia,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSemanaRutinas.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id_rutinas);
        _argIndex = 2;
        if (dia == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, dia);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateSemanaRutinas.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllRutinas(final Continuation<? super List<RutinasEntity>> continuation) {
    final String _sql = "SELECT * FROM rutinas";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<RutinasEntity>>() {
      @Override
      public List<RutinasEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdRutinas = CursorUtil.getColumnIndexOrThrow(_cursor, "id_rutinas");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfMusculos = CursorUtil.getColumnIndexOrThrow(_cursor, "musculos");
          final int _cursorIndexOfTiempoMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tiempoMin");
          final int _cursorIndexOfSeries = CursorUtil.getColumnIndexOrThrow(_cursor, "series");
          final int _cursorIndexOfPuntos = CursorUtil.getColumnIndexOrThrow(_cursor, "puntos");
          final List<RutinasEntity> _result = new ArrayList<RutinasEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RutinasEntity _item;
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
            final int _tmpSeries;
            _tmpSeries = _cursor.getInt(_cursorIndexOfSeries);
            final int _tmpPuntos;
            _tmpPuntos = _cursor.getInt(_cursorIndexOfPuntos);
            _item = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin,_tmpSeries,_tmpPuntos);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getRutinasById(final int idRutina,
      final Continuation<? super RutinasEntity> continuation) {
    final String _sql = "SELECT * FROM rutinas WHERE id_rutinas = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idRutina);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RutinasEntity>() {
      @Override
      public RutinasEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdRutinas = CursorUtil.getColumnIndexOrThrow(_cursor, "id_rutinas");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfCategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "categoria");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfMusculos = CursorUtil.getColumnIndexOrThrow(_cursor, "musculos");
          final int _cursorIndexOfTiempoMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tiempoMin");
          final int _cursorIndexOfSeries = CursorUtil.getColumnIndexOrThrow(_cursor, "series");
          final int _cursorIndexOfPuntos = CursorUtil.getColumnIndexOrThrow(_cursor, "puntos");
          final RutinasEntity _result;
          if(_cursor.moveToFirst()) {
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
            final int _tmpSeries;
            _tmpSeries = _cursor.getInt(_cursorIndexOfSeries);
            final int _tmpPuntos;
            _tmpPuntos = _cursor.getInt(_cursorIndexOfPuntos);
            _result = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin,_tmpSeries,_tmpPuntos);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getSemanaRutinas(
      final Continuation<? super List<SemanaRutinas_Rutinas_Relaciones>> continuation) {
    final String _sql = "SELECT * FROM semana_rutinas";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<SemanaRutinas_Rutinas_Relaciones>>() {
      @Override
      public List<SemanaRutinas_Rutinas_Relaciones> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfDia = CursorUtil.getColumnIndexOrThrow(_cursor, "dia");
            final int _cursorIndexOfIdRutinas = CursorUtil.getColumnIndexOrThrow(_cursor, "id_rutinas");
            final LongSparseArray<RutinasEntity> _collectionRutinas = new LongSparseArray<RutinasEntity>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfIdRutinas);
              _collectionRutinas.put(_tmpKey, null);
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiprutinasAscomExampleGlobaltrainingapp11EntidadesRutinasEntity(_collectionRutinas);
            final List<SemanaRutinas_Rutinas_Relaciones> _result = new ArrayList<SemanaRutinas_Rutinas_Relaciones>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final SemanaRutinas_Rutinas_Relaciones _item;
              final SemanaRutinasEntity _tmpSemanaRutinas;
              if (! (_cursor.isNull(_cursorIndexOfDia) && _cursor.isNull(_cursorIndexOfIdRutinas))) {
                final String _tmpDia;
                if (_cursor.isNull(_cursorIndexOfDia)) {
                  _tmpDia = null;
                } else {
                  _tmpDia = _cursor.getString(_cursorIndexOfDia);
                }
                final int _tmpId_rutinas;
                _tmpId_rutinas = _cursor.getInt(_cursorIndexOfIdRutinas);
                _tmpSemanaRutinas = new SemanaRutinasEntity(_tmpDia,_tmpId_rutinas);
              }  else  {
                _tmpSemanaRutinas = null;
              }
              RutinasEntity _tmpRutinas = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfIdRutinas);
              _tmpRutinas = _collectionRutinas.get(_tmpKey_1);
              _item = new SemanaRutinas_Rutinas_Relaciones(_tmpSemanaRutinas,_tmpRutinas);
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
    }, continuation);
  }

  @Override
  public Object getCategoriaRutinas(final String category,
      final Continuation<? super CategoriaRutinasEntity> continuation) {
    final String _sql = "SELECT * FROM categoria_rutinas where nombre =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<CategoriaRutinasEntity>() {
      @Override
      public CategoriaRutinasEntity call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfIdCatRutina = CursorUtil.getColumnIndexOrThrow(_cursor, "id_catRutina");
            final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
            final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
            final int _cursorIndexOfCantidad = CursorUtil.getColumnIndexOrThrow(_cursor, "cantidad");
            final CategoriaRutinasEntity _result;
            if(_cursor.moveToFirst()) {
              final int _tmpId_catRutina;
              _tmpId_catRutina = _cursor.getInt(_cursorIndexOfIdCatRutina);
              final String _tmpNombre;
              if (_cursor.isNull(_cursorIndexOfNombre)) {
                _tmpNombre = null;
              } else {
                _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
              }
              final String _tmpDescripcion;
              if (_cursor.isNull(_cursorIndexOfDescripcion)) {
                _tmpDescripcion = null;
              } else {
                _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
              }
              final int _tmpCantidad;
              _tmpCantidad = _cursor.getInt(_cursorIndexOfCantidad);
              _result = new CategoriaRutinasEntity(_tmpId_catRutina,_tmpNombre,_tmpDescripcion,_tmpCantidad);
            } else {
              _result = null;
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
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshiprutinasAscomExampleGlobaltrainingapp11EntidadesRutinasEntity(
      final LongSparseArray<RutinasEntity> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<RutinasEntity> _tmpInnerMap = new LongSparseArray<RutinasEntity>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiprutinasAscomExampleGlobaltrainingapp11EntidadesRutinasEntity(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<RutinasEntity>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiprutinasAscomExampleGlobaltrainingapp11EntidadesRutinasEntity(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id_rutinas`,`nombre`,`categoria`,`nivel`,`musculos`,`tiempoMin`,`series`,`puntos` FROM `rutinas` WHERE `id_rutinas` IN (");
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
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id_rutinas");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfIdRutinas = 0;
      final int _cursorIndexOfNombre = 1;
      final int _cursorIndexOfCategoria = 2;
      final int _cursorIndexOfNivel = 3;
      final int _cursorIndexOfMusculos = 4;
      final int _cursorIndexOfTiempoMin = 5;
      final int _cursorIndexOfSeries = 6;
      final int _cursorIndexOfPuntos = 7;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final RutinasEntity _item_1;
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
          final int _tmpSeries;
          _tmpSeries = _cursor.getInt(_cursorIndexOfSeries);
          final int _tmpPuntos;
          _tmpPuntos = _cursor.getInt(_cursorIndexOfPuntos);
          _item_1 = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin,_tmpSeries,_tmpPuntos);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
