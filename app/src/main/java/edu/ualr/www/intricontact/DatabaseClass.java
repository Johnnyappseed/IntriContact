package edu.ualr.www.intricontact;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;

/**
 * Created by John on 10/11/2017 for the purpose of having a different file house the database.
 */

public class DatabaseClass extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;

    public static final String CONTACT_TABLE_NAME = "contacts";
    public static final String CONTACT_PRIMARY_KEY = "ID";
    public static final String CONTACT_FIRST_NAME = "firstName";
    public static final String CONTACT_LAST_NAME = "lastName";
    public static final String CONTACT_NUMBER = "phoneNumber";
    public static final String CONTACT_EMAIL = "email";
    //ect can be used as an array that is turned into a string and saved into the DB
    //this array can store extra information on the main contact screen (the title + content)
    public static String  ECT;
    private static final String CONTACT_TABLE_CREATE =
            "CREATE TABLE " + CONTACT_TABLE_NAME + " (" +
            CONTACT_PRIMARY_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CONTACT_FIRST_NAME + " TEXT, " +
            CONTACT_LAST_NAME + " TEXT, " +
            CONTACT_NUMBER + " TEXT, " +
            CONTACT_EMAIL + " TEXT);";

    public DatabaseClass(Context context) {
        super(context, CONTACT_TABLE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CONTACT_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
