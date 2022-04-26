package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView item1, item2, item3, itemtotal1, itemtotal2,
            itemtotal3, subtotal, discount, total;
    Button minusBtn1, addBtn1, minusBtn2, addBtn2,
            minusBtn3, addBtn3;

    int item1q, item2q, item3q;
    float item1total ,item2total, item3total,
            totalItem, totalDiscount, totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item1 = (TextView) findViewById(R.id.item1);
        item2 = (TextView) findViewById(R.id.item2);
        item3 = (TextView) findViewById(R.id.item3);
        itemtotal1 = (TextView) findViewById(R.id.itemtotal1);
        itemtotal2 = (TextView) findViewById(R.id.itemtotal2);
        itemtotal3 = (TextView) findViewById(R.id.itemtotal3);
        subtotal = (TextView) findViewById(R.id.subtotal);
        discount = (TextView) findViewById(R.id.discount);
        total = (TextView) findViewById(R.id.total);
        addBtn1 = (Button) findViewById(R.id.addBtn1);
        minusBtn1 = (Button) findViewById(R.id.minusBtn1);
        addBtn2 = (Button) findViewById(R.id.addBtn2);
        minusBtn2 = (Button) findViewById(R.id.minusBtn2);
        addBtn3 = (Button) findViewById(R.id.addBtn3);
        minusBtn3 = (Button) findViewById(R.id.minusBtn3);


        addBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item1.setText(String.valueOf(item1q+=1));
                item1total = Float.parseFloat(String.valueOf(itemtotal1.getText()));
                item1total += 12.00;
                itemtotal1.setText(String.format("%.2f" , item1total));

                totalItem = item1total + item2total + item3total;
                totalDiscount = totalItem*10/100;
                totalPrice = totalItem - totalDiscount;

                subtotal.setText(String.format("%.2f" ,totalItem));
                discount.setText(String.format("%.2f" ,totalDiscount));
                total.setText(String.format("%.2f" ,totalPrice));
            }
        });

        minusBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(item1q>0) {
                    item1.setText(String.valueOf(item1q-=1));
                    item1total = Float.parseFloat(String.valueOf(itemtotal1.getText()));
                    item1total -= 12.00;
                    itemtotal1.setText(String.format("%.2f" ,item1total));

                    totalItem = item1total + item2total + item3total;
                    totalDiscount = totalItem*10/100;
                    totalPrice = totalItem - totalDiscount;

                    subtotal.setText(String.format("%.2f" ,totalItem));
                    discount.setText(String.format("%.2f" ,totalDiscount));
                    total.setText(String.format("%.2f" ,totalPrice));
                }
            }
        });

        addBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item2.setText(String.valueOf(item2q+=1));
                item2total = Float.parseFloat(String.valueOf(itemtotal2.getText()));
                item2total += 23.00;
                itemtotal2.setText(String.format("%.2f" ,item2total));

                totalItem = item1total + item2total + item3total;
                totalDiscount = totalItem*10/100;
                totalPrice = totalItem - totalDiscount;

                subtotal.setText(String.format("%.2f" ,totalItem));
                discount.setText(String.format("%.2f" ,totalDiscount));
                total.setText(String.format("%.2f" ,totalPrice));
            }
        });

        minusBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(item2q>0) {
                    item2.setText(String.valueOf(item2q-=1));
                    item2total = Float.parseFloat(String.valueOf(itemtotal2.getText()));
                    item2total -= 23.00;
                    itemtotal2.setText(String.format("%.2f" ,item2total));

                    totalItem = item1total + item2total + item3total;
                    totalDiscount = totalItem*10/100;
                    totalPrice = totalItem - totalDiscount;

                    subtotal.setText(String.format("%.2f" ,totalItem));
                    discount.setText(String.format("%.2f" ,totalDiscount));
                    total.setText(String.format("%.2f" ,totalPrice));
                }
            }
        });

        addBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item3.setText(String.valueOf(item3q+=1));
                item3total = Float.parseFloat(String.valueOf(itemtotal3.getText()));
                item3total += 30.00;
                itemtotal3.setText(String.format("%.2f" ,item3total));

                totalItem = item1total + item2total + item3total;
                totalDiscount = totalItem*10/100;
                totalPrice = totalItem - totalDiscount;

                subtotal.setText(String.format("%.2f" ,totalItem));
                discount.setText(String.format("%.2f" ,totalDiscount));
                total.setText(String.format("%.2f" ,totalPrice));
            }
        });

        minusBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(item3q>0) {
                    item3.setText(String.valueOf(item3q-=1));
                    item3total = Float.parseFloat(String.valueOf(itemtotal3.getText()));
                    item3total -= 30.00;
                    itemtotal3.setText(String.format("%.2f" ,item3total));

                    totalItem = item1total + item2total + item3total;
                    totalDiscount = totalItem*10/100;
                    totalPrice = totalItem - totalDiscount;

                    subtotal.setText(String.format("%.2f" ,totalItem));
                    discount.setText(String.format("%.2f" ,totalDiscount));
                    total.setText(String.format("%.2f" ,totalPrice));
                }
            }
        });
    }
}