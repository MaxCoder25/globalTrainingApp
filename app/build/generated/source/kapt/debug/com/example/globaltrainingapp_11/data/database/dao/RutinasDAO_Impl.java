package com.example.globaltrainingapp_11.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.globaltrainingapp_11.entidades.RutinasEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RutinasDAO_Impl implements RutinasDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RutinasEntity> __insertionAdapterOfRutinasEntity;

  private final EntityDeletionOrUpdateAdapter<RutinasEntity> __deletionAdapterOfRutinasEntity;

  private final EntityDeletionOrUpdateAdapter<RutinasEntity> __updateAdapterOfRutinasEntity;

  private final SharedSQLiteStatement __preparedStmtOfCleanDbRutinas;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRutinasById;

  public RutinasDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRutinasEntity = new EntityInsertionAdapter<RutinasEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `rutinas` (`id_rutinas`,`nombre`,`categoria`,`nivel`,`musculos`,`tiempoMin`) VALUES (nullif(?, 0),?,?,?,?,?)";
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
        return "UPDATE OR REPLACE `rutinas` SET `id_rutinas` = ?,`nombre` = ?,`categoria` = ?,`nivel` = ?,`musculos` = ?,`tiempoMin` = ? WHERE `id_rutinas` = ?";
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
        stmt.bindLong(7, value.getId_rutinas());
      }
    };
    this.__preparedStmtOfCleanDbRutinas = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM rutinas";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRutinasById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM rutinas WHERE id_rutinas = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertRutinas(final RutinasEntity news,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRutinasEntity.insert(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOneRutinas(final RutinasEntity news,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRutinasEntity.handle(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateRutinas(final RutinasEntity news,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRutinasEntity.handle(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object cleanDbRutinas(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfCleanDbRutinas.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfCleanDbRutinas.release(_stmt);
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
            _item = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin);
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
  public Object getRutinasById(final int idNews,
      final Continuation<? super RutinasEntity> continuation) {
    final String _sql = "SELECT * FROM rutinas WHERE id_rutinas = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idNews);
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
            _result = new RutinasEntity(_tmpId_rutinas,_tmpNombre,_tmpCategoria,_tmpNivel,_tmpMusculos,_tmpTiempoMin);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
