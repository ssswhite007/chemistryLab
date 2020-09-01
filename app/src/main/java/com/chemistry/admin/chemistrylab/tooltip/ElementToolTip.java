package com.chemistry.admin.chemistrylab.tooltip;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chemistry.admin.chemistrylab.R;
import com.chemistry.admin.chemistrylab.fragment.PeriodicTableFragment;

/**
 * Created by Admin on 10/14/2016.
 */

public class ElementToolTip{
    private View rootView;
    private TextView textAtomicMass;
    private TextView textAtomicNumber;
    private TextView textName;
    private TextView textSymbol;
    private TextView textElectronicGravity;
    private TextView textElectronicConfig;
    private TextView textOxidationStates;

    public ElementToolTip(Context context) {
        initViews(context);
    }

    private void initViews(Context context) {
        int size = context.getResources().getDimensionPixelSize(R.dimen.element_tool_tip_size);
        rootView = View.inflate(context, R.layout.item_element, null);
        rootView.setLayoutParams(new LinearLayout.LayoutParams(size, size));
        rootView.measure(size, size);
        textAtomicMass  = rootView.findViewById(R.id.txt_atomic_mass);
        textAtomicNumber  = rootView.findViewById(R.id.txt_atomic_number);
        textName  = rootView.findViewById(R.id.txt_name);
        textSymbol  = rootView.findViewById(R.id.txt_symbol);
        textElectronicGravity  = rootView.findViewById(R.id.txt_electronic_gravity);
        textElectronicConfig  = rootView.findViewById(R.id.txt_electron_config);
        textOxidationStates  = rootView.findViewById(R.id.txt_oxidation_states);
    }

    public View getRootView() {
        return rootView;
    }

    public void setData(PeriodicTableFragment.ElementItem item){
        textAtomicMass.setText(String.valueOf(item.getAtomicMass()));
        textAtomicNumber.setText(String.valueOf(item.getAtomicNumber()));
        textName.setText(item.getName());
        textSymbol.setText(item.getSymbol());
        textElectronicGravity.setText(String.valueOf(item.getElectronicGravity()));
        textElectronicConfig.setText(item.getElectronConfig());
        textOxidationStates.setText(item.getOxidationStates());
    }

}
