package com.example.globaltrainingapp_11.ui.articulos;



import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;


//import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.globaltrainingapp_11.R;
import com.example.globaltrainingapp_11.casosUso.Articles;
import com.example.globaltrainingapp_11.casosUso.CategoryRVModal;
import com.example.globaltrainingapp_11.casosUso.NewsModal;
import com.example.globaltrainingapp_11.controladores.adapters.CategoryRVAdapter;
import com.example.globaltrainingapp_11.controladores.adapters.NewsRVAdapter;
import com.example.globaltrainingapp_11.controladores.adapters.RetrofitAPI;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainNoticiasActivity extends AppCompatActivity implements CategoryRVAdapter.CategorClickInterface {

    //00bc45f2819147c8a1ec595c2405087a

    private RecyclerView newsRV, categoryRV;
    private ProgressBar loadingPB;
    private ArrayList<Articles> articlesArrayList;
    private ArrayList<CategoryRVModal> categoryRVModalArrayList;
    private CategoryRVAdapter categoryRVAdapter;
    private NewsRVAdapter newsRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_noticias);
        newsRV= findViewById(R.id.idRVNews);
        categoryRV=findViewById(R.id.idRVCategories);
        loadingPB= findViewById(R.id.idPBLoading);
        articlesArrayList= new ArrayList<>();
        categoryRVModalArrayList= new ArrayList<>();
        newsRVAdapter= new NewsRVAdapter (articlesArrayList,this);
        categoryRVAdapter = new CategoryRVAdapter(categoryRVModalArrayList,this,this::onCategoryClick);
        newsRV.setLayoutManager(new LinearLayoutManager(this));
        newsRV.setAdapter(newsRVAdapter);
        categoryRV.setAdapter(categoryRVAdapter);
        getCategories();
        getNews("Sports");

        newsRVAdapter.notifyDataSetChanged();


    }

    private void getCategories() {
        //categoryRVModalArrayList.add(new CategoryRVModal("All","https://media.istockphoto.com/photos/media-concept-with-tv-screens-picture-id1301983459?b=1&k=20&m=1301983459&s=170667a&w=0&h=rh_XkYTuyt6DCkDvmTSsAM5gdlEp74RXMdgui2GHXK4="));
        //categoryRVModalArrayList.add(new CategoryRVModal("Technology","https://images.unsplash.com/photo-1488590528505-98d2b5aba04b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fHRlY2h8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60"));
        //categoryRVModalArrayList.add(new CategoryRVModal("Science","https://media.istockphoto.com/photos/vaccine-in-laboratory-flu-shot-and-covid19-vaccination-picture-id1289345741?b=1&k=20&m=1289345741&s=170667a&w=0&h=oG8iaDNP4rOLSgXWfeSziU3Vyu6KJS9Hn2ORohzSsRg="));
        categoryRVModalArrayList.add(new CategoryRVModal("Sports","https://media.istockphoto.com/photos/be-as-strong-as-you-were-born-to-be-picture-id1279902517?k=20&m=1279902517&s=612x612&w=0&h=RlVc-49u3noWYHy0XE4IHvRuKD3_kfelklxIGrYz9bI="));
        //categoryRVModalArrayList.add(new CategoryRVModal("General","https://images.unsplash.com/photo-1457369804613-52c61a468e7d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8Z2VuZXJhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60"));
        //categoryRVModalArrayList.add(new CategoryRVModal("Business","https://images.unsplash.com/photo-1578574577315-3fbeb0cecdc2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YnVzaW5lc3N8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60"));
        //categoryRVModalArrayList.add(new CategoryRVModal("Entertainment","https://media.istockphoto.com/photos/warm-popcorn-viewed-from-above-on-pink-background-top-view-concept-picture-id1317027342?b=1&k=20&m=1317027342&s=170667a&w=0&h=asHMOS3a0cXujjC2AA3yjZi1ZC1N39eGEehaQA8d2Ds="));
        categoryRVModalArrayList.add(new CategoryRVModal("Health","https://images.unsplash.com/photo-1535914254981-b5012eebbd15?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGhlYWx0aHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60"));

        categoryRVAdapter.notifyDataSetChanged();
    }

    private void getNews(String category){
        loadingPB.setVisibility(View.VISIBLE);
        articlesArrayList.clear();
        String categoryURL="https://newsapi.org/v2/top-headlines?country=co&category="+category+"&apiKey=00bc45f2819147c8a1ec595c2405087a";
        String url="https://newsapi.org/v2/top-headlines?country=co&excludeDomains=stackoverflow.com&sortBy=published&languague=es&apiKey=00bc45f2819147c8a1ec595c2405087a";
        String BASE_URL="https://newsapi.org/";

        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        Call<NewsModal> call;
        if(category.equals("All")){
            call=retrofitAPI.getAllNews(url);
        }else{
            call= retrofitAPI.getNewsByCategory(categoryURL);

        }

        call.enqueue(new Callback<NewsModal>(){

            @Override
            public void onResponse(Call<NewsModal> call, Response<NewsModal> response) {
                NewsModal newsModal=response.body();
                loadingPB.setVisibility(View.GONE);
                ArrayList<Articles> articles= newsModal.getArticles();
                for(int i=0;i<articles.size();i++){

                    articlesArrayList.add(new Articles(articles.get(i).getTitle(),
                            articles.get(i).getDescription(),
                            articles.get(i).getUrlToImage(),
                            articles.get(i).getUrl(),
                            articles.get(i).getContent()));
                }
                newsRVAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<NewsModal> call, Throwable t) {

                //Toast.makeText(MainActivity.this,"Fail to get news", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCategoryClick(int position) {

        String category = categoryRVModalArrayList.get(position).getCategory();
        getNews(category);


    }
}