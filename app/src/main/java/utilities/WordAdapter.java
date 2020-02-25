package utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**Resource ID for background color of this list of words */
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    /*This is a comment */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        /* Change background of items with color provided by Adapter calling class (Change activity to activity)*/
        LinearLayout textContainer = listItemView.findViewById(R.id.text_container);

        /*Refer color resource */
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView miwokImage = listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            // Set imageView resource with current word provided
            miwokImage.setImageResource(currentWord.getmImageResourceId());

            // Ensure the visibility of image view
            miwokImage.setVisibility(View.VISIBLE);
        }else {
            // Hide the Image View when No Image resource provided (set visibility to GONE)
            miwokImage.setVisibility(View.GONE);
        }
        return listItemView;
    }

}
