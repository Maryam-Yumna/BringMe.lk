package app.noobstack.eshoplk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class AdminDeliveryOrders extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_admindelivery_orders, container, false);
    }

    public void changeAdminFrag(View view) {
        Toast.makeText( getActivity(), "Fragment Chnage", Toast.LENGTH_SHORT).show();
        System.out.println("uhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
    }

}