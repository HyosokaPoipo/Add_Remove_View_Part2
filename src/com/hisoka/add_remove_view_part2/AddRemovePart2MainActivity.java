package com.hisoka.add_remove_view_part2;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class AddRemovePart2MainActivity extends Activity {

	TextView berita;
	private int indeks = 0;
	boolean next = false;
	boolean previous = false;
	boolean firstL = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_remove_part2_main);
		
		berita = (TextView) findViewById(R.id.isiBerita);
	}
	
	String b0 = "Bahwa nelayan yang melaut dengan kisaran waktu satu hari satu malam disebut dengan istilah nelayan one day fishing";
	String b1 = "Otoritas Jasa Keuangan (OJK), industri perbankan dan Industri Keuangan Non Bank (IKNB) menyatakan tidak khawatir dengan potensi kredi macet atau Non Performing Loan pembiayaan pelaku usaha mikro dan kecil disektor kelautan dan perikanan. Pasalnya presentasi kredit macet setiap tahun disektor ini terus menurun.";
	String b2 = "Ratusan nelayan di pantai Santolo Indah, Garut, Jawa Barat terpaksa berhenti berlayar. Hal ini lantaran harga bahan bakar minyak (BBM) yang terus melambung. Harga 1 liter BBM mencapaii Rp.9 ribu. Padahal untuk sekali berlayar nelayan butuh sekitar 40 liber BBM. Akibatnya, banyak nelayan yang memilih alih profesi.";
	String b3 = "Karena buta hukum, nelayan pengebom ikan di Kalbar pasrah menerima hukuman.Jadi para nelayan jangan sampai menggunakan bom lagi";
	String b4 = "Desain dan keberadaan alat penangkap sedimentasi atau yang biasa disebut groin di Pantai Pancer, kecamatan puger, Kab. Jember, Jawa Timur, ternyata membawa efek negatif bagi nelayan setempat. Alat tersebut menciptakan pusaran air di sekitarnya dan menyebabkan banyak perahu jukung pecah sepanjang tahun ini.";
	
	
	String news[] = new String[]{b0,b1,b2,b3,b4};
	
	private int finalIndex = news.length;
	
	public void nextNews(View view)
	{
		Log.i("newxtNews-Indeks", Integer.toString(indeks));
		if(indeks >= finalIndex-1) indeks = -1;
		indeks++;
		berita.setText(news[indeks]);
		
		if(indeks >= finalIndex-1) indeks = -1;		
		
	}
	
	
	
	public void prevNews(View view)
	{
		Log.i("prevNews-Indeks", Integer.toString(indeks));
		indeks--;
		if(indeks == -1)
		{
			indeks = finalIndex-1;
		}else if(indeks == -2)
		{
			indeks = finalIndex-2;
		}
		
		berita.setText(news[indeks]);
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_remove_part2_main, menu);
		return true;
	}

}
