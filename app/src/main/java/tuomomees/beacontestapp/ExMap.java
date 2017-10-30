package tuomomees.beacontestapp;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Luokan on luonut tuomo päivämäärällä 30.10.2017.
 */

class ExMap {

    protected Context context;

    public ExMap(Context context)
    {
        this.context = context;
        calculate(context);
        hashMapEx(context);
    }

    public static void calculate(Context tama) {
        ArrayList<Integer> taulu = new ArrayList<Integer>();
        int luku = 9;
        while (luku != 0) {
            taulu.add(luku);
            luku = luku - 1;
            String aString = Integer.toString(luku);
            Toast.makeText(tama/*getApplicationContext()*/, "luku : " + aString, Toast.LENGTH_LONG).show();
        }
        int isum = summa(taulu); //lasketaan summa
        String aSum = Integer.toString(isum);
        Toast.makeText(tama/*getApplicationContext()*/, "summa : " + aSum, Toast.LENGTH_LONG).show();
    }

    private static int summa(ArrayList<Integer> tau) {
        int summa = 0;
        for (int i = 0; i < tau.size(); ++i) // for-each olisi tÃ¤ssÃ¤ toki luontevampi,
            summa += tau.get(i);
        return summa;
    }

    public static void hashMapEx(Context tama) {
        //HashMap<K,V>
        //Class HashMap object is a construct, that has K type values, like "key"), they are associated with V type values, like "value".
        //Also by the "key" is seached the value connected to this "key".
        //In a way HashMap object is like a table, that is indexed by K type values (not with numbers).

        HashMap<String, ArrayList<String>> who =
                new HashMap<String, ArrayList<String>>();

        ArrayList<String> maijaStuff = new ArrayList<String>();
        maijaStuff.add("doll");
        maijaStuff.add("bubby");
        maijaStuff.add("star");

        ArrayList<String> pekkaStuff = new ArrayList<String>();
        pekkaStuff.add("car");
        pekkaStuff.add("measure");
        pekkaStuff.add("sword");

        who.put("Maija", maijaStuff);
        who.put("Pekka", pekkaStuff);

        Toast.makeText(tama/*getApplicationContext()*/, "whose: " + who, Toast.LENGTH_LONG).show();
        //System.out.println(who);
        Toast.makeText(tama, "whose/Pekka: " + who.get("Pekka"), Toast.LENGTH_LONG).show();
        Toast.makeText(tama, "whose/Maija(2): " + who.get("Maija").get(2), Toast.LENGTH_LONG).show();
    }
}
