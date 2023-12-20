package com.example.ziaja_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ziaja_app.Adapter.PopularListAdapter;
import com.example.ziaja_app.Domain.PopularDomain;
import com.example.ziaja_app.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPupolar;
private RecyclerView recyclerViewPupolar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottom_navigation();
        
    }

    private void bottom_navigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MainActivity.class)));
        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("MacBook Pro 13 M2 chip", "Nowy MacBook Pro 13 z M2 chip to połączenie potęgi i elegancji. Wyposażony w najnowszy układ M2, ten laptop oferuje niesamowitą wydajność,\n" +
                " sprawną pracę i imponującą grafikę. Dzięki zaawansowanym technologiom Apple, MacBook Pro 13 pozwala na płynne przeglądanie,\n" +
                " edycję multimediów i tworzenie zawartości na najwyższym poziomie. Solidna obudowa wykonana z aluminium gwarantuje trwałość, \n" +
                "a innowacyjna klawiatura i obsługa dotykowa Touch Bar dodają wygodę i efektywność w codziennym użytkowaniu. \n" +
                "To narzędzie idealne dla kreatywnych profesjonałów i entuzjastów technologii, którzy cenią sobie jakość i wydajność.", "pic1",15,4,500 ));
        items.add(new PopularDomain("PlayStation 5", "PlayStation 5 to konsola, która wprowadza rozrywkę do nowego wymiaru.\n" +
                "Dzięki najnowszym osiągnięciom technologii gamingowej, PS5 zapewnia niesamowitą jakość grafiki,\n" +
                "płynne animacje i szybkie wczytywanie, co zapewnia niezapomniane wrażenia podczas gry.\n" +
                "Model Digital Edition pozbawiony jest napędu optycznego, co sprawia, że korzysta z cyfrowej biblioteki gier.\n" +
                "Rewolucyjny kontroler DualSense oferuje zaawansowane funkcje wibracyjne, reagujące na akcję w grze,\n" +
                "co intensyfikuje doznania podczas rozgrywki.\n" +
                "PlayStation 5 Digital Edition to wrota do świata nieograniczonych przygód dla każdego miłośnika gier", "pic2",10,4.5,450));
        items.add(new PopularDomain("Iphone 15", "iPhone 15 to nowa era innowacji w świecie smartfonów.\n" +
                "Z niesamowitym ekranem Super Retina XDR, dynamicznym zakresem kolorów i precyzyjnymi \n" +
                "detalami, iPhone 14 podnosi poprzeczkę w dziedzinie jakości obrazu. Wprowadzenie najnowszego\n" +
                "procesora zapewnia płynność działania i szybką reakcję na polecenia użytkownika.\n" +
                "Aparaty o wyższej rozdzielczości i zaawansowanej technologii fotograficznej pozwalają\n" +
                "uwiecznić chwile w perfekcyjnej jakości. Klasyczny design, trwała konstrukcja\n" +
                "oraz zaawansowane funkcje bezpieczeństwa sprawiają, że iPhone 15 to nie tylko smartfon,\n" +
                "ale także narzędzie do eksploracji nowych możliwości i kreatywności.", "pic3", 13,4.2,800));


        recyclerViewPupolar=findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar=new PopularListAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }
}