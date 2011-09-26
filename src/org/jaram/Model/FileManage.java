package org.jaram.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;

public class FileManage {
	SQLiteDatabase db;
	
	// If DB file is exist, DB file no create.
	// But if DB file need , DB file create.
	public FileManage(Context context, String path){

		String value = "Schedule.db";

		File folder = new File(path);
		folder.mkdirs();
		File outfile = new File(path+"/" + value);
		if(outfile.isFile()){
			db = SQLiteDatabase.openDatabase(path+"/"+value, null, 
					SQLiteDatabase.OPEN_READWRITE |  SQLiteDatabase.NO_LOCALIZED_COLLATORS);			
		}
		if (outfile.length() <= 0) {
			AssetManager assetManager = context.getResources().getAssets();
			try {
				InputStream is = assetManager.open(value, assetManager.ACCESS_BUFFER);
				long filesize = is.available();

				byte [] buffer = new byte[(int)filesize];
				is.read(buffer);

				outfile.createNewFile();
				FileOutputStream fo = new FileOutputStream(outfile);
				fo.write(buffer);

				is.close();
				fo.close();
				db = SQLiteDatabase.openDatabase(path+"/"+value, null, SQLiteDatabase.OPEN_READWRITE |  
						SQLiteDatabase.NO_LOCALIZED_COLLATORS);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
