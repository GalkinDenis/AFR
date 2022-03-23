package com.denis.appForRentaTeam.data.datasources.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UsersDao_Impl implements UsersDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UsersEntity> __insertionAdapterOfUsersEntity;

  public UsersDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUsersEntity = new EntityInsertionAdapter<UsersEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `users` (`id`,`email`,`first_name`,`last_name`,`avatar`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UsersEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmail());
        }
        if (value.getFirst_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFirst_name());
        }
        if (value.getLast_name() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLast_name());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAvatar());
        }
      }
    };
  }

  @Override
  public Object insert(final UsersEntity item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUsersEntity.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<UsersEntity>> getListOfUsers() {
    final String _sql = "SELECT * from Users";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Users"}, new Callable<List<UsersEntity>>() {
      @Override
      public List<UsersEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "last_name");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final List<UsersEntity> _result = new ArrayList<UsersEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UsersEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpFirst_name;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirst_name = null;
            } else {
              _tmpFirst_name = _cursor.getString(_cursorIndexOfFirstName);
            }
            final String _tmpLast_name;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLast_name = null;
            } else {
              _tmpLast_name = _cursor.getString(_cursorIndexOfLastName);
            }
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            _item = new UsersEntity(_tmpId,_tmpEmail,_tmpFirst_name,_tmpLast_name,_tmpAvatar);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
