package th.co.cdg.quiz1;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.pixplicity.easyprefs.library.Prefs;

import java.util.Objects;

public class IntiContentProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        new Prefs.Builder()
                .setContext(getContext())
                .setMode(android.content.ContextWrapper.MODE_PRIVATE)
                .setPrefsName(Objects.requireNonNull(getContext()).getPackageName())
                .setUseDefaultSharedPreference(true)
                .build();
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}
