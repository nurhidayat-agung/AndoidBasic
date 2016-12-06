package agung.nurhidayat.olshopsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class CariBarang extends AppCompatActivity {
    private EditText edtCariBarang;
    private Button btnCariBarang;
    private ListView lvDaftarbarang;
    private String keyword;
    private ArrayList<String> listIdBarang = new ArrayList<String>();
    private ArrayList<String> listNamaBarang = new ArrayList<String>();
    private ArrayList<String> listKetbarang = new ArrayList<String>();
    private ArrayList<String> listHarga = new ArrayList<String>();
    private ArrayList<String> listStokBarang = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_barang);
        edtCariBarang = (EditText) findViewById(R.id.edt_caribarang);
        btnCariBarang = (Button) findViewById(R.id.btn_caribarang);
        lvDaftarbarang = (ListView) findViewById(R.id.lv_daftarbarang);
        adapter = new ArrayAdapter<String>(CariBarang.this,android.R.layout.simple_list_item_1,listNamaBarang);
        lvDaftarbarang.setAdapter(adapter);
        btnCariBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keyword = edtCariBarang.getText().toString();
                try {
                    adapter.clear();
                    HashMap postCariBarang = new HashMap();
                    postCariBarang.put("txtNamabarang",keyword);
                    PostResponseAsyncTask taskCari = new PostResponseAsyncTask(CariBarang.this, postCariBarang, new AsyncResponse() {
                        @Override
                        public void processFinish(String result) {
                            //Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
                            try {
                                JSONArray arrBarang = new JSONArray(result);
                                for (int a = 0; a < arrBarang.length(); a++){
                                    JSONObject data = arrBarang.getJSONObject(a);
                                    listIdBarang.add(data.getString("id"));
                                    listNamaBarang.add(data.getString("nama"));
                                    listKetbarang.add(data.getString("keterangan"));
                                    listHarga.add(data.getString("harga"));
                                    listStokBarang.add(data.getString("stok"));
                                }

                                adapter.notifyDataSetChanged();

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    taskCari.execute("http://10.0.3.2/imkom/cari.php");
                }catch (Exception err){
                    Toast.makeText(getApplicationContext(),err.toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
