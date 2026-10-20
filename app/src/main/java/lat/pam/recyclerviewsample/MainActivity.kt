
package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan RecyclerView dengan layout XML
        val recyclerview = findViewById<RecyclerView>(
            R.id.recyclerview
        )

        // Mengatur tampilan daftar secara vertikal
        recyclerview.layoutManager =
            LinearLayoutManager(this)

        // Membuat daftar data
        val data = ArrayList<ItemsViewModel>()

        // Menambahkan 20 item
        for (i in 1..20) {
            data.add(ItemsViewModel("Item " + i))
        }

        // Menghubungkan data dengan adapter
        val adapter = CustomAdapter(data)

        Log.d("test string", "Jumlah data: " + data.size)

        // Menampilkan data pada RecyclerView
        recyclerview.adapter = adapter
    }
}
