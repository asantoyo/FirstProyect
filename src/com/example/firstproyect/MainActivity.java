package com.example.firstproyect;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//public class MainActivity extends Activity {
public class MainActivity extends ListActivity 
{
	String m_astrTest[] = {"LifeCycleTest", "SingleTouchTest", "MultiTouchTest", "KeyTest", "AccelerometerTest", "AssetsTest",
								  "ExternalStorageTest", "SoundPoolTest", ""};
	
	public final static String EXTRA_MESSAGE = "com.example.firstproyect.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, m_astrTest));
        
        //setContentView(R.layout.activity_main);
        
        // Commit 1
    }

    @Override
    protected void onListItemClick(ListView list, View view, int position, long id)
    {
    	super.onListItemClick(list, view, position, id);
    	String strName = m_astrTest[position];
    
    	try
    	{
    		Class<?> clazz = Class.forName("com.example.firstproyect." + strName);
    		Intent intent = new Intent(this, clazz);
    		startActivity(intent);
    	}catch (ClassNotFoundException e)
    	{
    	
    	}
    }
    
    

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//    
//    public void sendMessage(View view)
//    {
//    	Intent intent = new Intent(this, DisplayMessageActivity.class);
//    	EditText editText = (EditText) findViewById(R.id.edit_message);
//    	String message = editText.getText().toString();
//    	intent.putExtra(EXTRA_MESSAGE, message);
//    	startActivity(intent);
//    	
//    }
    
}
