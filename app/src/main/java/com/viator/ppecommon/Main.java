package com.viator.ppecommon;

import com.viator.ppecommon.changetravellername.ChangeTravellerNameActivity;
import com.viator.ppecommon.changetravellername.Traveller;

public class Main {
    Traveller traveller = new Traveller("karel", "herink");
    ChangeTravellerNameActivity activity = new ChangeTravellerNameActivity();
    {
        activity.getTravellers();
    }
}
