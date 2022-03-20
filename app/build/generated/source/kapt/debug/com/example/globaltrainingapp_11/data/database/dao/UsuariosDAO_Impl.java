package com.example.globaltrainingapp_11.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.globaltrainingapp_11.entidades.NivelesEntity;
import com.example.globaltrainingapp_11.entidades.PremiosEntity;
import com.example.globaltrainingapp_11.entidades.Usuarios;
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
public final class UsuariosDAO_Impl implements UsuariosDAO {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfUpdateNivel_IN_UsuarioById;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePremio_IN_UsuarioById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateRutinasCompletadas_IN_UsuarioById;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePuntos_IN_UsuarioById;

  private final SharedSQLiteStatement __preparedStmtOfInsertNuevoUsuario_Register;

  public UsuariosDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfUpdateNivel_IN_UsuarioById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE usuarios SET nivel=? WHERE idUsuario = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePremio_IN_UsuarioById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE usuarios SET premios=? WHERE idUsuario = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateRutinasCompletadas_IN_UsuarioById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE usuarios SET rutinasCompletadas=? WHERE idUsuario = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePuntos_IN_UsuarioById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE usuarios SET puntos=? WHERE idUsuario = ?";
        return _query;
      }
    };
    this.__preparedStmtOfInsertNuevoUsuario_Register = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "INSERT INTO usuarios (nombreUsuario, edadUsuario,emailUsuario, nicknameUsuario, passwordUsuario, rutinasCompletadas, puntos, nivel, premios) values (?,?,?, ?, ?, ?, ?,?,?)";
        return _query;
      }
    };
  }

  @Override
  public Object updateNivel_IN_UsuarioById(final int id_nivel, final int idUsuario,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNivel_IN_UsuarioById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id_nivel);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, idUsuario);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateNivel_IN_UsuarioById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePremio_IN_UsuarioById(final int id_premio, final int idUsuario,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePremio_IN_UsuarioById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id_premio);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, idUsuario);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdatePremio_IN_UsuarioById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updateRutinasCompletadas_IN_UsuarioById(final int rutinasCompletadas,
      final int idUsuario, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateRutinasCompletadas_IN_UsuarioById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, rutinasCompletadas);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, idUsuario);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateRutinasCompletadas_IN_UsuarioById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePuntos_IN_UsuarioById(final int puntos, final int idUsuario,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePuntos_IN_UsuarioById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, puntos);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, idUsuario);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdatePuntos_IN_UsuarioById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object insertNuevoUsuario_Register(final String nombreUsuario, final int edadUsuario,
      final String emailUsuario, final String nicknameUsuario, final String passwordUsuario,
      final int rutinasCompletadas, final int puntos, final int nivel, final int premios,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfInsertNuevoUsuario_Register.acquire();
        int _argIndex = 1;
        if (nombreUsuario == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, nombreUsuario);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, edadUsuario);
        _argIndex = 3;
        if (emailUsuario == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, emailUsuario);
        }
        _argIndex = 4;
        if (nicknameUsuario == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, nicknameUsuario);
        }
        _argIndex = 5;
        if (passwordUsuario == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, passwordUsuario);
        }
        _argIndex = 6;
        _stmt.bindLong(_argIndex, rutinasCompletadas);
        _argIndex = 7;
        _stmt.bindLong(_argIndex, puntos);
        _argIndex = 8;
        _stmt.bindLong(_argIndex, nivel);
        _argIndex = 9;
        _stmt.bindLong(_argIndex, premios);
        __db.beginTransaction();
        try {
          _stmt.executeInsert();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfInsertNuevoUsuario_Register.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllUsuarios(final Continuation<? super List<Usuarios>> continuation) {
    final String _sql = "SELECT * FROM usuarios";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Usuarios>>() {
      @Override
      public List<Usuarios> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "idUsuario");
          final int _cursorIndexOfNombreUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreUsuario");
          final int _cursorIndexOfEdadUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "edadUsuario");
          final int _cursorIndexOfEmailUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "emailUsuario");
          final int _cursorIndexOfNicknameUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "nicknameUsuario");
          final int _cursorIndexOfPasswordUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "passwordUsuario");
          final int _cursorIndexOfRutinasCompletadas = CursorUtil.getColumnIndexOrThrow(_cursor, "rutinasCompletadas");
          final int _cursorIndexOfPuntos = CursorUtil.getColumnIndexOrThrow(_cursor, "puntos");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfPremios = CursorUtil.getColumnIndexOrThrow(_cursor, "premios");
          final List<Usuarios> _result = new ArrayList<Usuarios>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Usuarios _item;
            final int _tmpIdUsuario;
            _tmpIdUsuario = _cursor.getInt(_cursorIndexOfIdUsuario);
            final String _tmpNombreUsuario;
            if (_cursor.isNull(_cursorIndexOfNombreUsuario)) {
              _tmpNombreUsuario = null;
            } else {
              _tmpNombreUsuario = _cursor.getString(_cursorIndexOfNombreUsuario);
            }
            final int _tmpEdadUsuario;
            _tmpEdadUsuario = _cursor.getInt(_cursorIndexOfEdadUsuario);
            final String _tmpEmailUsuario;
            if (_cursor.isNull(_cursorIndexOfEmailUsuario)) {
              _tmpEmailUsuario = null;
            } else {
              _tmpEmailUsuario = _cursor.getString(_cursorIndexOfEmailUsuario);
            }
            final String _tmpNicknameUsuario;
            if (_cursor.isNull(_cursorIndexOfNicknameUsuario)) {
              _tmpNicknameUsuario = null;
            } else {
              _tmpNicknameUsuario = _cursor.getString(_cursorIndexOfNicknameUsuario);
            }
            final String _tmpPasswordUsuario;
            if (_cursor.isNull(_cursorIndexOfPasswordUsuario)) {
              _tmpPasswordUsuario = null;
            } else {
              _tmpPasswordUsuario = _cursor.getString(_cursorIndexOfPasswordUsuario);
            }
            final int _tmpRutinasCompletadas;
            _tmpRutinasCompletadas = _cursor.getInt(_cursorIndexOfRutinasCompletadas);
            final int _tmpPuntos;
            _tmpPuntos = _cursor.getInt(_cursorIndexOfPuntos);
            final int _tmpNivel;
            _tmpNivel = _cursor.getInt(_cursorIndexOfNivel);
            final int _tmpPremios;
            _tmpPremios = _cursor.getInt(_cursorIndexOfPremios);
            _item = new Usuarios(_tmpIdUsuario,_tmpNombreUsuario,_tmpEdadUsuario,_tmpEmailUsuario,_tmpNicknameUsuario,_tmpPasswordUsuario,_tmpRutinasCompletadas,_tmpPuntos,_tmpNivel,_tmpPremios);
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
  public Object getOneUsuario(final int idUsuario,
      final Continuation<? super Usuarios> continuation) {
    final String _sql = "SELECT * FROM usuarios WHERE idUsuario = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idUsuario);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Usuarios>() {
      @Override
      public Usuarios call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "idUsuario");
          final int _cursorIndexOfNombreUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreUsuario");
          final int _cursorIndexOfEdadUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "edadUsuario");
          final int _cursorIndexOfEmailUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "emailUsuario");
          final int _cursorIndexOfNicknameUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "nicknameUsuario");
          final int _cursorIndexOfPasswordUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "passwordUsuario");
          final int _cursorIndexOfRutinasCompletadas = CursorUtil.getColumnIndexOrThrow(_cursor, "rutinasCompletadas");
          final int _cursorIndexOfPuntos = CursorUtil.getColumnIndexOrThrow(_cursor, "puntos");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfPremios = CursorUtil.getColumnIndexOrThrow(_cursor, "premios");
          final Usuarios _result;
          if(_cursor.moveToFirst()) {
            final int _tmpIdUsuario;
            _tmpIdUsuario = _cursor.getInt(_cursorIndexOfIdUsuario);
            final String _tmpNombreUsuario;
            if (_cursor.isNull(_cursorIndexOfNombreUsuario)) {
              _tmpNombreUsuario = null;
            } else {
              _tmpNombreUsuario = _cursor.getString(_cursorIndexOfNombreUsuario);
            }
            final int _tmpEdadUsuario;
            _tmpEdadUsuario = _cursor.getInt(_cursorIndexOfEdadUsuario);
            final String _tmpEmailUsuario;
            if (_cursor.isNull(_cursorIndexOfEmailUsuario)) {
              _tmpEmailUsuario = null;
            } else {
              _tmpEmailUsuario = _cursor.getString(_cursorIndexOfEmailUsuario);
            }
            final String _tmpNicknameUsuario;
            if (_cursor.isNull(_cursorIndexOfNicknameUsuario)) {
              _tmpNicknameUsuario = null;
            } else {
              _tmpNicknameUsuario = _cursor.getString(_cursorIndexOfNicknameUsuario);
            }
            final String _tmpPasswordUsuario;
            if (_cursor.isNull(_cursorIndexOfPasswordUsuario)) {
              _tmpPasswordUsuario = null;
            } else {
              _tmpPasswordUsuario = _cursor.getString(_cursorIndexOfPasswordUsuario);
            }
            final int _tmpRutinasCompletadas;
            _tmpRutinasCompletadas = _cursor.getInt(_cursorIndexOfRutinasCompletadas);
            final int _tmpPuntos;
            _tmpPuntos = _cursor.getInt(_cursorIndexOfPuntos);
            final int _tmpNivel;
            _tmpNivel = _cursor.getInt(_cursorIndexOfNivel);
            final int _tmpPremios;
            _tmpPremios = _cursor.getInt(_cursorIndexOfPremios);
            _result = new Usuarios(_tmpIdUsuario,_tmpNombreUsuario,_tmpEdadUsuario,_tmpEmailUsuario,_tmpNicknameUsuario,_tmpPasswordUsuario,_tmpRutinasCompletadas,_tmpPuntos,_tmpNivel,_tmpPremios);
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
  public Object getNivelById(final int id_nivel,
      final Continuation<? super NivelesEntity> continuation) {
    final String _sql = "SELECT * FROM niveles where id_nivel =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id_nivel);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<NivelesEntity>() {
      @Override
      public NivelesEntity call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfIdNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "id_nivel");
            final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
            final NivelesEntity _result;
            if(_cursor.moveToFirst()) {
              final int _tmpId_nivel;
              _tmpId_nivel = _cursor.getInt(_cursorIndexOfIdNivel);
              final String _tmpNivel;
              if (_cursor.isNull(_cursorIndexOfNivel)) {
                _tmpNivel = null;
              } else {
                _tmpNivel = _cursor.getString(_cursorIndexOfNivel);
              }
              _result = new NivelesEntity(_tmpId_nivel,_tmpNivel);
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

  @Override
  public Object getPremioById(final int id_premio,
      final Continuation<? super PremiosEntity> continuation) {
    final String _sql = "SELECT * FROM premios where id_premio =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id_premio);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<PremiosEntity>() {
      @Override
      public PremiosEntity call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfIdPremio = CursorUtil.getColumnIndexOrThrow(_cursor, "id_premio");
            final int _cursorIndexOfPremio = CursorUtil.getColumnIndexOrThrow(_cursor, "premio");
            final int _cursorIndexOfUbicacion = CursorUtil.getColumnIndexOrThrow(_cursor, "ubicacion");
            final int _cursorIndexOfCodigoRetiro = CursorUtil.getColumnIndexOrThrow(_cursor, "codigoRetiro");
            final int _cursorIndexOfImgPremio = CursorUtil.getColumnIndexOrThrow(_cursor, "img_premio");
            final PremiosEntity _result;
            if(_cursor.moveToFirst()) {
              final int _tmpId_premio;
              _tmpId_premio = _cursor.getInt(_cursorIndexOfIdPremio);
              final String _tmpPremio;
              if (_cursor.isNull(_cursorIndexOfPremio)) {
                _tmpPremio = null;
              } else {
                _tmpPremio = _cursor.getString(_cursorIndexOfPremio);
              }
              final String _tmpUbicacion;
              if (_cursor.isNull(_cursorIndexOfUbicacion)) {
                _tmpUbicacion = null;
              } else {
                _tmpUbicacion = _cursor.getString(_cursorIndexOfUbicacion);
              }
              final String _tmpCodigoRetiro;
              if (_cursor.isNull(_cursorIndexOfCodigoRetiro)) {
                _tmpCodigoRetiro = null;
              } else {
                _tmpCodigoRetiro = _cursor.getString(_cursorIndexOfCodigoRetiro);
              }
              final String _tmpImg_premio;
              if (_cursor.isNull(_cursorIndexOfImgPremio)) {
                _tmpImg_premio = null;
              } else {
                _tmpImg_premio = _cursor.getString(_cursorIndexOfImgPremio);
              }
              _result = new PremiosEntity(_tmpId_premio,_tmpPremio,_tmpUbicacion,_tmpCodigoRetiro,_tmpImg_premio);
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
}
