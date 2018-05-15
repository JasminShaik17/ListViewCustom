package cubex.mahesh.listviewcustom;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.File;

public class MyAdapter extends BaseAdapter {

    String path;
    File f;
    File[ ] files;
    MyAdapter( )
    {
        path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/";
        f = new File(path);
        if(!f.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/";
            f = new File(path);
        }
        files = f.listFiles();
    }

    @Override
    public int getCount() {
        return files.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView
            (int position, View convertView, ViewGroup parent) {
        return null;
    }
}
