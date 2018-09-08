package noceli.diego.agroapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;


public class ContatoFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getContext());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rtvie=inflater.inflate(R.layout.fragment_contato, container, false);
        Uri uri = Uri.parse("https://i.imgur.com/pQl5vGh.png");
        Uri uri2 = Uri.parse("https://graph.facebook.com/100002755554401/picture?type=large");
        Uri uri3 = Uri.parse("https://graph.facebook.com/100002105071377/picture?type=large");
        SimpleDraweeView img1 = (SimpleDraweeView) rtvie.findViewById(R.id.imgdeveloper2);
        SimpleDraweeView img2 = (SimpleDraweeView) rtvie.findViewById(R.id.imgdeveloper);
        SimpleDraweeView img3 = (SimpleDraweeView) rtvie.findViewById(R.id.imgdeveloper3);
        img1.setImageURI(uri);
        img2.setImageURI(uri2);
        img3.setImageURI(uri3);
        return rtvie;
    }

}
